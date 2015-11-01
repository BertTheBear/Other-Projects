<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" %>

<script runat="server">

</script>

<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Black Ubiquitous Down. We've got a Black Ubiquitous Down.</title>
</asp:Content>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="CONTENT">
  <div id="TEXT" style="background-color: transparent;">
    <h1 style="text-align: center;">Down for Maintenance</h1>
  </div>
</div>
<div id="CONTENT">
  <div id="TEXT">
    <table align="center" width="400px">
        <tr><td style="background-color: transparent; text-align: justify;">
            The peasants seem to have stopped working for some reason. I'll go check on them...
        </td></tr>
        <tr><td style="background-color: transparent; text-align: center;">
                <img src="images/no-more-work.jpg" alt="The workers don't seem happy." title="Maybe we should have paid them or something..."/>
        </td></tr>
        <tr><td style="background-color: transparent; text-align: justify;">
            Oh! Well... It appears our workers are staging some sort of uprising. Please head back 
            <a href="UbiquitousHome.aspx"> to our home page</a> while we try to sort this thing out.
        </td></tr>
    </table>
  </div>
</div>
</asp:Content>
