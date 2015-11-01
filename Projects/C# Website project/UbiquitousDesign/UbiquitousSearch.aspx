<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" %>

<script runat="server">

</script>
<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Ubiquitous Search Page.</title>
</asp:Content>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="CONTENT">
 <div id="TEXT">
    <h1 style="text-align:center;"> Search for reviews or articles.</h1>
    <table align="center">
        <tr>
          <td>
                <span id="cphMain_LblMake" style="display:inline-block;width:200px;">Search by Platform</span>
          </td>
            <td>
            <select name="ctl00$cphMain$DrpMake" onchange="javascript:setTimeout(&#39;__doPostBack(\&#39;ctl00$cphMain$DrpMake\&#39;,\&#39;\&#39;)&#39;, 0)" id="cphMain_DrpMake" style="width:200px;">
	          <option selected="selected" value="0">&lt;Select Platform&gt;</option>
                <option value="82">All Platforms</option>
	            <option value="83">Xbox One</option>
	            <option value="84">Xbox 360</option>
	            <option value="85">Playstation 4</option>
	            <option value="86">Playstation 3</option>
	            <option value="87">Nintendo Wii</option>
                <option value="88">Nintendo Wii U</option>
	            <option value="89">PC</option> 
            </select>
          </td>
        </tr>
        <tr>
          <td>
                <span id="cphMain_LblModel" style="display:inline-block;width:200px;">Search by Overall Rating</span>
          </td>
          <td>
            <select name="ctl00$cphMain$DrpModel" onchange="javascript:setTimeout(&#39;__doPostBack(\&#39;ctl00$cphMain$DrpModel\&#39;,\&#39;\&#39;)&#39;, 0)" id="cphMain_DrpModel" style="width:200px;">
	            <option selected="selected" value="0">&lt;Select Overall Rating&gt;</option>
                <option value="1">1</option>
	            <option value="2">2</option>
	            <option value="3">3</option>
	            <option value="4">4</option>
	            <option value="5">5</option> 
            </select>
          </td>
        </tr>
        <tr>
          <td>
             <span id="cphMain_LblDoor" style="display:inline-block;width:200px;">Search by Graphics</span></td>
          <td>
            <select name="ctl00$cphMain$DrpDoors" onchange="javascript:setTimeout(&#39;__doPostBack(\&#39;ctl00$cphMain$DrpDoors\&#39;,\&#39;\&#39;)&#39;, 0)" id="cphMain_DrpDoors" style="width:200px;">
	            <option selected="selected" value="0">&lt;Select Graphics&gt;</option>
	            <option value="1">1</option>
	            <option value="2">2</option>
	            <option value="3">3</option>
	            <option value="4">4</option>
	            <option value="5">5</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>
            <span id="cphMain_LblEngine" style="display:inline-block;width:200px;">Search by Gameplay</span>
          </td>
          <td>
            <select name="ctl00$cphMain$DrpEngine" onchange="javascript:setTimeout(&#39;__doPostBack(\&#39;ctl00$cphMain$DrpEngine\&#39;,\&#39;\&#39;)&#39;, 0)" id="cphMain_DrpEngine" style="width:200px;">
	            <option selected="selected" value="0">&lt;Select Gameplay&gt;</option>
	            <option value="1">1</option>
	            <option value="2">2</option>
	            <option value="3">3</option>
	            <option value="4">4</option>
	            <option value="5">5</option>
	            <option value="6">6</option>
	            <option value="8">8</option>
	            <option value="9">9</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>
            <span id="cphMain_LblSearch" style="display:inline-block;width:200px;">Search by Story</span>
          </td>
          <td>
            <select name="ctl00$cphMain$DrpTransmission" onchange="javascript:setTimeout(&#39;__doPostBack(\&#39;ctl00$cphMain$DrpTransmission\&#39;,\&#39;\&#39;)&#39;, 0)" id="cphMain_DrpTransmission" style="width:200px;">
	            <option selected="selected" value="0">&lt;Select Story&gt;</option>
                <option value="1">1</option>
	            <option value="2">2</option>
	            <option value="3">3</option>
	            <option value="4">4</option>
	            <option value="5">5</option>
            </select>
        </td>
      </tr>
      <tr>
        <td>
            <span id="cphMain_LblColor" style="display:inline-block;width:200px;">Search by Sound</span>
        </td>
        <td>
            <select name="ctl00$cphMain$DrpColor" onchange="javascript:setTimeout(&#39;__doPostBack(\&#39;ctl00$cphMain$DrpColor\&#39;,\&#39;\&#39;)&#39;, 0)" id="cphMain_DrpColor" style="width:200px;">
	            <option selected="selected" value="0">&lt;Select Sound&gt;</option>
	            <option value="1">1</option>
	            <option value="2">2</option>
	            <option value="3">3</option>
	            <option value="4">4</option>
	            <option value="5">5</option>
            </select>
        </td>
      </tr>
    </table>
  </div>
</div>
</asp:Content>

