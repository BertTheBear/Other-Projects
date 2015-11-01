<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" AutoEventWireup="true" CodeFile="ReviewArchive.aspx.cs" Inherits="ReviewArchive" %>

<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Ubiquitous Review Archive</title>
</asp:Content>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="HEADER">
    <ul>
		<li><a href="ReviewPage1.aspx" title="Write a review.">Write Review</a></li>
    </ul>
</div>
<table align="center" >
    <div id="CONTENT">
        <div style="text-align:center; padding: 10px 0px 15px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #000000;">
            <i><h1 style="text-align:center;">Game Review Archive:</h1></i>
        </div>
        <br />
        <table align="center">
            <tr>
            <td style="overflow: hidden; width: 360px; text-align: left;">
                <!-- First table -->
                <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
                <table align="center">
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Title:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(0,0)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Platform:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(0,1)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Score:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(0,2)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: justify; background-color:transparent;" colspan="2">
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
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Title:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(1,0)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Platform:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(1,1)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Score:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(1,2)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: justify; background-color:transparent;" colspan="2">
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
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Title:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(2,0)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Platform:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(2,1)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Score:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(2,2)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: justify; background-color:transparent;" colspan="2">
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
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Title:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(3,0)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Platform:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(3,1)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Score:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(3,2)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: justify; background-color:transparent;" colspan="2">
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

                <!-- Next column -->
                <td style="overflow: hidden; width: 360px; text-align: left;">
                <!-- First table -->
                <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
                <table align="center">
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Title:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(4,0)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Platform:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(4,1)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Score:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(4,2)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: justify; background-color:transparent;" colspan="2">
                     <i><%=getReview(4,3)%></i>
                    </td>
                </tr>
                </table>
                </div>
                <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                    <a href="#">
                        Submitted by user 
                        <%=getReview(4,4)%> <!-- This gets the name of the user who created the article -->
                    </a>
                </div>


                <!-- Second table -->
                <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
                <table align="center">
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Title:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(5,0)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Platform:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(5,1)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Score:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(5,2)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: justify; background-color:transparent;" colspan="2">
                     <i><%=getReview(5,3)%></i>
                    </td>
                </tr>
                </table>
                </div>
                <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                    <a href="#">
                        Submitted by user 
                        <%=getReview(5,4)%> <!-- This gets the name of the user who created the article -->
                    </a>
                </div>


                <!-- Third Review table -->
                <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
                <table align="center">
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Title:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(6,0)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Platform:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(6,1)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Score:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(6,2)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: justify; background-color:transparent;" colspan="2">
                     <i><%=getReview(6,3)%></i>
                    </td>
                </tr>
                </table>
                </div>
                <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                    <a href="#">
                        Submitted by user 
                        <%=getReview(6,4)%> <!-- This gets the name of the user who created the article -->
                    </a>
                </div>


                <!-- Fourth Review table -->
                <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #222222; text-align: justify;">
                <table align="center">
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Title:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(7,0)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Platform:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(7,1)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: left; background-color:transparent;">
                    Score:
                    </td>
                    <td style="overflow: hidden; width: 330px; text-align: right; background-color:transparent;">
                        <%=getReview(7,2)%>
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; width: 330px; text-align: justify; background-color:transparent;" colspan="2">
                     <i><%=getReview(7,3)%></i>
                    </td>
                </tr>
                </table>
                </div>
                <div style="font-size:7.5pt; color: #76DEFC; text-align: right;">
                    <a href="#">
                        Submitted by user 
                        <%=getReview(7,4)%> <!-- This gets the name of the user who created the article -->
                    </a>
                </div>
                </td>
            </tr>
    </table>
    </div>
</table>
</asp:Content>

