package pages;

import actions.Verify;
import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import actions.JSClick;

public class BackOffice_CustomerInformationPage extends Keywords {
	WebElement element;
	private Verify verify = new Verify();

	private String keyActiveAccount="onlineBanking.backoffice.accounts.accounts.clientUser.activeAccount";
	private String keyfundTransferLog="onlineBanking.backoffice.accounts.clientUser.fundTransferLog";
	private String keyEmailBtn="onlineBanking.backoffice.accounts.clientUser.EmailBtn";
	private String keyEmail_SMSBtn="onlineBanking.backoffice.accounts.clientUser.Email&SMSBtn";
	private String keySMSBtn="onlineBanking.backoffice.accounts.clientUser.SMSBtn";
	private String keyBillsPaidLog="onlineBanking.backoffice.accounts.clientUser.billsPaidLog";
	private String keyLoadPurchaseRequests="onlineBanking.backoffice.accounts.clientUser.loadPurchaseRequests";


	public void clickActiveAccount()throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyActiveAccount);
	}

	public void verifyAndClickFundTransferLog() throws Throwable {
		Wait.forSeconds(5000);
		//verify.elementIsPresent(keyfundTransferLog);
		//Wait.forSeconds(2000);
		jsClick.elementBy(keyfundTransferLog);
	}

	public void verifyAndClickBillsPaidLog() throws Throwable {
		Wait.forSeconds(5000);
		verify.elementIsPresent(keyBillsPaidLog);
		jsClick.elementBy(keyBillsPaidLog);
	}

	public void verifyAndClickLoadPurchaseRequest() throws Throwable {
		Wait.forSeconds(5000);
		verify.elementIsPresent(keyLoadPurchaseRequests);
		jsClick.elementBy(keyLoadPurchaseRequests);
	}

	public void verifyAndClickEmail() throws  Throwable {
		Wait.forSeconds(5000);
		verify.elementIsPresent(keyEmailBtn);
		click.elementBy(keyEmailBtn);
	}

	public void verifyAndClickEmail_SMS() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsPresent(keyEmail_SMSBtn);
		click.elementBy(keyEmail_SMSBtn);
	}



	public void verifyAndClickSMS() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsPresent(keySMSBtn);
		click.elementBy(keySMSBtn);
	}

}
