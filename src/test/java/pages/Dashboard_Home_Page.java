package pages;

import actions.Wait;
import base.Keywords;

public class Dashboard_Home_Page extends Keywords {

	private String SendReceive = "onlineBanking.Dashboard.SendReceive";

	public void clickSendReceive() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(SendReceive);
	}
}
