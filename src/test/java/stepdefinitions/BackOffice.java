package stepdefinitions;


import actions.Wait;
import base.Keywords;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.ApplicationException;
import exceptions.EnvironmentException;
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



    WebDriver driver;
    WebElement element;

    @Given("^I am on login page of online banking backoffice application as SubhaBrm user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_SubhaBrm_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername1").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Then("^I successfully logout by clicking the Logout Button$")
    public void I_successfully_logout_by_clicking_the_Logout_Button() throws Throwable {
        homePage.clickAccounts();
        homePage.clickLogoutBtn();
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

}
