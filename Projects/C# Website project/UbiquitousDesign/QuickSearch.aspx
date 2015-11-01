<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" %>

<script runat="server">

</script>

<asp:Content ID="Content1" ContentPlaceHolderID="TitlePlaceHolder" Runat="Server">
    <title>Quick Search</title>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">

<div id="CONTENT">
  <div id="TEXT">
        <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="Data Source=.\SQLEXPRESS;AttachDbFilename=|DataDirectory|\UbiquitousDB.MDF;Integrated Security=True;User Instance=True" SelectCommand="SELECT [GameID], [GameTitle] FROM [Game]"></asp:SqlDataSource>
    

        <asp:DropDownList ID="DropDownList1" runat="server" AutoPostBack="True" DataSourceID="SqlDataSource1" DataTextField="GameTitle" DataValueField="GameID">
        </asp:DropDownList>
        <asp:SqlDataSource ID="SqlDataSource2" runat="server" 
            ConnectionString="Data Source=.\SQLEXPRESS;AttachDbFilename=|DataDirectory|\UbiquitousDB.MDF;Integrated Security=True;User Instance=True" 
            SelectCommand="SELECT g.GameTitle, r.GameScore, r.ReviewDate, r.ReviewText FROM Review AS r INNER JOIN Game AS g ON r.GameID = g.GameID WHERE (r.GameID = @GameID)">
            <SelectParameters>
                <asp:ControlParameter ControlID="DropDownList1" Name="GameID" PropertyName="SelectedValue" Type="Int32" />
            </SelectParameters>
        </asp:SqlDataSource>
        <asp:DataList ID="DataList1" runat="server" DataSourceID="SqlDataSource2">
            <ItemTemplate>
                GameTitle:
                <asp:Label ID="GameTitleLabel" runat="server" Text='<%# Eval("GameTitle") %>' />
                <br />
                GameScore:
                <asp:Label ID="GameScoreLabel" runat="server" Text='<%# Eval("GameScore") %>' />
                <br />
                ReviewDate:
                <asp:Label ID="ReviewDateLabel" runat="server" Text='<%# Eval("ReviewDate") %>' />
                <br />
                ReviewText:
                <asp:Label ID="ReviewTextLabel" runat="server" 
                    Text='<%# Eval("ReviewText") %>' />
<br />
                <br />
            </ItemTemplate>
        </asp:DataList>
    </div>
</div>
</asp:Content>

