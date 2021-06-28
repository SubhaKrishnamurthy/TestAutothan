package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonMethodsPage;
import pages.ForeignExchange_Page;
import pages.LoginPage;

public class UITF {

    private LoginPage login = new LoginPage();
    private CommonMethodsPage common = new CommonMethodsPage();


    WebDriver driver;
    WebElement element;


}
