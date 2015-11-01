<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" AutoEventWireup="true" CodeFile="NewsArchive.aspx.cs" Inherits="NewsArchive" %>

<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Ubiquitous News Archive</title>
        <style type="text/css">
            .style1
            {
                width: 428px;
            }
            .style2
            {
                width: 200px;
            }
        </style>
</asp:Content>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <div id="HEADER">
    <ul>
		<li><a href="WriteArticlePage.aspx" title="Submit a news article.">Submit Article</a></li>
    </ul>
</div>
<br />
<table align="center" >
<div id="CONTENT">
    <div style="text-align:center; padding: 10px 0px 15px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #000000;">
        <i><h1 style="text-align:center;">News Article Archive:</h1></i>
    </div>
    <br />
        <table align="center">
        <tr><td>
            <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
            <table style="width: 740px; max-height:200px;">
                <tr>
                    <td colspan="2" style="text-align: left; background-color:transparent;" class="style1">
                     <b><%=getArticle(0,0)%></b>        <!-- This gets the title of the article -->
                    </td>
                </tr>
                <tr>
                    <td style="background-color:transparent; max-height:200px; max-width:175px;" 
                        class="style2">
<img src="ArticleImages/<%=getArticle(0,1)%>.jpg" alt="No Article Image" height="140px" width="170px" /><!-- This gets the image associated with the article -->
                    </td>
                    <td style="overflow: hidden; max-height:200px; text-align: justify; background-color:transparent;">
                     <i><%=getArticle(0,2)%></i>        <!-- This gets the article text. It is limited and will cut off after a certain number of characters -->
                        <br /> <br />
                        <a href="ViewArticle.aspx?id=<%=
                           getArticle(0,1)%>">Continue Reading...</a>
                    </td>
                </tr>
            </table>
            </div>
            <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                <a href="#">
                    Submitted by 
                        <%=getArticle(0, 3)%>           <!-- This gets the name of the user who created the article -->
                </a>
            </div>

            <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
            <table style="width: 740px; max-height:200px;">
                <tr>
                    <td colspan="2" style="text-align: left; background-color:transparent;" class="style1">
                     <b><%=getArticle(1,0)%></b>
                    </td>
                </tr>
                <tr>
                    <td style="background-color:transparent; max-height:200px; max-width:175px;" class="style2">
<img src="ArticleImages/<%=getArticle(1,1)%>.jpg" alt="No Article Image" height="140px" width="170px" /><!-- This gets the image associated with the article -->
                    </td>
                    <td style="overflow: hidden; max-height:200px; text-align: justify; background-color:transparent;">
                     <i><%=getArticle(1,2)%></i>
                        <br /> <br />
                        <a href="ViewArticle.aspx?id=<%=
                           getArticle(1,1)%>">Continue Reading...</a>
                    </td>
                </tr>
            </table>
            </div>
            <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                <a href="#">
                    Submitted by 
                        <%=getArticle(1,3)%> <!-- This gets the name of the user who created the article -->
                </a>
            </div>

            <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
            <table style="width: 740px; max-height:200px;">
                <tr>
                    <td colspan="2" style="text-align: left; background-color:transparent;" class="style1">
                     <b><%=getArticle(2,0)%></b>
                    </td>
                </tr>
                <tr>
                    <td style="background-color:transparent; max-height:200px; max-width:175px;" class="style2">
<img src="ArticleImages/<%=getArticle(2,1)%>.jpg" alt="No Article Image" height="140px" width="170px" /><!-- This gets the image associated with the article -->
                    </td>
                    <td style="overflow: hidden; max-height:200px; text-align: justify; background-color:transparent;">
                     <i><%=getArticle(2,2)%></i>
                        <br /> <br />
                        <a href="ViewArticle.aspx?id=<%=
                           getArticle(2,1)%>">Continue Reading...</a>
                    </td>
                </tr>
            </table>
            </div>
            <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                <a href="#">
                    Submitted by 
                        <%=getArticle(2, 3)%> <!-- This gets the name of the user who created the article -->
                </a> 
            </div>

            <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
            <table style="width: 740px; max-height:200px;">
                <tr>
                    <td colspan="2" style="text-align: left; background-color:transparent;" class="style1">
                     <b><%=getArticle(3,0)%></b>
                    </td>
                </tr>
                <tr>
                    <td style="background-color:transparent; max-height:200px; max-width:175px;" class="style2">
<img src="ArticleImages/<%=getArticle(3,1)%>.jpg" alt="No Article Image" height="140px" width="170px" /><!-- This gets the image associated with the article -->
                    </td>
                    <td style="overflow: hidden; max-height:200px; text-align: justify; background-color:transparent;">
                     <i><%=getArticle(3,2)%></i>
                        <br /> <br />
                        <a href="ViewArticle.aspx?id=<%=
                           getArticle(3,1)%>">Continue Reading...</a>
                    </td>
                </tr>
            </table>
            </div>
            <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                <a href="#">
                    Submitted by 
                        <%=getArticle(3,3)%> <!-- This gets the name of the user who created the article -->
                </a>
            </div>

            <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
            <table style="width: 740px; max-height:200px;">
                <tr>
                    <td colspan="2" style="text-align: left; background-color:transparent;" class="style1">
                     <b><%=getArticle(4,0)%></b>
                    </td>
                </tr>
                <tr>
                    <td style="background-color:transparent; max-height:200px; max-width:175px;" class="style2">
<img src="ArticleImages/<%=getArticle(4,1)%>.jpg" alt="No Article Image" height="140px" width="170px" /><!-- This gets the image associated with the article -->
                    </td>
                    <td style="overflow: hidden; max-height:200px; text-align: justify; background-color:transparent;">
                     <i><%=getArticle(4,2)%></i>
                        <br /> <br />
                        <a href="ViewArticle.aspx?id=<%=
                           getArticle(4,1)%>">Continue Reading...</a>
                    </td>
                </tr>
            </table>
            </div>
            <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                <a href="#">
                    Submitted by 
                        <%=getArticle(4,3)%> <!-- This gets the name of the user who created the article -->
                </a>
            </div>
            </td>
            </tr>
        </table>
        <div style="text-align:center">
            <a href="NewsArchive.aspx?page=<%=nextPage()%>">Next Page</a>
        </div>
</div>
</table>
</asp:Content>