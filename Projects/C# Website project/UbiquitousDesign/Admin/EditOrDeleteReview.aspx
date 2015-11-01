<%@ Page Title="" Language="C#" MasterPageFile="/UbiquitousDesign/AdminMasterPage.master" %>

<script runat="server">

</script>

<asp:Content ID="Content1" ContentPlaceHolderID="TitlePlaceHolder" Runat="Server">
    <title>Edit or delete review.</title>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">

    <div style="text-align:center; padding: 10px 0px 15px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; 
        background-color: #000000; width:760px; margin-left:auto; margin-right:auto;   ">
        <i><h1 style="text-align:center;">Edit or Delete Review:</h1></i>
    </div>
    <br />
<table align="center" >
    <tr><td style="background-color:transparent; text-align:center;">
        <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="Data Source=.\SQLEXPRESS;AttachDbFilename=|DataDirectory|\UbiquitousDB.MDF;Integrated Security=True;User Instance=True"
         DeleteCommand="DELETE FROM [Review] WHERE [ReviewID] = @ReviewID" InsertCommand="INSERT INTO [Review] ([UserId], [ReviewText], [GameScore], [GameID], [ReviewDate], [ReviewID], [PlatformID], [RoleId]) VALUES (@UserId, @ReviewText, @GameScore, @GameID, @ReviewDate, @ReviewID, @PlatformID, @RoleId)" 
         SelectCommand="SELECT * FROM [Review]" 
         UpdateCommand="UPDATE [Review] SET [UserId] = @UserId, [ReviewText] = @ReviewText, [GameScore] = @GameScore, [GameID] = @GameID, [ReviewDate] = @ReviewDate, [PlatformID] = @PlatformID, [RoleId] = @RoleId WHERE [ReviewID] = @ReviewID">
            <DeleteParameters>
                <asp:Parameter Name="ReviewID" Type="Int32" />
            </DeleteParameters>
            <InsertParameters>
                <asp:Parameter Name="UserId" Type="Object" />
                <asp:Parameter Name="ReviewText" Type="String" />
                <asp:Parameter Name="GameScore" Type="Int32" />
                <asp:Parameter Name="GameID" Type="Int32" />
                <asp:Parameter DbType="Date" Name="ReviewDate" />
                <asp:Parameter Name="ReviewID" Type="Int32" />
                <asp:Parameter Name="PlatformID" Type="Int32" />
                <asp:Parameter Name="RoleId" Type="Object" />
            </InsertParameters>
            <UpdateParameters>
                <asp:Parameter Name="UserId" Type="Object" />
                <asp:Parameter Name="ReviewText" Type="String" />
                <asp:Parameter Name="GameScore" Type="Int32" />
                <asp:Parameter Name="GameID" Type="Int32" />
                <asp:Parameter DbType="Date" Name="ReviewDate" />
                <asp:Parameter Name="PlatformID" Type="Int32" />
                <asp:Parameter Name="RoleId" Type="Object" />
                <asp:Parameter Name="ReviewID" Type="Int32" />
            </UpdateParameters>
        </asp:SqlDataSource>
        <asp:GridView ID="GridView1" runat="server" AllowPaging="True" AutoGenerateColumns="False" DataKeyNames="ReviewID" DataSourceID="SqlDataSource1">
            <Columns>
                <asp:CommandField ShowDeleteButton="True" ShowEditButton="True" />
                <asp:BoundField DataField="UserId" HeaderText="UserId" SortExpression="UserId" />
                <asp:BoundField DataField="ReviewText" HeaderText="ReviewText" SortExpression="ReviewText" />
                <asp:BoundField DataField="GameScore" HeaderText="GameScore" SortExpression="GameScore" />
                <asp:BoundField DataField="GameID" HeaderText="GameID" SortExpression="GameID" />
                <asp:BoundField DataField="ReviewDate" HeaderText="ReviewDate" SortExpression="ReviewDate" />
                <asp:BoundField DataField="ReviewID" HeaderText="ReviewID" ReadOnly="True" SortExpression="ReviewID" />
                <asp:BoundField DataField="PlatformID" HeaderText="PlatformID" SortExpression="PlatformID" />
                <asp:BoundField DataField="RoleId" HeaderText="RoleId" SortExpression="RoleId" />
            </Columns>
        </asp:GridView>
    </td></tr>
</table>
</asp:Content>

