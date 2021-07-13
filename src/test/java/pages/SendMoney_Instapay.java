package pages;

import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;
import helper.Tools;

public class SendMoney_Instapay extends Keywords {

	private String keyOtherbank = "onlineBanking.Fundtransfer.LnkOtherbanks";
	private String keyInstapay="onlineBanking.Fundtransfer.LnkInstapay";
	private String keyerrormessage="onlineBanking.Fundtransfer.LblErrorMessage";
	private String keymsgtorecipient="onlineBanking.Fundtransfer.TxtMessagetorecipient";
	private String keyerrormessageaccount="onlineBanking.Fundtransfer.Lblerrormsg";
	private String keysAccountsearchresult="onlineBanking.Fundtransfer.LnkNotEligible";


	public void clickOtherbank() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyOtherbank);
	}
	public void clickInstapay() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyInstapay);
	}
	public void verifyErrormessage(String Errormsg) throws Throwable {
		Wait.forSeconds(3000);
		verify.elementTextMatching(keyerrormessage,Errormsg);
	}

	public void Entermorethan256chars() throws ApplicationException {

		type.data(keymsgtorecipient, Tools.RANDOMTEXT("RANDOMTEXT",258));
	}
	public void verifyErrormessagenoteligible(String Errormsg) throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsPresent(keyerrormessageaccount);
	}

	public void verifyFieldisDisabled() throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsnotEnabled(keysAccountsearchresult);
	}
}
