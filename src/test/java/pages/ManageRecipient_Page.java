package pages;

import actions.Wait;
import base.Keywords;
import helper.Tools;

public class ManageRecipient_Page extends Keywords {

	private String addRecipient = "onlineBanking.ManageRecipient.AddRecipient";
	private String bankName = "onlineBanking.AddRecipient.BankName";
	private String accountName = "onlineBanking.AddRecipient.AccountName";
	private String accountNumber = "onlineBanking.AddRecipient.AccountNumber";
	private String accountNumberSearch = "onlineBanking.AddRecipient.AccountNumberSearch";
	private String menuBar = "onlineBanking.ManageRecipinet.Menubar";
	private String delete = "onlineBanking.ManageRecipient.Delete";
	private String deleteRecipient = "onlineBanking.ManageRecipient.DeleteRecipient";
	private CommonMethodsPage commonMethods = new CommonMethodsPage();
	String randomText = Tools.RANDOMTEXT("RANDOMNUMBER",12);

	public void clickAddRecipient() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(addRecipient);
	}

	public void doAddRecipient(String bankName) throws Throwable {
		select.backOffice_selectValueInAnyList(bankName,"bankName");
		type.data(accountName, Tools.RANDOMTEXT("RANDOMTEXT",15));
		type.data(accountNumber,randomText);
		commonMethods.clickSaveBtn();
		verify.IfElementExists(addRecipient);
	}

	public void doDeleteRecipient() throws Throwable {
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,"randomText");
		aReturn.clickEnter(accountNumberSearch);
		click.elementBy(menuBar);
		click.elementBy(delete);
		click.elementBy(deleteRecipient);
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,"randomText");
		aReturn.clickEnter(accountNumberSearch);
		commonMethods.verifyAlert();
	}

}
