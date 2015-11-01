<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" AutoEventWireup="true" CodeFile="ReviewPage.aspx.cs" Inherits="ReviewPage" %>

<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Ubiquitous Submit Review</title>
</asp:Content>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="CONTENT">
  <div id="TEXT" style="background-color: transparent;">
    <h1 style="text-align: center;">Write Review</h1>
  </div>
</div>
<div id="CONTENT">
 <div id="TEXT">
   <div style="width: 720px;text-align: center;">

      <table align="center" width="400px"><tr><td style="background-color: transparent; text-align: right;">
                <div>
        <asp:DropDownList ID="DropDownList1" runat="server" 
            DataSourceID="SqlDataSource1" DataTextField="PlatformName" 
            DataValueField="PlatformID">
        </asp:DropDownList>
        <asp:Button ID="submitPlatBtn" runat="server" Text="Submit Platform" OnClick="dropLists" />
        <asp:SqlDataSource ID="SqlDataSource1" runat="server" 
            ConnectionString="<%$ ConnectionStrings:Platformconnection %>" 
            SelectCommand="SELECT [PlatformID], [PlatformName] FROM [Platform]">
        </asp:SqlDataSource>
        <br />
        <br />
        <br />
        <br />
        <br />
        <asp:DropDownList ID="DropDownList2" runat="server">
        </asp:DropDownList>
        <br />
        <br />
        <br />
        <br />
    <br/>
        <asp:Label ID="UserLabel1" runat="server" 
            Text="Please write a general review about the game."></asp:Label>
    
        <br />
    
    </div>
    <asp:TextBox ID="UserBox1" runat="server" Height="100px" Width="250px"></asp:TextBox>
    <asp:RequiredFieldValidator ValidationGroup="valGroup1" ID="RequiredFieldValidator1" runat="server" 
        ControlToValidate="UserBox1" ErrorMessage="Please enter a general review for the game."></asp:RequiredFieldValidator>
    <br />
    <br />
    <br />
    <br />
    <asp:DropDownList ID="DropDownList3" runat="server">
    </asp:DropDownList>
    <br />
    <br />
    <br />
    <br />

    <asp:Button ValidationGroup="valGroup1" ID="userSubmitBtn" runat="server" OnClick="basicRev" Text="Submit Review" />
         <br />
    </td></tr></table>
    <br />
     <div id="cphMain_fileUploadDiv" style="height: 25px; float:inherit;">
        Choose picture:
        <input type="file" name="ctl00$cphMain$FileUpload1" id="cphMain_FileUpload1" />
        <input type="submit" name="ctl00$cphMain$SubmitReview" value="Submit" id="cphMain_SubmitReview" class="reviewButton" />
     </div>
     <br />
    </div>
    <br />
    <br />
  </div>
</div>

</asp:Content>

