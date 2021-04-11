package stepdefinitions;


import actions.Wait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import runners.ConvergentTestRunner;
import actions.*;

public class C001_Login {

    private LoginPage login = new LoginPage();

    WebDriver driver;
    WebElement element;

    @Given("^I'm on login page of convergent banking mobile application$")
    public void iMOnLoginPageOfConvergentBankingMobileApplication() throws Throwable {
        login.enterUsernme(PropertyReader.testDataOf("Account1_UserID").trim());
        login.enterPassword(PropertyReader.testDataOf("Account1_Password").trim());
        //Thread.sleep(3000);
        actions.Wait.forSeconds(3000);
        WebElement iframeSwitch = driver.findElement(By.xpath("(//div/iframe)[1]"));
        driver.switchTo().frame(iframeSwitch);
        element= driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        //TestAttributes.driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
        driver.switchTo().defaultContent();
        //Thread.sleep(8000);
        actions.Wait.forSeconds(3000);
        driver.findElement(By.xpath("//*[text()=\"Log In\"]/parent::button")).click();
    }


}
