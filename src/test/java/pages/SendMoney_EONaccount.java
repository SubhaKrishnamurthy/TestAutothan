package pages;

import actions.Wait;
import base.Keywords;
import helper.Tools;

public class SendMoney_EONaccount extends Keywords {

	private String keyEonaccount = "onlineBanking.Fundtransfer.EonAccount";
	private String keyEonaccounttnumber="onlineBanking.Fundtransfer.TxtEonaccountnumber";
	private String keyUBaccountname="onlineBanking.Fundtransfer.TxtUnionbankaccountname";
	private String keyAmount="onlineBanking.Fundtransfer.TxtAmount";
	private String keyInvalidEONccountnumbererror="onlineBanking.Fundtransfer.lblInvalidEONccountnumbererror";
	private String keyerrormsg="onlineBanking.Fundtransfer.lblErrormessage";
	private String keyselectfromrecipient="onlineBanking.Fundtransfer.BtnSelectfromreceipient";
	private String keybtnmyrecipient="onlineBanking.Fundtransfer.BtnMyRecipients";
	private String keysearchrecipient="onlineBanking.Fundtransfer.TxtSearchRecipients";
	private String keysearchrecipientresult="onlineBanking.Fundtransfer.LnkSearchRecipientsresults";
	private String keyinputemail="onlineBanking.Fundtransfer.TxtInputEmail";
	private String keymobilenumber="onlineBanking.Fundtransfer.TxtMobilenumber";
	private String keymsgtorecipient="onlineBanking.Fundtransfer.TxtMessagetorecipient";
	private String KeyNext="onlineBanking.Fundtransfer.BtnNext";
	private String keyfavourite="onlineBanking.Fundtransfer.BtnFavouriteRecipients";



	public void clickEONaccount() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyEonaccount);
	}

	public void enterEONaccountNumber(String Accountnumber) throws Throwable {
		Wait.forSeconds(3000);
		type.data(keyEonaccounttnumber,Accountnumber);
		Wait.forSeconds(2000);
	}

	public void verifyEONaccountexist() throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsPresent(keyEonaccount);

	}

	public void verifyinvalidEONaccounterror(String Error) throws Throwable {
		Wait.forSeconds(3000);
		verify.elementTextMatching(keyInvalidEONccountnumbererror,Error);

	}
}
