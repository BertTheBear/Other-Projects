using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;//makes SQL work

public partial class NewsArchive : System.Web.UI.Page
{
    //This should not need to be changed and shoul automatically map (Thanks Shane)
    string myConnectionString = @"Data Source=.\SQLEXPRESS;AttachDbFilename=|DataDirectory|\UbiquitousDB.MDF;Integrated Security=True;User Instance=True";


    protected string nextPage()
    {
        string path = HttpContext.Current.Request.Url.AbsoluteUri;
        //Sort path
        int temp = path.LastIndexOf("=");
        string id = path.Substring(temp + 1);
        if (!Int32.TryParse(id, out temp))
        {
            temp = 0;
        }
        else
        {
            temp = Convert.ToInt32(id);
        }
        temp = temp + 1;
        id = "" + temp;
        return id;
    }

    protected int getPage()
    {
        string path = HttpContext.Current.Request.Url.AbsoluteUri;
        //Sort path
        int temp = path.LastIndexOf("=");
        string id = path.Substring(temp + 1);
        if(!Int32.TryParse(id, out temp))
        {
            temp = 0;
        }
        else
        {
            temp = Convert.ToInt32(id);
        }
        return temp;
    }
    
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

        num = num + 5 * getPage();

        switch (slot)
        {
            case 0://ArticleTitle
                type = "ArticleTitle";
                break;
            case 1://Image
                type = "ArticleID";
                break;
            case 2://text
                type = "ArticleText";
                break;
            case 3://Username
         //       before = "SELECT UserName FROM aspnet_Users WHERE UserID = (";
         //       after = ")";
                type = "ArticleWriter";
                break;
            default:
                type = "*";
                break;
        }
        string tempstring = "";
        for (int i = 5 * getPage(); i <= num; i++)
        {
            if (i % 5 == 0)
                param = "SELECT TOP 1 ArticleDate FROM " + table + ")";
            else if (i % 5 == 1)
                param = "SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + "))";
            else
            {
                tempstring = tempstring + ")";
                param = "SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (" + param;
            }
        }
        param = " WHERE ArticleDate = (" + param + tempstring;
        //switch (num)
        //{
        //    case 0:
        //        param = " WHERE ArticleDate = (SELECT TOP 1 ArticleDate FROM " + table + ")";
        //        break;
        //    case 1:
        //        param = " WHERE ArticleDate = (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + "))";
        //        break;
        //    case 2:
        //        param = " WHERE ArticleDate = (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + ")))";
        //        break;
        //    case 3:
        //        param = " WHERE ArticleDate = (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + "))))";
        //        break;
        //    case 4:
        //        param = " WHERE ArticleDate = (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + " WHERE ArticleDate < (SELECT MAX(ArticleDate) FROM " + table + ")))))";
        //        break;
        //    default:
        //        param = "";
        //        break;
        //}
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
            if (result.Length >= 556)
            {
                result = result.Substring(0, 555);
                int end = result.LastIndexOf(".");
                result = result.Substring(0, end + 1);
            }
        }
        return result;
    }
}