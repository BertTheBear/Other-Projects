using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;


public partial class ProfessionalReview : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void uploadReview(object sender, EventArgs e)
    {
        SqlConnection vid = new SqlConnection(@"Data Source=.\SQLEXPRESS;AttachDbFilename=|DataDirectory|\UbiquitousDB.MDF;Integrated Security=True;User Instance=True");
        {
            SqlCommand xp = new SqlCommand("Insert into ProfessionalReview(Gameplay,Graphics,Overall,GameID,ReviewID,UserID,RoleID)Values(@Gameplay, @Graphics, @Overall, @GameID, @ReviewID, @UserID, @RoleID)", vid);


            string connectionString = @"Data Source=.\SQLEXPRESS;AttachDbFilename=|DataDirectory|\UbiquitousDB.MDF;Integrated Security=True;User Instance=True";

            DataTable review = new DataTable("ProfessionalReview");
            using (SqlConnection conn = new SqlConnection(connectionString))
            {
                string command = "SELECT * FROM ProfessionalReview";
                using (SqlCommand cmd = new SqlCommand(command, conn))
                {

                    SqlDataAdapter adapt = new SqlDataAdapter(cmd);
                    conn.Open();
                    adapt.Fill(review);
                    conn.Close();
                }
            }
            Console.Read();
            int maxID;
            String max = "";
            foreach (DataRow row in review.Rows)
            {
                max = row["ReviewID"].ToString();

            }

            Int32.TryParse(max, out maxID);

            xp.Parameters.AddWithValue("@Gameplay", GmplyTxtBox.Text);
            xp.Parameters.AddWithValue("@Graphics", GfxTxtBox.Text);
            xp.Parameters.AddWithValue("@Overall",  OverallTxtBox.Text);
            xp.Parameters.AddWithValue("@GameID",   1);
            xp.Parameters.AddWithValue("@ReviewID", max + 1);
            xp.Parameters.AddWithValue("@UserID",   "91f70ba8-5750-490d-a955-d23f07c108ae");
            xp.Parameters.AddWithValue("@RoleID",   "83e7138d-b4c0-4489-835f-1a21891d9796");
            



            vid.Open();
            xp.ExecuteNonQuery();
            vid.Close();

            if (IsPostBack)
            {
                GmplyTxtBox.Text = "";
                GfxTxtBox.Text = "";
                OverallTxtBox.Text = "";
                changePage();
            }

        }
        
    }
    protected void changePage()
    {
        Response.Redirect("WorkComplete.aspx");
    }
}