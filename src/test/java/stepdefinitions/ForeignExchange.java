package stepdefinitions;

import actions.Wait;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.python.modules._functools._functools;
import pages.*;

public class ForeignExchange {

    private LoginPage login = new LoginPage();
    private CommonMethodsPage common = new CommonMethodsPage();
    private ForeignExchange_Page foreignExchangePage = new ForeignExchange_Page();

    WebDriver driver;
    WebElement element;

   @Then("^I verify Add Account and Cancel buttons by clicking BUYUSD button$")
    public void I_verify_Add_Account_and_Cancel_buttons_by_clicking_BUYUSD_button() throws Throwable {
       foreignExchangePage.clickBuyUSD();
    }

    @Then("^I verify Add Account and Cancel buttons by clicking SELLUSD button$")
    public void I_verify_Add_Account_and_Cancel_buttons_by_clicking_SELLUSD_button() throws Throwable {
       foreignExchangePage.clickSellUSD();
    }

    @And("^I click BUYUSD button, select account and enter USD amount \"([^\"]*)\"$")
    public void I_click_BUYUSD_button_select_account_and_enter_USD_amount(String arg1) throws Throwable {
        foreignExchangePage.enterDetailsFX(arg1);
    }

    @Then("^I verify the enough fund error message$")
    public void I_verify_the_enough_fund_error_message() throws Throwable {
        foreignExchangePage.verifyEnoughFundErrMsg();
    }

    @And("^I click SELLUSD button, select account and enter USD amount \"([^\"]*)\"$")
    public void I_click_SELLUSD_button_select_account_and_enter_USD_amount(String arg1) throws Throwable {
        foreignExchangePage.enterDetailsFX1(arg1);
    }

    @Then("^I verify the amount exceeds error message$")
    public void I_verify_the_amount_exceeds_error_message() throws Throwable {
       foreignExchangePage.verifyAmtExceedsErrMsg();
    }

    @And("^I select the value \"([^\"]*)\" in purpose dropdown section$")
    public void iSelectTheValueInPurposeDropdownSection(String arg0) throws Throwable {
        foreignExchangePage.selectPurposeDropdown(arg0);

    }
    @And("^I click the Next Button in FX$")
    public void iClickTheNextButton() throws Throwable {
        foreignExchangePage.clickNextButton();
    }

    @And("^I click the SIGNATURE button$")
    public void iClickTheSIGNATUREButton() throws Throwable {
        foreignExchangePage.clickSignatureButton();

    }

    @And("^I click the save button in Signature screen$")
    public void iClickTheSaveButtonInSignatureScreen() throws Throwable {
        foreignExchangePage.clickSaveButton();
    }
    @When("^I Click the Edit button in FX$")
    public void i_Click_the_Edit_button() throws Throwable {
        foreignExchangePage.clickEditBtn();
    }

    @And("^I select USD amount \"([^\"]*)\"$")
    public void iSelectUSDAmount(String arg0) throws Throwable {
        foreignExchangePage.enterUSDAmount(arg0);

    }

    @And("^I click the Update button in Buy USD section$")
    public void iClickTheUpdateButtonInBuyUSDSection() throws Throwable {
        foreignExchangePage.clickUpdateButton();
    }

    @When("^I click the Buy USD button in FX convert page$")
    public void iClickTheBuyUSDButtonInFXConvertPage() throws Throwable {
        foreignExchangePage.clickBuyUSDAmountButton();
    }

    @Then("^I verify the Deal Received Title message$")
    public void iVerifyTheDealReceivedTitleMessage() throws Throwable {
        foreignExchangePage.verifyDealSuccessMessage();
    }

    @And("^I verify the DealSuccess message$")
    public void iVerifyTheDealSuccessMessage() throws Throwable {
        foreignExchangePage.verifyDealReceivedTitle();
    }

    @And("^I click the OK button$")
    public void iClickTheOKButton() throws Throwable {
        foreignExchangePage.clickOKButton();
    }

    @And("^I click the Request Deal button in FX convert page$")
    public void iClickTheRequestDealButtonInFXConvertPage() throws Throwable {
        foreignExchangePage.clickRequestDealButton();
    }

    @And("^I click on Terms and Conditions options in E-Signature screen$")
    public void iClickOnTermsAndConditionsOptionsInESignatureScreen() throws Throwable {
        foreignExchangePage.clickTermsConditionsLink();
    }

    @Then("^I Verify Terms and Conditions title in E-Signature screen$")
    public void iVerifyTermsAndConditionsTitleInESignatureScreen() throws Throwable {
        foreignExchangePage.verifyTermsConditionsHeader();
    }

    @And("^I click on OK button in E-Signature screen$")
    public void iClickOnOKButtonInESignatureScreen() throws Throwable {
        foreignExchangePage.clickTermsConditionsOkButton();
    }

    @Then("^I Verify the Buying \"([^\"]*)\" and Fromaccount \"([^\"]*)\" and Purpose\"([^\"]*)\"$")
    public void iVerifyTheBuyingAndFromaccountAndPurpose(String arg0, String arg1, String arg2) throws Throwable {
        foreignExchangePage.verifyBuyUSDTransferDetailsPage(arg0,arg1,arg2);
    }

    @Then("^I Verify the Selling amount \"([^\"]*)\" and Fromaccount \"([^\"]*)\"$")
    public void iVerifyTheSellingAmountAndFromaccount(String arg0, String arg1) throws Throwable {
        foreignExchangePage.verifySellUSDTransferDetailsPage(arg0,arg1);
    }

    @When("^I click the Sell USD button in FX convert page$")
    public void iClickTheSellUSDButtonInFXConvertPage() throws Throwable {
        foreignExchangePage.clickSellUSDAmountButton();
    }
}
