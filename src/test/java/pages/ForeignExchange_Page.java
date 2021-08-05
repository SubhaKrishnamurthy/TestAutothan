package pages;

import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;
import helper.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ForeignExchange_Page extends Keywords {


	private String BuyUSD = "onlineBanking.FX.BuyUSD";
	private String SellUSD = "onlineBanking.FX.SellUSD";
	private String AddAccount = "onlineBanking.FX.AddAccount";
	private String EnterUSD = "onlineBanking.FX.EnterUSD";
	private String EnoughFundErrMsg = "onlineBanking.FX.EnoughFundErrMsg";
	private String AmountExceedsErrMsg = "onlineBanking.FX.AmountExceedsErrMsg";
	private BackOffice_RegisterPage registerPage = new BackOffice_RegisterPage();
	private CommonMethodsPage commonMethods = new CommonMethodsPage();


	public void clickBuyUSD() throws Throwable {
		verify.elementIsPresent(BuyUSD);
		Wait.forSeconds(1000);
		jsClick.elementBy(BuyUSD);
		Wait.forSeconds(1000);
		verify.elementIsPresent(AddAccount);
		commonMethods.clickCancelBtn();
	}

	public void clickSellUSD() throws Throwable {
		verify.elementIsPresent(SellUSD);
		Wait.forSeconds(1000);
		jsClick.elementBy(SellUSD);
		Wait.forSeconds(1000);
		verify.elementIsPresent(AddAccount);
		commonMethods.clickCancelBtn();
	}

	public void enterDetailsFX(String usd) throws Throwable {
		verify.elementIsPresent(BuyUSD);
		Wait.forSeconds(1000);
		jsClick.elementBy(BuyUSD);
		Wait.forSeconds(1000);
		commonMethods.clickkeySelectAcc();
		commonMethods.clickFromAccNumber();
		type.data(EnterUSD,usd);

	}

	public void enterDetailsFX1(String usd) throws Throwable {
		verify.elementIsPresent(SellUSD);
		Wait.forSeconds(1000);
		jsClick.elementBy(SellUSD);
		Wait.forSeconds(1000);
		commonMethods.clickkeySelectAcc();
		commonMethods.clickFromAccNumber();
		type.data(EnterUSD,usd);

	}

	public void verifyEnoughFundErrMsg() throws Throwable
	{
		Wait.forSeconds(2000);
		verify.elementIsPresent(EnoughFundErrMsg);
	}

	public void verifyAmtExceedsErrMsg() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsPresent(AmountExceedsErrMsg);
	}

}
