package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.Dashboard_Home_Page;
import pages.LoginPage;
import pages.SendMoney_OtherUBaccount;
import pages.*;

public class InstapayFundtransfer {
    private Dashboard_Home_Page dashboard = new Dashboard_Home_Page();
    private LoginPage login = new LoginPage();
    private SendMoney_Ownaccount  Ownaccount= new SendMoney_Ownaccount();
    private SendMoney_OtherUBaccount  OtherUBaccount= new SendMoney_OtherUBaccount();
    private SendMoney_Instapay Instapay= new SendMoney_Instapay();




    @Then("^I click the Other banks or Ewallet$")
    public void iClickTheOtherBanksOrEwallet() throws Throwable {
        Instapay.clickOtherbank();
    }

    @And("^I click the Instapay link$")
    public void iClickTheInstapayLink() throws Throwable {
        Instapay.clickInstapay();
    }



    @Then("^I verify the validation message for than account balance \"([^\"]*)\"$")
    public void iVerifyTheValidationMessageForThanAccountBalance(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Instapay.verifyErrormessage(arg0);
    }

    @And("^I enter the recipient email \"([^\"]*)\" mobilenumber \"([^\"]*)\" and remarks (\\d+) chars$")
    public void iEnterTheRecipientEmailMobilenumberAndRemarksChars(String arg0, String arg1,int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.entertheMobileEmail(arg0,arg1);
        Instapay.Entermorethan256chars();
    }

    @And("^I verify Next button is not enabled$")
    public void iVerifyNextButtonIsNotEnabled() throws Throwable {
        OtherUBaccount.verifyNextbuttonisnotenabled();

    }

    @And("^I search the Account number from saved recipient \"([^\"]*)\"$")
    public void iSearchTheAccountNumberFromSavedRecipient(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.searchRecipientfrommyrecipient(arg0);
    }


    @Then("^I verify Account number is disabled$")
    public void iVerifyAccountNumberIsDisabled() throws Throwable {
        Instapay.verifyFieldisDisabled();
    }

    @And("^I Verify \"([^\"]*)\" message displayed in the account number$")
    public void iVerifyMessageDisplayedInTheAccountNumber(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Instapay.verifyErrormessagenoteligible(arg0);
    }

    @And("^I search the Account number from favourite recipient \"([^\"]*)\"$")
    public void iSearchTheAccountNumberFromFavouriteRecipient(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.searchRecipientfromfavouriterecipient(arg0);
    }

    @And("^I select the bank \"([^\"]*)\" from listbox$")
    public void iSelectTheBankFromListbox(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Instapay.selectBank(arg0);
    }

    @And("^I Enter the Accountnumber\"([^\"]*)\"$")
    public void iEnterTheAccountnumber(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Instapay.enterAccountnumber(arg0);
    }

    @And("^I enter the Accountname\"([^\"]*)\"$")
    public void iEnterTheAccountname(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Instapay.enterAccountname(arg0);
    }

    @Then("^I verify the error message\"([^\"]*)\"$")
    public void iVerifyTheErrorMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Instapay.verifyAccountnameisrequired();
    }

    @Then("^I verify the error message accout number \"([^\"]*)\"$")
    public void iVerifyTheErrorMessageAccoutNumber(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Instapay.verifyAccountnumberisrequired();
    }

    @Then("^I verify the error message accout name \"([^\"]*)\"$")
    public void iVerifyTheErrorMessageAccoutName(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Instapay.verifyAccountnamevalidation();
    }
}
