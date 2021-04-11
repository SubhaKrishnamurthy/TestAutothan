package pages;

import base.Keywords;

public class BackOffice_AccountsPage extends Keywords {

	private String keyManageClients="onlineBanking.backoffice.accountsPage.manageClients";

	public void clickManageClients() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(keyManageClients);
	}


}
