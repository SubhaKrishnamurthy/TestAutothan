package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.*;

public class BuyLoad {
    private Dashboard_Home_Page dashboard = new Dashboard_Home_Page();
    private LoginPage login = new LoginPage();
    private SendMoney_Ownaccount  Ownaccount= new SendMoney_Ownaccount();
    private SendMoney_OtherUBaccount  OtherUBaccount= new SendMoney_OtherUBaccount();
    private SendMoney_Instapay Instapay= new SendMoney_Instapay();
    private SendMoney_Pesonet Pesonet= new SendMoney_Pesonet();
    private SendMoney_PDDTS PDDTS= new SendMoney_PDDTS();
    private BuyloadPage Buyload= new BuyloadPage();



    @Then("^I click select contact in the buyload page$")
    public void iClickSelectContactInTheBuyloadPage() throws Throwable {
        Buyload.clickselectcontact();
    }

    @And("^I verify the mobile number is exist$")
    public void iVerifyTheMobileNumberIsExist() throws Throwable {
        Buyload.verifyelementisexist();
    }

    @And("^I select the value \"([^\"]*)\" in buy load screen$")
    public void iSelectTheValueInBuyLoadScreen(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Buyload.selectvaluefromthetext(arg0);
    }

    @And("^I click the search result$")
    public void iClickTheSearchResult() throws Throwable {
        Buyload.clickSearchresult();
    }

   

    @And("^I click the select from list$")
    public void iClickTheSelectFromList() throws Throwable {
        Buyload.clickSelectfromlist();
    }

    @And("^I verify tansfer successful displayed$")
    public void iVerifyTansferSuccessfulDisplayed() throws Throwable {
        Buyload.verifypurchasesuccessful();
    }

    @And("^I Verify the buyload details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iVerifyTheBuyloadDetailsAndAnd(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I enter the name \"([^\"]*)\" in search field$")
    public void iEnterTheNameInSerachField(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Buyload.enterSearchcontact(arg0);
    }

    @And("^I click purchaseload button$")
    public void iClickPurchaseloadButton() throws Throwable {
        Buyload.clickPurchaseload();
    }

    @And("^I click the favourite link$")
    public void iClickTheFavouriteLink() throws Throwable {
        Buyload.clickLnkfavourites();
    }

    @And("^I click the from account number low balance$")
    public void iClickTheFromAccountNumberLowBalance() throws Throwable {
        Buyload.clickkeyaccountnumber();
    }

    @And("^I verify the error message low balance account$")
    public void iVerifyTheErrorMessageLowBalanceAccount() throws Throwable {
        Buyload.verifyerrrormessageisexist();
    }

    @And("^I click the Submit Button in buyload$")
    public void iClickTheSubmitButtonInBuyload() throws Throwable {
        Buyload.clickSubmit();
    }

    @And("^I verify the new purchase link$")
    public void iVerifyTheNewPurchaseLink() throws Throwable {
        Buyload.clickNewpurchase();
    }

    @And("^I verify the select contact is exist$")
    public void iVerifyTheSelectContactIsExist() throws Throwable {
        Buyload.verifySelectcontactisexist();
    }

    @And("^I Verify the Dashboard page is displayed$")
    public void iVerifyTheDashboardPageIsDisplayed() throws Throwable {
        Buyload.verifyKeyDashboardisexist();
    }

    @And("^I click the cancel purchase button$")
    public void iClickTheCancelPurchaseButton() throws Throwable {
        Buyload.clickBuyloadcancelpurchase();
    }

    @And("^I click the fromaccount edit button$")
    public void iClickTheFromaccountEditButton() throws Throwable {
        Buyload.clickBuyloadfromaccountedit();
    }

    @And("^I click the mobilenumber edit button$")
    public void iClickTheMobilenumberEditButton() throws Throwable {
        Buyload.clickBuyloadmobilenumberedit();
    }

    @And("^I enter the mobilenumber \"([^\"]*)\"$")
    public void iEnterTheMobilenumber(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Buyload.entertheMobilenumber(arg0);
    }

    @And("^I click the amount edit button$")
    public void iClickTheAmountEditButton() throws Throwable {
        Buyload.clickBuyloadamountedit();
    }

    @And("^I Verify the next button is enabled$")
    public void iVerifyTheNextButtonIsEnabled() throws Throwable {
        Ownaccount.VerifyNextisenabled();
    }

    @And("^I verify the \"([^\"]*)\" error message$")
    public void iVerifyTheErrorMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Buyload.verifyInvalidmobileerrormsg();
    }
}
