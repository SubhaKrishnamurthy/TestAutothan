package pages;

import actions.Wait;
import base.Keywords;

public class BuyloadPage extends Keywords {

	private String ManageContacts = "onlineBanking.BuyLoad.ManageContacts";
	private String AccountName  = "onlineBanking.BUYLOAD_MANAGECONTACTS.AccountName";
	private String AccountNumber = "onlineBanking.BUYLOAD_MANAGECONTACTS.AccountNumber";

	public void clickManageContacts() throws Throwable {
		verify.IfElementExists(ManageContacts);
		click.elementBy(ManageContacts);
	}

	public void verifyAccountName_Number(String name,String number) throws Throwable {
		verify.elementTextContains(AccountName,name);
		verify.elementTextContains(AccountNumber,number);
	}
}
