using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;
using System.Web.Security;

namespace UbiquitousDesign
{
    public partial class UserReview : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void basicRev(object sender, EventArgs e)
        {
            SqlConnection vid = new SqlConnection("Data Source=.\\SQLEXPRESS;AttachDbFilename=|DataDirectory|\\ASPNETDB.MDF;Integrated Security=True;User Instance=True");
            {
                SqlCommand xp = new SqlCommand("Insert into Review(UserID,ReviewText,GameScore,GameID,ReviewDate,ReviewID,PlatformID,RoleID)Values(@UserID, @ReviewText, @GameScore, @GameID, @ReviewDate, @ReviewID, @PlatformID, @RoleID)", vid);


                string connectionString = "Data Source=.\\SQLEXPRESS;AttachDbFilename=|DataDirectory|\\ASPNETDB.MDF;Integrated Security=True;User Instance=True";

                DataTable userRev = new DataTable("Review");
                using (SqlConnection conn = new SqlConnection(connectionString))
                {
                    string command = "SELECT * FROM Review";
                    using (SqlCommand cmd = new SqlCommand(command, conn))
                    {

                        SqlDataAdapter adapt = new SqlDataAdapter(cmd);
                        conn.Open();
                        adapt.Fill(userRev);
                        conn.Close();
                    }
                }
                Console.Read();
                int maxID;
                String max = "";
                foreach (DataRow row in userRev.Rows)
                {
                    max = row["ReviewID"].ToString();

                }
                MembershipUser user = Membership.GetUser();
                string id = user.ProviderUserKey.ToString();
                var dateAndTime = DateTime.Now;
                var date = dateAndTime.Date;
                Int32.TryParse(max, out maxID);


                DataTable getRoleID = new DataTable("aspnet_UsersInRoles");
                using (SqlConnection conn = new SqlConnection(connectionString))
                {
                    string roleQuery = "Select RoleId FROM aspnet_UsersInRoles WHERE UserId=" + user;
                    using (SqlCommand cmd = new SqlCommand(roleQuery, conn))
                    {

                        SqlDataAdapter adapter = new SqlDataAdapter(cmd);
                        conn.Open();
                        adapter.Fill(getRoleID);
                        conn.Close();

                    }
                    Console.Read();
                    String role = "";
                    foreach (DataRow row in getRoleID.Rows)
                    {
                        role = row["RoleId"].ToString();

                    }


                    DataTable getUserName = new DataTable("Review");
                    using (SqlConnection conn2 = new SqlConnection(connectionString))
                    {
                        string userNameQuery = "Select UserName FROM Review WHERE UserId=" + user;
                        using (SqlCommand cmd = new SqlCommand(userNameQuery, conn2))
                        {

                            SqlDataAdapter adapter = new SqlDataAdapter(cmd);
                            conn2.Open();
                            adapter.Fill(getUserName);
                            conn2.Close();

                        }
                        Console.Read();
                        String userN = "";
                        foreach (DataRow row in getUserName.Rows)
                        {
                            userN = row["UserName"].ToString();

                        }





                        xp.Parameters.AddWithValue("@UserID", user);
                        xp.Parameters.AddWithValue("@ReviewText", UserBox1.Text);
                        xp.Parameters.AddWithValue("@GameScore", 1);     //must fix these
                        xp.Parameters.AddWithValue("@GameID", 1);
                        xp.Parameters.AddWithValue("@ReviewDate", date);
                        xp.Parameters.AddWithValue("@ReviewID", maxID + 1);
                        xp.Parameters.AddWithValue("@PlatformID", 1);
                        xp.Parameters.AddWithValue("@RoleID", role);
                        xp.Parameters.AddWithValue("@UserName", userN);



                        vid.Open();
                        xp.ExecuteNonQuery();
                        vid.Close();

                        if (IsPostBack)
                        {
                            UserBox1.Text = "";
                        }


                    }
                }
            }
        }

        protected void dropLists(object sender, EventArgs e)
        {
            string connectionString = "Data Source=.\\SQLEXPRESS;AttachDbFilename=|DataDirectory|\\ASPNETDB.MDF;Integrated Security=True;User Instance=True";
            DropDownList2.Visible = false;
            String platID = DropDownList1.SelectedValue;
            DataTable selectGame = new DataTable("Game");
            using (SqlConnection conn = new SqlConnection(connectionString))
            {
                string aquery = "Select GameTitle from Game where PlatformID=" + platID;
                using (SqlCommand cmd = new SqlCommand(aquery, conn))
                {

                    SqlDataAdapter adapter = new SqlDataAdapter(cmd);
                    conn.Open();
                    adapter.Fill(selectGame);
                    conn.Close();

                }
                Console.Read();
                String gameName = "";
                foreach (DataRow row in selectGame.Rows)
                {
                    gameName = row["GameTitle"].ToString();
                    DropDownList2.Items.Add(gameName);

                }
                DropDownList2.Visible = false;

            }
            DropDownList2.Visible = true;
        }

    }
}

