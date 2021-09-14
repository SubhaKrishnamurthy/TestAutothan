package pages;

import actions.Verify;
import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class MobileBranchBanking_Page extends Keywords {

    private static Logger log=Logger.getLogger(MobileBranchBanking_Page.class);
    private RequestPayment_Page requestPaymentPage = new RequestPayment_Page();
    private Dashboard_Home_Page dashboardHomePage = new Dashboard_Home_Page();
    private CommonMethodsPage commonMethodsPage = new CommonMethodsPage();

    private String BOOKVISIT = "onlineBanking.MBB.BOOKVISIT";
    private String MBBTransaction = "onlineBanking.MBB.MBBTransaction";
    private String VisitdetailsBranchSearchResult5 = "onlineBanking.MBB.VisitdetailsBranchSearchResult5";
    private String VisitHistory1Status = "onlineBanking.MBB.VisitHistory1Status";
    private String VisitHistory1date = "onlineBanking.MBB.VisitHistory1date";
    private String ReviewEdit = "onlineBanking.MBB.ReviewEdit";
    private String Historytxntype = "onlineBanking.MBB.Historytxntype";
    private String BranchAddress = "onlineBanking.MBB.BranchAddress";
    private String MBBTransactiondate = "onlineBanking.MBB.MBBTransactiondate";
    private String BranchUPCOMINGmessage = "onlineBanking.MBB.BranchUPCOMINGmessage";
    private String VisitdetailsBranchSearch = "onlineBanking.MBB.VisitdetailsBranchSearch";
    private String BranchHISTORYmessage = "onlineBanking.MBB.BranchHISTORYmessage";
    private String UpcomingTransactionandamount3 = "onlineBanking.MBB.UpcomingTransactionandamount3";
    private String HistoryDate2 = "onlineBanking.MBB.HistoryDate2";
    private String UpcomingViewMore = "onlineBanking.MBB.UpcomingViewMore";
    private String Historystatus1 = "onlineBanking.MBB.Historystatus1";
    private String SelectDate = "onlineBanking.MBB.SelectDate";
    private String TODAY = "onlineBanking.MBB.TODAY";
    private String HistoryDate3 = "onlineBanking.MBB.HistoryDate3";
    private String UPCOMING = "onlineBanking.MBB.UPCOMING";
    private String SelectBranch2 = "onlineBanking.MBB.SelectBranch2";
    private String HistoryViewMore = "onlineBanking.MBB.HistoryViewMore";
    private String DashboardDate1 = "onlineBanking.MBB.DashboardDate1";
    private String UpcomingDate1 = "onlineBanking.MBB.UpcomingDate1";
    private String Historystatus3 = "onlineBanking.MBB.Historystatus3";
    private String VisitdetailsBranchSearchResult2 = "onlineBanking.MBB.VisitdetailsBranchSearchResult2";
    private String HistoryTransactionandamount1 = "onlineBanking.MBB.HistoryTransactionandamount1";
    private String HistoryVisitdetailsstatus = "onlineBanking.MBB.HistoryVisitdetailsstatus";
    private String UpcomingDate3 = "onlineBanking.MBB.UpcomingDate3";
    private String DashboardDate2 = "onlineBanking.MBB.DashboardDate2";
    private String Historystatus2 = "onlineBanking.MBB.Historystatus2";
    private String SelectBranch = "onlineBanking.MBB.SelectBranch";
    private String TODAYDETAILS = "onlineBanking.MBB.TODAYDETAILS";
    private String BranchTODAYmessage = "onlineBanking.MBB.BranchTODAYmessage";
    private String Visitdetailsdate = "onlineBanking.MBB.Visitdetailsdate";
    private String UpcomingTransactionandamount1 = "onlineBanking.MBB.UpcomingTransactionandamount1";
    private String UpcomingTransactionandamount2 = "onlineBanking.MBB.UpcomingTransactionandamount2";
    private String Historydetails1 = "onlineBanking.MBB.Historydetails1";
    private String HISTORY = "onlineBanking.MBB.HISTORY";
    private String Visitdetailsbranchaddress = "onlineBanking.MBB.Visitdetailsbranchaddress";
    private String VisitdetailsAccountNumber = "onlineBanking.MBB.VisitdetailsAccountNumber";
    private String HistoryDate1 = "onlineBanking.MBB.HistoryDate1";
    private String VisitdetailsAmount = "onlineBanking.MBB.VisitdetailsAmount";
    private String ViewMore = "onlineBanking.MBB.ViewMore";
    private String SelectBranchfavouritemsg = "onlineBanking.MBB.SelectBranchfavouritemsg";
    private String SelectBranchunfavouritemsg = "onlineBanking.MBB.SelectBranchunfavouritemsg";
    private String Historydetails2 = "onlineBanking.MBB.Historydetails2";
    private String VisitHistory1Amount = "onlineBanking.MBB.VisitHistory1Amount";
    private String HistoryDate11 = "onlineBanking.MBB.HistoryDate11";
    private String HistoryTransactionandamount2 = "onlineBanking.MBB.HistoryTransactionandamount2";
    private String VisitdetailsBranchSearchResult3 = "onlineBanking.MBB.VisitdetailsBranchSearchResult3";
    private String VisitdetailsBranchSearchResult4 = "onlineBanking.MBB.VisitdetailsBranchSearchResult4";
    private String HistoryTransactionandamount3 = "onlineBanking.MBB.HistoryTransactionandamount3";
    private String DashboardTransaction = "onlineBanking.MBB.DashboardTransaction";
    private String UpcomingDate2 = "onlineBanking.MBB.UpcomingDate2";
    private String VisitdetailsBranchSearchResult1 = "onlineBanking.MBB.VisitdetailsBranchSearchResult1";
    private String Visitdetailsbranchname = "onlineBanking.MBB.Visitdetailsbranchname";
    private String HistoryStatus1 = "onlineBanking.MBB.HistoryStatus1";
    private String Historydetails3 = "onlineBanking.MBB.Historydetails3";
    private String VisitdetailsStatus = "onlineBanking.MBB.VisitdetailsStatus";
    private String UpcomingAmount1 = "onlineBanking.MBB.UpcomingAmount1";
    private String HistoryVisitdetailsbranch = "onlineBanking.MBB.HistoryVisitdetailsbranch";
    private String Clickcardformoredetails = "onlineBanking.MBB.Clickcardformoredetails";
    private String ScheduleBankVisitinadvance = "onlineBanking.MBB.ScheduleBankVisitinadvance";
    private String SelectdateTodaydate = "onlineBanking.MBB.SelectdateTodaydate";
    private String CancelVisit = "onlineBanking.MBB.CancelVisit";
    private String CancelVisitReview = "onlineBanking.MBB.CancelVisitReview";
    private String SearchIcon = "onlineBanking.MBB.SearchIcon";
    private Wait wait;

    //MBB-VisitDetails and VisitReview Page

    private String  MBBReviewvisit_Issuingbankcheckdeposit ="onlineBanking.MBB.MBBReviewvisit_Issuingbankcheckdeposit";
    private String  MBBReviewvisit_Amount ="onlineBanking.MBB.MBBReviewvisit_Amount";
    private String  MBBReviewvisit_amountcheckdeposit2 ="onlineBanking.MBB.MBBReviewvisit_amountcheckdeposit2";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWUpdateVisit ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWUpdateVisit";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber3closeicon ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber3closeicon";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWGotoDashboard ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWGotoDashboard";
    private String  MBBReviewvisit_Accountnumber2 ="onlineBanking.MBB.MBBReviewvisit_Accountnumber2";
    private String  MBBReviewvisit_amountcheckdeposit ="onlineBanking.MBB.MBBReviewvisit_amountcheckdeposit";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAmount1 ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAmount1";
    private String  AddCashWithdrawl ="onlineBanking.MBB.AddCashWithdrawl";
    private String  MBBReviewvisit_Accountnumber ="onlineBanking.MBB.MBBReviewvisit_Accountnumber";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber2 ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber2";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSOthers1 ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSOthers1";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWSuccessMessage ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWSuccessMessage";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAddCashWithdrawal ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAddCashWithdrawal";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber1closeicon ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber1closeicon";
    private String  PG_MBBBOOKVISITDETAILSCashwithdrwalcancel ="onlineBanking.MBB.PG_MBBBOOKVISITDETAILSCashwithdrwalcancel";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber2closeicon ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber2closeicon";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAddCheckDeposit ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAddCheckDeposit";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWThankYou ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWThankYou";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAmount3 ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAmount3";
    private String  MBBReviewvisit_accountnumbercheckdeposit ="onlineBanking.MBB.MBBReviewvisit_accountnumbercheckdeposit";
    private String  PG_MBBBOOKVISITDETAILSCheckdepositcancel ="onlineBanking.MBB.PG_MBBBOOKVISITDETAILSCheckdepositcancel";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAmount2 ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAmount2";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSCheckNumber1 ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSCheckNumber1";
    private String  AddCheckDeposit ="onlineBanking.MBB.AddCheckDeposit";
    private String  MBBReviewvisit_Date ="onlineBanking.MBB.MBBReviewvisit_Date";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber1 ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber1";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber3 ="onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber3";
    private String  MBBReviewvisit_Amount2 = "onlineBanking.MBB.MBBReviewvisit_Amount2";
    private String  MBBReviewvisit_checknumbercheckdeposit2 = "onlineBanking.MBB.MBBReviewvisit_checknumbercheckdeposit2";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSCheckNumber2 = "onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSCheckNumber2";
    private String  MBBReviewvisit_accountnumbercheckdeposit2 = "onlineBanking.MBB.MBBReviewvisit_accountnumbercheckdeposit2";
    private String  AddCashDeposit = "onlineBanking.MBB.AddCashDeposit";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWBookVisit = "onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWBookVisit";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWEdit = "onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWEdit";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWViewVisits = "onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWViewVisits";
    private String  MBBReviewvisit_checknumbercheckdeposit = "onlineBanking.MBB.MBBReviewvisit_checknumbercheckdeposit";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSUnionbank1 = "onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSUnionbank1";
    private String  Hangon_Errormsg = "onlineBanking.MBB.Hangon_Errormsg";
    private String  MBBReviewvisit_BranchAddress = "onlineBanking.MBB.MBBReviewvisit_BranchAddress";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAddCashDeposit = "onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAddCashDeposit";
    private String  MBBReviewvisit_BranchName = "onlineBanking.MBB.MBBReviewvisit_BranchName";
    private String  MOBILEBRANCHBANKINGBOOKVISITAddTransaction = "onlineBanking.MBB.MOBILEBRANCHBANKINGBOOKVISITAddTransaction";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber1search = "onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber1search";
    private String  PG_MBBBOOKVISITDETAILSCashdepositcancel = "onlineBanking.MBB.PG_MBBBOOKVISITDETAILSCashdepositcancel";
    private String  PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSCancelVisit = "onlineBanking.MBB.PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSCancelVisit";
    private String  MBBReviewvisit_Issuingbankcheckdeposit2 = "onlineBanking.MBB.MBBReviewvisit_Issuingbankcheckdeposit2";

    public void verifyMBBScreen() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementIsPresent(HISTORY);
        verify.elementIsPresent(UPCOMING);
        verify.elementIsPresent(SelectBranch2);
        verify.elementIsPresent(BOOKVISIT);
        verify.elementIsPresent(TODAY);
    }

    public void clickSelectBranch() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(SelectBranch2);
    }

    public void clickSearchIcon() throws Throwable {
        click.elementBy(SearchIcon);
        Wait.forSeconds(2000);
    }

    public void verifyMessgae_TodaySection() throws Throwable {
        verify.elementTextContains(BranchTODAYmessage,"No visits found.");
        verify.elementTextContains(BranchUPCOMINGmessage,"No upcoming visits found.");
      //  verify.elementTextContains(BranchHISTORYmessage,"No visits found.");
    }

    public void verifyViewMoreBtn() throws Throwable {
        verify.IfElementNotExists(UpcomingViewMore);
        verify.IfElementNotExists(HistoryViewMore);
    }

    public void searchBranch(String branchName) throws Throwable {
        type.data(VisitdetailsBranchSearch,branchName);
        clickSearchIcon();
        Wait.forSeconds(2000);
        click.elementBy(VisitdetailsBranchSearchResult1);
        Wait.forSeconds(2000);
    }

    public void verify_BranchAddress(String branchAddress) throws Throwable {
        Wait.forSeconds(2000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,4000)");
        //jse.executeScript("arguments[0].scrollIntoView();",BranchAddress );
        Wait.forSeconds(2000);
        verify.elementIsPresent(BranchAddress);
    }

    public void selectDate(String Data) throws Throwable {
        click.elementBy(SelectDate);
        Wait.forSeconds(2000);
        try {
           String Data1 =Data.trim();
            //String[] DataSplit = TestAttributes.Data.split("\\|\\|");
            //System.out.println(TestAttributes.Data);
            //String DataSplittemp=DataSplit[1].replace("[","").trim();
            //DataSplittemp=DataSplittemp.replace("]","").trim();
            //String[] DataSplit1=DataSplittemp.split(";;");

            String day= Data1;
            int items = driver.findElements(By.xpath("//td[not(contains(@class,'disabled'))]")).size();
            //int item1= TestAttributes.driver.findElements(By.xpath("//td[@class='ant-picker-cell ant-picker-cell-disabled ant-picker-cell-in-view']  ")).size();
            //int item2= TestAttributes.driver.findElements(By.xpath("//td[@class='ant-picker-cell ant-picker-cell-disabled'] ")).size();
            //int items=item1+item2;
            if (items<=4)
            {
              driver.findElement(By.xpath("//*[@class='ant-picker-header-next-btn']")).click();
            }
              driver.findElement(By.xpath("//td[not(contains(@class,'disabled'))]"+"["+day+"]")).click();
        Wait.forSeconds(2000);
        }
        catch(Exception e)	{
            log.info("Error while selecting the date");
        }

    }

    public void click_AddTransactionBtn() throws Throwable {
        Wait.forSeconds(2000);
        jsClick.elementBy(MOBILEBRANCHBANKINGBOOKVISITAddTransaction);
    }

    public void click_AddCashDepositBtn() throws Throwable {
        click.elementBy(PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAddCashDeposit);
    }

    public void enterAccNumber(String accNum) throws Throwable {
        type.data(PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber1,accNum);
    }

    public void enterAmt(String amount) throws Throwable {
        type.data(PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAmount1,amount);
    }

    public void verify_AccNumberValue(String accNum) throws Throwable {
        verify.ElementTextByAttribute(PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber1,accNum,"value");
    }

    public void verify_ReviewVisit_AmountValue(String amount) throws Throwable {
       Wait.forSeconds(1000);
        verify.elementTextContains(MBBReviewvisit_Amount,amount);
    }

    public void click_CancelVisitReview() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(CancelVisitReview);
    }

    public void verify_SelectBranch() throws Throwable {
        Wait.forSeconds(1000);
        verify.elementIsPresent(SelectBranch2);
    }

    public void verify_ReviewVisit_AccNumberValue(String accNum) throws Throwable {
        verify.elementTextContains(MBBReviewvisit_Accountnumber,accNum);
    }

    public void bookVisit_TodaysDate() throws Throwable {
        click.elementBy(SelectDate);
        Wait.forSeconds(1000);
        try{
        if(SelectdateTodaydate!=null)
        {
            click.elementBy(SelectdateTodaydate);
            requestPaymentPage.clickNextButton();
            click.elementBy(MOBILEBRANCHBANKINGBOOKVISITAddTransaction);
            click.elementBy(PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAddCashDeposit);
            type.data(PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAccountNumber1,"029160078588");
            type.data(PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAmount1,"100");
            requestPaymentPage.clickNextButton();
            Wait.forSeconds(2000);
            click.elementBy(PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWBookVisit);
            Wait.forSeconds(2000);
            jsClick.elementBy(PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWGotoDashboard);
        }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void VerifyError_TodaysDate() throws Throwable {
        dashboardHomePage.clickMBBSection();
        click.elementBy(SelectBranch2);
        searchBranch("Vigan");
        click.elementBy(SelectDate);
        click.elementBy(SelectdateTodaydate);
        verify.elementTextContains(Hangon_Errormsg,"There is existing branch visit on");
        commonMethodsPage.clickNoBtn();
        commonMethodsPage.verifyAccNumErrMsg("An existing visit already exist on this date. Please select another date or edit the existing.");
    }

    public void selectTodaysDate() throws Throwable {
        click.elementBy(SelectDate);
        click.elementBy(SelectdateTodaydate);
    }

    public void editAmount() throws Throwable{
        click.elementBy(ReviewEdit);
        type.data(PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAmount1,"105");
        click.elementBy(PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWUpdateVisit);

    }

    public void click_BookVisit() throws Throwable {
        click.elementBy(PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWBookVisit);
        verify.elementIsPresent(PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWThankYou);
        Wait.forSeconds(2000);
        click.elementBy(PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWGotoDashboard);
    }

    public void CancelTodaysVisit() throws Throwable {
        Wait.forSeconds(2000);
        dashboardHomePage.clickMBBSection();
        Wait.forSeconds(2000);
        click.elementBy(Clickcardformoredetails);
        Wait.forSeconds(2000);
        click.elementBy(CancelVisit);
        commonMethodsPage.clickYesBtn();
        Wait.forSeconds(2000);
    }

    public void editTodaysVisit() throws Throwable {
        dashboardHomePage.clickMBBSection();
        click.elementBy(SelectBranch2);
        searchBranch("Vigan");
        Wait.forSeconds(2000);
        click.elementBy(SelectDate);
        click.elementBy(SelectdateTodaydate);
        Wait.forSeconds(2000);
        verify.elementTextContains(Hangon_Errormsg,"There is existing branch visit on");
        commonMethodsPage.clickYesBtn();
        Wait.forSeconds(2000);
        requestPaymentPage.clickNextButton();
        type.data(PG_MOBILEBRANCHBANKINGBOOKVISITDETAILSAmount1,"100");
        requestPaymentPage.clickNextButton();
        click.elementBy(PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWUpdateVisit);
        Wait.forSeconds(2000);
        click.elementBy(PG_MOBILEBRANCHBANKINGBOOKVISITREVIEWGotoDashboard);
        dashboardHomePage.clickMBBSection();
    }
}

