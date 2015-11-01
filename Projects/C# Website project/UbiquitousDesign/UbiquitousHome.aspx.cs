using System;
using System.Collections.Generic;
using System.Web;
using System.Linq;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;//makes SQL work

public partial class UbiquitousHome : System.Web.UI.Page
{
    //This should not need to be changed and should automatically map (Thanks Shane)
    string myConnectionString = @"Data Source=.\SQLEXPRESS;AttachDbFilename=|DataDirectory|\UbiquitousDB.MDF;Integrated Security=True;User Instance=True";
    
    protected void Page_Load(object sender, EventArgs e)
    {
        
    }

    protected string getArticle(int num, int slot)
    {
        SqlConnection connection = new SqlConnection(myConnectionString);
        string result = "Not Working";
        string table = "Articles";
        string param = "";
        string type = "";
        string before = "";
        string after = "";

        switch (slot)
        {
            case 0://ArticleTitle
                type = "ArticleTitle";
                break;
      //      case 1://Image
      //          type = "ArticleImage";
      //          break;
            case 2://text
                type = "ArticleText";
                break;
            case 3://Username
       //         before = "SELECT UserName FROM aspnet_Users WHERE UserID = (";
       //         after = ")";
                type = "ArticleWriter";
                break;
            default:
                type = "*";
                break;
        }

        switch (num)
        {
            case 0:
                param = " WHERE ArticleDate = (SELECT TOP 1 ArticleDate FROM " + table + ")";
                break;
            case 1:
                param = " WHERE ArticleDate = (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + "))";
                break;
            case 2:
                param = " WHERE ArticleDate = (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + ")))";
                break;
            case 3:
                param = " WHERE ArticleDate = (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + "))))";
                break;
            case 4:
                param = " WHERE ArticleDate = (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + ")))))";
                break;
            default:
                param = "";
                break;
        }
        try
        {
            connection.Open();
            SqlCommand cmd = connection.CreateCommand();
            cmd.CommandText = before + "SELECT " + type + " FROM " + table + param + after;
            try
            {
                result = cmd.ExecuteScalar().ToString();
            }
            catch (NullReferenceException e)
            {
                result = "Null";
            }
            connection.Close();
        }
        catch (Exception e)
        {
            result = (e.ToString());
        }
        if (slot == 2)
        {
            if (result.Length >= 356)
            {
                result = result.Substring(0, 355);
                int end = result.LastIndexOf(".");
                result = result.Substring(0, end + 1);
            }
        }
        return result;
    }

    protected string getReview(int num, int slot)
    {
        SqlConnection connection = new SqlConnection(myConnectionString);
        string result;
        string table = "Review";
        string param = "";
        string type = "";
        string before = "";
        string after = "";
        switch (slot)
        {
            case 0://GameID
                before = "SELECT GameTitle FROM Game WHERE GameID = ( ";
                after = " )";
                type = "GameID";
                break;
            case 1://Platform
                before = "SELECT PlatformName FROM Platform WHERE PlatformID = (";
                after = ")";
                type = "PlatformID";
                break;
            case 2://score
                type = "GameScore";
                break;
            case 3://text
                type = "ReviewText";
                break;
            case 4://Username
                before = "SELECT UserName FROM aspnet_Users WHERE UserID = (";
                after = ")";
                type = "UserID";
                break;

        }

        switch (num)
        {
            case 0:
                param = " WHERE ReviewDate = (SELECT TOP 1 ReviewDate FROM " + table + ")";
                break;
            case 1:
                param = " WHERE ReviewDate = (SELECT MAX(ReviewDate) FROM " + table + " WHERE ReviewDate < (SELECT MAX(ReviewDate) FROM " + table + "))";
                break;
            case 2:
                param = " WHERE ReviewDate = (SELECT MAX(ReviewDate) FROM " + table + " WHERE ReviewDate < (SELECT MAX(ReviewDate) FROM " + table + " WHERE ReviewDate < (SELECT MAX(ReviewDate) FROM " + table + ")))";
                /*
                or
                table = "ProfessionalReview";
                param = " WHERE ReviewDate = (SELECT TOP 1 ReviewDate FROM " + table + ")";
                 */
                break;
            case 3:
                param = " WHERE ReviewDate = (SELECT MAX(ReviewDate) FROM " + table + " WHERE ReviewDate < (SELECT MAX(ReviewDate) FROM " + table + " WHERE ReviewDate < (SELECT MAX(ReviewDate) FROM " + table + " WHERE ReviewDate < (SELECT MAX(ReviewDate) FROM " + table + "))))";
                /*
                or
                table = "ProfessionalReview";
                param = " WHERE ReviewDate = (SELECT TOP 1 ReviewDate FROM " + table + " WHERE ReviewDate < (SELECT MAX(ReviewDate) FROM " + table + " WHERE ReviewDate < (SELECT MAX(ReviewDate) FROM " + table + ")))";
                 */
                break;
            default:
                param = "";
                break;
        }
        try
        {
            connection.Open();
            SqlCommand cmd = connection.CreateCommand();
            cmd.CommandText = before + "SELECT "+ type +" FROM " + table + param + after;
            try
            {
                result = cmd.ExecuteScalar().ToString();
            }
            catch (NullReferenceException e)
            {
                result = "Null";
            }
            connection.Close();
        }
        catch (Exception e)
        {
            result = (e.ToString());
        }
        //result = before + "SELECT " + type + " FROM " + table + param + after;
        return result;
    }
    
    public string randomTitle()
    {
        Random random = new Random();
        var page = (Page)HttpContext.Current.Handler;
        int randomNumber = random.Next(0, 20);
        string response;
        switch (randomNumber)
        {
            case 1:
                response = "You've met with a terrible fate, haven't you?";
                break;
            case 2:
                response = "You were eaten by a grue.";
                break;
            case 3:
                response = "I never asked for this.";
                break;
            case 4:
                response = "Snake? Snake?! SNAAAAAAAKE!!";
                break;
            case 5:
                response = "You must construct additional pylons.";
                break;
            case 6:
                response = "Error 404 was merely a setback!";
                break;
            case 7:
                response = "OBJECTION!!";
                break;
            case 8:
                response = "No Gods or Kings, only Games.";
                break;
            case 9:
                response = "Prepare to die... I mean... Look! Games!";
                break;
            case 0:
                response = "All your reviews are belong to us!";
                break;
            case 10:
                response = "You are not prepared!";
                break;
            case 11:
                response = "YOU used REVIEW! It's super effective!";
                break;
            case 12:
                response = "Wololololo!";
                break;
            case 13:
                response = "OBJECTION!!";
                break;
            case 14:
                response = "Spy sappin' mah sentry!";
                break;
            case 15:
                response = "War. War never changes.";
                break;
            case 16:
                response = "War has changed!";
                break;
            case 17:
                response = "Finish him!";
                break;
            case 18:
                response = "A man chooses; a website obeys.";
                break;
            case 19:
                response = "Stay a while and listen.";
                break;
            default:
                response = "Ubiquitous Gaming Home";
                break;
        }
        return response;
    }
}