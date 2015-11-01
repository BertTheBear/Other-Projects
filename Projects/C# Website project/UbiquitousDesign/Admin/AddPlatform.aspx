<%@ Page Title="" Language="C#" MasterPageFile="/UbiquitousDesign/AdminMasterPage.master" AutoEventWireup="true" CodeFile="AddPlatform.aspx.cs" Inherits="AddPlatform" %>

<asp:Content ID="Content1" ContentPlaceHolderID="TitlePlaceHolder" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="CONTENT">
  <div id="TEXT" style="background-color: transparent;">
    <h1 style="text-align:center;">Frequently Asked Questions</h1>
  </div>
</div>
<div style="width:760px; margin-left:auto; margin-right:auto;">
 <div style="padding: 15px 10px 15px 10px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; 
     background-color: #222222; text-align: justify;">
     <table align="center" width="300px">
        <tr><td style="background-color: transparent; text-align: right;">
            Platform Name
            <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
            <br />
            <br />
            PlatformID
            <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
            <br />
            <br />
            <br />
            <br />
            <asp:Button ID="Button1" runat="server" Text="Add New Platform" />
            <br />
            <br />
            <br />
        </td></tr>
    </table>
</div>
</div>
</asp:Content>
