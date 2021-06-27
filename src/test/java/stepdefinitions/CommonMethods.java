package stepdefinitions;


import actions.Wait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonMethodsPage;
import pages.LoginPage;
import runners.ConvergentTestRunner;
import actions.*;

public class CommonMethods {

    private LoginPage login = new LoginPage();
    private CommonMethodsPage common = new CommonMethodsPage();

    WebDriver driver;
    WebElement element;

    @Given("^I'm on login page of UB online banking application$")
    public void Im_on_login_page_of_UB_online_banking_application() throws Throwable {
        login.enterUsernme(PropertyReader.testDataOf("Account1_UserID").trim());
        login.enterPassword(PropertyReader.testDataOf("Account1_Password").trim());
        //Thread.sleep(3000);
        actions.Wait.forSeconds(3000);
        actions.Wait.forSeconds(3000);
        login.clickRecaptcha();
        login.clickLoginbutton();
    }

    @And("^I logout of UB online banking application$")
    public void I_logout_of_UB_online_banking_application() throws Throwable {
        common.clickLogoutBtn();
    }


    @Given("^I'm on login page of UB online banking application with otp \"([^\"]*)\"$")
    public void iMOnLoginPageOfUBOnlineBankingApplicationWithOtp(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterUsernme(PropertyReader.testDataOf("Account1_UserID").trim());
        login.enterPassword(PropertyReader.testDataOf("Account1_Password").trim());
        //Thread.sleep(3000);
        actions.Wait.forSeconds(3000);
        actions.Wait.forSeconds(3000);
        login.clickRecaptcha();
        login.clickLoginbutton();
        actions.Wait.forSeconds(3000);
        login.enterOTP(arg0);
        actions.Wait.forSeconds(3000);
        login.clickSubmitbutton();
    }

    @Given("^I'm on login page of UB online banking application with user \"([^\"]*)\" otp \"([^\"]*)\"$")
    public void iMOnLoginPageOfUBOnlineBankingApplicationWithUserOtp(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterUsernme(arg0);
        login.enterPassword(PropertyReader.testDataOf("Account1_Password").trim());
        //Thread.sleep(3000);
        actions.Wait.forSeconds(3000);
        actions.Wait.forSeconds(3000);
        login.clickRecaptcha();
        login.clickLoginbutton();
        actions.Wait.forSeconds(5000);
        login.enterOTP(arg1);
        actions.Wait.forSeconds(3000);
        login.clickSubmitbutton();
    }


}
