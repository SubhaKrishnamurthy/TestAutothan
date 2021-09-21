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
import pages.GreenPinPage;
import pages.LoginPage;
import runners.ConvergentTestRunner;
import actions.*;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;

public class CommonMethods {

    private LoginPage login = new LoginPage();
    private CommonMethodsPage common = new CommonMethodsPage();
    GreenPinPage greenPinPage = new GreenPinPage();
   // private static Logger log = Logger.getLogger(Click.class);

    WebDriver driver;
    WebElement element;

    @Given("^I'm on login page of UB online banking application$")
    public void Im_on_login_page_of_UB_online_banking_application() throws Throwable
    {
        if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
        {
            actions.Wait.forSeconds(50000);
        }
        actions.Wait.forSeconds(3000);
        login.enterUsernme(PropertyReader.testDataOf("Account1_UserID").trim());
        login.enterPassword(PropertyReader.testDataOf("Account1_Password").trim());
        actions.Wait.forSeconds(3000);
        login.clickRecaptcha();
        login.clickLoginbutton();
        actions.Wait.forSeconds(3000);
        greenPinPage.enter_Pin("2","2","2","2","2","2");
        //login.enterOTP(PropertyReader.testDataOf("Account1_OTP").trim());
        //actions.Wait.forSeconds(2000);
        //login.clickSubmitbutton();
    }

    @And("^I logout of UB online banking application$")
    public void I_logout_of_UB_online_banking_application() throws Throwable {
        common.clickLogoutBtn();
    }


    @Given("^I'm on login page of UB online banking application with otp \"([^\"]*)\"$")
    public void iMOnLoginPageOfUBOnlineBankingApplicationWithOtp(String arg0) throws Throwable
    {

        if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
        {
            actions.Wait.forSeconds(50000);
        }
        actions.Wait.forSeconds(3000);
        login.enterUsernme(PropertyReader.testDataOf("Account1_UserID").trim());
        login.enterPassword(PropertyReader.testDataOf("Account1_Password").trim());
        //Thread.sleep(3000);
        actions.Wait.forSeconds(3000);
        actions.Wait.forSeconds(3000);
        login.clickRecaptcha();
        login.clickLoginbutton();
        actions.Wait.forSeconds(3000);
        //login.enterOTP(arg0);
        //actions.Wait.forSeconds(3000);
        //login.clickSubmitbutton();
        char[] ch=arg0.toCharArray();
        greenPinPage.enter_Pin(String.valueOf(ch[0]),String.valueOf(ch[1]),String.valueOf(ch[2]),
                String.valueOf(ch[3]),String.valueOf(ch[4]),String.valueOf(ch[5]));
    }

    @Given("^I'm on login page of UB online banking application with user \"([^\"]*)\"$")
    public void Im_on_login_page_of_UB_online_banking_application_with_user(String arg0) throws Throwable
    {
        if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
        {
            actions.Wait.forSeconds(50000);
        }
        actions.Wait.forSeconds(3000);
        login.enterUsernme(arg0);
        login.enterPassword(PropertyReader.testDataOf("Account1_Password").trim());
        //Thread.sleep(3000);
        actions.Wait.forSeconds(3000);
        actions.Wait.forSeconds(3000);
        login.clickRecaptcha();
        login.clickLoginbutton();
        actions.Wait.forSeconds(3000);
        greenPinPage.enter_Pin("2","2","2","2","2","2");
        //login.enterOTP(PropertyReader.testDataOf("Account1_OTP").trim());
        //actions.Wait.forSeconds(2000);
        //login.clickSubmitbutton();
    }

    @Given("^I'm on login page of UB online banking application with user \"([^\"]*)\" otp \"([^\"]*)\"$")
    public void iMOnLoginPageOfUBOnlineBankingApplicationWithUserOtp(String arg0, String arg1) throws Throwable
    {

        if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
        {
            actions.Wait.forSeconds(50000);
        }
        actions.Wait.forSeconds(3000);
        login.enterUsernme(arg0);
        actions.Wait.forSeconds(3000);
        login.enterPassword(PropertyReader.testDataOf("Account1_Password").trim());
        actions.Wait.forSeconds(3000);
        login.clickRecaptcha();
        login.clickLoginbutton();
        //actions.Wait.forSeconds(8000);
        //login.enterOTP(arg1);
        actions.Wait.forSeconds(3000);
        //login.clickSubmitbutton();
        char[] ch=arg1.toCharArray();
        greenPinPage.enter_Pin(String.valueOf(ch[0]),String.valueOf(ch[1]),String.valueOf(ch[2]),
                String.valueOf(ch[3]),String.valueOf(ch[4]),String.valueOf(ch[5]));
        if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
        {
            actions.Wait.forSeconds(8000);
        }
    }



}
