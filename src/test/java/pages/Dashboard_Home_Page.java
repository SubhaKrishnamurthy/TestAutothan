package pages;

import actions.Wait;
import base.Keywords;

public class Dashboard_Home_Page extends Keywords {

	private String SendReceive = "onlineBanking.Dashboard.SendReceive";
	private String fx = "onlineBanking.Dashboard.ForeignExchange";
	private String AccountsManageBtn = "onlineBanking.Dashboard.AccountsMAnageBtn";
	private String AddAccounts = "onlineBanking.Dashboard.AddAccountsLink";
	private String AddExistingAccounts = "onlineBanking.Dashboard.AddExistingAcc";

	public void clickSendReceive() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(SendReceive);
	}

	public void clickFX() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(fx);
	}

	public void clickAccountsManageBtn() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(AccountsManageBtn);
	}

	public void clickAddExistingAccount() throws Throwable {
		click.elementBy(AddAccounts);
		click.elementBy(AddExistingAccounts);
	}


}
