package pages;

import actions.Wait;
import base.Keywords;

public class CommonMethods extends Keywords {

	private String keyYesBtn = "onlineBanking.backoffice.common.YesBtn";
	private String keyNoBtn="onlineBanking.backoffice.common.NoBtn";
	private String keyCloseBtn2 = "onlineBanking.backoffice.common.CloseBtn2";
	private String keyCloseBtn1 = "onlineBanking.backoffice.common.CloseBtn1";

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
}
