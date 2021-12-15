package pages;

import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;

public class InstallmentHistoryPage extends Keywords {

    private String CreditCard1 = "onlineBanking.InstallmentHistory.CreditCard1";
    private String CreditCard2 = "onlineBanking.InstallmentHistory.CreditCard2";
    private String CreditCard3= "onlineBanking.InstallmentHistory.CreditCard3";
    private String InstallmentHistory = "onlineBanking.InstallmentHistory.InstallmentHistory";
    private String NoInstallmentErrMsg = "onlineBanking.InstallmentHistory.NoInstallmentErrMsg";
    private String FirstInstallment = "onlineBanking.InstallmentHistory.FirstInstallment";
    private String ReferenceNumber = "onlineBanking.InstallmentHistory.ReferenceNumber";
    private String PurchasedOn = "onlineBanking.InstallmentHistory.PurchasedOn";
    private String ProgressBar = "onlineBanking.InstallmentHistory.ProgressBar";
    private String Installments = "onlineBanking.InstallmentHistory.Installments";
    private String RemainingBalance = "onlineBanking.InstallmentHistory.RemainingBalance";
    private String PurchaseAmount = "onlineBanking.InstallmentHistory.PurchaseAmount";
    private String EndDate = "onlineBanking.InstallmentHistory.EndDate";
    private String InstallmentHistoryTitle = "onlineBanking.InstallmentHistory.InstallmentHistoryTitle";
    private String InstallmentDetailsTitle  = "onlineBanking.InstallmentHistory.InstallmentDetailsTitle";
    private String PurchaseAmountPHP = "onlineBanking.InstallmentHistory.PurchaseAmountPHP";
    private String MerchantName = "onlineBanking.InstallmentHistory.MerchantName";
    private String Reminder  = "onlineBanking.InstallmentHistory.Reminder";
    private String DueDate = "onlineBanking.InstallmentHistory.DueDate";
    private String InstallmentAmt = "onlineBanking.InstallmentHistory.InstallmentAmt";
    private String checkMarkIndicator = "onlineBanking.InstallmentHistory.checkMarkIndicator";
    private String ViewStatement = "onlineBanking.InstallmentHistory.ViewStatement";
    private String DownloadStatement = "onlineBanking.InstallmentHistory.DownloadStatement";
    private String DownloadStatementView = "onlineBanking.InstallmentHistory.DownloadStatementView";
    private String ManageCards = "onlineBanking.CC.ManageCards";
    private String ClickMonth = "onlineBanking.InstallmentHistory.ClickMonth";
    private String SelectMonth = "onlineBanking.InstallmentHistory.SelectMonth";
    private String StatementBalance = "onlineBanking.InstallmentHistory.StatementBalance";
    private String MinimumAmountDue = "onlineBanking.InstallmentHistory.MinimumAmountDue";
    private String StatementDate = "onlineBanking.InstallmentHistory.StatementDate";
    private String PreviousBalance = "onlineBanking.InstallmentHistory.PreviousBalance";
    private String PurchasesAdvances = "onlineBanking.InstallmentHistory.PurchasesAdvances";
    private String PaymentsCredits = "onlineBanking.InstallmentHistory.PaymentsCredits";
    private String TotalAmountDue = "onlineBanking.InstallmentHistory.TotalAmountDue";
    private String DownloadPDF = "onlineBanking.InstallmentHistory.DownloadPDF";
    private String DownloadHeader = "onlineBanking.InstallmentHistory.DownloadHeader";
    private String DownloadSuccessMessage = "onlineBanking.InstallmentHistory.DownloadSuccessMessage";


    private Wait wait;

    public void select_CreditCard2() throws Throwable {
        Wait.forSeconds(6000);
        click.elementBy(CreditCard2);
    }

    public void select_CreditCard1() throws Throwable {
        Wait.forSeconds(6000);
        click.elementBy(CreditCard1);
    }

    public void verify_Icons() throws Throwable {
        Wait.forSeconds(6000);
        verify.elementIsPresent(InstallmentHistoryTitle);
        verify.elementIsPresent(ViewStatement);
        verify.elementIsPresent(DownloadStatement);
        verify.elementIsPresent(ManageCards);
    }

    public void click_InstallmentHistoryIcon() throws Throwable {
        Wait.forSeconds(6000);
        jsClick.elementBy(InstallmentHistoryTitle);
    }

    public void verify_installemntHistoryScreen() throws Throwable {
        Wait.forSeconds(6000);
        verify.elementIsPresent(InstallmentHistoryTitle);
    }

    public void select_Transaction() throws Throwable {
        Wait.forSeconds(6000);
        click.elementBy(FirstInstallment);
    }

    public void verify_installmentDetailsScreen() throws Throwable {
        Wait.forSeconds(6000);
        verify.elementIsPresent(InstallmentDetailsTitle);
    }

    public void verify_InstallmentDetails() throws Throwable {
        Wait.forSeconds(5000);
        verify.elementIsPresent(ReferenceNumber);
        verify.elementIsPresent(PurchasedOn);
        verify.elementIsPresent(MerchantName);
        verify.elementIsPresent(ProgressBar);
        verify.elementIsPresent(Installments);
        verify.elementIsPresent(RemainingBalance);
        verify.elementIsPresent(PurchaseAmount);
        verify.elementIsPresent(EndDate);
    }

    public void verify_NoInstallemntErrMsg() throws Throwable {
        verify.elementIsPresent(NoInstallmentErrMsg);
    }

    public void verify_ReminderandBreakDownPayment() throws Throwable {
        verify.elementIsPresent(PurchaseAmountPHP);
        verify.elementIsPresent(Reminder);
        verify.elementIsPresent(DueDate);
        verify.elementIsPresent(InstallmentAmt);
        verify.elementIsPresent(checkMarkIndicator);
    }
    public void clickViewStatement() throws Throwable {
        Wait.forSeconds(4000);
        click.elementBy(ViewStatement);
    }
    public void verify_ViewStatementDetails() throws Throwable {
        Wait.forSeconds(4000);
        verify.elementIsPresent(StatementBalance);
        verify.elementIsPresent(MinimumAmountDue);
        verify.elementIsPresent(DueDate);
        verify.elementIsPresent(StatementDate);
        verify.elementIsPresent(PreviousBalance);
        verify.elementIsPresent(PurchasesAdvances);
        verify.elementIsPresent(PaymentsCredits);
        verify.elementIsPresent(TotalAmountDue);
    }
    public void clickMonthYear() throws Throwable {
        Wait.forSeconds(4000);
        click.elementBy(ClickMonth);
        //jsClick.elementBy(ClickMonth);
    }
    public void selectMonthYear() throws Throwable {
        Wait.forSeconds(2000);
        click.elementBy(SelectMonth);
    }
    public void clickDownloadStatement() throws Throwable {
        Wait.forSeconds(4000);
        click.elementBy(DownloadStatement);
    }
    public void clickDownloadStatementView() throws Throwable {
        Wait.forSeconds(4000);
        click.elementBy(DownloadStatement);
    }
    public void clickDownloadPDF() throws Throwable {
        Wait.forSeconds(4000);
        click.elementBy(DownloadPDF);
    }
    public void verifyDownloadStatus() throws Throwable {
      verify.IfElementExists(DownloadHeader);
    }
    public void verifyDownloadSuccessMessage() throws Throwable {
        Wait.forSeconds(2000);
        //verify.IfElementExists(DownloadSuccessMessage);
        verify.elementIsPresent(DownloadSuccessMessage);
    }

}
