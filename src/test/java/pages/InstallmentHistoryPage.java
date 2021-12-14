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
    private String ManageCards = "onlineBanking.CC.ManageCards";
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
        verify.elementIsPresent(InstallmentHistory);
        verify.elementIsPresent(ViewStatement);
        verify.elementIsPresent(DownloadStatement);
        verify.elementIsPresent(ManageCards);
    }

    public void click_InstallmentHistoryIcon() throws Throwable {
        Wait.forSeconds(6000);
        jsClick.elementBy(InstallmentHistory);
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
}
