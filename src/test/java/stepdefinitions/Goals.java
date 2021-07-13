package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonMethodsPage;
import pages.Dashboard_Home_Page;
import pages.GoalsPage;
import pages.RequestPayment_Page;

public class Goals {

    Dashboard_Home_Page dashboardHomePage = new Dashboard_Home_Page();
    GoalsPage goalsPage = new GoalsPage();
    CommonMethodsPage common = new CommonMethodsPage();

    @Then("^I Verify the Goals section in the dashboard$")
    public void i_Verify_the_Goals_section_in_the_dashboard() throws Throwable {
        goalsPage.verifyGoalsLbl();
    }

    @Then("^I click Goals manage button$")
    public void i_click_Goals_manage_button() throws Throwable {
        goalsPage.clickManageBtn();
    }

    @When("^I Click the add button in goals section$")
    public void i_Click_the_add_button_in_goals_section() throws Throwable {
        goalsPage.clickAddBtn();
    }

    @Then("^I Verify the goals add section page is displayed$")
    public void i_Verify_the_goals_add_section_page_is_displayed() throws Throwable {
        goalsPage.verifyHeader();
    }


    @Then("^I Check if user able to select goals type in the goals section and Click the select goal button$")
    public void i_Check_if_user_able_to_select_goals_type_in_the_goals_section_and_Click_the_select_goal_button() throws Throwable {
        goalsPage.clickSelectGoalBtn();
    }

    @When("^I Enter the below (\\d+) characters in goal name as \"([^\"]*)\"$")
    public void i_Enter_the_below_characters_in_goal_name_as(int arg1, String name) throws Throwable {
        goalsPage.enterGoalName(name);
    }

    @Then("^I Verify next button is \"([^\"]*)\"$")
    public void i_Verify_next_button_is(String arg1) throws Throwable {
        if (arg1.equalsIgnoreCase("enabled")) {
            goalsPage.verifyNextBtnEnabled();
        } else {
            goalsPage.verifyNextBtnDisabled();
        }
    }

    @Then("^I Verify the goal name error as \"([^\"]*)\"$")
    public void i_Verify_the_goal_name_error_as(String arg1) throws Throwable {
        goalsPage.verifyGoalNameErr(arg1);
    }

    @Then("^I Verify the Goals amount as \"([^\"]*)\"$")
    public void i_Verify_the_Goals_amount_as(String arg1) throws Throwable {
        goalsPage.verifyGoalsAmt(arg1);
    }

    @When("^I Click the \"([^\"]*)\" icon for increment goals amount$")
    public void i_Click_the_icon_for_increment_goals_amount(String arg1) throws Throwable {
        if (arg1.equalsIgnoreCase("plus")) {
            goalsPage.clickPlusIcon();
        } else {
            goalsPage.clickMinusIcon();
        }

    }

    @When("^I Click the frequency weekly in goals section$")
    public void i_Click_the_frequency_weekly_in_goals_section() throws Throwable {
        goalsPage.clickFreq_weekly();
    }

    @When("^I Click the frequency monthly in goals section$")
    public void i_Click_the_frequency_monthly_in_goals_section() throws Throwable {
        goalsPage.clickFreq_Monthly();
    }

    @When("^I Click the frequency quarterly in goals section$")
    public void i_Click_the_frequency_quarterly_in_goals_section() throws Throwable {
        goalsPage.clickFreq_Quarterly();
    }

    @Then("^I Click the tomorrows date in goals section$")
    public void i_Click_the_tomorrows_date_in_goals_section() throws Throwable {
        goalsPage.clickTomorrowDate();
    }

    @Then("^I Click the select account in the goals section$")
    public void i_Click_the_select_account_in_the_goals_section() throws Throwable {
        goalsPage.selectAccount_GoalsSection();
    }

    @Then("^I Verify the savings account numbers are displaying$")
    public void i_Verify_the_savings_account_numbers_are_displaying() throws Throwable {
        goalsPage.verifySavingAccNumbers();
    }

    @Then("^I Select the savings account number2 displaying$")
    public void i_Select_the_savings_account_number2_displaying() throws Throwable {
        goalsPage.selectSavingAccount2();
    }

    @Then("^I Select the savings account number displaying$")
    public void i_Select_the_savings_account_number_displaying() throws Throwable {
        goalsPage.selectSavingAccount();
    }

    @Then("^I verify and click may be later button$")
    public void i_verify_and_click_may_be_later_button() throws Throwable {
        goalsPage.clickMaybeLaterBtn();
    }

    @Then("^I verify the review page header$")
    public void i_verify_the_review_page_header() throws Throwable {
        goalsPage.verifyReviewPageHeader();
    }

    @And("^I click the Goals review page cancel button$")
    public void I_click_the_Goals_review_page_cancel_button() throws Throwable {
        goalsPage.clickReview_CancelBtn();
    }

    @And("^I click the Deposit PHP button$")
    public void I_click_the_Deposit_PHP_button() throws Throwable {
        goalsPage.clickDepositPHPBtn();
    }


    @Then("^I Verify the goal name as \"([^\"]*)\"$")
    public void i_Verify_the_goal_name_as(String arg1) throws Throwable {
       goalsPage.verifyGoalName(arg1);
    }

    @When("^I Edit the goal name as \"([^\"]*)\"$")
    public void I_Edit_the_goal_name_as(String name) throws  Throwable {
        goalsPage.editGoalName(name);
    }


    @Then("^I Verify the review page Goals amount as \"([^\"]*)\"$")
    public void i_Verify_the_review_page_Goals_amount_as(String arg1) throws Throwable {
        goalsPage.verifyGoalsAmt_ReviewPage(arg1);
    }

    @Then("^I edit the goal amount$")
    public void i_edit_the_goal_amount() throws Throwable {
        goalsPage.editGoalAmount();
    }


    @Then("^I verify the Goals account name as \"([^\"]*)\" and account number as \"([^\"]*)\"$")
    public void i_verify_the_Goals_account_name_as_and_account_number_as(String accName, String accNumber) throws Throwable {
        goalsPage.verifyGoalsAccName_GoalsAccNumber(accName,accNumber);
    }

    @Then("^I edit the goal account$")
    public void i_edit_the_goal_account() throws Throwable {
        goalsPage.editGoalAccount();
    }


    @Then("^I select the existing goal$")
    public void i_select_the_existing_goal() throws Throwable {
        goalsPage.selectExistingGoal();
    }

    @Then("^I click the top up button$")
    public void i_click_the_top_up_button() throws Throwable {
        goalsPage.clickTopUpBtn();
    }

    @Then("^I Click  the \\+(\\d+)php element in the goals section$")
    public void i_Click_the_php_element_in_the_goals_section(int arg1) throws Throwable {
        goalsPage.click100PHPElement();
    }

    @When("^I Enter the top up amount as \"([^\"]*)\"$")
    public void i_Enter_the_top_up_amount_as(String amt) throws Throwable {
        goalsPage.enterTopupAmount(amt);
    }

    @Then("^I Verify the error message for topup amount$")
    public void i_Verify_the_error_message_for_topup_amount() throws Throwable {
        goalsPage.verifyErrorMsg_TopUpAmt();
    }


    @Then("^I verify the top up amount amount as \"([^\"]*)\"$")
    public void i_verify_the_top_up_amount_amount_as(String arg1) throws Throwable {
       goalsPage.verifyTopUpAmt(arg1);
    }

    @Then("^I click the topup review edit button$")
    public void i_click_the_topup_review_edit_button() throws Throwable {
        goalsPage.clickTopUbReviewEditBtn();
    }

    @When("^I Click the topup submit button in review page$")
    public void i_Click_the_topup_submit_button_in_review_page() throws Throwable {
        goalsPage.clickTopUpSubmitBtn();
    }

    @Then("^I click the goals ok button$")
    public void i_click_the_goals_ok_button() throws Throwable {
        goalsPage.clickGoalsOkBtn();
    }

    @And("^I click the goals next button$")
    public void I_click_the_goalsnextbutton() throws Throwable {
        goalsPage.clickNextBtn();
    }


    @Then("^I pass goal and submit if pause goal button exists$")
    public void i_pass_goal_and_submit_if_pause_goal_button_exists() throws Throwable {
        goalsPage.pauseGoal();
    }

    @Then("^I resume goal and submit if resume goal button exists$")
    public void i_resume_goal_and_submit_if_resume_goal_button_exists() throws Throwable {
        goalsPage.resumeGoal();
    }


    @Then("^I click start saving button$")
    public void i_click_start_saving_button() throws Throwable {
        goalsPage.clickStartSavingBtn();
    }

    @Then("^I Verify the goal success message$")
    public void i_Verify_the_goal_success_message() throws Throwable {
        goalsPage.verifyGoalSuccessMsg();
    }

    @Then("^I Click the Back to Go dashboard$")
    public void i_Click_the_Back_to_Go_dashboard() throws Throwable {
        goalsPage.clickBackToDashboard();
    }

    @Then("^I withdraw the goal$")
    public void i_withdraw_the_goal() throws Throwable {
        goalsPage.withdrawGoal();
    }

    @Then("^I do page refresh$")
    public void i_do_page_refresh() throws Throwable {
        common.pageRefresh();
    }


}