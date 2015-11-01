<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" %>

<script runat="server">

</script>
<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Ubiquitous Submit Article.</title>
</asp:Content>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="CONTENT">
  <div id="TEXT" style="background-color: transparent;">
    <h1 style="text-align: center">Write Article</h1>
  </div>
</div>
<div id="CONTENT">
  <div id="TEXT">
  <table width="400px" align="center"><tr><td style="background-color: transparent; text-align: right;">
     <div id="cphMain_MakerDropListDiv" style="height: 25px">
            Platform:
        <select name="ctl00$cphMain$MakerDropList" onchange="javascript:setTimeout(&#39;__doPostBack(\&#39;ctl00$cphMain$MakerDropList\&#39;,\&#39;\&#39;)&#39;, 0)" id="cphMain_MakerDropList" style="width:100px;">
	        <option selected="selected" value=""></option>
	        <option value="83">Xbox One</option>
	        <option value="84">Xbox 360</option>
	        <option value="85">Playstation 4</option>
	        <option value="86">Playstation 3</option>
	        <option value="87">Nintendo Wii</option>
	        <option value="88">PC</option>
        </select>
    </div>
    </td></tr>
    <tr><td style="background-color: transparent; text-align: left;">
             Review: <br />
        <textarea name="ctl00$cphMain$ReviewTextBox" rows="2" cols="20" id="cphMain_ReviewTextBox" style="height:170px;width:393px;" onclick="return cphMain_ReviewTextBox_onclick()">
        </textarea>
    <div style="float: left; width: 190px; margin-left: 5px; text-align: right; border: 1px solid black">
    </div>
    </td></tr>
    <tr><td style="background-color: transparent; text-align: center;">
    <div id="cphMain_fileUploadDiv" style="height: 58px; width: 397px;">
        Chose picture:
            <input type="file" name="ctl00$cphMain$FileUpload1" id="cphMain_FileUpload1" />
            <input type="submit" name="ctl00$cphMain$SubmitReview" value="Submit" id="cphMain_SubmitReview" class="reviewButton" />
     </div>
     </td></tr>
     </table>
  </div>
    <script language="javascript" type="text/javascript">
    </script>
  </div>
</asp:Content>

