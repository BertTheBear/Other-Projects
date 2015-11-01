using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;//makes SQL work

public partial class ViewArticle : System.Web.UI.Page
{
    //This should not need to be changed and shoul automatically map (Thanks Shane)
    string myConnectionString = @"Data Source=.\SQLEXPRESS;AttachDbFilename=|DataDirectory|\UbiquitousDB.MDF;Integrated Security=True;User Instance=True";
    
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected string getArticle(int slot)
    {
        string path = HttpContext.Current.Request.Url.AbsoluteUri;
        //Sort path
        int temp = path.LastIndexOf("=");
        string id = path.Substring(temp+1);
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
            case 1://Image
                type = "ArticleID";
                break;
            case 2://text
                type = "ArticleText";
                break;
            case 3://Username
                type = "ArticleWriter";
                break;
            default:
                type = "*";
                break;
        }

        
        param = " WHERE ArticleID = " + id;
                
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
        return result;
    }
}