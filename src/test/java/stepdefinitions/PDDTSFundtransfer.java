package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.*;

public class PDDTSFundtransfer {
    private Dashboard_Home_Page dashboard = new Dashboard_Home_Page();
    private LoginPage login = new LoginPage();
    private SendMoney_Ownaccount  Ownaccount= new SendMoney_Ownaccount();
    private SendMoney_OtherUBaccount  OtherUBaccount= new SendMoney_OtherUBaccount();
    private SendMoney_Instapay Instapay= new SendMoney_Instapay();
    private SendMoney_Pesonet Pesonet= new SendMoney_Pesonet();
    private SendMoney_PDDTS PDDTS= new SendMoney_PDDTS();






    @And("^I Verify the PDDTS Text verification$")
    public void iVerifyThePDDTSTextVerification() throws Throwable {
        PDDTS.verifyPDDTStextvalidation();

    }

    @And("^I Verify PDDTS link isexist$")
    public void iVerifyPDDTSLinkIsexist() throws Throwable {
        PDDTS.verifyPDDTSisexist();
    }

    @And("^I Verify the PDDTS Text verification \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iVerifyThePDDTSTextVerificationAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PDDTS.verifyPDDTStextvalidation(arg0,arg1);
    }

    @And("^I click PDDTS Link$")
    public void iClickPDDTSLink() throws Throwable {
        PDDTS.clickPDDTS();
    }

    @And("^I enter the Address details in PDDTS Address field$")
    public void iEnterTheAddressDetailsInPDDTSAddressField() throws Throwable {
        PDDTS.entertheAddressfield();
    }

    @And("^I enter the amount less than (\\d+)USD in amount field$")
    public void iEnterTheAmountLessThanUSDInAmountField(int arg0) {

    }

    @And("^I enter the amount \"([^\"]*)\" less than (\\d+)USD in amount$")
    public void iEnterTheAmountLessThanUSDInAmount(String arg0, int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.enterthAmount(arg0);
    }

    @Then("^I verify the error \"([^\"]*)\"$")
    public void iVerifyTheError(String arg0) throws Throwable {
        Instapay.verifyErrormessage(arg0);
    }

    @And("^I enter the amount \"([^\"]*)\" more than account balance$")
    public void iEnterTheAmountMoreThanAccountBalance(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.enterthAmount(arg0);
    }

    @And("^I enter the amount \"([^\"]*)\"$")
    public void iEnterTheAmount(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.enterthAmount(arg0);
    }

    @Then("^I verify the popup message\"([^\"]*)\"$")
    public void iVerifyThePopupMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PDDTS.verifyPDDTSpopuptextvalidation(arg0);
    }

    @And("^I verify the Gotit button displayed$")
    public void iVerifyTheGotitButtonDisplayed() throws Throwable {
        PDDTS.verifytheGotitbutton();
    }

    @Then("^I verify the Sendto page is displayed$")
    public void iVerifyTheSendtoPageIsDisplayed() throws Throwable {
        PDDTS.verifySendto();
    }
}
