package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import pages.CommonMethodsPage;
import pages.LoginPage;
import pages.PayBillsPage;

public class PayBills {

    PayBillsPage payBills = new PayBillsPage();
    CommonMethodsPage common = new CommonMethodsPage();
    LoginPage loginPage = new LoginPage();

    @When("^I am on the PayBills page$")
    public void i_am_on_the_PayBills_page() throws Throwable {
        payBills.clickPayBills();
        payBills.clickSelectBiller();
    }

    @When("^I search for the biller \"([^\"]*)\" in Billers list$")
    public void i_search_for_the_biller_in_Billers_list(String arg1) throws Throwable {
        payBills.searchBiller_BillersList(arg1);

    }

    @Then("^I verify the value as \"([^\"]*)\" in search result1$")
    public void i_verify_the_value_as_in_search_result1(String arg1) throws Throwable {
        payBills.verifyValue_SearchResult1(arg1);
    }

    @And("^I verify the value as \"([^\"]*)\" in search result2$")
    public void i_verify_the_value_as_in_search_result2(String arg1) throws Throwable {
        payBills.verifyValue_SearchResult2(arg1);
    }

    @Then("^I search for the billler \"([^\"]*)\" in Favorites list$")
    public void i_search_for_the_billler_in_Favorites_list(String arg1) throws Throwable {
        payBills.searchBiller_FavouritesList(arg1);
    }

    @Then("^I search for the biller \"([^\"]*)\" in MyBillers$")
    public void i_search_for_the_biller_in_MyBillers(String arg1) throws Throwable {
        payBills.searchBiller_MyBillers(arg1);
    }

    @Then("^I click the search result(\\d+)$")
    public void i_click_the_search_result(int arg1) throws Throwable {
        payBills.clickSearchResult();
    }

    @Then("^I Select the from account$")
    public void i_Select_the_from_account() throws Throwable {
        common.clickFromAccNumber();
    }

    @Then("^I click the Date field$")
    public void i_click_the_Date_field() throws Throwable {
        payBills.clickDate();
    }

    @Then("^I Enter the account in account ID filed as \"([^\"]*)\"$")
    public void i_Enter_the_account_in_account_ID_filed_as(String arg1) throws Throwable {
       payBills.enterAccount(arg1);
    }

    @And("^I click the cancel button$")
    public void I_click_the_cancel_button() throws Throwable {
        payBills.clickCancel();
    }


    @Then("^I enter paymentReferenceNo as \"([^\"]*)\" PayorsName as \"([^\"]*)\" and PolicyNo as \"([^\"]*)\"$")
    public void i_enter_paymentReferenceNo_as_PayorsName_as_and_PolicyNo_as(String arg1, String arg2, String arg3) throws Throwable {
        payBills.enterAccountDetails(arg1,arg2,arg3);
    }

    @Then("^I Click the Repeat check box$")
    public void i_Click_the_Repeat_check_box() throws Throwable {
        payBills.clickRepeatCheckBox();
    }

    @Then("^I Verify the Frequency Listbox and End Date Listbox are displaying$")
    public void i_Verify_the_Frequency_Listbox_and_End_Date_Listbox_are_displaying() throws Throwable {
        payBills.verifyFrequency_EndDate();
    }

    @Then("^I Click the Edit button$")
    public void i_Click_the_Edit_button() throws Throwable {
       payBills.clickEditBtn();
    }

    @Then("^I verify the pay php button$")
    public void i_verify_the_pay_php_button() throws Throwable {
        payBills.verify_PayPHP();
    }

    @Then("^I enter visa number as \"([^\"]*)\"$")
    public void i_enter_visa_number_as(String arg1) throws Throwable {
        payBills.enterVisaNumber(arg1);
    }

    @Then("^I verify review page error message as \"([^\"]*)\"$")
    public void i_verify_review_page_error_message_as(String arg1) throws Throwable {
        payBills.verifyErrMsg(arg1);
    }

    @Then("^I click the Pay Bills php button$")
    public void i_click_the_Pay_Bills_php_button() throws Throwable {
       payBills.click_PayPHP();
    }

    @Then("^I verify visa number value as \"([^\"]*)\"$")
    public void i_verify_visa_number_value_as(String arg1) throws Throwable {
        payBills.verify_VisaNumber(arg1);
    }

    @Then("^I verify the date value as \"([^\"]*)\"$")
    public void i_verify_the_date_value_as(String arg1) throws Throwable {
        payBills.verify_DateValue(arg1);
    }

    @Then("^I verify pay Bills payment successful message$")
    public void i_verify_pay_Bills_payment_successful_message() throws Throwable {
        payBills.verify_PaymentSuccessful();
    }

    @Then("^I Verify from account number field masked as \"([^\"]*)\" and after unmasking as \"([^\"]*)\"$")
    public void i_Verify_from_account_number_field_masked_as_and_after_unmasking_as(String arg1, String arg2) throws Throwable {
        payBills.verify_FromAccountNumber(arg1,arg2);
    }

    @Then("^I verify card number filed masked as \"([^\"]*)\" and after unmaking as \"([^\"]*)\"$")
    public void i_verify_card_number_filed_masked_as_and_after_unmaking_as(String arg1, String arg2) throws Throwable {
        payBills.verify_CardNumber(arg1,arg2);
    }

    @Then("^I click the GotIt button if displayed$")
    public void i_click_the_GotIt_button_if_displayed() throws Throwable {
        payBills.click_GotitBtn();
       // loginPage.clickkeepmeloggedinbtn();
    }

    @Then("^I click new payment button in final page$")
    public void i_click_new_payment_button_in_final_page() throws Throwable {
        payBills.click_NewPaymentBtn();
    }

    @Then("^I Verify BillerName as \"([^\"]*)\" FromAccountNumber as \"([^\"]*)\" PolicyOwnerNumber as \"([^\"]*)\" Amount as \"([^\"]*)\"$")
    public void i_Verify_BillerName_as_FromAccountNumber_as_PolicyOwnerNumber_as_Amount_as(String BillerName, String FromAccNumber, String PolicyOwnerNo, String Amount) throws Throwable {
       payBills.verify_FinalPage(BillerName,FromAccNumber,PolicyOwnerNo,Amount);
    }

    @Then("^I click calender date$")
    public void i_click_calender_date() throws Throwable {
        payBills.click_Calender();
    }


    @Then("^I edit from account number$")
    public void i_edit_from_account_number() throws Throwable {
        payBills.edit_AccountNumber();
    }

    @Then("^I edit the biller details$")
    public void i_edit_the_biller_details() throws Throwable {
        payBills.edit_BillerDetails();
    }

    @Then("^I edit the amount$")
    public void i_edit_the_amount() throws Throwable {
       payBills.edit_Amount();
    }

    @And("^I Click pay Bills Back button$")
    public void I_Click_pay_Bills_Back_button() throws Throwable {
        payBills.click_BackBtn();
    }

}