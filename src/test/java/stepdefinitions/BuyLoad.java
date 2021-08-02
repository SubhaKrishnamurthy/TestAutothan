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
        Buyload.verifySuccessfulscreenvalidations(arg0, arg1, arg2);
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

    @And("^I enter the name\"([^\"]*)\"$")
    public void iEnterTheName(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Buyload.entertheSearchname(arg0);

    }

    @And("^I verify the search results \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iVerifyTheSearchResultsAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Buyload.verifySearcresult(arg0,arg1);
    }

    @And("^I click the search icon in buyload$")
    public void iClickTheSearchIconInBuyload() throws Throwable {
        Buyload.clickSearchicon();
    }

    @And("^I click the favourite link in buyload$")
    public void iClickTheFavouriteLinkInBuyload() throws Throwable {
        OtherUBaccount.clickfavourite();
    }

    @And("^I click the addcontact in buyload$")
    public void iClickTheAddcontactInBuyload() throws Throwable {
        Buyload.clickAddcontact();
    }

    @And("^I enter the name \"([^\"]*)\" and mobile\"([^\"]*)\" in add contact deatils$")
    public void iEnterTheNameAndMobileInAddContactDeatils(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Buyload.enterContactnameandmobile(arg0,arg1);
    }

    @And("^I click the save button in manage contact$")
    public void iClickTheSaveButtonInManageContact() throws Throwable {
        Buyload.clickSave();
    }

    @And("^I click the search result link$")
    public void iClickTheSearchResultLink() throws Throwable {
        Buyload.clickSearchfirstresult();
    }

    @And("^I click the edit button in manage contact$")
    public void iClickTheEditButtonInManageContact() throws Throwable {
        Buyload.clickEdit();
    }

    @And("^I change the buyload contat name\"([^\"]*)\"$")
    public void iChangeTheBuyloadContatName(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Buyload.enterContactnameandmobile(arg0,"09841011885");
    }

    @And("^I click the delete button in manage contact$")
    public void iClickTheDeleteButtonInManageContact() throws Throwable {
        Buyload.clickDelete();
    }

    @And("^I verify \"([^\"]*)\"$")
    public void iVerify(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Buyload.verifySearcresultNoenrolledcontactsfound();
    }

    @And("^I click the favorite button$")
    public void iClickTheFavoriteButton() throws Throwable {
        Buyload.clickfavouritebutton();
    }

    @And("^I verify the validation error message in add contact$")
    public void iVerifyTheValidationErrorMessageInAddContact() throws Throwable {
        Buyload.verifyValidationinaddcontact();
    }

    @And("^I verify the validation error message \"([^\"]*)\" contact already contact already exist$")
    public void iVerifyTheValidationErrorMessageContactAlreadyContactAlreadyExist(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Buyload.verifyErrormessage(arg0);

    }

    @Then("^I click the FAQ link in Buyload page$")
    public void iClickTheFAQLinkInBuyloadPage() throws Throwable {
        Buyload.clickFAQ();

    }

    @And("^I verify the FAQ links are exist in FAQ page$")
    public void iVerifyTheFAQLinksAreExistInFAQPage() throws Throwable {
        Buyload.verifyFAQscreens();

    }

    @Then("^I enter the value\"([^\"]*)\" in search filed$")
    public void iEnterTheValueInSearchFiled(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Buyload.enterFAQsearchr(arg0);
    }

    @And("^I verify the results displayed$")
    public void iVerifyTheResultsDisplayed() throws Throwable {
        Buyload.verifyFAQsearchresults();
    }
}
