<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" %>

<script runat="server">

</script>
<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Something need doing?</title>
        <style type="text/css">
            .style1
            {
                height: 0px;
                width: 0px;
            }
        </style>
</asp:Content>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <h1 style="text-align: center;">Work Complete!</h1>
<div id="CONTENT">
  <div id="TEXT">
      <p style="text-align: center;">
        <br />Your task has been completed!
    </p>
    <table align="center"><tr><td style="background-color:#222222;">
        <img src="images/work-complete.jpg" alt="A happy peon enjoying his labour." title="A working peon is a happy peon."/>
    </td></tr></table>
    <p style="text-align: center;">
        Feel free to continue to browse our site. <br />
        <a href="UbiquitousHome.aspx">Back to Home.</a>
    </p>
  </div>
</div>
<table align="center" class="style1"><tr><td style="background-color:transparent">
    <audio src="images/work-complete.mp3" autoplay="true" controls="false"></audio>
</td></tr></table>
</asp:Content>

