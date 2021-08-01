package pages;

import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;
import helper.Tools;
import org.openqa.selenium.By;

public class SendMoney_Instapay extends Keywords {

	private String keyOtherbank = "onlineBanking.Fundtransfer.LnkOtherbanks";
	private String keyInstapay="onlineBanking.Fundtransfer.LnkInstapay";
	private String keyerrormessage="onlineBanking.Fundtransfer.LblErrorMessage";
	private String keymsgtorecipient="onlineBanking.Fundtransfer.TxtMessagetorecipient";
	private String keyerrormessageaccount="onlineBanking.Fundtransfer.Lblerrormsg";
	private String keysAccountsearchresult="onlineBanking.Fundtransfer.LnkNotEligible";
	private String keysselectbank="onlineBanking.Fundtransfer.lstselectbank";
	private String keysAccountnameisrequired="onlineBanking.Fundtransfer.lblAccountnameisrequired";
	private String keysAccountnumberisrequired="onlineBanking.Fundtransfer.lblAccountnumberisrequired";
	private String keysThisfieldisrequired="onlineBanking.Fundtransfer.lblThisfieldisrequired";
	private String keysaccountnumber="onlineBanking.Fundtransfer.txtaccountnumber";
	private String keysaccountname="onlineBanking.Fundtransfer.txtaccountname";
	private String keysaccountnamevalidation="onlineBanking.Fundtransfer.lblAccountnameshouldbeatleast4characterslong";


	public void clickOtherbank() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyOtherbank);
	}
	public void clickInstapay() throws Throwable {
		Wait.forSeconds(5000);
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

	public void selectBank(String Bankname) throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keysselectbank);
		Wait.forSeconds(3000);
		driver.findElement(By.xpath("("+"//*[text()="+"'"+Bankname+"'"+"]"+")"+"[1]" +"|"+ "("+"//*[text()="+"'"+Bankname+"'"+"]"+")"+"[1]" +"|"+ "("+"//*[text()="+"'"+Bankname+"'"+"]"+")"+"[1]")).click();
	}

	public void enterAccountname(String acctname) throws ApplicationException {

		type.data(keysaccountname, acctname);
	}

	public void enterAccountnumber(String acctnum) throws ApplicationException {

		type.data(keysaccountnumber, acctnum);
	}

	public void verifyThisfieldisrequired() throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsnotEnabled(keysThisfieldisrequired);
	}
	public void verifyAccountnumberisrequired() throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsnotEnabled(keysAccountnumberisrequired);
	}
	public void verifyAccountnameisrequired() throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsnotEnabled(keysAccountnameisrequired);
	}

	public void verifyAccountnamevalidation() throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsnotEnabled(keysaccountnamevalidation);
	}

}
