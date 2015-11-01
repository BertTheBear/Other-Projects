<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" %>

<script runat="server">

</script>
<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>404: Page not found.</title>
</asp:Content>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="CONTENT">
  <div id="TEXT" style="background-color: transparent;">
    <h1 style="text-align: center;">404: Page not found </h1>
  </div>
</div>
<div id="CONTENT">
  <div id="TEXT">
    <table align="center" width="400px">
        <tr><td style="background-color: transparent; text-align: center;">
            I uh... think we managed to get lost. Now how did we do that? <br />
        </td></tr>
        <tr><td style="background-color: transparent; text-align: center;">
                <img src="images/lost.jpg" alt="Silent Hill? Sounds like a quaint little village." title="Seems like a nice place... Wonder why it's so foggy?"/>
        </td></tr>
        <tr><td style="background-color: transparent; text-align: justify;">
            You wait here. I'll go ask for directions in that town up there. I won't be more than 5 minutes.
            <br /> <br />
            <a href="UbiquitousHome.aspx">- Head Home?</a>
        </td></tr>
    </table>
  </div>
</div>
</asp:Content>

