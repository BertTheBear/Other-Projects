<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" AutoEventWireup="true" CodeFile="UbiquitousHome.aspx.cs" Inherits="UbiquitousHome" %>

<asp:Content ID="Content1" ContentPlaceHolderID="TitlePlaceHolder" Runat="Server">
        <title><%=randomTitle()%></title>
  </asp:Content>

<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <table align="center">
        <tr>
            <td style="overflow: hidden; width: 460px; text-align: left;">
            <!-- Not sure how to do the other article entries. We may just do it as a table with one column -->
            <p style="text-align:center;padding: 10px 0px 15px 0px; background-color: #000000;">
                    <i><b>Recent Articles:</b></i>
            </p>
            <div id="TEXT">
            <table style="width: 460px; max-height:200px;">
                <tr>
                    <td colspan="2" style="text-align: left; background-color:transparent;" class="style1">
                     <b><%=getArticle(0,0)%></b>
                    </td>
                </tr>
                <tr>
                    <td style="background-color:transparent; max-height:200px; max-width:175px; width:175px;" class="style1">
<img src="ArticleImages/<%=getArticle(0,1)%>.jpg" alt="No Article Image" height="140px" width="170px" /><!-- This gets the image associated with the article -->
                    </td>
                    <td style="overflow: hidden; max-width: 280px; width: 280px; max-height:200px; text-align: justify; background-color:transparent;">
                     <i><%=getArticle(0,2)%></i>
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
                        <%=getArticle(0, 3)%> <!-- This gets the name of the user who created the article -->
                </a>
            </div>

            <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
            <table>
                <tr>
                    <td colspan="2" style="text-align: left; background-color:transparent;" class="style1">
                     <b><%=getArticle(1,0)%></b>
                    </td>
                </tr>
                <tr>
                    <td style="background-color:transparent; max-height:200px; max-width:175px; width:175px;" class="style1">
<img src="ArticleImages/<%=getArticle(1,1)%>.jpg" alt="No Article Image" height="140px" width="170px" /><!-- This gets the image associated with the article -->
                    </td>
                    <td style="overflow: hidden; max-width: 280px; width: 280px; max-height:200px; text-align: justify; background-color:transparent;">
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
            <table style="width: 460px; max-height:200px;">
                <tr>
                    <td colspan="2" style="text-align: left; background-color:transparent;" class="style1">
                     <b><%=getArticle(2,0)%></b>
                    </td>
                </tr>
                <tr>
                    <td style="background-color:transparent; max-height:200px; max-width:175px; width:175px;" class="style1">
<img src="ArticleImages/<%=getArticle(2,1)%>.jpg" alt="No Article Image" height="140px" width="170px" /><!-- This gets the image associated with the article -->
                    </td>
                    <td style="overflow: hidden; max-width: 280px; width: 280px; max-height:200px; text-align: justify; background-color:transparent;">
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
            <table style="width: 460px; max-height:200px;">
                <tr>
                    <td colspan="2" style="text-align: left; background-color:transparent;" class="style1">
                     <b><%=getArticle(3,0)%></b>
                    </td>
                </tr>
                <tr>
                    <td style="background-color:transparent; max-height:200px; max-width:175px; width:175px;" class="style1">
<img src="ArticleImages/<%=getArticle(3,1)%>.jpg" alt="No Article Image" height="140px" width="170px" /><!-- This gets the image associated with the article -->
                    </td>
                    <td style="overflow: hidden; max-width: 280px; width: 280px; max-height:200px; text-align: justify; background-color:transparent;">
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

             <div id="TEXT">
            <table style="width: 460px; max-height:200px;">
                <tr>
                    <td colspan="2" style="text-align: left; background-color:transparent;" class="style1">
                     <b><%=getArticle(4,0)%></b>
                    </td>
                </tr>
                <tr>
                    <td style="background-color:transparent; max-height:200px; max-width:175px; width:175px;" class="style1">
<img src="ArticleImages/<%=getArticle(4,1)%>.jpg" alt="No Article Image" height="140px" width="170px" /><!-- This gets the image associated with the article -->
                    </td>
                    <td style="overflow: hidden; max-width: 280px; width: 280px; max-height:200px; text-align: justify; background-color:transparent;">
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

            <!-- Right aligned side -->
            <td style="overflow: hidden; width: 260px; text-align: left;">
            <p style="text-align:center;padding: 10px 0px 15px 0px; background-color: #000000;">
                    <i><b>Most recent reviews:</b></i>
            </p>

            <!-- First table -->
            <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
            <table align="center">
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Title:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(0,0)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Platform:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(0,1)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Score:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(0,2)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: justify; background-color:transparent;" colspan="2">
                 <i><%=getReview(0,3)%></i>
                </td>
            </tr>
            </table>
            </div>
            <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                <a href="#">
                    Submitted by user 
                    <%=getReview(0,4)%> <!-- This gets the name of the user who created the article -->
                </a>
            </div>


            <!-- Second table -->
            <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
            <table align="center">
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Title:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(1,0)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Platform:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(1,1)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Score:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(1,2)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: justify; background-color:transparent;" colspan="2">
                 <i><%=getReview(1,3)%></i>
                </td>
            </tr>
            </table>
            </div>
            <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                <a href="#">
                    Submitted by user 
                    <%=getReview(1,4)%> <!-- This gets the name of the user who created the article -->
                </a>
            </div>


            <!-- Third Review table -->
            <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
            <table align="center">
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Title:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(2,0)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Platform:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(2,1)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Score:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(2,2)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: justify; background-color:transparent;" colspan="2">
                 <i><%=getReview(2,3)%></i>
                </td>
            </tr>
            </table>
            </div>
            <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                <a href="#">
                    Submitted by user 
                    <%=getReview(2,4)%> <!-- This gets the name of the user who created the article -->
                </a>
            </div>


            <!-- Fourth Review table -->
            <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
            <table align="center">
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Title:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(3,0)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Platform:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(3,1)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: left; background-color:transparent;">
                Score:
                </td>
                <td style="overflow: hidden; width: 260px; text-align: right; background-color:transparent;">
                    <%=getReview(3,2)%>
                </td>
            </tr>
            <tr>
                <td style="overflow: hidden; width: 260px; text-align: justify; background-color:transparent;" colspan="2">
                 <i><%=getReview(3,3)%></i>
                </td>
            </tr>
            </table>
            </div>
            <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                <a href="#">
                    Submitted by user 
                    <%=getReview(3,4)%> <!-- This gets the name of the user who created the article -->
                </a>
            </div>
            </td>
        </tr>
    </table>
</asp:Content>

