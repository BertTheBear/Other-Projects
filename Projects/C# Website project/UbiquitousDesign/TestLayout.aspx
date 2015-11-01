<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" %>
<script runat="server">

</script>
<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Ubiquitous Gaming Test Layout</title>
</asp:Content>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <table align="center">
        <tr>
            <td style="overflow: hidden; width: 460px; text-align: left;">
            <!-- Not sure how to do the other article entries. We may just do it as a table with one column -->
            <div id="TEXT">
            <table>
                <tr>
                    <td style="overflow: hidden; width: 460px; text-align: left; background-color:transparent;">
                        <b>Title of Review0</b>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 460px; text-align: left; background-color:transparent;">
                        Put the actual text here. This should be the beginning of the article, maybe the first one or two paragraphs depending on length. Should end with: <br /> <br />
                        <a href="#">Continue Reading...</a>
                    </td>
                </tr>
            </table>
            </div>

            <div id="TEXT">
            <table>
                <tr>
                    <td style="overflow: hidden; width: 460px; text-align: left; background-color:transparent;">
                        <b>Title of Review1</b>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 460px; text-align: left; background-color:transparent;">
                        Put the actual text here. This should be the beginning of the article, maybe the first one or two paragraphs depending on length. Should end with: <br /> <br />
                        <a href="#">Continue Reading...</a>
                    </td>
                </tr>
            </table>
            </div>

            <div id="TEXT">
            <table>
                <tr>
                    <td style="overflow: hidden; width: 460px; text-align: left; background-color:transparent;">
                        <b>Title of Review2</b>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 460px; text-align: left; background-color:transparent;">
                        Put the actual text here. This should be the beginning of the article, maybe the first one or two paragraphs depending on length. Should end with: <br /> <br />
                        <a href="#">Continue Reading...</a>
                    </td>
                </tr>
            </table>
            </div>

            </td>

            <!-- Right aligned side -->
            <td style="overflow: hidden; width: 260px; text-align: left;">

            <div id="TEXT">
            <table align="center">
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: center; /*background-color:transparent;*/ border: 1px; border-color: White;" colspan="2">
                    <b>Review</b>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Title:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                Cooking Papa <!-- this will need to be a reference to part of the database. Maybe the most recent review or something -->
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Score:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                8 <!-- Also need to be a reference -->
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: justify; background-color:transparent;" colspan="2">
                    <!-- And this too needs to be a reference -->
                    I believe this game to be the epitome of cooking fathers and is such an original idea and I have no idea what else to put in here for the review. <br /> <br />
                    We should probably put a limit on how much you can write in this box. Something like 255 characters (Based off of the usual SQL storage standard)
                </td>
            </tr>
            </table>
            </div>
            <div id="TEXT">
            <table align="center">
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: center; background-color: #151515; border: 1px; border-color: White;" colspan="2">
                    <i><b>Critic Review</b></i>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Title:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                Cooking Papa <!-- this will need to be a reference to part of the database. Maybe the most recent review or something -->
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Gameplay:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                8 <!-- Also need to be a reference -->
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Soundtrack:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                6 <!-- Also need to be a reference -->
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Story:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                8 <!-- Also need to be a reference -->
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Graphics:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                9 <!-- Also need to be a reference -->
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Multiplayer:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                7 <!-- Also need to be a reference -->
                </td>
            </tr>
             <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                <b>Overall Score:</b>
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                7.4 <!-- Can be a calculation -->
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: justify; background-color:transparent;" colspan="2">
                    <!-- And this too needs to be a reference -->
                    I believe this game to be the epitome of cooking fathers and is such an original idea and I have no idea what else to put in here for the review. <br /> <br />
                    I felt that though the soundtrack was sub-par, the story was not bad and the graphics were quite good. The multiplayer was also incredibly enjoyable with friends though the matchmaking wasn't very good. <br /> <br />
                    We should probably give a larger limit for professional reviews. Maybe double. <br /><br />
                    I'm also not sure if we should do a sum of all of the scores or if we should let them make their own categories but give a score out of 100 at the end.
                </td>
            </tr>
            </table>
            </div>
            </td>
        </tr>
    </table>
    <div id="CONTENT">
   <!-- For other pages, content goes here -->
    </div>
</asp:Content>

