package pages;

import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;

public class GoalsPage extends Keywords {

    private String Goalstarget_amount ="onlineBanking.MyGoals.Goalstarget_amount";
    private String date = "onlineBanking.MyGoals.date";
    private String Edit_page_withdrawFunds ="onlineBanking.MyGoals.Edit_page_withdrawFunds";
    private String CardNumber ="onlineBanking.MyGoals.CardNumber";
    private String Popup_Maybelater ="onlineBanking.MyGoals.Popup_Maybelater";
    private String Savingsaccount3 ="onlineBanking.MyGoals.Savingsaccount3";
    private String WithdrawAmount_input ="onlineBanking.MyGoals.WithdrawAmount_input";
    private String Edit_page_header_RecentActivity ="onlineBanking.MyGoals.Edit_page_header_RecentActivity";
    private String Review_Termsandconditions ="onlineBanking.MyGoals.Review_Termsandconditions";
    private String Popup_OkTransferphp ="onlineBanking.MyGoals.Popup_OkTransferphp";
    private String MyGoalsname_error ="onlineBanking.MyGoals.MyGoalsname_error";
    private String Pausegoal_GoalsSuccessfullyresumed ="onlineBanking.MyGoals.Pausegoal_GoalsSuccessfullyresumed";
    private String Savingsaccount2 ="onlineBanking.MyGoals.Savingsaccount2";
    private String Withdrawandclosegoal ="onlineBanking.MyGoals.Withdrawandclosegoal";
    private String Fitness ="onlineBanking.MyGoals.Fitness";
    private String PauseGoal ="onlineBanking.MyGoals.PauseGoal";
    private String Edit_page_header_pausegoal ="onlineBanking.MyGoals.Edit_page_header_pausegoal";
    private String Next ="onlineBanking.MyGoals.Next";
    private String Targetamount_Edit ="onlineBanking.MyGoals.Targetamount_Edit";
    private String ResumeGoal ="onlineBanking.MyGoals.ResumeGoal";
    private String Goalstarget_amount_minus ="onlineBanking.MyGoals.Goalstarget_amount_minus";
    private String Edit_page_header_Manage ="onlineBanking.MyGoals.Edit_page_header_Manage";
    private String OK ="onlineBanking.MyGoals.OK";
    private String Details_Edit ="onlineBanking.MyGoals.Details_Edit";
    private String Review_Startsaving ="onlineBanking.MyGoals.Review_Startsaving";
    private String EmergencyFunds ="onlineBanking.MyGoals.EmergencyFunds";
    private String Goalstopup ="onlineBanking.MyGoals.Goalstopup";
    private String Edit_target_amount_minus ="onlineBanking.MyGoals.Edit_target_amount_minus";
    private String Travel ="onlineBanking.MyGoals.Travel";
    private String Topup_review_amount ="onlineBanking.MyGoals.Topup_review_amount";
    private String Goalname ="onlineBanking.MyGoals.Goalname";
    private String Dashboard_Add ="onlineBanking.MyGoals.Dashboard_Add";
    private String GoalReviewAndEdit_FromAccount_Edit ="onlineBanking.MyGoals.GoalReviewAndEdit_FromAccount_Edit";
    private String GoalReviewandEdit_AmounttoSave_Edit ="onlineBanking.MyGoals.GoalReviewAndEdit_AmounttoSave_Edit";
    private String Manage ="onlineBanking.MyGoals.Manage";
    private String Gadget ="onlineBanking.MyGoals.Gadget";
    private String Savingsaccount4 ="onlineBanking.MyGoals.Savingsaccount4";
    private String Savingsaccount5 ="onlineBanking.MyGoals.Savingsaccount5";
    private String Topup_review_topup ="onlineBanking.MyGoals.Topup_review_topup";
    private String Successful ="onlineBanking.MyGoals.Successful";
    private String Buisness ="onlineBanking.MyGoals.Buisness";
    private String topup_goal_header ="onlineBanking.MyGoals.topup_goal_header";
    private String Topupamount_input ="onlineBanking.MyGoals.Topupamount_input";
    private String Goalhasended ="onlineBanking.MyGoals.Goalhasended";
    private String MyGoals_Car ="onlineBanking.MyGoals.MyGoals_Car";
    private String Pausegoal_submit ="onlineBanking.MyGoals.Pausegoal_submit";
    private String USDAccount ="onlineBanking.MyGoals.USDAccount";
    private String installmentamount ="onlineBanking.MyGoals.installmentamount";
    private String Review_Cancel ="onlineBanking.MyGoals.Review_Cancel";
    private String Frequency_Weekly ="onlineBanking.MyGoals.Frequency_Weekly";
    private String selectthisgoal ="onlineBanking.MyGoals.selectthisgoal";
    private String Topup_100php ="onlineBanking.MyGoals.Topup_100php";
    private String Tommorowsdate ="onlineBanking.MyGoals.Tommorowsdate";
    private String Todaysdate ="onlineBanking.MyGoals.Todaysdate";
    private String Review_targetamountedit ="onlineBanking.MyGoals.Review_targetamountedit";
    private String Edit_target_amount_Save ="onlineBanking.MyGoals.Edit_target_amount_Save";
    private String installmentamount_minus ="onlineBanking.MyGoals.installmentamount_minus";
    private String Gotodashboard ="onlineBanking.MyGoals.Gotodashboard";
    private String installmentamount_plus ="onlineBanking.MyGoals.installmentamount_plus";
    private String Topup_errormessage ="onlineBanking.MyGoals.Topup_errormessage";
    private String Frequency_Quarterly ="onlineBanking.MyGoals.Frequency_Quarterly";
    private String House ="onlineBanking.MyGoals.House";
    private String resumegoal_resumed ="onlineBanking.MyGoals.resumegoal_resumed";
    private String Education ="onlineBanking.MyGoals.Education";
    private String Frequency_Monthly ="onlineBanking.MyGoals.Frequency_Monthly";
    private String topup_success_message ="onlineBanking.MyGoals.topup_success_message";
    private String header ="onlineBanking.MyGoals.header";
    private String testgoalstopup ="onlineBanking.MyGoals.testgoalstopup";
    private String Reviewpage_header ="onlineBanking.MyGoals.Reviewpage_header";
    private String WithdrawPHP ="onlineBanking.MyGoals.WithdrawPHP";
    private String selectfromaccount ="onlineBanking.MyGoals.selectfromaccount";
    private String Maybelater ="onlineBanking.MyGoals.Maybelater";
    private String SuccessfullyEdited ="onlineBanking.MyGoals.SuccessfullyEdited";
    private String MyGoals_Family ="onlineBanking.MyGoals.MyGoals_Family";
    private String Errormessage_MinimumtopupamountisPHP100 ="onlineBanking.MyGoals.Errormessage_MinimumtopupamountisPHP100";
    private String Todaysdatevalue ="onlineBanking.MyGoals.Todaysdatevalue";
    private String Shopping ="onlineBanking.MyGoals.Shopping";
    private String Savingsaccount1 ="onlineBanking.MyGoals.Savingsaccount1";
    private String resumegoal_submit ="onlineBanking.MyGoals.resumegoal_submit";
    private String Edit_page_header_Details ="onlineBanking.MyGoals.Edit_page_header_Details";
    private String RestandRelaxation ="onlineBanking.MyGoals.RestandRelaxation";
    private String WebLbl_Goals_MyGoals_Investment ="onlineBanking.MyGoals.WebLbl_Goals_MyGoals_Investment";
    private String Goalstarget_amount_plus ="onlineBanking.MyGoals.Goalstarget_amount_plus";
    private String Edit_target_amount_plus ="onlineBanking.MyGoals.Edit_target_amount_plus";
    private String Topup_reviewEdit ="onlineBanking.MyGoals.Topup_reviewEdit";
    private String GoalsManageBtn = "onlineBanking.Goals.ManageBtn";
    //Goals-Review Page
    private String ReviewGoalsName = "onlineBanking.MyGoalsReview.Goalsname";
    private String Review_Save = "onlineBanking.MyGoalsReview.Save";
    private String Review_Goalsamount = "onlineBanking.MyGoalsReview.Goalsamount";
    private String Review_GoalsAccountName = "onlineBanking.MyGoalsReview.Goalsfromaccountname";
    private String Review_GoalsAccNumber = "onlineBanking.MyGoalsReview.Goalsfromaccountnumber";
    private String YesBtn = "onlineBanking.MyGoals.YesBtn";
    //Goals Dashboard
    private String Goals = "onlineBanking.GoalsDashboard.Goals";
    private String Goals_Existing = "onlineBanking.GoalsDashboard.Existing";
    private String Goals_Existing2 = "onlineBanking.GoalsDashboard.Existing2";

    public void verifyGoalsLbl() throws Throwable {
        Wait.forSeconds(5000);
        verify.elementIsPresent(Goals);
    }

    public void clickManageBtn() throws Throwable {
        Wait.forSeconds(5000);
        verify.IfElementExists(GoalsManageBtn);
        click.elementBy(GoalsManageBtn);
    }

    public void clickAddBtn() throws Throwable {
        Wait.forSeconds(4000);
        click.elementBy(Dashboard_Add);
    }

    public void verifyHeader() throws Throwable {
        verify.elementIsPresent(header);
    }

    public void clickSelectGoalBtn() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        Wait.forSeconds(2000);
        WebElement otherEle = driver.findElement(By.cssSelector("div:nth-child(13) > div > svg"));
        otherEle.click();
        jsClick.elementBy(selectthisgoal);
    }

    public void enterGoalName(String name) throws Throwable {
        Wait.forSeconds(2000);
        type.data(Goalname,name);
    }

    public void verifyNextBtnEnabled() throws Throwable {
        verify.elementIsEnabled(Next);
    }

    public void verifyNextBtnDisabled() throws Throwable {
        verify.elementIsDisabled(Next);
    }

    public void clickNextBtn() throws Throwable {
        Wait.forSeconds(1000);
        jsClick.elementBy(Next);
    }

    public void verifyGoalNameErr(String error) throws Throwable {
        verify.elementTextMatching(MyGoalsname_error,error);
    }

    public void verifyGoalsAmt(String amt) throws Throwable {
        verify.ElementTextByAttribute(installmentamount,amt,"value");
    }

    public void clickPlusIcon() throws Throwable{
     Wait.forSeconds(2000);
      click.elementBy(installmentamount_plus);
    }

    public void clickMinusIcon() throws Throwable {
       Wait.forSeconds(2000);
        click.elementBy(installmentamount_minus);
    }

    public void clickFreq_weekly() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(Frequency_Weekly);
    }

    public void clickFreq_Monthly() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(Frequency_Monthly);
    }

    public void clickFreq_Quarterly() throws Throwable {
        Wait.forSeconds(1000);
        click.elementBy(Frequency_Quarterly);
    }

    public void clickTomorrowDate() throws Throwable {
        if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
        {
            Wait.forSeconds(2000);
            get.elementBy(date).click();
            click.elementBy(Tommorowsdate);
        }
        else {
            Wait.forSeconds(1000);
            click.elementBy(date);
            click.elementBy(Tommorowsdate);
        }
    }

    public void selectAccount_GoalsSection() throws Throwable {
        click.elementBy(selectfromaccount);
    }

    public void verifySavingAccNumbers() throws Throwable {
        verify.elementIsPresent(Savingsaccount1);
        verify.elementIsPresent(Savingsaccount2);
    }

    public void selectSavingAccount() throws Throwable {
        click.elementBy(Savingsaccount1);
    }

    public void selectSavingAccount2() throws Throwable {
        click.elementBy(Savingsaccount2);
    }

    public void clickMaybeLaterBtn() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementIsPresent(Maybelater);
        click.elementBy(Maybelater);
    }

    public void verifyReviewPageHeader() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementIsPresent(Reviewpage_header);
    }

    public void clickReview_CancelBtn() throws Throwable {
        click.elementBy(Review_Cancel);
    }

    public void clickDepositPHPBtn() throws Throwable {
        click.elementBy(Popup_OkTransferphp);
    }

    public void verifyGoalName(String goalName) throws Throwable {
        verify.elementTextMatching(ReviewGoalsName,goalName);
    }

    public void editGoalName(String name) throws Throwable {
        click.elementBy(Targetamount_Edit);
        type.data(Goalname,name);
        click.elementBy(Review_Save);
    }

    public void editGoalAmount() throws Throwable {
        Wait.forSeconds(2000);
        jsClick.elementBy(Review_targetamountedit);
        Wait.forSeconds(2000);
        click.elementBy(Edit_target_amount_minus);
        click.elementBy(Edit_target_amount_Save);
    }

    public void editGoalAccount() throws Throwable {
        click.elementBy(GoalReviewAndEdit_FromAccount_Edit);
        click.elementBy(selectfromaccount);
        Wait.forSeconds(1000);
        click.elementBy(Savingsaccount1);
    }

    public void verifyGoalsAmt_ReviewPage(String amount) throws Throwable {
        Wait.forSeconds(2000);
        verify.elementTextContains(Review_Goalsamount,amount);
    }

    public void verifyGoalsAccName_GoalsAccNumber(String accName,String accNumber) throws Throwable {
        Wait.forSeconds(2000);
        if (Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac")) {
            verify.elementTextMatching_MacSafari(Review_GoalsAccountName, accName);
            verify.elementTextMatching_MacSafari(Review_GoalsAccNumber, accNumber);
        }
        else {
            verify.elementTextMatching(Review_GoalsAccountName, accName);
            verify.elementTextMatching(Review_GoalsAccNumber, accNumber);
        }
    }

    public void selectExistingGoal() throws Throwable {
        verify.elementIsPresent(Goals_Existing2);
        click.elementBy(Goals_Existing2);
    }

    public void selectExistingGoal_Test() throws Throwable {
        verify.elementIsPresent(Goals_Existing);
        click.elementBy(Goals_Existing);
    }

    public void clickTopUpBtn() throws Throwable {
        verify.elementIsPresent(Goalstopup);
        click.elementBy(Goalstopup);
    }

    public void click100PHPElement() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementIsPresent(Topup_100php);
        if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
        {
            get.elementBy(Topup_100php).click();
        }
        else {
            click.elementBy(Topup_100php);
        }
    }

    public void enterTopupAmount(String amount) throws Throwable{
        type.data(Topupamount_input,amount);
        Wait.forSeconds(2000);
    }

    public void verifyErrorMsg_TopUpAmt() throws Throwable {
        verify.elementIsPresent(Topup_errormessage);
    }

    public void verifyTopUpAmt(String amount) throws Throwable {
        verify.elementTextContains(Topup_review_amount,amount);
    }

    public void clickTopUbReviewEditBtn() throws Throwable {
        click.elementBy(Topup_reviewEdit);
    }

    public void clickTopUpSubmitBtn() throws Throwable {
        click.elementBy(Topup_review_topup);
    }

    public void clickGoalsOkBtn() throws Throwable {
        Wait.forSeconds(5000);
        jsClick.elementBy(OK);
        Wait.forSeconds(3000);
    }

    public void pauseGoal() throws Throwable
    {
        try {
            if (PauseGoal != null)
            {
                click.elementBy(PauseGoal);
                click.elementBy(Pausegoal_submit);
                verify.elementIsPresent(Pausegoal_GoalsSuccessfullyresumed);
                clickGoalsOkBtn();
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void resumeGoal() throws Throwable {
       try{
        if(ResumeGoal!=null)
        {
            click.elementBy(ResumeGoal);
            click.elementBy(Next);
            click.elementBy(resumegoal_submit);
            verify.elementIsPresent(resumegoal_resumed);
            clickGoalsOkBtn();
        }
       }
       catch (Throwable throwable) {
           throwable.printStackTrace();
       }
    }

    public void clickStartSavingBtn() throws Throwable {
       click.elementBy(Review_Termsandconditions);
        click.elementBy(Review_Startsaving);
    }

    public void verifyGoalSuccessMsg() throws Throwable{
        verify.elementIsPresent(Successful);
    }

    public void clickBackToDashboard() throws Throwable {
        click.elementBy(Gotodashboard);
    }

    public void withdrawGoal() throws Throwable {
        click.elementBy(Edit_page_withdrawFunds);
        Wait.forSeconds(2000);
        type.data(WithdrawAmount_input,"500");
        click.elementBy(Next);
        click.elementBy(YesBtn);
        click.elementBy(Withdrawandclosegoal);
        Wait.forSeconds(6000);
    }

}
