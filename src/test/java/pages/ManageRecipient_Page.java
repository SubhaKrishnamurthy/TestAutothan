package pages;

import actions.Wait;
import base.Keywords;

public class ManageRecipient_Page extends Keywords {

	private String addRecipient = "onlineBanking.ManageRecipient.AddRecipient";

	public void clickAddRecipient() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(addRecipient);
	}


}
