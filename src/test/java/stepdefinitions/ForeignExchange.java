package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.python.modules._functools._functools;
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
}
