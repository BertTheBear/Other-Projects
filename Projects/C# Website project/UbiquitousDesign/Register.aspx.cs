using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.Security;

public partial class Register : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void CreateUserWizard1_ContinueButtonClick(object sender, EventArgs e)
    {
        string use = Context.User.Identity.Name;
        //Membership.UpdateUser.()
        Roles.AddUserToRole(use, "User");
        Response.Redirect("UbiquitousHome.aspx");
    }
}