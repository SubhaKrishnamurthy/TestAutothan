package stepdefinitions;


import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonMethodsPage;
import pages.Dashboard_Home_Page;
import pages.LoginPage;

public class Dashboard_Home {

    private LoginPage login = new LoginPage();
    private CommonMethodsPage common = new CommonMethodsPage();
    private Dashboard_Home_Page dashboard = new Dashboard_Home_Page();

    WebDriver driver;
    WebElement element;

   @When("^I click on Send/Request link in dashboard$")
    public void I_click_on_Send_Request_link_in_dashboard() throws Throwable {
       dashboard.clickSendReceive();
    }

    @When("^I click on Foreign Exchange button in dashboard$")
    public void I_click_on_Foreign_Exchange_button_in_dashboard() throws Throwable {
        dashboard.clickFX();
    }
}
