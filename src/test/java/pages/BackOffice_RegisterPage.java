package pages;

import actions.Wait;
import base.Keywords;
import helper.Tools;

public class BackOffice_RegisterPage extends Keywords {

	private String keyfirstname = "onlineBanking.backoffice.Register.txtFirstname";
	private String keylastname = "onlineBanking.backoffice.Register.txtLastname";
	private String keySelectrole = "onlineBanking.backoffice.Register.lblSelectyourrole";
	private String keyuserBRM = "onlineBanking.backoffice.Register.lblBRM";
	private String keymobilenumber="onlineBanking.backoffice.Register.txtmobilenumber";
	private String keyemailid="onlineBanking.backoffice.Register.txtemailaddress";
	private String keyusername="onlineBanking.backoffice.Register.txtUsername";
	private String keypassword="onlineBanking.backoffice.Register.txtPassword";
	private String keyregister="onlineBanking.backoffice.Register.btnregister2";
	private String Keyusersforapproval="onlineBanking.backoffice.Register.LblUsersforapproval";
	private String KeyEndorse="onlineBanking.backoffice.Register.btnBRMEndorse";
	private String KeyPleasespecifyreason="onlineBanking.backoffice.Register.txtPleasespecifyreason";
	private String KeyEndorsebtn="onlineBanking.backoffice.Register.btnEndorse";
	private String Keylogout="onlineBanking.backoffice.homepage.logout";
	private String KeyApprove="onlineBanking.backoffice.Register.btnBRMApprove";
	private String KeyApprovebtn="onlineBanking.backoffice.Register.btnApprove";
	private String keyuserSAC="onlineBanking.backoffice.Register.lblSAC";
	private String KeySACEndorse="onlineBanking.backoffice.Register.btnSACEndorse";
	private String KeySACApprove="onlineBanking.backoffice.Register.btnSACApprove";
	private String KeyCEGTeamLead="onlineBanking.backoffice.Register.lblCEGTeamLead";
	private String KeyCEGTeamLeadEndorse="onlineBanking.backoffice.Register.btnCEGTeamLeadEndorse";
	private String KeyCEGTeamLeadApprove="onlineBanking.backoffice.Register.btnCEGTeamLeadApprove";
	private String KeyCEGAgent="onlineBanking.backoffice.Register.lblCEGAgent";
	private String KeyCEGAgentEndorse="onlineBanking.backoffice.Register.btnCEGEndorse";
	private String KeyCEGAgentApprove="onlineBanking.backoffice.Register.btnCEGApprove";
	private String KeyAFU="onlineBanking.backoffice.Register.lblAFU";
	private String KeyAFUEndorse="onlineBanking.backoffice.Register.btnAFUEndorse";
	private String KeyAFUApprove="onlineBanking.backoffice.Register.btnAFUApprove";
	private String KeyBillsPayInnovation="onlineBanking.backoffice.Register.lblBillsPayInnovation";
	private String KeyBillsPayInnovationEndorse="onlineBanking.backoffice.Register.btnBillspayinnovationEndorse";
	private String KeyBillsPayInnovationApprove="onlineBanking.backoffice.Register.btnBillspayinnovationApprove";
	private String KeyHelpdesk="onlineBanking.backoffice.Register.lblHelpDesk";
	private String KeyHelpdeskEndorse="onlineBanking.backoffice.Register.btnHelpdeskEndorse";
	private String KeyHelpdeskApprove="onlineBanking.backoffice.Register.btnHelpdeskApprove";
	private String KeyAppsupport="onlineBanking.backoffice.Register.lblAppSupport";
	private String KeyAppsupportEndorse="onlineBanking.backoffice.Register.btnAppsupportEndorse";
	private String KeyAppsupportApprove="onlineBanking.backoffice.Register.btnAppsupportApprove";
	private String KeyUnionBankOnlineProduct="onlineBanking.backoffice.Register.lblAppSupport";
	private String KeyUnionBankOnlineProductEndorse="onlineBanking.backoffice.Register.btnAppsupportEndorse";
	private String KeyUnionBankOnlineProductApprove="onlineBanking.backoffice.Register.btnAppsupportApprove";
	private String KeyQRMaker="onlineBanking.backoffice.Register.lblAppSupport";
	private String KeyQRMakerEndorse="onlineBanking.backoffice.Register.btnAppsupportEndorse";
	private String KeyQRMakerApprove="onlineBanking.backoffice.Register.btnAppsupportApprove";
	private String KeySACDisApprove="onlineBanking.backoffice.Register.btnSACDisApprove";
	private String KeyDisApprove="onlineBanking.backoffice.Register.btndisapprove";
	private String KeyCEGTeamLeadDisApprove="onlineBanking.backoffice.Register.btnCEGTeamLeadDisApprove";
	private String KeyCEGAgentDisApprove="onlineBanking.backoffice.Register.btnCEGDisApprove";
	private String KeyAFUDisApprove="onlineBanking.backoffice.Register.btnAFUDisApprove";
	private String KeyQRMakerDisApprove="onlineBanking.backoffice.Register.btnQRMakerDisApprove";
	private String KeyBillsPayInnovationDisApprove="onlineBanking.backoffice.Register.btnBillspayinnovationDisApprove";
	private String KeyHelpDeskDisApprove="onlineBanking.backoffice.Register.btnHelpdeskDisApprove";
	private String KeyAppsupportDisApprove="onlineBanking.backoffice.Register.btnAppsupportDisApprove";
	private String 	KeyUnionBankOnlineProductDisApprove="onlineBanking.backoffice.Register.btnUBonlineproductDisApprove";
	private String KeyBillsPayOnboardingDisApprove="onlineBanking.backoffice.Register.btnBillsPayOnboardingDisApprove";
	private String KeyBillsPayOnboardingrole="onlineBanking.backoffice.Register.lblBillSPayOnboarding";
	private String KeyBillsPayOnboardingEndorse="onlineBanking.backoffice.Register.btnBillsPayOnboardingEndorse";
    public static String Username;

	public void clickSelectUserrole() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(keySelectrole);
	}
	public void clickUserBRM() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(keyuserBRM);
	}
	public void enterFirstName() throws Throwable {
		Wait.forSeconds(2000);
		type.data(keyfirstname,Tools.RANDOMTEXT("RANDOMTEXT",5));
	}

	public void enterLastName() throws Throwable {
		Wait.forSeconds(2000);
		type.data(keylastname, Tools.RANDOMTEXT("RANDOMTEXT",5));
	}
	public void entermobilenumber() throws Throwable {
		Wait.forSeconds(2000);
		type.data(keymobilenumber, Tools.RANDOMMOBILENUMBER(9));
	}
	public void entermailid() throws Throwable {
		Wait.forSeconds(2000);
		type.data(keyemailid, Tools.RANDOMMAILID(5));
	}

	public void enterusername() throws Throwable {
		Wait.forSeconds(2000);
		Username=Tools.RANDOMTEXT("RANDOMTEXT",5);
		type.data(keyusername,Username );
	}

	public void enterpassw0rd() throws Throwable {
		Wait.forSeconds(2000);
		type.data(keypassword, "p@55w0rd");
	}

	public void clickRegister() throws Throwable {
		actions.Wait.forSeconds(5000);
		click.elementBy(keyregister);
		actions.Wait.forSeconds(10000);
	}

	public void clickUserforapproval() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(Keyusersforapproval);
	}
	public void clickEndorse() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyEndorse);
	}
	public void enterPleasespecifyreason() throws Throwable {
		actions.Wait.forSeconds(2000);
		type.data(KeyPleasespecifyreason, "Reason");
	}
	public void clickEndorsebtn() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyEndorsebtn);
	}

	public void clickLogout() throws Throwable {
		actions.Wait.forSeconds(10000);
		click.elementBy(Keylogout);
	}
	public void clickApprovebtn() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyApprovebtn);
	}
	public void clickApprove() throws Throwable {
		actions.Wait.forSeconds(5000);
		click.elementBy(KeyApprove);
	}

	public void clickSACEndorse() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeySACEndorse);
	}
	public void clickSACApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeySACApprove);
	}

	public void clickUserSAC() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(keyuserSAC);
	}
	public void clickCEGTeamLead() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyCEGTeamLead);
	}

	public void clickCEGTeamLeadEndorse() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyCEGTeamLeadEndorse);
	}
	public void clickCEGTeamLeadApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyCEGTeamLeadApprove);
	}
	public void clickCEGAgentrole() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyCEGAgent);
	}

	public void clickCEGAgentEndorse() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyCEGAgentEndorse);
	}
	public void clickCEGAgentApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyCEGAgentApprove);
	}

	public void clickAFUrole() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyAFU);
	}

	public void clickAFUEndorse() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyAFUEndorse);
	}
	public void clickAFUApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyAFUApprove);
	}


	public void clickBillsPayInnovationrole() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyBillsPayInnovation);
	}

	public void clickBillsPayInnovationEndorse() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyBillsPayInnovationEndorse);
	}
	public void clickBillsPayInnovationApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyBillsPayInnovationApprove);
	}
	public void clickHelpdeskrole() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyHelpdesk);
	}

	public void clickHelpdeskEndorse() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyHelpdeskEndorse);
	}
	public void clickHelpdeskApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyHelpdeskApprove);
	}
	public void clickAppsupportrole() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyAppsupport);
	}

	public void clickAppsupportEndorse() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyAppsupportEndorse);
	}
	public void clickAppsupportApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyAppsupportApprove);
	}
	public void clickUnionBankOnlineProductrole() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyUnionBankOnlineProduct);
	}

	public void clickUnionBankOnlineProductEndorse() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyUnionBankOnlineProductEndorse);
	}
	public void clickUnionBankOnlineProductApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyUnionBankOnlineProductApprove);
	}
	public void clickQRMakerrole() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyQRMaker);
	}

	public void clickQRMakerEndorse() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyQRMakerEndorse);
	}
	public void clickQRMakerApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyQRMakerApprove);
	}

	public void clickDisApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyDisApprove);
	}
	public void clickSACDisApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeySACDisApprove);
	}
	public void clickCEGTeamLeadDisApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyCEGTeamLeadDisApprove);
	}
	public void clickCEGAgentDisApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyCEGAgentDisApprove);
	}
	public void clickAFUDisApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyAFUDisApprove);
	}
	public void clickQRMakerDisApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyQRMakerDisApprove);
	}
	public void clickBillsPayInnovationDisApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyBillsPayInnovationDisApprove);
	}
	public void clickHelpDeskDisApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyHelpDeskDisApprove);
	}
	public void clickAppsupportDisApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyAppsupportDisApprove);
	}
	public void clickUnionBankOnlineProductDisApprove() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyUnionBankOnlineProductDisApprove);
	}
	public void clickBillsPayOnboardingrole() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyBillsPayOnboardingrole);
	}
	public void clickBillsPayOnboardingProduct() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyBillsPayOnboardingDisApprove);
	}
	public void clickBillsPayOnboardingEndorse() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(KeyBillsPayOnboardingEndorse);
	}


}

