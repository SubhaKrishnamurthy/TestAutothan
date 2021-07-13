package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Tools;
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
    private BuyloadPage buyloadPage = new BuyloadPage();
    private ManageTransferPage manageTransferPage = new ManageTransferPage();
    public String accountName = "";
    public String mobileNumber = "";
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

    @When("^I Select the from account in the displayed account list$")
    public void i_Select_the_from_account_in_the_displayed_account_list() throws Throwable {
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

    @Then("^I Verify the Congratulation message along with other details in the request payment final page for two user account$")
    public void i_Verify_the_Congratulation_message_along_with_other_details_in_the_request_payment_final_page_for_two_user_account() throws Throwable {
        requestPaymentPage.verifyCongMsg_OtherDetails1();
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
       if(arg1.equalsIgnoreCase("name1"))
        {
            arg1 = Tools.RANDOMTEXT("RANDOMTEXT",10);
            accountName = arg1;
        }
        requestPaymentPage.enterName(arg1);
    }

    @When("^I Enter the mobile number as five digits \"([^\"]*)\"$")
    public void i_Enter_the_mobile_number_as_five_digits(String arg1) throws Throwable {
        if(arg1.equalsIgnoreCase("name2"))
        {
            arg1 = Tools.RANDOMTEXT("RANDOMNUMBER",11);
           mobileNumber = arg1;
        }
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

    @Then("^I verify that amount is splitted to the participants as \"([^\"]*)\" \"([^\"]*)\" and input for amount is disabled$")
    public void i_verify_that_amount_is_splitted_to_the_participants_as_and_input_for_amount_is_disabled(String amt1,String amt2) throws Throwable {
      requestPaymentPage.verifyAmountDisabled(amt1,amt2);
    }

    @Then("^I verify that amount is splitted to the participants as \"([^\"]*)\" \"([^\"]*)\" and input for amount is enabled$")
    public void i_verify_that_amount_is_splitted_to_the_participants_as_and_input_for_amount_is_enabled(String amt1,String amt2) throws Throwable {
        requestPaymentPage.verifyAmountEnabled(amt1,amt2);
    }


    @When("^I click the cancel button and confirm cancel$")
    public void i_click_the_cancel_button_and_confirm_cancel() throws Throwable {
        common.clickCancelBtn1();
        requestPaymentPage.confirmCancelRequest();
    }

    @Then("^I verify dashboard page$")
    public void i_verify_dashboard_page() throws Throwable {
        ownaccount.verifyOwnaccountsexist();
    }

    @When("^I click the cancel button and click no button$")
    public void i_click_the_cancel_button_and_click_no_button() throws Throwable {
        common.clickCancelBtn1();
        common.clickNoBtn();
    }

    @Then("^I verify the account name and account number$")
    public void i_verify_the_account_name_and_account_number() throws Throwable {
            requestPaymentPage.verifyAccountName_Number();
    }


    @And("^I click the Deposit to account number$")
    public void i_click_the_Deposit_to_account_number() throws Throwable {
        requestPaymentPage.clickDepositToAccNum();
    }

    @Then("^I verify the Deposit to account number$")
    public void i_verify_the_Deposit_to_account_number() throws Throwable {
        requestPaymentPage.verifyDepositToAccNum();
    }

    @When("^I click the edit button$")
    public void i_click_the_edit_button() throws Throwable {
        requestPaymentPage.clickEditBtn();
    }


    @When("^I see the from account in the displayed account list$")
    public void i_see_the_from_account_in_the_displayed_account_list() throws Throwable {
        requestPaymentPage.SelectAccount();
    }

    @Then("^I verify the Account Number BackGround color$")
    public void i_verify_the_Account_Number_BackGround_color() throws Throwable {
        common.verifyAccNumBGColor();
    }

    @Then("^I verify From and To account number$")
    public void i_verify_From_and_To_account_number() throws Throwable {
        common.verifyFrom_To_Account();
    }


    @When("^I click on save button$")
    public void i_click_on_save_button() throws Throwable {
       common.clickSaveBtn();
    }

    @When("^I click the BuyLoad link in the send request page$")
    public void i_click_the_BuyLoad_link_in_the_send_request_page() throws Throwable {
        dashboardHomePage.clickBuyloadLink();
    }

    @When("^I Click the Manage contacts link in the Buyload$")
    public void i_Click_the_Manage_contacts_link_in_the_Buyload() throws Throwable {
        buyloadPage.clickManageContacts();
    }

    @When("^I search for the participant as \"([^\"]*)\"$")
    public void i_search_for_the_participant(String arg1) throws Throwable {
        if(arg1.equalsIgnoreCase("name3")){
            arg1= accountName;
        }
        manageTransferPage.searchForParticipant(arg1);
    }

    @Then("^I verify the participants account name and account number$")
    public void i_verify_the_participants_account_name_and_account_number() throws Throwable {
        String name = accountName;
        String number = mobileNumber;
        buyloadPage.verifyAccountName_Number(name,number);
    }



}
