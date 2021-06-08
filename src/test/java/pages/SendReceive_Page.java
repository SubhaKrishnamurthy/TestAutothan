package pages;

import actions.Wait;
import base.Keywords;

public class SendReceive_Page extends Keywords {

	private String manageRecipient = "onlineBanking.SendReceive.manageRecipient";

	public void clickManageRecipient() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(manageRecipient);
	}


}
