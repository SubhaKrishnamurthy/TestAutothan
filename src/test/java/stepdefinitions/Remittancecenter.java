package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.*;

public class Remittancecenter {
    private Dashboard_Home_Page dashboard = new Dashboard_Home_Page();
    private LoginPage login = new LoginPage();
    private SendMoney_Ownaccount  Ownaccount= new SendMoney_Ownaccount();
    private SendMoney_OtherUBaccount  OtherUBaccount= new SendMoney_OtherUBaccount();
    private SendMoney_Instapay Instapay= new SendMoney_Instapay();
    private SendMoney_Pesonet Pesonet= new SendMoney_Pesonet();
    private SendMoney_PDDTS PDDTS= new SendMoney_PDDTS();
    private SendMoney_Remittancecenter RC= new SendMoney_Remittancecenter();

    @Then("^I verify the remittancecenter link$")
    public void iVerifyTheRemittancecenterLink() throws Throwable {
        RC.verifyRemittancecenterisexist();
    }

    @And("^I click the getstarted link$")
    public void iClickTheGetstartedLink() throws Throwable {
        RC.clickBtnGetstarted();
    }

    @And("^I click the remittancecenter link$")
    public void iClickTheRemittancecenterLink() throws Throwable {
    RC.clickRemittancecenter();
    }

    @And("^I verify remittancecenterlbl link$")
    public void iVerifyRemittancecenterlblLink() throws Throwable {
        RC.verifyRemittancecenterheaderisexist();
    }

    @And("^I click palawan express link$")
    public void iClickPalawanExpressLink() throws Throwable {
        RC.clickpalawanexpress();
    }

    @And("^I click the remittancecenter proceed link$")
    public void iClickTheRemittancecenterProceedLink() throws Throwable {
     RC.clickRemittancecenterproceed();
    }

    @And("^I enter the amount \"([^\"]*)\" and enter the purpose \"([^\"]*)\"$")
    public void iEnterTheAmountAndEnterThePurpose(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        RC.entertheamountandpurpose(arg0,arg1);
    }

    @And("^I click the click to select account and select account from list$")
    public void iClickTheClickToSelectAccountAndSelectAccountFromList() throws Throwable {
       RC.clickSelectaccount();

    }

    @Then("^I verify the Servive fee should be displayed$")
    public void iVerifyTheServiveFeeShouldBeDisplayed() throws Throwable {
    RC.verifyServicefeeisexist();
    }

    @And("^I verify the cancel and proceed button isexist$")
    public void iVerifyTheCancelAndProceedButtonIsexist() throws Throwable {
    RC.verifyCancelandproceedisexist();
    }

    @And("^I click the proceed button$")
    public void iClickTheProceedButton() throws Throwable {
    RC.clickProceed();
    }


    @Then("^I verify the Sendto page is displayed in RC$")
    public void iVerifyTheSendtoPageIsDisplayedInRC() throws Throwable {
        RC.verifyRemittancecentersendmoneyto();
    }

    @And("^I enter the recipient email \"([^\"]*)\" mobilenumber \"([^\"]*)\"$")
    public void iEnterTheRecipientEmailMobilenumber(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        OtherUBaccount.entertheMobileEmail(arg0,arg1);
    }

    @And("^I Select DOB and Nationality$")
    public void iSelectDOBAndNationality() throws Throwable {
        RC.selectNationality();
    }

    @And("^I enter the Firstname \"([^\"]*)\" and Middlename\"([^\"]*)\" and Lastname\"([^\"]*)\"$")
    public void iEnterTheFirstnameAndMiddlenameAndLastname(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        RC.entertheNames(arg0,arg1,arg2);
    }

    @And("^I Verify the from accountno\"([^\"]*)\" accountname\"([^\"]*)\" transferamt\"([^\"]*)\"purpose\"([^\"]*)\"$")
    public void iVerifyTheFromAccountnoAccountnameTransferamtPurpose(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    RC.verifyAccountdetails(arg0,arg1,arg2);
    }

    @And("^I verify the  name \"([^\"]*)\" and DOB\"([^\"]*)\" nationality\"([^\"]*)\"$")
    public void iVerifyTheNameAndDOBNationality(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      RC.verifynamedetails(arg0,arg1,arg2);
    }

    @And("^I verify the mobileno\"([^\"]*)\" mailid\"([^\"]*)\"adddress\"([^\"]*)\"$")
    public void iVerifyTheMobilenoMailidAdddress(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     RC.verifyEmailMobileandaddress(arg0,arg1,arg2);
    }

    @And("^I click the cancel button in remittance center reviewandsend page$")
    public void iClickTheCancelButtonInRemittanceCenterReviewandsendPage() throws Throwable {
    RC.clickRemittanceCenterReviewandsendSendcancel();
    }

    @And("^I click the reviewandsend checkbox$")
    public void iClickTheReviewandsendCheckbox() throws Throwable {
        RC.clickRemittanceCenterReviewandsendcheckbox();
    }

    @And("^I click the reviewandsend php button$")
    public void iClickTheReviewandsendPhpButton() throws Throwable {
        RC.clickRemittanceCenterReviewandsendSendPhp();
    }

    @And("^I click the cancel button in remittance center reviewandsend$")
    public void iClickTheCancelButtonInRemittanceCenterReviewandsend() throws Throwable {
        RC.clickRemittanceCenterReviewandsendSendcancel();
    }

    @And("^I click the Submit in remittance center$")
    public void iClickTheSubmitInRemittanceCenter() throws Throwable {
        RC.clickRemittanceCenterSubmit();
    }

    @And("^I click palawan express link is exist$")
    public void iClickPalawanExpressLinkIsExist() throws Throwable {
     RC.Verifypalawanexpressexist();
    }


    @And("^I leave the Address is blank and verify the validation$")
    public void iLeaveTheAddressIsBlankAndVerifyTheValidation() throws Throwable {
    PDDTS.VerifytheAddressfieldwhenblank();
    }

    @And("^I click the edit button in remittance center$")
    public void iClickTheEditButtonInRemittanceCenter() throws Throwable {
        RC.clickRemittanceCenterEdit();
    }

    @And("^I click the update button in remittance center$")
    public void iClickTheUpdateButtonInRemittanceCenter() throws Throwable {
        RC.clickRemittanceCenterUpdate();
    }


}
