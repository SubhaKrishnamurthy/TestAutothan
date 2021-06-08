package stepdefinitions;


import actions.Wait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import helper.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonMethodsPage;
import pages.LoginPage;
import pages.ManageRecipient_Page;
import pages.SendReceive_Page;

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

    @And("^I select bank name as \"([^\"]*)\"$")
    public void I_select_bank_name_as() throws Throwable {
        
    }

    @And("^I enter account name,number and click save button$")
    public void I_enter_account_name_number_and_click_save_button() throws Throwable {

    }

    @And("^I delete the recipient$")
    public void I_delete_the_recipient() throws Throwable {

    }

}
