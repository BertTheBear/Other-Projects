using System;
using System.Collections.Generic;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class UbiquitousMasterPage : System.Web.UI.MasterPage
{
    SqlConnection search = new SqlConnection(@"Data Source=.\SQLEXPRESS;AttachDbFilename=|DataDirectory|\UbiquitousDB.MDF;Integrated Security=True;User Instance=True");
    string myConnectionString = @"Data Source=.\SQLEXPRESS;AttachDbFilename=|DataDirectory|\UbiquitousDB.MDF;Integrated Security=True;User Instance=True";

    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Log_In(object sender, EventArgs e)
    {
        Response.Redirect("/UbiquitousDesign/Login.aspx");
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        String str = "select * from Game where(GameTitle like '%' + @search + '%')";
        SqlCommand xp = new SqlCommand(str, search);
        if (SearchBox.Text.Length > 0)
        {
            xp.Parameters.Add("@search", SqlDbType.NVarChar).Value = SearchBox.Text;
            search.Open();
            xp.ExecuteNonQuery();
            SqlDataAdapter da = new SqlDataAdapter();
            da.SelectCommand = xp;
            DataSet ds = new DataSet();
            da.Fill(ds, "GameTitle");
            GridView1.DataSource = ds;
            GridView1.DataBind();
            search.Close();
        }
        else
        {
            GridView1.DataSource = null;
            GridView1.DataBind();
        }

    }
}
