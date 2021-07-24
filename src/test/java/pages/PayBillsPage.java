package pages;

import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;

import java.sql.Ref;

public class PayBillsPage extends Keywords {

    private String PaybillsPAYMENTREFERENCENO = "onlineBanking.PayBills.PaybillsPAYMENTREFERENCENO";
    private String MyBillers = "onlineBanking.PayBills.MyBillers";
    private String PolicyOwnwernumber = "onlineBanking.PayBills.PolicyOwnwernumber";
    private String ManageBillers = "onlineBanking.PayBills.ManageBillers";
    private String PaymentSuccessful1 = "onlineBanking.PayBills.PaymentSuccessful";
    private String RepeatinPayBill = "onlineBanking.PayBills.RepeatinPayBill";
    private String PaymentSuccessful = "onlineBanking.PayBills.PaymentSuccessful";
    private String BillPaymentsFAQ = "onlineBanking.PayBills.BillPaymentsFAQ";
    private String SelectBiller = "onlineBanking.PayBills.SelectBiller";
    private String FromAccountNumberMask = "onlineBanking.PayBills.FromAccountNumberMask";
    private String BillerList = "onlineBanking.PayBills.BillerList";
    private String BillercardNumbermask = "onlineBanking.PayBills.BillercardNumbermask";
    private String Billersearchresult3 = "onlineBanking.PayBills.Billersearchresult3";
    private String AbramobileNumber = "onlineBanking.PayBills.AbramobileNumber";
    private String AccountID = "onlineBanking.PayBills.AccountID";
    private String Transactiondate = "onlineBanking.PayBills.Transactiondate";
    private String FromAccountNumber = "onlineBanking.PayBills.FromAccountNumber";
    private String Datevalue = "onlineBanking.PayBills.Datevalue";
    private String PaybillsPOLICYNO = "onlineBanking.PayBills.PaybillsPOLICYNO";
    private String RecentPayments = "onlineBanking.PayBills.RecentPayments";
    private String EnterthebillerInformation = "onlineBanking.PayBills.EnterthebillerInformation";
    private String ABRAMOBILENumber = "onlineBanking.PayBills.ABRAMOBILENumber";
    private String ToBilllername = "onlineBanking.PayBills.ToBilllername";
    private String PayBillNext = "onlineBanking.PayBills.PayBillNext";
    private String Policyownernumber = "onlineBanking.PayBills.Policyownernumber";
    private String ManageScheduledPayments = "onlineBanking.PayBills.ManageScheduledPayments";
    private String Billersearchresult2 = "onlineBanking.PayBills.Billersearchresult2";
    private String EndRepeatinPayBill = "onlineBanking.PayBills.EndRepeatinPayBill";
    private String FromAccountBank = "onlineBanking.PayBills.FromAccountBank";
    private String BillerAccountID = "onlineBanking.PayBills.BillerAccountID";
    private String Policynumber = "onlineBanking.PayBills.Policynumber";
    private String VisaNumber = "onlineBanking.PayBills.VisaNumber";
    private String PaybillsPAYORSNAME = "onlineBanking.PayBills.PaybillsPAYORSNAME";
    private String Policynumber1 = "onlineBanking.PayBills.Policynumber";
    private String BillernameABRA = "onlineBanking.PayBills.BillernameABRA";
    private String Amount = "onlineBanking.PayBills.Amount";
    private String Date = "onlineBanking.PayBills.Date";
    private String Billersearchresult1 = "onlineBanking.PayBills.Billersearchresult1";
    private String FromAccountType = "onlineBanking.PayBills.FromAccountType";
    private String ReferenceNumber = "onlineBanking.PayBills.ReferenceNumber";
    private String NewPayment = "onlineBanking.PayBills.NewPayment";
    private String Payphp = "onlineBanking.PayBills.Payphp";
    private String PayBills = "onlineBanking.PayBills.PayBills";
    private String Searchbiller = "onlineBanking.PayBills.Searchbiller";
    private String DateInput = "onlineBanking.Common.DateInput";
    private String CancelVisitReview = "onlineBanking.MBB.CancelVisitReview";
    private String keyRepeatCheckBox ="onlineBanking.Fundtransfer.ChkRepeat";
    private String keyfrequency="onlineBanking.Fundtransfer.LstFrequency";
    private String EndDate = "onlineBanking.backoffice.ScheduledActivities.FailedScheduledBillsPaymentSearch2";
    private String ToBillerEdit = "onlineBanking.PayBills.ToBillerEdit";
    private String Review_ErrMsg = "onlineBanking.PayBills.Review.ErrorMsg";

    public ManageRecipient_Page manageRecipientPage = new ManageRecipient_Page();

    public void clickPayBills() throws Throwable {
        Wait.forSeconds(2000);
        jsClick.elementBy(PayBills);
    }

    public void clickSelectBiller() throws Throwable {
        Wait.forSeconds(2000);
        click.elementBy(SelectBiller);
    }

    public void searchBiller_BillersList(String name) throws Throwable {
        Wait.forSeconds(2000);
        jsClick.elementBy(BillerList);
        Wait.forSeconds(2000);
        type.data(Searchbiller,name);
        Wait.forSeconds(2000);
    }

    public void verifyValue_SearchResult1(String name) throws Throwable {
        verify.elementTextContains(Billersearchresult1,name);
    }

    public void verifyValue_SearchResult2(String name) throws Throwable {
        verify.elementTextContains(Billersearchresult2,name);
    }

    public void searchBiller_FavouritesList(String name) throws Throwable {
        manageRecipientPage.clickFavTab();
        type.data(Searchbiller,name);
    }

    public void searchBiller_MyBillers(String name) throws Throwable {
        click.elementBy(MyBillers);
        type.data(Searchbiller,name);
    }

    public void clickDate() throws Throwable {
        click.elementBy(DateInput);
    }

    public void clickSearchResult() throws Throwable {
        click.elementBy(Billersearchresult1);
    }

    public void enterAccount(String accountID) throws Throwable {
        type.data(AccountID,accountID);
    }

    public void clickCancel() throws Throwable {
        click.elementBy(CancelVisitReview);
    }

    public void enterAccountDetails(String RefNo,String PayorName,String PolicyNo) throws Throwable {
        Wait.forSeconds(4000);
        type.data(PaybillsPAYMENTREFERENCENO, RefNo);
        type.data(PaybillsPAYORSNAME,PayorName);
        type.data(PaybillsPOLICYNO,PolicyNo);
    }

    public void clickRepeatCheckBox() throws Throwable {
        click.elementBy(keyRepeatCheckBox);
    }

    public void verifyFrequency_EndDate() throws Throwable {
        verify.elementIsPresent(keyfrequency);
        verify.elementIsPresent(EndDate);
    }

    public void clickEditBtn() throws Throwable {
        click.elementBy(ToBillerEdit);
    }

    public void verify_PayPHP() throws Throwable {
        verify.elementIsPresent(Payphp);
    }

    public void click_PayPHP() throws Throwable {
       Wait.forSeconds(1000);
        click.elementBy(Payphp);
    }

    public void enterVisaNumber(String no) throws Throwable {
       Wait.forSeconds(2000);
        type.data(VisaNumber,no);
    }

    public void verifyErrMsg(String Msg) throws Throwable {
        Wait.forSeconds(1000);
        verify.elementTextContains(Review_ErrMsg,Msg);
    }
}
