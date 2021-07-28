package pages;

import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;
import helper.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class ManageRecipient_Page extends Keywords {

	private String addRecipient = "onlineBanking.ManageRecipient.AddRecipient";
	private String keybankName = "onlineBanking.AddRecipient.BankName";
	private String keyBankNameUCPB = "onlineBanking.AddRecipient.BankNameUCPB";
	private String accountName = "onlineBanking.AddRecipient.AccountName";
	private String accountNumber = "onlineBanking.AddRecipient.AccountNumber";
	private String accountNumberSearch = "onlineBanking.AddRecipient.AccountNumberSearch";
	private String menuBar = "onlineBanking.ManageRecipient.Menubar";
	private String delete = "onlineBanking.ManageRecipient.Delete";
	private String deleteRecipient = "onlineBanking.ManageRecipient.DeleteRecipient";
	private String saveAsFavorite = "onlineBanking.ManageRecipient.SaveAsFavorite";
	private String SearchResultRecipient = "onlineBanking.ManageRecipient.SearchResultRecipient";
	private String closeIconEditRecipient = "onlineBanking.ManageRecipient.CloseIconEditRecipient";
	private String SaveAsFavoriteOn = "onlineBanking.ManageRecipient.SaveAsFavoriteOn";
	private String FavoriteLink = "onlineBanking.ManageRecipient.FavoriteLink";
	public String keyAllertErrMsg = "onlineBanking.common.alertErrorMessage";
	private String Update= "onlineBanking.RequestPayment.Update";

	private BackOffice_RegisterPage registerPage = new BackOffice_RegisterPage();
	private CommonMethodsPage commonMethods = new CommonMethodsPage();
	String randomAccountNumber = Tools.RANDOMTEXT("RANDOMNUMBER",12);
	public static String UpdatedaccNum = "";

	public void clickAddRecipient() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(addRecipient);
	}

	public void doAddRecipient() throws Throwable {
		Wait.forSeconds(4000);
		click.elementBy(keybankName);
		Wait.forSeconds(2000);
		click.elementBy(keyBankNameUCPB);
		Wait.forSeconds(2000);
		type.data(accountName, Tools.RANDOMTEXT("RANDOMTEXT",8));
		type.data(accountNumber,randomAccountNumber);
		commonMethods.clickSaveBtn();
		verify.IfElementExists(addRecipient);
	}

	public void doAddFavoriteRecipient() throws Throwable {
		Wait.forSeconds(4000);
		click.elementBy(keybankName);
		Wait.forSeconds(2000);
		click.elementBy(keyBankNameUCPB);
		Wait.forSeconds(2000);
		type.data(accountName, Tools.RANDOMTEXT("RANDOMTEXT",8));
		type.data(accountNumber,randomAccountNumber);
		click.elementBy(saveAsFavorite);
		commonMethods.clickSaveBtn();
		verify.IfElementExists(addRecipient);
	}

	public void doAddRecipient_AccountNameErrorMessage() throws Throwable {
		Wait.forSeconds(4000);
		click.elementBy(keybankName);
		Wait.forSeconds(2000);
		click.elementBy(keyBankNameUCPB);
		Wait.forSeconds(2000);
		type.data(accountName, Tools.RANDOMTEXT("RANDOMTEXT",3));
		commonMethods.verifyAccNumErrMsg("Account name should be at least 4 characters long");
		Wait.forSeconds(2000);
		type.data(accountName, Tools.RANDOMTEXT("RANDOMTEXT",35));
		type.data(accountNumber,randomAccountNumber);
		commonMethods.clickSaveBtn();
		verify.IfElementExists(addRecipient);
	}

	public void doAddRecipient_AccountNumberErrMsg() throws Throwable {
		Wait.forSeconds(4000);
		click.elementBy(keybankName);
		Wait.forSeconds(2000);
		click.elementBy(keyBankNameUCPB);
		Wait.forSeconds(2000);
		type.data(accountNumber, Tools.RANDOMTEXT("RANDOMNUMBER",4));
		type.data(accountName, Tools.RANDOMTEXT("RANDOMTEXT",8));
		Wait.forSeconds(2000);
		commonMethods.verifyAccNumErrMsg("Account number should be 12 digits long");
		Wait.forSeconds(2000);
		type.data(accountNumber, randomAccountNumber);
		commonMethods.clickSaveBtn();
		verify.IfElementExists(addRecipient);
	}

	public void doDeleteRecipient() throws Throwable {
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,randomAccountNumber);
		aReturn.clickEnter(accountNumberSearch);
		Wait.forSeconds(6000);
		click.elementBy(menuBar);
		Wait.forSeconds(3000);
		click.elementBy(delete);
		click.elementBy(deleteRecipient);
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,randomAccountNumber);
		aReturn.clickEnter(accountNumberSearch);
		Wait.forSeconds(2000);
		commonMethods.verifyAlert();
	}

	public void doDeleteRecipient_Recent() throws Throwable {
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,UpdatedaccNum);
		aReturn.clickEnter(accountNumberSearch);
		Wait.forSeconds(6000);
		click.elementBy(menuBar);
		Wait.forSeconds(3000);
		click.elementBy(delete);
		click.elementBy(deleteRecipient);
		Wait.forSeconds(3000);
		/*
		type.data(accountNumberSearch,UpdatedaccNum);
		aReturn.clickEnter(accountNumberSearch);
		Wait.forSeconds(2000);
		commonMethods.verifyAlert();
		 */
	}
	public void searchRecipient(String name) throws Throwable {
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,name);
		aReturn.clickEnter(accountNumberSearch);
		Wait.forSeconds(6000);
		click.elementBy(SearchResultRecipient);
	}

	public void searchRecipient_Recent() throws Throwable{
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,randomAccountNumber);
		aReturn.clickEnter(accountNumberSearch);
		Wait.forSeconds(6000);
		click.elementBy(SearchResultRecipient);
	}

	public void searchRecipient_Recent1() throws Throwable {
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,UpdatedaccNum);
		aReturn.clickEnter(accountNumberSearch);
		Wait.forSeconds(6000);
		click.elementBy(SearchResultRecipient);
	}

	public void editAccountName() throws Throwable {
		type.data(accountName, Tools.RANDOMTEXT("RANDOMTEXT",3));
		type.data(accountNumber, Tools.RANDOMTEXT("RANDOMNUMBER",18));
		commonMethods.verifyAccNumErrMsg("Account name should be at least 4 characters long");
		type.data(accountName, Tools.RANDOMTEXT("RANDOMTEXT",35));
		type.data(accountNumber, Tools.RANDOMTEXT("RANDOMNUMBER",12));
		commonMethods.verifyAccNumNoErrMsg();
		Wait.forSeconds(2000);
		WebElement element = driver.findElement(By.cssSelector("div.header-foreground > div > div.left.part > a > svg"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

	public void editAccountNumber() throws Throwable {
		type.data(accountNumber, Tools.RANDOMTEXT("RANDOMNUMBER",4));
		type.data(accountName, Tools.RANDOMTEXT("RANDOMTEXT",15));
		commonMethods.verifyAccNumErrMsg("Account number should be at least 8 digits long");
		type.data(accountName, Tools.RANDOMTEXT("RANDOMTEXT",30));
		type.data(accountNumber, Tools.RANDOMTEXT("RANDOMNUMBER",12));
		commonMethods.verifyAccNumNoErrMsg();
		Wait.forSeconds(2000);
		WebElement element = driver.findElement(By.cssSelector("div.header-foreground > div > div.left.part > a > svg"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		Wait.forSeconds(2000);
	}

	public void editAccountNumber1() throws Throwable {
		type.data(accountName, Tools.RANDOMTEXT("RANDOMTEXT",8));
		type.data(accountNumber, Tools.RANDOMTEXT("RANDOMNUMBER",12));
		element = driver.findElement(By.xpath("//input[@placeholder='Account Number']"));
		UpdatedaccNum = element.getText();
		Wait.forSeconds(2000);
	}

	public void saveRecipientAsFavorite() throws Throwable {
		click.elementBy(saveAsFavorite);
		registerPage.clickUpdatelink();
	}

	public void saveRecipientAsUnFavorite() throws Throwable {
		click.elementBy(SaveAsFavoriteOn);
		registerPage.clickUpdatelink();
	}

	public void clickFavTab() throws Throwable {
		click.elementBy(FavoriteLink);
	}

	public void searchAndVerifyRecipient(String value) throws Throwable {
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,value);
		aReturn.clickEnter(accountNumberSearch);
		Wait.forSeconds(9000);
		verify.elementTextContains(SearchResultRecipient,value);
	}

	public void clickExistingRecipient() throws Throwable {
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,"testautomation4");
		aReturn.clickEnter(accountNumberSearch);
		Wait.forSeconds(6000);
		Boolean t = verify.IfElementExistsboolean(keyAllertErrMsg);
		if (t.equals(true))
		{
			click.elementBy(addRecipient);
			Wait.forSeconds(2000);
			click.elementBy(keybankName);
			Wait.forSeconds(2000);
			click.elementBy(keyBankNameUCPB);
			Wait.forSeconds(2000);
			type.data(accountName,"testautomation4" );
			type.data(accountNumber,randomAccountNumber);
			commonMethods.clickSaveBtn();
			verify.IfElementExists(addRecipient);
		}
	}

	public void deleteExistingRecipient() throws Throwable{
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,"testautomation4");
		aReturn.clickEnter(accountNumberSearch);
		Wait.forSeconds(6000);
		click.elementBy(menuBar);
		Wait.forSeconds(3000);
		click.elementBy(delete);
		click.elementBy(deleteRecipient);
		Wait.forSeconds(3000);
		type.data(accountNumberSearch,"testautomation4");
		aReturn.clickEnter(accountNumberSearch);
		Wait.forSeconds(2000);
		commonMethods.verifyAlert();
	}

	public void clickUpdate() throws Throwable {
		click.elementBy(Update);
	}

}
