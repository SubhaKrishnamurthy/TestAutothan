package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InstallmentHistoryPage;
import pages.WesternUnionPage;

public class InstallmentHistory {

    InstallmentHistoryPage installmentHistoryPage = new InstallmentHistoryPage();

    @When("^user selects credit card2 listed in dashboard$")
    public void user_selects_credit_card2_listed_in_dashboard() throws Throwable {
        installmentHistoryPage.select_CreditCard2();
    }

    @When("^user selects credit card1 listed in dashboard$")
    public void user_selects_credit_card1_listed_in_dashboard() throws Throwable {
        installmentHistoryPage.select_CreditCard1();
    }

    @Then("^user able to verify icons and other details of the screen$")
    public void user_able_to_verify_icons_and_other_details_of_the_screen() throws Throwable {
        installmentHistoryPage.verify_Icons();
    }

    @When("^user clicks installment history icon$")
    public void user_clicks_installment_history_icon() throws Throwable {
        installmentHistoryPage.click_InstallmentHistoryIcon();
    }

    @Then("^Application should navigate to installment history screen$")
    public void application_should_navigate_to_installment_history_screen() throws Throwable {
        installmentHistoryPage.verify_installemntHistoryScreen();
    }

    @When("^user selects any transaction listed under installment history$")
    public void user_selects_any_transaction_listed_under_installment_history() throws Throwable {
         installmentHistoryPage.select_Transaction();
    }

    @Then("^Application should navigate to installment details screen$")
    public void application_should_navigate_to_installment_details_screen() throws Throwable {
        installmentHistoryPage.verify_installmentDetailsScreen();
    }

    @Then("^user verifies application displays required details under installment details$")
    public void user_verifies_application_displays_required_details_under_installment_details() throws Throwable {
        installmentHistoryPage.verify_InstallmentDetails();
    }


    @Then("^Verify application displays \"([^\"]*)\" under installment history$")
    public void verifyApplicationDisplaysUnderInstallmentHistory(String arg0) throws Throwable {
        installmentHistoryPage.verify_NoInstallemntErrMsg();
    }

    @Then("^user verifies installment history and due date reminder and broken down payment schedules$")
    public void userVerifiesInstallmentHistoryAndDueDateReminderAndBrokenDownPaymentSchedules() throws Throwable {
         installmentHistoryPage.verify_ReminderandBreakDownPayment();
    }

    @And("^user click to view statement icon$")
    public void userClickToViewStatementIcon() throws Throwable {
        installmentHistoryPage.clickViewStatement();

    }

    @Then("^Verify application displays all the details under view statement$")
    public void verifyApplicationDisplaysAllTheDetailsUnderViewStatement() throws Throwable {
        installmentHistoryPage.verify_ViewStatementDetails();

    }

    @And("^user to click DOWNLOAD STATEMENT$")
    public void userToClickDOWNLOADSTATEMENT() throws Throwable {
        installmentHistoryPage.clickDownloadStatement();

    }

    @When("^user to select month and year$")
    public void userToSelectMonthAndYear() throws Throwable {
        installmentHistoryPage.clickMonthYear();
        installmentHistoryPage.selectMonthYear();

    }

    @And("^user to click DOWNLOAD PDF$")
    public void userToClickDOWNLOADPDF() throws Throwable {
        installmentHistoryPage.clickDownloadPDF();

    }

    @Then("^Verify Application is display Download status message$")
    public void verifyApplicationIsDisplayDownloadStatusMessage() throws Throwable {
        installmentHistoryPage.verifyDownloadStatus();
    }

    @And("^Verify Application is display success screen message$")
    public void verifyApplicationIsDisplaySuccessScreenMessage() throws Throwable {
        installmentHistoryPage.verifyDownloadSuccessMessage();
    }

    @When("^user to click DOWNLOAD STATEMENT in View Statement$")
    public void userToClickDOWNLOADSTATEMENTInViewStatement() throws Throwable {
        installmentHistoryPage.clickDownloadStatementView();
    }
}