package pages;

import actions.Wait;
import base.Keywords;
import org.openqa.selenium.By;

public class BuyloadPage extends Keywords {

	private String ManageContacts = "onlineBanking.BuyLoad.ManageContacts";
	private String AccountName  = "onlineBanking.BUYLOAD_MANAGECONTACTS.AccountName";
	private String AccountNumber = "onlineBanking.BUYLOAD_MANAGECONTACTS.AccountNumber";
	private String keybuyload="onlineBanking.BuyLoad.LnkBuyload";
	private String keyselectcontact="onlineBanking.BuyLoad.LnkSelectcontact";
	private String keymobilenumber="onlineBanking.BuyLoad.Txtmobilenumber";
	private String keyselectfromlist="onlineBanking.BuyLoad.Btnselectfromlist";
	private String keySearchcontact="onlineBanking.BuyLoad.TxtSearchcontact";
	private String keySearchresult="onlineBanking.BuyLoad.lblSearchresult";
	private String keypurchaseload="onlineBanking.BuyLoad.Btnpurchaseload";
	private String keyOTP="onlineBanking.BuyLoad.TxtOTP";
	private String keysubmit="onlineBanking.BuyLoad.btnsubmit";
	private String keypurchasesuccessful="onlineBanking.BuyLoad.Lblpurchasesuccessful";
	private String keyFromAcoount_Purchasesuccessful="onlineBanking.BuyLoad.LblFromAcoount_Purchasesuccessful";
	private String keyBuyLoad_To_Purchasesuccessful="onlineBanking.BuyLoad.lblBuyLoad_To_Purchasesuccessful";
	private String keyamount_RecentTransfers="onlineBanking.BuyLoad.lblamount_RecentTransfers";
    private String keylnkfavourites="onlineBanking.BuyLoad.lnkfavourites";
	private String keyaccountnumber="onlineBanking.BuyLoad.lblaccountnumber";
	private String keyerrormessage="onlineBanking.BuyLoad.lblerrormessage";
	private String Keysubmit="onlineBanking.BuyLoad.btnSubmit";
	private String KeyNewpurchase="onlineBanking.BuyLoad.btnNewpurchase";
	private String KeyDashboard="onlineBanking.BuyLoad.lbldashboard";
	private String KeyInvalidotperrormsg="onlineBanking.BuyLoad.lblInvalidotperrormsg";
	private String KeyBuyloadfromaccountedit="onlineBanking.BuyLoad.btnfromaccountedit";
	private String KeyBuyloadmobilenumberedit="onlineBanking.BuyLoad.btnmobilenumberedit";
	private String KeyBuyloadamountedit="onlineBanking.BuyLoad.btnamountedit";
	private String KeyBuyloadcancelpurchase="onlineBanking.BuyLoad.btncancelpurchase";
	private String Keymobilenumber="onlineBanking.BuyLoad.txtmobilenumber";
	private String Keyinvaligmobilenumbererrormsg="onlineBanking.BuyLoad.lbltinvalidmobilenumbererrormsg";

	public void clickManageContacts() throws Throwable {
		verify.IfElementExists(ManageContacts);
		click.elementBy(ManageContacts);
	}

	public void verifyAccountName_Number(String name,String number) throws Throwable {
		verify.elementTextContains(AccountName,name);
		verify.elementTextContains(AccountNumber,number);
	}

	public void clickbuyload() throws Throwable {

		click.elementBy(keybuyload);
	}
	public void clickselectcontact() throws Throwable {

		click.elementBy(keyselectcontact);
	}
	public void verifyelementisexist() throws Throwable {
		verify.IfElementExists(keymobilenumber);

	}

	public void selectvaluefromthetext(String Datatoselect) throws Throwable {
		String Datatoselectxpath= "("+"//*[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]";
		driver.findElement(By.xpath(Datatoselectxpath)).click();
	}
	public void clickSelectfromlist() throws Throwable {
		click.elementBy(keyselectfromlist);
	}
	public void enterSearchcontact(String name) throws Throwable {
		type.data(keySearchcontact,name);
	}
	public void clickSearchresult() throws Throwable {
		click.elementBy(keySearchresult);
	}
	public void clickPurchaseload() throws Throwable {
		click.elementBy(keypurchaseload);
	}

	public void verifypurchasesuccessful() throws Throwable {
		verify.IfElementExists(keypurchasesuccessful);

	}
	public void clickLnkfavourites() throws Throwable {
		click.elementBy(keylnkfavourites);
	}
	public void clickkeyaccountnumber() throws Throwable {
		click.elementBy(keyaccountnumber);
	}

	public void verifyerrrormessageisexist() throws Throwable {
		verify.elementIsPresent(keyerrormessage);

	}
	public void clickSubmit() throws Throwable {
		click.elementBy(Keysubmit);
		Wait.forSeconds(5000);
	}
	public void clickNewpurchase() throws Throwable {
		click.elementBy(KeyNewpurchase);
		Wait.forSeconds(5000);
	}

	public void verifySelectcontactisexist() throws Throwable {

		verify.elementIsPresent(keyselectcontact);

	}
	public void verifyKeyDashboardisexist() throws Throwable {

		verify.elementIsPresent(KeyDashboard);

	}
	public void verifyInvalidotperrormsg() throws Throwable {

		verify.elementIsPresent(KeyInvalidotperrormsg);

	}
	public void clickBuyloadfromaccountedit() throws Throwable {
		click.elementBy(KeyBuyloadfromaccountedit);
		Wait.forSeconds(3000);
	}
	public void clickBuyloadmobilenumberedit() throws Throwable {
		click.elementBy(KeyBuyloadmobilenumberedit);
		Wait.forSeconds(3000);
	}
	public void clickBuyloadamountedit() throws Throwable {
		click.elementBy(KeyBuyloadamountedit);
		Wait.forSeconds(3000);
	}

	public void clickBuyloadcancelpurchase() throws Throwable {
		click.elementBy(KeyBuyloadcancelpurchase);
		Wait.forSeconds(3000);
	}

	public void entertheMobilenumber(String Mobilenumber) throws Throwable {
		type.data(Keymobilenumber,Mobilenumber);
		Wait.forSeconds(3000);

	}

	public void verifyInvalidmobileerrormsg() throws Throwable {
		Wait.forSeconds(3000);
		verify.elementIsPresent(Keyinvaligmobilenumbererrormsg);

	}

}
