package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

public class SplitBills {

    Dashboard_Home_Page dashboardHomePage =  new Dashboard_Home_Page();
    RequestPayment_Page requestPaymentPage = new RequestPayment_Page();

    @When("^I click the Split bills under receive money$")
    public void i_click_the_Split_bills_under_receive_money() throws Throwable {
        dashboardHomePage.clickSendReceive();
        requestPaymentPage.clickSplitBillsLink();
    }

    @Then("^I Verify Congratulation message,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void i_Verify_Congratulation_message(String fromAccName, String FromAccNumber, String RequesingAmount, String TotalBill, String YourAmount, String message, String DepositToAccName, String DepositToAccNumber) throws Throwable {
        requestPaymentPage.verifyCongMsg_OtherDetails_SplitBills(fromAccName,FromAccNumber,RequesingAmount,TotalBill,YourAmount,message,DepositToAccName,DepositToAccNumber);
    }

    @Then("^I Click the Go to Dashboard button Link$")
    public void I_Click_the_Go_to_Dashboard_button_Link() throws Throwable {
        requestPaymentPage.clickGoToDashboard();
    }

    @When("^I enter YourPortion amount as \"([^\"]*)\" and RequesingFrom amount as \"([^\"]*)\"$")
    public void i_enter_YourPortion_amount_as_and_RequesingFrom_amount_as(String arg1, String arg2) throws Throwable {
       requestPaymentPage.splitYourPortionAmt_RequesingAmt(arg1,arg2);
    }

}
