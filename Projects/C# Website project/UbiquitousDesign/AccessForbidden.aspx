<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" %>

<script runat="server">

</script>

<asp:Content ID="Content1" ContentPlaceHolderID="TitlePlaceHolder" Runat="Server">
    <title>403: Access Forbidden</title>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="CONTENT">
  <div id="TEXT" style="background-color: transparent;">
    <h1 style="text-align: center;">Stop right there criminal scum!</h1>
  </div>
</div>
<div id="CONTENT">
  <div id="TEXT">
    <table align="center" width="400px">
        <tr><td style="background-color: transparent; text-align: center;">
            403: Access Forbidden <br />
            You don't have permission to view this web-page.
        </td></tr>
        <tr><td style="background-color: transparent; text-align: center;">
                <img src="images/forbidden.jpg" alt="This guard doesn't seem pleased..." title="He's fought mud-crabs more fearsome than you!"/>
        </td></tr>
        <tr><td style="background-color: transparent; text-align: justify;">
            <a href="UbiquitousHome.aspx">- Go to Jail.</a> <br />
            <a href="UbiquitousHome.aspx">- Resist Arrest.</a> <br />
            <a href="UbiquitousHome.aspx">- Pay Gold.</a>
        </td></tr>
    </table>
  </div>
</div>
</asp:Content>

