package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.*;

public class PesoNetFundtransfer {
    private Dashboard_Home_Page dashboard = new Dashboard_Home_Page();
    private LoginPage login = new LoginPage();
    private SendMoney_Ownaccount  Ownaccount= new SendMoney_Ownaccount();
    private SendMoney_OtherUBaccount  OtherUBaccount= new SendMoney_OtherUBaccount();
    private SendMoney_Instapay Instapay= new SendMoney_Instapay();
    private SendMoney_Pesonet Pesonet= new SendMoney_Pesonet();




    @And("^I click the Pesonet link$")
    public void iClickThePesonetLink() throws Throwable {
        Pesonet.clickPesonet();
    }

    @And("^I select the reason \"([^\"]*)\"$")
    public void iSelectTheReason(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Pesonet.selectthereason(arg0);
    }

    @And("^I click the proceed with transfer$")
    public void iClickTheProceedWithTransfer() throws Throwable {
        Pesonet.clickproceedwithPesonet();
    }

    @Then("^I Verify the error message \"([^\"]*)\"$")
    public void iVerifyTheErrorMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Pesonet.verifyAmounterror();
    }

    @And("^I select the reason(\\d+) \"([^\"]*)\"$")
    public void iSelectTheReason(int arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Pesonet.selectthereason2(arg1);
    }

    @And("^I Enter the reason in Leave purpose field \"([^\"]*)\"$")
    public void iEnterTheReasonInLeavePurposeField(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Pesonet.entertheLeaveaPurpose(arg0);
    }


    @Then("^I Verify the \"([^\"]*)\" is not displayed in listbox$")
    public void i_Verify_the_is_not_displayed_in_listbox(String arg1) throws Throwable {
       Pesonet.verify_BankNotDisplayed(arg1);
    }

}
