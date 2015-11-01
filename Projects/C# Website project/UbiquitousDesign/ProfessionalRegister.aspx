<%@ Page Title="" Language="C#" MasterPageFile="~/UbiquitousMasterPage.master" AutoEventWireup="true" CodeFile="ProfessionalRegister.aspx.cs" Inherits="ProfessionalRegister" %>

<asp:Content ID="Content0" ContentPlaceHolderID="TitlePlaceHolder" runat="server">
        <title>Ubiquitous Account Registration</title>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div id="CONTENT">
  <div style="padding: 5px 0px 5px 0px; border-bottom: 1px solid #484848; border-top: 1px solid #585858; background-color: #363636; text-align: justify;">
    <table align="center" width="400px">
        <tr><td style="background-color: transparent; text-align: center;">
            <asp:CreateUserWizard ID="CreateUserWizard1" runat="server" 
                CreateUserButtonText="Create Professional User" 
                oncontinuebuttonclick="CreateUserWizard1_ContinueButtonClick">
                <WizardSteps>
                    <asp:CreateUserWizardStep ID="CreateUserWizardStep1" runat="server">
                    </asp:CreateUserWizardStep>
                    <asp:CompleteWizardStep ID="CompleteWizardStep1" runat="server">
                    </asp:CompleteWizardStep>
                </WizardSteps>
            </asp:CreateUserWizard>
        </td></tr>
    </table>
  </div>
</div>
</asp:Content>
