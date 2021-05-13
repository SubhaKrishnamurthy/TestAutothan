package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import helper.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

public class BackOffice {

    private LoginPage login = new LoginPage();
    private BackOffice_HomePage homePage = new BackOffice_HomePage();
    private BackOffice_AccountsPage accountsPage = new BackOffice_AccountsPage();
    private BackOffice_AccountsSearchPage accountsSearchPage = new BackOffice_AccountsSearchPage();
    private BackOffice_CustomerInformationPage customerInformationPage = new BackOffice_CustomerInformationPage();
    private CommonMethods commonMethods =  new CommonMethods();
    private BackOffice_InvalidSignUpsPage invalidSignUpsPage = new BackOffice_InvalidSignUpsPage();
    private BackOffice_UsersPage usersPage=new BackOffice_UsersPage();
    private BackOffice_ScheduledActivitiesPage scheduledActivitiesPage = new BackOffice_ScheduledActivitiesPage();
    private BackOffice_RegisterPage RegisterPage = new BackOffice_RegisterPage();
    WebDriver driver;
    WebElement element;

    @Given("^I am on login page of online banking backoffice application as SubhaBrm user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_SubhaBrm_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername1").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Given("^I am on login page of online banking backoffice application as Subha user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_Subha_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername2").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Given("^I am on login page of online banking backoffice application as UBPProductAuto1 user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_UBPProductAuto1_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername3").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Given("^I am on login page of online banking backoffice application as UBPSAC1 user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_UBPSAC1_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername4").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Given("^I am on login page of online banking backoffice application as UBPSAC2 user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_UBPSAC2_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername5").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Then("^I successfully logout by clicking the Logout Button$")
    public void I_successfully_logout_by_clicking_the_Logout_Button() throws Throwable {
        homePage.clickAccounts();
        homePage.clickLogoutBtn();
    }

    @When("^When I click on the accounts tab$")
    public void When_I_click_on_the_accounts_tab() throws Throwable{
        homePage.clickAccounts();
    }

    @When("^I click on the manage clients tab$")
    public void I_click_on_the_manage_clients_tab() throws Throwable {
        homePage.clickAccounts();
        accountsPage.clickManageClients();
    }

    @When("^I search for first name as \"([^\"]*)\"$")
    public void I_search_for_first_name_as(String firstName) throws Throwable {
        accountsSearchPage.searchFirstname(firstName);
    }

    @Then("^I verify the list of users related to search$")
    public void I_verify_the_list_of_users_related_to_search() throws Throwable {
        accountsSearchPage.verifyActiveUser();
    }

    @When("^I search for last name as \"([^\"]*)\"$")
    public void I_search_for_last_name_as(String lastName) throws Throwable{
        accountsSearchPage.searchLastName(lastName);
    }

    @When("^I search for mobileNumber as \"([^\"]*)\"$")
    public void I_search_for_mobileNumber_as(String mobileNumber)throws Throwable {
        accountsSearchPage.searchMobileNumber(mobileNumber);
    }

    @When("^I search for emailID as \"([^\"]*)\"$")
    public void I_search_for_emailID_as(String emailID)throws Throwable {
        accountsSearchPage.searchEmailID(emailID);
    }

    @When("^I search for accountNumber as \"([^\"]*)\"$")
    public void I_search_for_accountNumber_as(String accountNumber)throws Throwable {
        accountsSearchPage.searchAccountNumber(accountNumber);
    }

    @When("^I search for invalidAccountNumber as \"([^\"]*)\"$")
    public void I_search_for_invalidAccountNumber_as(String invalidAccNum)throws Throwable {
        accountsSearchPage.searchinvalidAccNum(invalidAccNum);
    }

    @Then("^I verify no list of users$")
    public void I_verify_no_list_of_users()throws Throwable {
        accountsSearchPage.verifyNoActiveUser();
    }

    @When("^I click on the active user$")
    public void I_click_on_the_active_user() throws Throwable {
        accountsSearchPage.clickActiveUser();
    }

    @Then("^I click active account in customer information page$")
    public void I_click_active_account_in_customer_information_page() throws Throwable {
        customerInformationPage.clickActiveAccount();
    }

    @Then("^I verify view transfer logs and click one of the logs$")
    public void I_verify_view_transfer_logs_and_click_one_of_the_logs() throws Throwable {
        customerInformationPage.verifyAndClickFundTransferLog();
    }

    @Then("^I Verify and click the Email, SMS, Email and SMS buttons$")
    public void I_Verify_and_click_the_Email_SMS_Email_and_SMS_buttons() throws Throwable {
        customerInformationPage.verifyAndClickEmail();
        commonMethods.clickNoBtn();
        customerInformationPage.verifyAndClickEmail_SMS();
        commonMethods.clickNoBtn();
        customerInformationPage.verifyAndClickSMS();
        commonMethods.clickNoBtn();
        commonMethods.clickCloseBtn2();
        commonMethods.clickCloseBtn1();
    }

    @Then("^I verify Bills paid logs and click one of the logs$")
    public void I_verify_Bills_paid_logs_and_click_one_of_the_logs() throws Throwable {
        customerInformationPage.verifyAndClickBillsPaidLog();
    }

    @Then("^I verify load purchase logs and click one of the logs$")
    public void I_verify_load_purchase_logs_and_click_one_of_the_logs() throws Throwable {
        customerInformationPage.verifyAndClickLoadPurchaseRequest();
    }

    @When("^I click on the manage Invalid SignUps tab$")
    public void I_click_on_the_manage_Invalid_SignUps_tab() throws Throwable {
        homePage.clickAccounts();
        accountsPage.clickInvalidSignUpsTab();
    }

    @And("^I select Add FAQ Type as \"([^\"]*)\"$")
    public void I_select_Add_FAQ_Type_as(String data) throws Throwable {
        invalidSignUpsPage.selectFAQType(data);
    }

    @And("^I enter \"([^\"]*)\" in search text and click search button$")
    public void I_enter_in_search_text_and_click_search_button(String arg1) throws Throwable {
        invalidSignUpsPage.enterinSearchText(arg1);
    }

    @Then("^I verify Invalid signup search results$")
    public void I_verify_Invalid_signup_search_results() throws Throwable {
        invalidSignUpsPage.verifySearchResults();
    }

    @And("^I select CIF type as \"([^\"]*)\" and click search button$")
    public void I_select_CIF_type_as_and_click_search_button(String data) throws Throwable {
        invalidSignUpsPage.selectCIFType(data);
    }

    @And("^I verify customer Information Title$")
    public void I_verify_customer_Information_Title() throws Throwable {
        customerInformationPage.verifyTtile();
    }

    @And("^I click customer information Deactivate button$")
    public void I_click_customer_information_Deactivate_button() throws Throwable {
        customerInformationPage.clickDeactivateBtn();
    }

    @And("^I click manage profile changes for approval$")
    public void I_click_manage_profile_changes_for_approval() throws Throwable {
        customerInformationPage.clickProfileManagesForApprovalLink();
    }

    @And("^I click users cancel for \"([^\"]*)\"$")
    public void I_click_users_cancel_for(String data) throws Throwable {
        usersPage.clickUsersCancel();
    }

    @And("^I enter cancel reason as \"([^\"]*)\" and click confirm cancel button$")
    public void I_enter_cancel_reason_as_and_click_confirm_cancel_button(String reason) throws Throwable {
            usersPage.enterCancelReason(reason);
            usersPage.clickConfirmCancelBtn();
    }

    @And("^I verify customer information Deactivate button$")
    public void I_verify_customer_information_Deactivate_button() throws Throwable {
        customerInformationPage.verifyDeactivateBtn();
    }

    @And("^I enter deactivate reason as \"([^\"]*)\" and click confirm deactivate button$")
    public void I_enter_deactivate_reason_as_and_click_confirm_deactivate_button(String reason) throws Throwable {
      usersPage.enterCancelReason(reason);
        customerInformationPage.clickConfirmDeactivateBtn();
    }

    @When("^I click on the accounts tab$")
    public void I_click_on_the_accounts_tab() throws Throwable {
        homePage.clickAccounts();
    }

    @And("^I click users dispprove for \"([^\"]*)\"$")
        public void I_click_users_dispprove_for(String data) throws Throwable {
        usersPage.clickUsersDispprove(data);
    }

    @And("^I enter disapprove reason as \"([^\"]*)\" and click confirm disapprove button$")
    public void I_enter_disapprove_reason_as_and_click_confirm_disapprove_button(String reason) throws Throwable {
        usersPage.enterCancelReason(reason);
        usersPage.clickConfirmDisapproveBtn();
    }

    @And("^I click on customer information Edit profile button$")
    public void I_click_on_customer_information_Edit_profile_button() throws Throwable {
        customerInformationPage.clickEditProfileBtn();
    }

    @And("^I edit customer last name as \"([^\"]*)\"$")
    public void I_edit_customer_last_name_as(String data) throws Throwable {
        customerInformationPage.enterLastName(data);
    }

    @And("^I click the edit user ID update button$")
    public void I_click_the_edit_user_ID_update_button() throws Throwable {
        customerInformationPage.clickKeyEditUSerIDUpdateBtn();
    }

    @And("^I enter edit reason as \"([^\"]*)\" and click on Save button$")
    public void I_enter_edit_reason_as_and_click_on_Save_button(String data) throws Throwable {
        customerInformationPage.enterCustoInfoApprovalReason(data);
        commonMethods.clickSaveBtn();
    }

    @And("^I click users approve for \"([^\"]*)\"$")
    public void I_click_users_approve_for(String data) throws Throwable {
        usersPage.clickUsersApprove();
    }

    @And("^I click users approve for User ID \"([^\"]*)\"$")
    public void I_click_users_approve_for_User_ID(String data) throws Throwable {
        usersPage.clickUsersApproveForID();
    }

    @And("^I enter approve reason as \"([^\"]*)\" and click confirm approve button$")
    public void I_enter_approve_reason_as_and_click_confirm_approve_button(String data) throws Throwable {
        //customerInformationPage.enterCustoInfoApprovalReason(data);
       usersPage.enterCancelReason(data);
       usersPage.clickUsersApprovalApprove();
    }

    @And("^I click on customer information Edit UserID button$")
    public void I_click_on_customer_information_Edit_UserID_button() throws Throwable {
        customerInformationPage.clickEditUserIDBtn();
    }

    @And("^I edit userID as \"([^\"]*)\"$")
    public void I_edit_userID_as(String data) throws Throwable {
        customerInformationPage.enterEditUserIDtxt(data);
    }

    @And("^I click manage User ID changes for approval$")
    public void I_click_manage_User_ID_changes_for_approval() throws Throwable {
        accountsPage.clickManageUSerIDForApproval();
    }

    @And("^I click customer information activate button$")
    public void I_click_customer_information_activate_button() throws Throwable {
        customerInformationPage.clickActivateBtn();
    }

    @And("^I enter activate reason as \"([^\"]*)\" and click confirm activate button$")
    public void I_enter_activate_reason_as_and_click_confirm_activate_button(String reason) throws Throwable {
        usersPage.enterCancelReason(reason);
        customerInformationPage.clickConfirmActivateBtn();
    }

    @When("^I click on the Scheduled Activities Link$")
    public void I_click_on_the_Scheduled_Activities_Link() throws Throwable {
        homePage.clickScheduledActivities();
    }

    @And("^I click on the Failed scheduled Fund Transfer search Link$")
    public void I_click_on_the_Failed_scheduled_Fund_Transfer_search_Link() throws Throwable {
        scheduledActivitiesPage.clickFailedScheduledFundTransfer();
    }

    @And("^I click on the Failed scheduled Bills Payment search Link$")
    public void I_click_on_the_Failed_scheduled_Bills_Payment_search_Link() throws Throwable {
        scheduledActivitiesPage.clickFailedScheduledBillsPayment();
    }

    @And("^I select transaction type as \"([^\"]*)\" and click search button$")
    public void I_select_transaction_type_as_and_click_search_button(String data) throws Throwable {
        scheduledActivitiesPage.clickFailedScheduledBillsPaymentSearch(data);
    }

    @Then("^I verify DailyID,AccountNumbers,Transaction,Message,Status,Action$")
    public void I_verify_DailyID_AccountNumbers_Transaction_Message_Status_Action() throws Throwable {
        scheduledActivitiesPage.verifyFailedScheduledElements();
    }

    @Then("^I verify Source account as no records found \"([^\"]*)\"$")
    public void I_verify_Source_account_as_no_records_found(String data) throws Throwable{
        scheduledActivitiesPage.verifyNoRecordsFound(data);
    }

    @Given("^I'm click the register button in the backoffice application$")
    public void iMClickTheRegisterButtonInTheBackofficeApplication() throws Throwable {
        homePage.clickRegister();
    }

    @When("^I enter the firstname lastname and user creation \"([^\"]*)\" details$")
    public void iEnterTheFirstnameLastnameAndUserCreationDetails(String arg0) throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickUserBRM();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
    }

    @And("^I select source type as \"([^\"]*)\",Enter text as \"([^\"]*)\" and click Search button$")
    public void I_select_source_type_as_Enter_text_as_ferwew_and_click_Search_button(String data,String text) throws Throwable {
        scheduledActivitiesPage.selectSearch1EnterSearchTxtClickSearchBtn(data,text);
    }
}
