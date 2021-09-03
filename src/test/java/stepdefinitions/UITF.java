package stepdefinitions;

import actions.Wait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

public class UITF {

    private LoginPage login = new LoginPage();
    private CommonMethodsPage common = new CommonMethodsPage();
    Dashboard_Home_Page dashboardHomePage = new Dashboard_Home_Page();
    private UITF_Page uitfPage = new UITF_Page();

    WebDriver driver;
    WebElement element;

    @When("^I click on the UITF account in the dashboard$")
    public void I_click_on_the_UITF_account_in_the_dashboard() throws Throwable {
        dashboardHomePage.clickUITFAccount();
    }

    @Then("^I verify the recent transactions label and view more button$")
    public void I_verify_the_recent_transactions_label_and_view_more_button() throws Throwable {
        dashboardHomePage.verifyRecentTransacLbl_ViewMoreBtn();
    }

    @And("^I verify the other buttons after clicking the view more button$")
    public void I_verify_the_other_buttons_after_clicking_the_view_more_button() throws Throwable {
        dashboardHomePage.verifyOtherBtns_UITF();
    }

    @When("^I click on the Subscription product$")
    public void I_click_on_the_Subscription_product() throws Throwable {
        dashboardHomePage.clickSubsProduct();
    }

    @Then("^I Verify whether the Subscription Transaction details screen is displayed$")
    public void I_Verify_whether_the_Subscription_Transaction_details_screen_is_displayed() throws Throwable {
        dashboardHomePage.verifySubsDetails();
    }

    @When("^I click on the Redemption product$")
    public void i_click_on_the_Redemption_product() throws Throwable {
         dashboardHomePage.clickRedempProduct();
    }

    @Then("^I Verify whether the Redemption Transaction details screen is displayed$")
    public void i_Verify_whether_the_Redemption_Transaction_details_screen_is_displayed() throws Throwable {
        dashboardHomePage.verifyRedempDetails();
    }

    @When("^I click on the UITF element in the dashboard$")
    public void i_click_on_the_UITF_element_in_the_dashboard() throws Throwable {
        dashboardHomePage.clickUITFElement();
        dashboardHomePage.clickGetStartedBtn();
    }

    @When("^user selects the filter as All$")
    public void user_selects_the_filter_as_All() throws Throwable {
        uitfPage.FilterAll();
    }

    @Then("^I verify whether the user can view the all UITF products in the list$")
    public void i_verify_whether_the_user_can_view_the_all_UITF_products_in_the_list() throws Throwable {
        uitfPage.verifyAllProducts();
    }

    @When("^user selects the filter as PHP fixed income$")
    public void user_selects_the_filter_as_PHP_fixed_income() throws Throwable {
        uitfPage.FilterPHPIncome();
    }

    @Then("^I verify whether the user can view the list of UITF product related to PHP fixed income$")
    public void i_verify_whether_the_user_can_view_the_list_of_UITF_product_related_to_PHP_fixed_income() throws Throwable {
        uitfPage.verifyPHPIncomeProducts();
    }

    @When("^user selects the filter as USD fixed income$")
    public void user_selects_the_filter_as_USD_fixed_income() throws Throwable {
        uitfPage.FilterUSDIncome();
    }

    @Then("^I verify whether the user can view the list of UITF product related toUSD fixed income$")
    public void i_verify_whether_the_user_can_view_the_list_of_UITF_product_related_toUSD_fixed_income() throws Throwable {
        uitfPage.verifyUSDIncomeProducts();
    }

    @When("^user selects the filter as Equity$")
    public void user_selects_the_filter_as_Equity() throws Throwable {
        uitfPage.FilterEquity();
    }

    @Then("^I verify whether the user can view the list of UITF product related to Equity$")
    public void i_verify_whether_the_user_can_view_the_list_of_UITF_product_related_to_Equity() throws Throwable {
        uitfPage.verifyEquityProducts();
    }

    @When("^user selects the filter as Multi-Asset$")
    public void user_selects_the_filter_as_Multi_Asset() throws Throwable {
        uitfPage.FilterMultiAsset();
    }

    @Then("^I verify whether the user can view the list of UITF product related to Multi-Asset$")
    public void i_verify_whether_the_user_can_view_the_list_of_UITF_product_related_to_Multi_Asset() throws Throwable {
        uitfPage.verifyMultiAssetProducts();
    }

    @When("^user can click on particular product in the list$")
    public void user_can_click_on_particular_product_in_the_list() throws Throwable {
        uitfPage.clickPHPIncomeProduct();
    }

    @Then("^I Verify whether the user can view all the performances and also product details of product by chart$")
    public void i_Verify_whether_the_user_can_view_all_the_performances_and_also_product_details_of_product_by_chart() throws Throwable {
        uitfPage.verifyPerformance_ProductDetails();
    }

    @When("^I click on Subscribe button$")
    public void i_click_on_Subscribe_button() throws Throwable {
        uitfPage.clickSubscribeBtn();
    }

    @When("^I provide all subscription details in Subscription Form page$")
    public void i_provide_all_subscription_details_in_Subscription_Form_page() throws Throwable {
        uitfPage.enterSubscriptionDetails();
    }

    @When("^I proceed Subscribe in Subscription Review page$")
    public void i_proceed_Subscribe_in_Subscription_Review_page() throws Throwable {
        uitfPage.clickSubscribeFinalBtn();
    }

    @Then("^I verify the success message in Subscription Success page$")
    public void i_verify_the_success_message_in_Subscription_Success_page() throws Throwable {
        uitfPage.verifySubscriptionSuccess();
    }


    @When("^I click on redeem button$")
    public void i_click_on_redeem_button() throws Throwable {
        uitfPage.clickRedeemBtn();
    }

    @When("^I provide all redemption details in Redemption Form page$")
    public void i_provide_all_redemption_details_in_Redemption_Form_page() throws Throwable {
        uitfPage.enterRedemptionDetails();
    }

    @When("^I proceed redeem in Redemption Review page$")
    public void i_proceed_redeem_in_Redemption_Review_page() throws Throwable {
        uitfPage.clickRedeemFinalBtn();
    }

    @Then("^I verify the success message in Redemption Success page$")
    public void i_verify_the_success_message_in_Redemption_Success_page() throws Throwable {
        uitfPage.verifyRedemptionSuccess();
    }


    @When("^I click on Add existing account$")
    public void i_click_on_Add_existing_account() throws Throwable {
        dashboardHomePage.clickAccountsManageBtn();
        dashboardHomePage.clickAddExistingAccount();
        dashboardHomePage.clickUITFLink();
    }

    @Then("^I verify next button is disabled when I leave account number field as blank$")
    public void i_verify_next_button_is_disabled_when_I_leave_account_number_field_as_blank() throws Throwable {
        uitfPage.enterBlank_VerifyNextBtn();
    }

    @Then("^I verify next button is disabled when I Enter account number with less than (\\d+) digits$")
    public void i_verify_next_button_is_disabled_when_I_Enter_account_number_with_less_than_digits(int arg1) throws Throwable {
        uitfPage.enterLessthan12digits_VerifyNxtBtn();
    }

    @Then("^I verify Next button is enabled when I enter account number more than (\\d+) digits and should not allow more than (\\d+) digits$")
    public void i_verify_Next_button_is_enabled_when_I_enter_account_number_more_than_digits_and_should_not_allow_more_than_digits(int arg1, int arg2) throws Throwable {
        uitfPage.enterMoreThan16Digits_VerifyNxtBtn();
    }

    @Then("^I verify Invalid account number error message is displayed when I Enter the non existing UITF account number$")
    public void i_verify_Invalid_account_number_error_message_is_displayed_when_I_Enter_the_non_existing_UITF_account_number() throws Throwable {
        uitfPage.enterNonExistingNum_VerifyErrMsg();
    }

    @When("^I Click the Dashboard link$")
    public void IClicktheDashboardlink() throws Throwable{
        uitfPage.click_Dashboard();
    }
}
