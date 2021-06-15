package pages;

import actions.Wait;
import base.Keywords;

public class CommonMethodsPage extends Keywords {

	private String keyYesBtn = "onlineBanking.backoffice.common.YesBtn";
	private String keyNoBtn="onlineBanking.backoffice.common.NoBtn";
	private String keyCloseBtn2 = "onlineBanking.backoffice.common.CloseBtn2";
	private String keyCloseBtn1 = "onlineBanking.backoffice.common.CloseBtn1";
	private String keySaveBtn = "onlineBanking.backoffice.common.SaveBtn";
	private String keyLogoutBtn = "onlineBanking.backoffice.common.LogoutBtn";
	private String keyErrorMessage = "onlineBanking.common.alertMsg.";

	public void clickYesBtn() throws Throwable {
		click.elementBy(keyYesBtn);
	}

	public void clickNoBtn() throws Throwable {
		click.elementBy(keyNoBtn);
	}

	public void clickCloseBtn2() throws Throwable {
		click.elementBy(keyCloseBtn2);
	}

	public void clickCloseBtn1() throws Throwable {
		click.elementBy(keyCloseBtn1);
	}

	public void clickSaveBtn() throws Throwable {
		click.elementBy(keySaveBtn);
		Wait.forSeconds(3000);
	}

	public void clickLogoutBtn() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyLogoutBtn);
	}

	public void verifyAlert() throws Throwable {
		verify.IfElementExists(keyErrorMessage);
	}
}
