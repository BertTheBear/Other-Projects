using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;//makes SQL work

public partial class ReviewArchive : System.Web.UI.Page
{
    //This should not need to be changed and shoul automatically map (Thanks Shane)
    string myConnectionString = @"Data Source=.\SQLEXPRESS;AttachDbFilename=|DataDirectory|\UbiquitousDB.MDF;Integrated Security=True;User Instance=True";

    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected string getReview(int num, int slot)
    {
        SqlConnection connection = new SqlConnection(myConnectionString);
        string result;
        string table = "Review";
        string param = "";
        string column = "";
        string before = "";
        string after = "";
        switch (slot)
        {
            case 0://GameID
                before = "SELECT GameTitle FROM Game WHERE GameID = ( ";
                after = " )";
                column = "GameID";
                break;
            case 1://Platform
                before = "SELECT PlatformName FROM Platform WHERE PlatformID = (";
                after = ")";
                column = "PlatformID";
                break;
            case 2://score
                column = "GameScore";
                break;
            case 3://text
                column = "ReviewText";
                break;
            case 4://Username
                before = "SELECT UserName FROM aspnet_Users WHERE UserID = (";
                after = ")";
                column = "UserID";
                break;

        }
        string temp = "";
        for (int i = 0; i <= num; i++)
        {
            if (i == 0)
                param = "SELECT TOP 1 ReviewDate FROM " + table + ")";
            else if (i == 1)
                param = "SELECT MAX(ReviewDate) FROM " + table + " WHERE ReviewDate < (SELECT MAX(ReviewDate) FROM " + table + "))";
            else
            {
                temp = temp + ")";
                param = "SELECT MAX(ReviewDate) FROM " + table + " WHERE ReviewDate < (" + param;
            }
        }
        param = " WHERE ReviewDate = (" + param + temp;
        try
        {
            connection.Open();
            SqlCommand cmd = connection.CreateCommand();
            cmd.CommandText = before + "SELECT " + column + " FROM " + table + param + after;
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
        //result = before + "SELECT " + column + " FROM " + table + param + after;
        return result;
    }
}