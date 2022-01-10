package pages;

import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;
import helper.Tools;
import org.openqa.selenium.By;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;

public class SendMoney_OtherUBaccount extends Keywords {

	private String keyOtherUBaccount = "onlineBanking.Fundtransfer.AnotherUnionBankAccount";
	private String keyUBaccountnumber="onlineBanking.Fundtransfer.TxtUnionbankaccountnumber";
	private String keyUBaccountname="onlineBanking.Fundtransfer.TxtUnionbankaccountname";
	private String keyAmount="onlineBanking.Fundtransfer.TxtAmount";
	private String keyotperror="onlineBanking.Fundtransfer.lblOTPError";
	private String keyerrormsg="onlineBanking.Fundtransfer.lblErrormessage";
	private String keyaccerrormsg="onlineBanking.Fundtransfer.lblinvalidatargetaccountErrormessage";
	private String keyselectfromrecipient="onlineBanking.Fundtransfer.BtnSelectfromreceipient";
	private String keybtnmyrecipient="onlineBanking.Fundtransfer.BtnMyRecipients";
	private String keysearchrecipient="onlineBanking.Fundtransfer.TxtSearchRecipients";
	private String keysearchrecipientresult="onlineBanking.Fundtransfer.LnkSearchRecipientsresults";
	private String keyinputemail="onlineBanking.Fundtransfer.TxtInputEmail";
	private String keymobilenumber="onlineBanking.Fundtransfer.TxtMobilenumber";
	private String keymsgtorecipient="onlineBanking.Fundtransfer.TxtMessagetorecipient";
	private String KeyNext="onlineBanking.Fundtransfer.BtnNext";
	private String keyfavourite="onlineBanking.Fundtransfer.BtnFavouriteRecipients";
	private String keyDateinput="onlineBanking.Fundtransfer.btnDateinput";
	private String keyCalendarnextbutton="onlineBanking.Fundtransfer.btnCalendarnextbutton";
	private String keyCalendardate="onlineBanking.Fundtransfer.btnCalendardate";
	private String keyCalendarpreviousdate="onlineBanking.Fundtransfer.lnkpreviousdate";



	public void clickUBaccount() throws Throwable {
		Wait.forSeconds(8000);
		click.elementBy(keyOtherUBaccount);
	}
	public void enterUBaccount(String Accountname,String Accountnumber) throws Throwable {
		Wait.forSeconds(3000);
		type.data(keyUBaccountnumber,Accountname);
		type.data(keyUBaccountname,Accountnumber);
	}
	public void enterthAmount(String Amt) throws Throwable {
		Wait.forSeconds(3000);
		type.data(keyAmount,Amt);

	}

	public void verifyOTPErrorisexist() throws Throwable {
		Wait.forSeconds(3000);
		verify.IfElementExists(keyotperror);
	}

	public void verifyErrormessagevalidation(String Expected) throws Throwable {
		Wait.forSeconds(3000);
		verify.elementTextMatching(keyaccerrormsg,Expected);
	}

	public void selectRecipientfrommyrecipient(String Recipient) throws Throwable {
		Wait.forSeconds(9000);
		click.elementBy(keyselectfromrecipient);
		click.elementBy(keybtnmyrecipient);
		Wait.forSeconds(5000);
		type.data(keysearchrecipient,Recipient);
		Wait.forSeconds(10000);
		click.elementBy(keysearchrecipientresult);
	}
	public void entertheMobileEmailRemarks(String Email,String Mobile,String Remarks) throws Throwable {
		Wait.forSeconds(4000);
		type.data(keyinputemail,Email);
		type.data(keymobilenumber,Mobile);
		type.data(keymsgtorecipient,Remarks);
	}
	public void verifyNextbuttonisenabled() throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsEnabled(KeyNext);
	}

	public void selectRecipientfromfavouriterecipient(String Recipient) throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyselectfromrecipient);
		Wait.forSeconds(3000);
		click.elementBy(keyfavourite);
		Wait.forSeconds(5000);
		type.data(keysearchrecipient,Recipient);
		Wait.forSeconds(10000);
		click.elementBy(keysearchrecipientresult);
	}

	public void entertheMobileEmaileithRemarksmorethan256chars(String Email,String Mobile,String Remarks) throws Throwable {
		Wait.forSeconds(3000);
		type.data(keyinputemail, Email);
		type.data(keymobilenumber, Mobile);
		type.data(keymsgtorecipient,  Tools.RANDOMTEXT("RANDOMTEXT",258));
	}

	public void entertheMobileEmail(String Email,String Mobile) throws Throwable {
		Wait.forSeconds(3000);
		type.data(keyinputemail,Email);
		type.data(keymobilenumber,Mobile);

	}
	public void verifyNextbuttonisnotenabled() throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsnotEnabled(KeyNext);
	}


	public void searchRecipientfrommyrecipient(String Recipient) throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(keyselectfromrecipient);
		click.elementBy(keybtnmyrecipient);
		Wait.forSeconds(5000);
		type.data(keysearchrecipient,Recipient);
		Wait.forSeconds(10000);

	}
	public void searchRecipientfromfavouriterecipient(String Recipient) throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyselectfromrecipient);
		click.elementBy(keyfavourite);
		Wait.forSeconds(5000);
		type.data(keysearchrecipient,Recipient);
		Wait.forSeconds(10000);

	}

	public void Selectthefututdate() throws ApplicationException {
		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") ){
			get.elementBy(keyDateinput).click();
			Wait.forSeconds(3000);
			get.elementBy(keyCalendarnextbutton).click();
			Wait.forSeconds(3000);
			get.elementBy(keyCalendardate).click();
		}
		else {
			click.elementBy(keyDateinput);
			Wait.forSeconds(3000);
			click.elementBy(keyCalendarnextbutton);
			Wait.forSeconds(3000);
			click.elementBy(keyCalendardate);
		}

	}


	public void verifyCalendarprviousdatebuttonisnotexist() throws Throwable {
		Wait.forSeconds(3000);
		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") ) {

			get.elementBy(keyDateinput).click();
			Wait.forSeconds(3000);
			get.elementBy(keyCalendarpreviousdate).click();
			Wait.forSeconds(3000);
			verify.elementIsnotEnabled(keyCalendardate);
		}
		else{

			click.elementBy(keyDateinput);
			Wait.forSeconds(3000);
			click.elementBy(keyCalendarpreviousdate);
			Wait.forSeconds(3000);
			verify.elementIsnotEnabled(keyCalendardate);
		}

	}

	public void clickfavourite() throws Throwable {
		Wait.forSeconds(3000);

		click.elementBy(keyfavourite);
		Wait.forSeconds(5000);

	}
}
