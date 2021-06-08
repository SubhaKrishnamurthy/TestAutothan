package stepdefinitions;


import actions.Wait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.PropertyReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonMethodsPage;
import pages.LoginPage;
import runners.ConvergentTestRunner;
import actions.*;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class CommonMethods {

    private LoginPage login = new LoginPage();
    private CommonMethodsPage common = new CommonMethodsPage();
    private static Logger log = Logger.getLogger(Click.class);

    WebDriver driver;
    WebElement element;

    @Given("^I'm on login page of UB online banking application$")
    public void Im_on_login_page_of_UB_online_banking_application() throws Throwable {

            actions.Wait.forSeconds(3000);
           // WebElement iframeSwitch = driver.findElement(By.xpath("(//div/iframe)[1]"));
          //  driver.switchTo().frame("reCAPTCHA");

           // JavascriptExecutor executor = (JavascriptExecutor) driver;
           // executor.executeScript("arguments[0].click();", element);
        element = driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[1]"));



        driver.switchTo().defaultContent();
            actions.Wait.forSeconds(3000);
            login.enterUsernme(PropertyReader.testDataOf("Account1_UserID").trim());
            login.enterPassword(PropertyReader.testDataOf("Account1_Password").trim());
            actions.Wait.forSeconds(4000);
            driver.findElement(By.xpath("//*[text()=\"Log In\"]/parent::button")).click();

    }
    @And("^I logout of UB online banking application$")
    public void I_logout_of_UB_online_banking_application() throws Throwable {
        common.clickLogoutBtn();
    }


}
