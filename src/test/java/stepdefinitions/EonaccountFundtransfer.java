package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.*;

public class EonaccountFundtransfer {
    private Dashboard_Home_Page dashboard = new Dashboard_Home_Page();
    private LoginPage login = new LoginPage();
    private SendMoney_Ownaccount  Ownaccount= new SendMoney_Ownaccount();
    private SendMoney_OtherUBaccount  OtherUBaccount= new SendMoney_OtherUBaccount();
    private SendMoney_EONaccount Eonaccount= new SendMoney_EONaccount();



    @Then("^I Click the EOnaccount fundtransfer Link$")
    public void iClickTheEOnaccountFundtransferLink() throws Throwable {
        Eonaccount.clickEONaccount();
    }

    @And("^Enter the Eon Account Number \"([^\"]*)\"$")
    public void enterTheEonAccountNumber(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Eonaccount.enterEONaccountNumber(arg0);
    }

    @And("^I Verify the Eonaccount Link$")
    public void iVerifyTheEonaccountLink() throws Throwable {
        Eonaccount.verifyEONaccountexist();

    }

    @Then("^I Verify Error message \"([^\"]*)\" displayed account number field$")
    public void iVerifyErrorMessageDisplayedAccountNumberField(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Eonaccount.verifyinvalidEONaccounterror(arg0);
    }

    @And("^I Verify the values \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"\"([^\"]*)\" in Recent transactions$")
    public void iVerifyTheValuesAndAndInRecentTransactions(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        Ownaccount.verifytheRecenttransactionPage(arg0,arg1,arg2);
    }
}
