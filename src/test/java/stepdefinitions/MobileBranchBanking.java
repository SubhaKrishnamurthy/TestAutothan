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

    @Then("^I Verfiy the Mobile branch banking screen$")
    public void i_Verfiy_the_Mobile_branch_banking_screen() throws Throwable {
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



}
