<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" %>

<script runat="server">

</script>

<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Oops!</title>
</asp:Content>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="CONTENT">
  <div id="TEXT" style="background-color: transparent;">
    <h1 style="text-align: center;">That's not supposed to happen...</h1>
  </div>
</div>
<div id="CONTENT">
  <div id="TEXT">
    <table align="center" width="400px">
        <tr><td style="background-color: transparent; text-align: center;">
            Oh dear. Something went wrong. How did that happen?
        </td></tr>
        <tr><td style="background-color: transparent; text-align: center;">
                <img src="images/broken.jpg" alt="That train wasn't there this morning..." title="Hopefully nobody will notice."/>
        </td></tr>
        <tr><td style="background-color: transparent; text-align: center;">
            Don't worry, I'll sort this out. You can just  
            <a href="UbiquitousHome.aspx"> head home.</a>
        </td></tr>
    </table>
  </div>
</div>
</asp:Content>



