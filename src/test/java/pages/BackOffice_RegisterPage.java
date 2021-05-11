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
}
