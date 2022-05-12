package pages;

import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;
import helper.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;

public class ForeignExchange_Page extends Keywords {


	private String BuyUSD = "onlineBanking.FX.BuyUSD";
	private String SellUSD = "onlineBanking.FX.SellUSD";
	private String AddAccount = "onlineBanking.FX.AddAccount";
	private String EnterUSD = "onlineBanking.FX.EnterUSD";
	private String EnoughFundErrMsg = "onlineBanking.FX.EnoughFundErrMsg";
	private String AmountExceedsErrMsg = "onlineBanking.FX.AmountExceedsErrMsg";
	private String Purpose = "onlineBanking.FX.Purpose";
	private String KeyNext = "onlineBanking.Fundtransfer.BtnNext";
	private String Signature = "onlineBanking.FX.Signature";
	private String Save = "onlineBanking.FX.Save";
	private String Edit = "onlineBanking.FX.Edit";
	private String Update = "onlineBanking.FX.Update";
	private String BuyUSDAmount = "onlineBanking.FX.BuyUSDAmount";
	private String SellUSDAmount = "onlineBanking.FX.SellUSDAmount";
	private String DealReceivedTitle = "onlineBanking.FX.DealReceivedTitle";
	private String DealSuccessMessage = "onlineBanking.FX.DealSuccessMessage";
	private String OkButton = "onlineBanking.FX.Ok";
	private String RequestDealButton = "onlineBanking.FX.RequestDeal";
	private String BuyingAmount = "onlineBanking.FX.BuyingAmount";
	private String SellingAmount ="onlineBanking.FX.SellingAmount";
	private String PurposeValue = "onlineBanking.FX.PurposeValue";
	private String TermConditionLink = "onlineBanking.FX.TermConditionLink";
	private String TermConditionOkButton = "onlineBanking.FX.TermConditionOkButton";
	private String TermConditionHeader = "onlineBanking.FX.TermConditionHeader";
    private String keytransfersuccessfulfromacct="onlineBanking.Fundtransfer.Lbltransfersuccessfulfromaccount";
	private BackOffice_RegisterPage registerPage = new BackOffice_RegisterPage();
	private CommonMethodsPage commonMethods = new CommonMethodsPage();


	public void clickBuyUSD() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsPresent(BuyUSD);
		Wait.forSeconds(2000);
		click.elementBy(BuyUSD);
		Wait.forSeconds(2000);
		verify.elementIsPresent(AddAccount);
		commonMethods.clickCancelBtn();
	}

	public void clickSellUSD() throws Throwable {
		Wait.forSeconds(8000);
		//verify.elementIsPresent(SellUSD);
		jsClick.elementBy(SellUSD);
		Wait.forSeconds(1000);
		verify.elementIsPresent(AddAccount);
		commonMethods.clickCancelBtn();
	}

	public void enterDetailsFX(String usd) throws Throwable {
		verify.elementIsPresent(BuyUSD);
		Wait.forSeconds(5000);
		jsClick.elementBy(BuyUSD);
		Wait.forSeconds(4000);
		commonMethods.clickkeySelectAcc();
		commonMethods.clickFromAccNumber();
		Wait.forSeconds(4000);
		type.data(EnterUSD, usd);

	}

	public void enterDetailsFX1(String usd) throws Throwable {
		verify.elementIsPresent(SellUSD);
		Wait.forSeconds(1000);
		jsClick.elementBy(SellUSD);
		Wait.forSeconds(1000);
		commonMethods.clickkeySelectAcc();
		commonMethods.clickFromAccNumber();
		type.data(EnterUSD, usd);

	}

	public void verifyEnoughFundErrMsg() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsPresent(EnoughFundErrMsg);
	}

	public void verifyAmtExceedsErrMsg() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsPresent(AmountExceedsErrMsg);
	}

	public void selectPurposeDropdown(String purposeValue) throws Throwable {
		Wait.forSeconds(4000);

		if (Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac")) {

			get.elementBy(Purpose).click();
			Wait.forSeconds(3000);
			//driver.findElement(By.xpath("//span[@title=\"Travel\"]")).click();
			//driver.findElement(By.xpath("//*[text()=\"Travel\"]")).click();
			driver.findElement(By.xpath("//div[@class='rc-virtual-list']//div[text()=\"Travel\"]")).click();


		} else {

			click.elementBy(Purpose);
			Wait.forSeconds(4000);
//			String DataToSelectXpath= "(//*[text()='"+purposeValue+"'])";
//			driver.findElement(By.xpath(DataToSelectXpath)).click();
			driver.findElement(By.xpath("//div[@class='rc-virtual-list']//div[text()=\"Travel\"]")).click();
		}

	}

	public void clickNextButton() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(KeyNext);
	}

	public void clickSignatureButton() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(Signature);
	}

	public void clickSaveButton() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(Save);
	}

	public void clickEditBtn() throws Throwable {
		Wait.forSeconds(10000);
		//click.elementBy(Edit);
		jsClick.elementBy(Edit);
		Wait.forSeconds(2000);
	}

	public void enterUSDAmount(String usd) throws Throwable {
		Wait.forSeconds(10000);
		type.data(EnterUSD, usd);
	}

	public void clickUpdateButton() throws Throwable {
		Wait.forSeconds(5000);
		//click.elementBy(Update);
		jsClick.elementBy(Update);
	}

	public void clickBuyUSDAmountButton() throws Throwable {
		Wait.forSeconds(1000);
		// click.elementBy(BuyUSDAmount);
		jsClick.elementBy(BuyUSDAmount);
	}
	public void clickSellUSDAmountButton() throws Throwable {
		Wait.forSeconds(1000);
		// click.elementBy(SellUSDAmount);
		jsClick.elementBy(SellUSDAmount);
	}

	public void verifyDealReceivedTitle() throws Throwable {
		verify.IfElementExists(DealReceivedTitle);
	}

	public void verifyDealSuccessMessage() throws Throwable {
		verify.IfElementExists(DealSuccessMessage);

	}

	public void clickOKButton() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(OkButton);
	}

	public void clickRequestDealButton() throws Throwable {
		Wait.forSeconds(10000);
		click.elementBy(RequestDealButton);
	}

	public void clickTermsConditionsLink() throws Throwable {
		click.elementBy(TermConditionLink);
	}

	public void verifyTermsConditionsHeader() throws Throwable {
		Wait.forSeconds(3000);
		verify.IfElementExists(TermConditionHeader);
	}
	public void clickTermsConditionsOkButton() throws Throwable {
		click.elementBy(TermConditionOkButton);
	}
	public void verifyBuyUSDTransferDetailsPage(String Buying,String Fromacc,String Purpose) throws Throwable {
		Wait.forSeconds(3000);
		verify.elementTextMatching(BuyingAmount,Buying);
		verify.elementTextMatching(keytransfersuccessfulfromacct,Fromacc);
		verify.elementTextMatching(PurposeValue,Purpose);
	}
	public void verifySellUSDTransferDetailsPage(String Selling,String Fromacc) throws Throwable {
		Wait.forSeconds(5000);
		verify.elementTextMatching(SellingAmount,Selling);
		verify.elementTextMatching(keytransfersuccessfulfromacct,Fromacc);
	}
}