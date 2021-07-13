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
    public void iVerifyThePDDTSTextVerification() {

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
}
