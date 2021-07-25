package stepdefinitions;


import actions.Wait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helper.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

public class ManageRecipient {

    private LoginPage login = new LoginPage();
    private CommonMethodsPage common = new CommonMethodsPage();
    private SendReceive_Page sendReceivePage = new SendReceive_Page();
    private ManageRecipient_Page manageRecipient = new ManageRecipient_Page();



    WebDriver driver;
    WebElement element;

    @And("^I click the manage recipient link$")
    public void I_click_the_manage_recipient_link() throws Throwable {
        sendReceivePage.clickManageRecipient();
    }

    @And("^I click the Add recipient button$")
    public void I_click_the_Add_recipient_button() throws Throwable {
        manageRecipient.clickAddRecipient();
    }

    @Then("^I select bank name and enter details and Save$")
    public void I_select_bank_name_as_and_enter_details_and_Save() throws Throwable {
        manageRecipient.doAddRecipient();
    }

    @And("^I delete the recipient$")
    public void I_delete_the_recipient() throws Throwable {
        manageRecipient.doDeleteRecipient();
    }

    @And("^I delete the recent recipient$")
    public void I_delete_the_recent_recipient() throws Throwable {
        manageRecipient.doDeleteRecipient_Recent();
    }

    @Then("^I enter accountName less than 4 digits and verify Error message$")
    public void I_enter_accountName_less_than_4_digits_and_verify_Error_message() throws Throwable {
        manageRecipient.doAddRecipient_AccountNameErrorMessage();
    }

    @Then("^I enter accountNumber less than 12 digits and verify Error message$")
    public void I_enter_accountNumber_less_than_12_digits_and_verify_Error_message() throws Throwable{
        manageRecipient.doAddRecipient_AccountNumberErrMsg();
    }

    @Then("^I select bank name and enter details and Save as favorite$")
    public void I_select_bank_name_and_enter_details_and_Save_as_favorite() throws Throwable {
        manageRecipient.doAddFavoriteRecipient();
    }

    @And("^I search for the recipient \"([^\"]*)\"$")
    public void I_search_for_the_recipient(String name) throws Throwable {
        manageRecipient.searchRecipient(name);
    }

    @And("^I edit the account name$")
    public void I_edit_the_account_name() throws Throwable {
        manageRecipient.editAccountName();
    }

    @And("^I edit the account number$")
    public void I_edit_the_account_number() throws Throwable {
        manageRecipient.editAccountNumber();
    }

    @Then("^I save the recipient as favorite and update$")
    public void I_save_the_recipient_as_favorite_and_update() throws Throwable {
            manageRecipient.saveRecipientAsFavorite();
    }

    @Then("^I save the recipient back to un favorite and update$")
    public void I_save_the_recipient_back_to_un_favorite_and_update() throws Throwable {
        manageRecipient.saveRecipientAsUnFavorite();
    }

    @And("^I click on the favorite tab$")
    public void I_click_on_the_favorite_tab() throws Throwable {
        manageRecipient.clickFavTab();
    }

    @Then("^I search and verify for the recipient \"([^\"]*)\"$")
    public void I_search_and_verify_for_the_recipient(String value) throws Throwable {
        manageRecipient.searchAndVerifyRecipient(value);
    }

    @And("^I click on the existing recipient$")
    public void I_click_on_the_existing_recipient() throws Throwable {
        manageRecipient.clickExistingRecipient();
    }

    @Then("^I delete the existing recipient$")
    public void I_delete_the_existing_recipient() throws Throwable{
        manageRecipient.deleteExistingRecipient();
    }

    @Then("^I search for the recipient, change accountNumber(\\d+) and update$")
    public void i_search_for_the_recipient_change_accountNumber_and_update(String arg1) throws Throwable {
        if(arg1.equalsIgnoreCase("1"))
        {
        manageRecipient.searchRecipient_Recent();
        manageRecipient.editAccountNumber();
        manageRecipient.clickUpdate();
        }
        else if(arg1.equalsIgnoreCase("2"))
        {
            manageRecipient.searchRecipient_Recent1();
            manageRecipient.editAccountNumber1();
            manageRecipient.clickUpdate();
        }
        else if(arg1.equalsIgnoreCase("3"))
        {
            manageRecipient.searchRecipient_Recent1();
            manageRecipient.editAccountNumber1();
            manageRecipient.clickUpdate();
        }
    }

}
