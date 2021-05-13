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
}
