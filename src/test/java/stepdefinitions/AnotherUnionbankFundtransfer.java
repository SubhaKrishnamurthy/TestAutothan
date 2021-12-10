package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.ApplicationException;
import pages.Dashboard_Home_Page;
import pages.LoginPage;
import pages.SendMoney_OtherUBaccount;
import pages.SendMoney_Ownaccount;

public class AnotherUnionbankFundtransfer {
    private Dashboard_Home_Page dashboard = new Dashboard_Home_Page();
    private LoginPage login = new LoginPage();
    private SendMoney_Ownaccount  Ownaccount= new SendMoney_Ownaccount();
    private SendMoney_OtherUBaccount  OtherUBaccount= new SendMoney_OtherUBaccount();

    @Then("^I Click UBacount link$")
    public void iClickUBacountLink() throws Throwable {
        OtherUBaccount.clickUBaccount();

    }

    @And("^I enter the UBP account number \"([^\"]*)\" and account name \"([^\"]*)\"$")
    public void iEnterTheUBPAccountNumberAndAccountName(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.enterUBaccount(arg0,arg1);
    }

    @And("^I Enter the Amount \"([^\"]*)\" in ub account transfer$")
    public void iEnterTheAmountInUbAccountTransfer(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.enterthAmount(arg0);
    }

    @Then("^I verify the Invalid OTP error message$")
    public void iVerifyTheInvalidOTPErrorMessage() throws Throwable {
        OtherUBaccount.verifyOTPErrorisexist();
    }

    @Then("^I verify the Invalid Account number error message \"([^\"]*)\"$")
    public void iVerifyTheInvalidAccountNumberErrorMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.verifyErrormessagevalidation(arg0);
    }


    @And("^I select the Account number from saved recipient \"([^\"]*)\"$")
    public void iSelectTheAccountNumberFromSavedRecipient(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.selectRecipientfrommyrecipient(arg0);
    }

    @And("^I enter the recipient email \"([^\"]*)\" mobilenumber \"([^\"]*)\" and remarks\"([^\"]*)\"$")
    public void iEnterTheRecipientEmailMobilenumberAndRemarks(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.entertheMobileEmailRemarks(arg0,arg1,arg2);
    }

    @And("^I verify Next button is enabled$")
    public void iVerifyNextButtonIsEnabled() throws Throwable {
        OtherUBaccount.verifyNextbuttonisenabled();
    }

    @And("^I select the Account number from favourite recipient \"([^\"]*)\"$")
    public void iSelectTheAccountNumberFromFavouriteRecipient(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.selectRecipientfromfavouriterecipient(arg0);
    }

    @And("^I enter the recipient email \"([^\"]*)\" mobilenumber \"([^\"]*)\" and remarks morethan (\\d+)$")
    public void iEnterTheRecipientEmailMobilenumberAndRemarksMorethan(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.entertheMobileEmaileithRemarksmorethan256chars(arg0,arg1,arg2);
    }

    @And("^I Select the future date$")
    public void iSelectTheFutureDate() throws ApplicationException {
        OtherUBaccount.Selectthefututdate();
    }

    @And("^I Verify the values \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"\" in Recent transactions$")
    public void iVerifyTheValuesAndAndInRecentTransactions(String arg0, String arg1, String arg2) throws Throwable {
        Ownaccount.verifytheRecenttransactionPage(arg0,arg1,arg2);
    }
}
