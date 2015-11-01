<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" %>

<script runat="server">

</script>

<asp:Content ID="Content1" ContentPlaceHolderID="TitlePlaceHolder" Runat="Server">
    <title>Profile Page</title>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <div id="CONTENT">
  <div id="TEXT" style="background-color: transparent;">
    <h1 style="text-align: center;">Profile Page</h1>
  </div>
</div>
<div id="CONTENT">
  <div id="TEXT">
    <div id="HEADER">
    <ul>
		<li><a href="Admin/AdminPage.aspx" title="Admin settings.">AdminSettings</a></li>
        <li><a href="Account.aspx" title="Change your Password.">Change Password</a></li>
        <li><a href="Login.aspx" title="Login to your account.">Login</a></li>
    </ul>
</div>
  </div>
</div>
</asp:Content>