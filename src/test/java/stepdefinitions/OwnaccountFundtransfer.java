package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonMethodsPage;
import pages.*;
import pages.Dashboard_Home_Page;
import pages.SendReceive_Page;

public class OwnaccountFundtransfer {
    private Dashboard_Home_Page dashboard = new Dashboard_Home_Page();
    private LoginPage login = new LoginPage();
    private SendMoney_Ownaccount  Ownaccount= new SendMoney_Ownaccount();



    @When("^I click the Send/Receive Money$")
    public void iClickTheSendRequest() throws Throwable {
        dashboard.clickSendReceive();
    }

    @Then("^Ownacount link should not displayed$")
    public void ownacountLinkShouldNotDisplayed() throws Throwable {
        Ownaccount.verifyOwnaccountsNotexist();
    }

    @Then("^I Click Ownacount link$")
    public void iClickOwnacountLink() throws Throwable {
        Ownaccount.clickOwnaccount();
    }

    @And("^I click the from account number$")
    public void iClickTheFromAccountNumber() throws Throwable {
        Ownaccount.clickFromaccount();
    }

    @And("^I click the to account number$")
    public void iClickTheToAccountNumber() throws Throwable {
        Ownaccount.clickToaccount();
    }

    @And("^I Enter the Amount \"([^\"]*)\" and remarks \"([^\"]*)\"$")
    public void iEnterTheAmountAndRemarks(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Ownaccount.enterthAmountandRemarks(arg0,arg1);
    }

    @And("^I click the Next Button$")
    public void iClickTheNextButton() throws Throwable {
        Ownaccount.clickNextbutton();
    }

    @And("^I verify the Gotit button displayed or not$")
    public void iVerifyTheGotitButtonDisplayedOrNot() throws Throwable {
        Ownaccount.verifytheGotitbutton();
    }

    @And("^I click the Transfer button$")
    public void iClickTheTransferButton() throws Throwable {
        Ownaccount.clickTransferbutton();
    }

    @Then("^I Verify the OTP Filed is page is displayed$")
    public void iVerifyTheOTPFiledIsPageIsDisplayed() throws Throwable {
        Ownaccount.verifyOTPpageisdisplayed();
    }

    @And("^I Enter the OTP \"([^\"]*)\" in OTP Page$")
    public void iEnterTheOTPInOTPPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Ownaccount.entertheOTPOTPpage(arg0);
    }

    @And("^I click the Submit Button$")
    public void iClickTheSubmitButton() throws Throwable {
        Ownaccount.clickSubmit();
    }

    @Then("^I verify the Successful message is displayed$")
    public void iVerifyTheSuccessfulMessageIsDisplayed() throws Throwable {
        Ownaccount.verifytransfersuccessfulisdisplayed();
    }

    @And("^I Verify the Fromaccount\"([^\"]*)\" and Toaccount \"([^\"]*)\" and Amount\"([^\"]*)\"and$")
    public void iVerifyTheFromaccountAndToaccountAndAmountAnd(String arg0, String arg1, String arg2) throws Throwable {
        Ownaccount.verifytransferdetailsinsuccessfulpage(arg0,arg1,arg2);
    }

    @Then("^I Click the New Transaction button Link$")
    public void iClickTheNewTransactionButtonLink() throws Throwable {
        Ownaccount.clickNewtransaction();
    }

    @And("^I Verify the Ownaccount Link$")
    public void iVerifyTheOwnaccountLink() throws Throwable {
        Ownaccount.verifyOwnaccountsexist();
    }

    @And("^I Click the Logout Button$")
    public void iClickTheLogoutButton() throws Throwable {
        Ownaccount.clickLogout();
    }

    @And("^I click the Cancel button$")
    public void iClickTheCancelButton() throws Throwable {
        Ownaccount.clickCancel();
    }

    @And("^I click the Yes button$")
    public void iClickTheYesButton() throws Throwable {
        Ownaccount.clickYes();
    }

    @And("^I Click Back button$")
    public void iClickBackButton() throws Throwable {
        Ownaccount.navigatetoBack();
    }

    @Then("^I Verify from account number page should be displayed$")
    public void iVerifyFromAccountNumberPageShouldBeDisplayed() throws Throwable {
        Ownaccount.verifyFromaccountnumberisexist();
    }

    @And("^I click the Repeat checkbox and select frequency as \"([^\"]*)\"$")
    public void iClickTheRepeatCheckboxAndSelectFrequencyAs(String arg0) throws Throwable {
        Ownaccount.selectFrequency(arg0);
    }

    @And("^I Click the fromaccountnumber edit$")
    public void iClickTheFromaccountnumberEdit() throws Throwable {
        Ownaccount.clickFromaccountedit();
    }

    @And("^I Click the toaccountnumber edit$")
    public void iClickTheToaccountnumberEdit() throws Throwable {
        Ownaccount.clickToaccountedit();
    }

    @And("^I Click the Amount details edit$")
    public void iClickTheAmountDetailsEdit() throws Throwable {
        Ownaccount.clickamountedit();
        
    }

    @And("^I click the update Button$")
    public void iClickTheUpdateButton() throws Throwable {
        Ownaccount.clickUpdate();
    }

    @And("^I Select the frequency as \"([^\"]*)\"$")
    public void iSelectTheFrequencyAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Ownaccount.selectFrequency(arg0);
    }

    @And("^I Enter the Amount \"([^\"]*)\" and remarks with morethan (\\d+) characters$")
    public void iEnterTheAmountAndRemarksWithMorethanCharacters(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Ownaccount.enterthAmountandRemarkswith256chars(arg0,arg1);
    }


    @And("^I Store the Reference Number and transaction date$")
    public void iStoreTheReferenceNumberAndTransactionDate() throws Throwable {
        Ownaccount.StoreTxndateandReferencenumber();
    }

    @Then("^I Verify the values \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" in Recenent transactions$")
    public void iVerifyTheValuesAndAndInRecenentTransactions(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}
