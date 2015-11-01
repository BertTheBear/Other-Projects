<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" AutoEventWireup="true" CodeFile="ViewArticle.aspx.cs" Inherits="ViewArticle" %>

<asp:Content ID="Content1" ContentPlaceHolderID="TitlePlaceHolder" Runat="Server">
    <title>View Article</title>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<table align="center" >
  <div id="CONTENT">
    <div style="text-align:center; padding: 10px 0px 15px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #484848; background-color: #000000;">
        <i><h1 style="text-align:center;">News Article Archive:</h1></i>
    </div>
    <br />
        <table align="center">
        <tr><td>
            <table style="width: 740px;">
                <tr>
                    <td style="text-align: center; background-color: #222222; font-size:17px;">
                     <b><%=getArticle(0)%></b>        <!-- This gets the title of the article -->
                    </td>
                </tr>
                <tr>
                    <td style="background-color:transparent; text-align:center;">
<img src="ArticleImages/<%=getArticle(1)%>.jpg" alt="Article Image"/><!-- This gets the image associated with the article -->
                    </td>
                </tr>
                <tr>
                    <td style="overflow: hidden; text-align: justify; background-color: #222222;">
                     <i><%=getArticle(2)%></i>        <!-- This gets the article text. It is limited and will cut off after a certain number of characters -->
                        <br /> <br />
                    </td>
            </tr>
        </table>
  </div>
</table>
</asp:Content>