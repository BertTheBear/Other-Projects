<%@ Page Title="" Language="C#" MasterPageFile="/UbiquitousDesign/AdminMasterPage.master" %>

<script runat="server">

</script>

<asp:Content ID="Content1" ContentPlaceHolderID="TitlePlaceHolder" Runat="Server">
    <title>Admin Profile Page</title>
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
		<li><a href="AddGame.aspx" title="Add Game">Add Game</a></li>
        <li><a href="AddPlatform.aspx" title="Add Platform.">Add Platform</a></li>
        <li><a href="EditOrDeleteReview.aspx" title="Edit Or Delete Review.">Edit Or Delete Review</a></li>
    </ul>
</div>
  </div>
</div>
</asp:Content>