package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Dashboard_Home_Page;
import pages.GoalsPage;
import pages.RequestPayment_Page;

public class Goals {

    Dashboard_Home_Page dashboardHomePage = new Dashboard_Home_Page();
    GoalsPage goalsPage = new GoalsPage();

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

    @Then("^I Select the savings account number displaying$")
    public void i_Select_the_savings_account_number_displaying() throws Throwable {
        goalsPage.selectSavingAccount();
    }







}