package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonMethodsPage;
import pages.Dashboard_Home_Page;
import pages.MobileBranchBanking_Page;
import pages.RequestPayment_Page;

public class MobileBranchBanking {

    Dashboard_Home_Page dashboardHomePage =  new Dashboard_Home_Page();
    MobileBranchBanking_Page mbbPage = new MobileBranchBanking_Page();
    CommonMethodsPage commonpage = new CommonMethodsPage();

    @When("^I click visit branch from dashboard$")
    public void i_click_visit_branch_from_dashboard() throws Throwable {
       dashboardHomePage.clickMBBSection();
    }

    @Then("^I Verifiy the Mobile branch banking screen$")
    public void i_Verifiy_the_Mobile_branch_banking_screen() throws Throwable {
        mbbPage.verifyMBBScreen();
    }

    @When("^I click the select branch option$")
    public void i_click_the_select_branch_option() throws Throwable {
        mbbPage.clickSelectBranch();
    }

    @When("^I click the search icon$")
    public void i_click_the_search_icon() throws Throwable {
        mbbPage.clickSearchIcon();
    }

    @Then("^I verify the branch required error message as \"([^\"]*)\"$")
    public void i_verify_the_branch_required_error_message_as(String msg) throws Throwable {
        commonpage.verifyAccNumErrMsg1(msg);
    }

    @Then("^I Verify the message in the today section$")
    public void i_Verify_the_message_in_the_today_section() throws Throwable {
        mbbPage.verifyMessgae_TodaySection();
    }

    @Then("^I verify no View more buttton in upcoming section and History section$")
    public void i_verify_no_View_more_buttton_in_upcoming_section_and_History_section() throws Throwable {
        mbbPage.verifyViewMoreBtn();
    }

    @When("^I search the branch as (\\D+)$")
    public void i_search_the_branch_as(String arg1) throws Throwable {
       mbbPage.searchBranch(arg1);
    }

    @Then("^I verify the branch address as \"([^\"]*)\"$")
    public void i_verify_the_branch_address_as(String arg1) throws Throwable {
        mbbPage.verify_BranchAddress(arg1);
    }

    @When("^I select the date as \"([^\"]*)\"$")
    public void i_select_the_date_as(String date) throws Throwable {
        mbbPage.selectDate(date);
    }

    @When("^I click add transaction button$")
    public void i_click_add_transaction_button() throws Throwable {
        mbbPage.click_AddTransactionBtn();
    }

    @When("^I click add cash deposit button$")
    public void i_click_add_cash_deposit_button() throws Throwable {
        mbbPage.click_AddCashDepositBtn();
    }

    @When("^I enter account number as \"([^\"]*)\"$")
    public void i_enter_account_number_as(String arg1) throws Throwable {
        mbbPage.enterAccNumber(arg1);
    }

    @When("^I enter account number again as \"([^\"]*)\"$")
    public void i_enter_account_number_again_as(String accNum) throws Throwable {
        mbbPage.Re_enterAccNumber(accNum);
    }

    @When("^I enter amount as \"([^\"]*)\"$")
    public void i_enter_amount_as(String arg1) throws Throwable {
        mbbPage.enterAmt(arg1);
    }

    @When("^I enter amount again as \"([^\"]*)\"$")
    public void i_enter_amount_again_as(String arg1) throws Throwable {
        mbbPage.Re_enterAmt(arg1);
    }

    @Then("^I verify no error message is displayed$")
    public void i_verify_no_error_message_is_displayed() throws Throwable {
        commonpage.verifyAccNumNoErrMsg();
    }

    @Then("^I verify review visit account number value as \"([^\"]*)\"$")
    public void i_verify_review_visit_account_number_value_as(String arg1) throws Throwable {
        mbbPage.verify_ReviewVisit_AccNumberValue(arg1);
    }

    @Then("^I verify account number value as \"([^\"]*)\"$")
    public void i_verify_account_number_value_as(String arg1) throws Throwable {
        mbbPage.verify_AccNumberValue(arg1);
    }

    @Then("^I verify review visit amount as \"([^\"]*)\"$")
    public void i_verify_review_visit_amount_as(String arg1) throws Throwable {
        mbbPage.verify_ReviewVisit_AmountValue(arg1);
    }

    @Then("^I click the cancel visit review button$")
    public void i_click_the_cancel_visit_review_button() throws Throwable {
        mbbPage.click_CancelVisitReview();
    }

    @Then("^I verify the select branch option is available$")
    public void i_verify_the_select_branch_option_is_available() throws Throwable {
        mbbPage.verify_SelectBranch();
    }

    @Then("^I book visit if todays date is enabled$")
    public void i_book_visit_if_todays_date_is_enabled() throws Throwable {
        mbbPage.bookVisit_TodaysDate();
    }

    @Then("^I verify error message after selecting todays date$")
    public void i_verify_error_message_after_selecting_todays_date() throws Throwable {
        mbbPage.VerifyError_TodaysDate();
    }

    @When("^I select todays date$")
    public void i_select_todays_date() throws Throwable {
        mbbPage.selectTodaysDate();
    }

    @When("^I edit the amount from review page$")
    public void i_edit_the_amount_from_review_page() throws Throwable {
        mbbPage.editAmount();
    }

    @Then("^I click book visit button$")
    public void i_click_book_visit_button() throws Throwable {
        mbbPage.click_BookVisit();

    }

    @Then("^I cancel the visit$")
    public void i_cancel_the_visit() throws Throwable {
        mbbPage.CancelTodaysVisit();
    }

    @Then("^I edit the visit after selecting todays date$")
    public void i_edit_the_visit_after_selecting_todays_date() throws Throwable {
        mbbPage.editTodaysVisit();
    }

}
