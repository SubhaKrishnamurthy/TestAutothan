package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

public class RequestPayment {

    private LoginPage login = new LoginPage();
    private CommonMethodsPage common = new CommonMethodsPage();
    Dashboard_Home_Page dashboardHomePage = new Dashboard_Home_Page();
    private RequestPayment_Page requestPaymentPage = new RequestPayment_Page();
    private SendMoney_OtherUBaccount sendMoneyOtherUBaccount =  new SendMoney_OtherUBaccount();
    private SendMoney_Ownaccount ownaccount = new SendMoney_Ownaccount();

    WebDriver driver;
    WebElement element;

    @When("^I click the Request payment under receive money$")
    public void i_click_the_Request_payment_under_receive_money() throws Throwable {
        dashboardHomePage.clickSendReceive();
        requestPaymentPage.clickRequestPaymentLink();
    }

    @When("^I enter the amount field as \"([^\"]*)\"$")
    public void i_enter_the_amount_field_as(String arg1) throws Throwable {
        sendMoneyOtherUBaccount.enterthAmount(arg1);
    }

    @When("^I select the split option as \"([^\"]*)\"$")
    public void i_select_the_split_option_as(String arg1) throws Throwable {
        requestPaymentPage.selectOption(arg1);
    }

    @When("^I add one participant as \"([^\"]*)\"$")
    public void i_add_one_participant_as(String name) throws Throwable {
        requestPaymentPage.AddParticipant(name);
    }

    @When("^I enter the request payment message as \"([^\"]*)\"$")
    public void i_enter_the_request_payment_message(String arg1) throws Throwable {
        requestPaymentPage.enterRequestMessage(arg1);
    }

    @When("^I Select the from account in the dispalyed account list$")
    public void i_Select_the_from_account_in_the_dispalyed_account_list() throws Throwable {
        requestPaymentPage.SelectAccount();
        common.clickFromAccNumber();
    }

    @Then("^I Verify the next button is not enabled$")
    public void i_Verify_the_next_button_is_not_enabled() throws Throwable {
        requestPaymentPage.verifyNextBtnDisabled();
    }

    @Then("^I Verify values in the Amount filed as \"([^\"]*)\"$")
    public void i_Verify_values_in_the_Amount_filed_as(String arg1) throws Throwable {
        requestPaymentPage.verifyAmountValue(arg1);
    }

    @Then("^I Verify the Error message in the amount field as \"([^\"]*)\"$")
    public void i_Verify_the_Error_message_in_the_amount_field(String msg) throws Throwable {
        requestPaymentPage.verifyAmountErrMsg(msg);
    }


    @When("^I click the next button$")
    public void i_click_the_next_button() throws Throwable {
        requestPaymentPage.clickNextButton();
    }

    @When("^I click the Request payemnt php button$")
    public void i_click_the_Request_payemnt_php_button() throws Throwable {
        requestPaymentPage.clickPHPBtn();
    }

    @Then("^I Verify the Congratulation message along with other details in the request payment final page$")
    public void i_Verify_the_Congratulation_message_along_with_other_details_in_the_request_payment_final_page() throws Throwable {
        requestPaymentPage.verifyCongMsg_OtherDetails();
    }

    @Then("^I click the New Transaction button in the final page$")
    public void i_click_the_New_Transaction_button_in_the_final_page() throws Throwable {
        ownaccount.clickNewtransaction();
    }

    @Then("^I Verify the description value as \"([^\"]*)\"$")
    public void i_Verify_the_description_value_as(String arg1) throws Throwable {
        requestPaymentPage.verifyDescription(arg1);
    }

    @When("^I enter the amount field for another participant as \"([^\"]*)\"$")
    public void i_enter_the_amount_field_for_another_participant_as(String arg1) throws Throwable {
       requestPaymentPage.enterAmount1(arg1);
    }

    @When("^I click on Add participant and Add icon in the Request payment$")
    public void i_click_on_Add_participant() throws Throwable {
        requestPaymentPage.clickAddIcon();
    }

    @When("^I input the name as \"([^\"]*)\"$")
    public void i_input_the_name_as(String arg1) throws Throwable {
        requestPaymentPage.enterName(arg1);
    }

    @When("^I Enter the mobile number as five digits \"([^\"]*)\"$")
    public void i_Enter_the_mobile_number_as_five_digits(String arg1) throws Throwable {
        requestPaymentPage.enterMobileNumber(arg1);
    }

    @Then("^I Verify the Error message in the mobile number as \"([^\"]*)\"$")
    public void i_Verify_the_Error_message_in_the_mobile_number_as(String arg1) throws Throwable {
        common.verifyAccNumErrMsg(arg1);
    }

    @Then("I Verify Congratulation message,split amount as \"([^\"]*)\",\"([^\"]*)\",total amt as \"([^\"]*)\" along with other details in request payment final page$")
    public void i_Verify_Congratulation_message_amount_as_and_along_with_other_details_for_two_participants_in_request_payment_final_page(String amount1,String amount2,String totalAmt) throws Throwable {
       requestPaymentPage.verifyCongMsg_OtherDetails_2Participants(amount1,amount2,totalAmt);
    }

    @When("^I split the amount as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_split_the_amount_as_and(String arg1, String arg2) throws Throwable {
       requestPaymentPage.splitAmount(arg1,arg2);
    }

    @Then("^I Verify the total amount error message in the total amount field$")
    public void i_Verify_the_total_amount_error_message_in_the_total_amount_field() throws Throwable {
        requestPaymentPage.verifyTotalAmtErrMsg();
    }
}
