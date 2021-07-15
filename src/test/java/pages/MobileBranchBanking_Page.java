package pages;

import actions.Wait;
import base.Keywords;

public class MobileBranchBanking_Page extends Keywords {



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
        verify.elementTextContains(BranchHISTORYmessage,"No visits found.");
    }

    public void verifyViewMoreBtn() throws Throwable {
        verify.IfElementNotExists(UpcomingViewMore);
        verify.IfElementNotExists(HistoryViewMore);
    }
}
