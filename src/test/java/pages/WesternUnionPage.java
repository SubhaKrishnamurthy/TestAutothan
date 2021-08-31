package pages;

import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WesternUnionPage extends Keywords {

    private String otherPartners ="onlineBanking.WesternUnion.otherPartners";
    private String WesternUnion ="onlineBanking.WesternUnion.WesternUnion";
    private String RecieveMoneyFromWU ="onlineBanking.WesternUnion.RecieveMoneyFromWU";
    private String InvalidAmount ="onlineBanking.WesternUnion.InvalidAmount";
    private String MTCNCode ="onlineBanking.WesternUnion.MTCNCode";
    private String Amount ="onlineBanking.WesternUnion.Amount";
    private String MTCNCodeLessthan10digitErrMsg ="onlineBanking.WesternUnion.MTCNCodeLessthan10digitErrMsg";
    private String InvalidMTCNCODEErrMsg ="onlineBanking.WesternUnion.InvalidMTCNCODEErrMsg";
    private String Purpose ="onlineBanking.WesternUnion.Purpose";
    private String RelationShip ="onlineBanking.WesternUnion.RelationShip";
    private String WUAccount ="onlineBanking.WesternUnion.WUAccount";
    private String MTCNAlreadyClaimedErrMsg ="onlineBanking.WesternUnion.MTCNAlreadyClaimedErrMsg";
    private String PurposeGift ="onlineBanking.WesternUnion.PurposeGift";
    private String GonzalesAccount ="onlineBanking.WesternUnion.GonzalesAccount";
    private String RelationShipFamily ="onlineBanking.WesternUnion.RelationShipFamily";
    private String getStartedBtn = "onlineBanking.WesternUnion.GetStartedBtn";
    private String OK ="onlineBanking.MyGoals.OK";
    Dashboard_Home_Page dashboardHomePage =  new Dashboard_Home_Page();
    GoalsPage goalsPage = new GoalsPage();
    CommonMethodsPage common = new CommonMethodsPage();

    public void clickWesternUnion() throws Throwable {
        dashboardHomePage.clickSendReceive();
        verify.IfElementExists(otherPartners);
        click.elementBy(otherPartners);
        /*
        if(verify.IfElementExistsboolean(OK)){
            click.elementBy(OK);
        }
         */
        Wait.forSeconds(8000);
        click.elementBy(getStartedBtn);
        Wait.forSeconds(8000);
        click.elementBy(WesternUnion);
        goalsPage.clickNextBtn();
    }

    public void verifyHeader() throws Throwable {
        verify.elementIsPresent(RecieveMoneyFromWU);
    }

    public void enterMTCNCode(String code) throws Throwable{
        type.data(MTCNCode,code);
    }

    public void verifyMTCNCode(String code) throws Throwable {
        Wait.forSeconds(2000);
        verify.ElementTextByAttribute(MTCNCode,code,"value");
    }

    public void verifyErrMsg_Lessthan10Digits() throws Throwable {
        verify.elementIsPresent(MTCNCodeLessthan10digitErrMsg);
    }

    public void enterMTCNAmt(String amt) throws Throwable {
        type.data(Amount,amt);
    }

    public void verifyInvalidAmtErrMsg() throws Throwable {
        verify.elementIsPresent(InvalidAmount);
    }

    public void verifyInvalidCodeErrMsg() throws Throwable {
        verify.elementIsPresent(InvalidMTCNCODEErrMsg);
    }

    public void enterOtherDetails_WU() throws Throwable {
        common.clickkeySelectAcc();
        click.elementBy(WUAccount);
        click.elementBy(Purpose);
        click.elementBy(PurposeGift);
        click.elementBy(RelationShip);
        verify.IfElementExists(RelationShipFamily);
        click.elementBy(RelationShipFamily);
    }

    public void verifyMTCNAlreadyClaimed() throws Throwable {
        verify.elementIsPresent(MTCNAlreadyClaimedErrMsg);
    }
}
