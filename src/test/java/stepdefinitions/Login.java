package stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

public class Login {

    private LoginOrangeHrm_Page login = new LoginOrangeHrm_Page();



    @Then("^check user able to enter user name and password$")
    public void check_user_able_to_enter_user_name_and_password() throws Throwable {
        LoginOrangeHrm_Page.EnterUserNameAndPassword();
    }

    @Then("^user able to click login$")
    public void user_able_to_click_login() throws Throwable {
        LoginOrangeHrm_Page.ClickLoginBtn();
    }

}
