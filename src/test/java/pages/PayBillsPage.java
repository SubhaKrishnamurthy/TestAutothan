package pages;

import actions.Wait;
import base.Keywords;
import cucumber.api.java.eo.Se;
import exceptions.ApplicationException;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.Ref;

public class PayBillsPage extends Keywords {

    private String PaybillsPAYMENTREFERENCENO = "onlineBanking.PayBills.PaybillsPAYMENTREFERENCENO";
    private String MyBillers = "onlineBanking.PayBills.MyBillers";
    private String PolicyOwnwernumber = "onlineBanking.PayBills.PolicyOwnwernumber";
    private String ManageBillers = "onlineBanking.PayBills.ManageBillers";
    private String PaymentSuccessful1 = "onlineBanking.PayBills.PaymentSuccessful1";
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
    private String keygotit="onlineBanking.Fundtransfer.BtnGotit";
    private String CalenderNextBtn = "onlineBanking.Common.WebLnk_CalendarNextButton";
    private String CalenderBackBtn = "onlineBanking.Common.WebLnk_CalendarBackButton";
    private String CalenderDate = "onlineBanking.Common.WrbBtn_CalendarDate";
    private String keyAmount="onlineBanking.Fundtransfer.TxtAmount";
    private String BackButton = "onlineBanking.PayBills.BackButton";

    public SendMoney_Ownaccount Ownaccount = new SendMoney_Ownaccount();
    public ManageRecipient_Page manageRecipientPage = new ManageRecipient_Page();
    public CommonMethodsPage common = new CommonMethodsPage();

    public void verify_PayBills() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementIsPresent(PayBills);
    }

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
       Wait.forSeconds(2000);
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
        Wait.forSeconds(4000);
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
      Wait.forSeconds(2000);
        jsClick.elementBy(Payphp);
    }

    public void enterVisaNumber(String no) throws Throwable {
       Wait.forSeconds(2000);
        type.data(VisaNumber,no);
    }

    public void verifyErrMsg(String Msg) throws Throwable {
        Wait.forSeconds(1000);
        verify.elementTextContains(Review_ErrMsg,Msg);
    }

    public void verify_VisaNumber(String no) throws Throwable {
        Wait.forSeconds(1000);
        verify.elementTextContains(VisaNumber,no);
    }

    public void verify_DateValue(String datevalue) throws Throwable {
        Wait.forSeconds(2000);
        verify.VERIFYDATE(Datevalue,datevalue);
    }

    public void verify_PaymentSuccessful() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementIsPresent(PaymentSuccessful1);
    }

    public void verify_FromAccountNumber(String beforeMask,String afterMask) throws Throwable {
        Wait.forSeconds(1000);
        verify.elementTextContains(FromAccountNumberMask,beforeMask);
        jsClick.elementBy(FromAccountNumberMask);
        verify.elementTextContains(FromAccountNumberMask,afterMask);

    }

    public void verify_CardNumber(String beforeMask,String afterMask) throws Throwable {
        Wait.forSeconds(2000);
        verify.elementTextContains(BillercardNumbermask,beforeMask);
        jsClick.elementBy(BillercardNumbermask);
        verify.elementTextContains(BillercardNumbermask,afterMask);
    }

    public void click_GotitBtn() throws Throwable {
           try{
           if (keygotit != null) {
               jsClick.elementBy(keygotit);
           }
       } catch (ApplicationException e) {
           e.printStackTrace();
       }

    }

    public void click_NewPaymentBtn() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(NewPayment);
    }

    public void verify_FinalPage(String BillerName, String FromAccNumber, String PolicyOwnerNo, String AmountValue) throws Throwable {
        Wait.forSeconds(1000);
        verify.elementTextContains(ToBilllername,BillerName);
        verify.elementTextContains(FromAccountNumber,FromAccNumber);
        verify.elementTextContains(BillerAccountID,PolicyOwnerNo);
        verify.elementTextContains(Amount,AmountValue);
    }

    public void click_Calender() throws Throwable {
        click.elementBy(DateInput);
        click.elementBy(CalenderNextBtn);
        click.elementBy(CalenderDate);
    }

    public void edit_AccountNumber() throws Throwable {
        Ownaccount.clickFromaccountedit();
        common.clickFromAccNumber();
        click_GotitBtn();
    }

    public void edit_BillerDetails() throws Throwable {
        clickEditBtn();
        type.data(PaybillsPAYMENTREFERENCENO, "0006992990424204");
        Ownaccount.clickUpdate();
        click_GotitBtn();
    }

    public void edit_Amount() throws Throwable {
        Ownaccount.clickamountedit();
        type.data(keyAmount,"150");
        Ownaccount.clickUpdate();
        click_GotitBtn();
    }

    public void click_BackBtn() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(BackButton);
    }
}
