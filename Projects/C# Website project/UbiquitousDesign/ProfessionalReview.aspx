<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" AutoEventWireup="true" CodeFile="ProfessionalReview.aspx.cs" Inherits="ProfessionalReview" %>

<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Ubiquitous Submit Review</title>
</asp:Content>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="CONTENT">
  <div id="TEXT" style="background-color: transparent;">
    <h1 style="text-align: center;">Write Review  </h1>
  </div>
</div>
<div id="CONTENT">
 <div id="TEXT">
   <div style="width: 720px;text-align: center;">
        
        <!-- We might move the error messages up higher so they are more visible like the other pages. -->

      <table align="center" width="400px"><tr><td style="background-color: transparent; text-align: right;">

            <p>
                <asp:Label ID="Label2" runat="server" Text="Gameplay"></asp:Label>
            </p>
            <p>
                <asp:TextBox ID="GmplyTxtBox" runat="server" Height="100px" Width="350px"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator4" runat="server" 
                    ControlToValidate="GmplyTxtBox" ErrorMessage="Please enter a Gameplay Review"></asp:RequiredFieldValidator>
            </p>

            <p>
            <asp:Label ID="Label1" runat="server" Text="Graphics"></asp:Label>
            </p>
            <p>
                <asp:TextBox ID="GfxTxtBox" runat="server" Height="100px" Width="350px"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" 
                    ControlToValidate="GfxTxtBox" ErrorMessage="Please enter a Graphics review"></asp:RequiredFieldValidator>
            </p>

            <p>
                <asp:Label ID="Label3" runat="server" Text="Overall"></asp:Label>
            </p>
            <p>
                <asp:TextBox ID="OverallTxtBox" runat="server" Height="100px" Width="350px"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" 
                    ControlToValidate="OverallTxtBox" ErrorMessage="Please enter an Overall review"></asp:RequiredFieldValidator>
            </p>

      </td></tr></table>
      
    <%--<div id="cphMain_fileUploadDiv" style="height: 25px; float:inherit;">--%>
        Choose picture:
        <input type="file" name="ctl00$cphMain$FileUpload1" id="cphMain_FileUpload1" />
        <input type="submit" name="ctl00$cphMain$SubmitReview" value="Submit" id="cphMain_SubmitReview" class="reviewButton" />
        <br />     <br />
    
        <asp:Button ID="Button1" runat="server" OnClick="uploadReview" Text="Submit Review" />
        <br />
        <br />
   <%--</div>--%>  


    </div>
  </div>
</div>
</asp:Content>