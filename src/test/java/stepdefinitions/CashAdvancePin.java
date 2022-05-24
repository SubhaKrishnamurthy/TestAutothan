package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CashAdvancePinPage;

public class CashAdvancePin {
    CashAdvancePinPage CAPinPage= new CashAdvancePinPage();

    @When("^user click on the listed accounts$")
    public void userClickOnTheListedAccounts() throws Throwable {
        CAPinPage.click_CardAccount();

    }

    @Then("^I Verify whether application displays \"([^\"]*)\" option$")
    public void iVerifyWhetherApplicationDisplaysOption(String arg0) throws Throwable {
        CAPinPage.verifySetCashAdvancedPin(arg0);

    }
    @And("^I Verify whether application displays the label descripton as \"([^\"]*)\"$")
    public void iVerifyWhetherApplicationDisplaysTheLabelDescriptonAs(String arg0) throws Throwable {
        CAPinPage.verifySixDigitPin(arg0);
    }

    @When("^I click on Set Cash Advance Pin option$")
    public void iClickOnSetCashAdvancePinOption() throws Throwable {
        CAPinPage.click_SetCardPin();

    }

    @Then("^Verify application allow user to clear the entered pin by clicking \"([^\"]*)\" option$")
    public void verifyApplicationAllowUserToClearTheEnteredPinByClickingOption(String arg0) throws Throwable {
        CAPinPage.click_ClearPin();
    }

    @When("^I click on Reset Cash Advance Pin option$")
    public void iClickOnResetCashAdvancePinOption() throws Throwable {
        CAPinPage.click_ResetCardPin();
    }

    @Then("^I Verify whether application displayed \"([^\"]*)\" option$")
    public void iVerifyWhetherApplicationDisplayedOption(String arg0) throws Throwable {
        CAPinPage.verifyResetCashAdvancedPin(arg0);
    }

    @When("^user click on the listed accounts from Reset$")
    public void userClickOnTheListedAccountsFromReset() throws Throwable {
        CAPinPage.click_ResetCardAccount();
    }

    @And("^I Verify whether application displays the Reset cash label descripton as \"([^\"]*)\"$")
    public void iVerifyWhetherApplicationDisplaysTheResetCashLabelDescriptonAs(String arg0) throws Throwable {
        CAPinPage.verifySixDigitCreditPin(arg0);
    }
}
