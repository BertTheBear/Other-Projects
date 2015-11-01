<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" AutoEventWireup="true" CodeFile="Account.aspx.cs" Inherits="Account" %>

<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Ubiquitous Account Information</title>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="CONTENT">
  <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #585858; background-color: #363636; text-align: justify;">
    <table align="center" width="400px">
        <tr><td style="background-color: transparent; text-align: center;">
            <asp:ChangePassword ID="ChangePassword1" runat="server" oncontinuebuttonclick="ChangePassword1_ContinueButtonClick">
            </asp:ChangePassword>
            </td></tr>
    </table>
  </div>
</div>
</asp:Content>
