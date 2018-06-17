﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.Security;

public partial class ProfessionalRegister : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void CreateUserWizard1_ContinueButtonClick(object sender, EventArgs e)
    {
        string use = Context.User.Identity.Name;
        Roles.AddUserToRole(use, "Professional");
        Response.Redirect("UbiquitousHome.aspx");
    }
}