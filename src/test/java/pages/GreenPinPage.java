package pages;

import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;
import org.openqa.selenium.JavascriptExecutor;

public class GreenPinPage extends Keywords {

    private String PlayEverDayCard = "onlineBanking.GreenPin.PlayEverDayCard";
    private String PlayEverDayCard2 = "onlineBanking.GreenPin.PlayEverDayCard2";
    private String ManageCards = "onlineBanking.GreenPin.ManageCards";
    private String PlayEveryDayCardImg = "onlineBanking.GreenPin.PlayEveryDayCardImg";
    private String ChangePin ="onlineBanking.GreenPin.ChangePin";
    private String Pin1 = "onlineBanking.GreenPin.Pin1";
    private String Pin2 = "onlineBanking.GreenPin.Pin2";
    private String Pin3 = "onlineBanking.GreenPin.Pin3";
    private String Pin4 =  "onlineBanking.GreenPin.Pin4";
    private String Pin5 =  "onlineBanking.GreenPin.Pin5";
    private String Pin6 =  "onlineBanking.GreenPin.Pin6";
    private String OTPPin1 = "onlineBanking.GreenPin.OTPPin1";
    private String OTPPin2 = "onlineBanking.GreenPin.OTPPin2";
    private String OTPPin3 = "onlineBanking.GreenPin.OTPPin3";
    private String OTPPin4 = "onlineBanking.GreenPin.OTPPin4";
    private String OTPPin5 = "onlineBanking.GreenPin.OTPPin5";
    private String OTPPin6 = "onlineBanking.GreenPin.OTPPin6";
    private String consecutiveNumericValuesErrMsg = "onlineBanking.GreenPin.consecutiveNumericValuesErrMsg";
    private String SamePinErrMsg = "onlineBanking.GreenPin.SamePinErrMsg";
    private String doesntMatchPreviousPINInput = "onlineBanking.GreenPin.doesntMatchPreviousPINInput";
    private String ReminderText = "onlineBanking.GreenPin.ReminderText";
    private String ReminderTitle = "onlineBanking.GreenPin.ReminderTitle";
    private String InvalidOTPErr = "onlineBanking.GreenPin.InvalidOTPErr";
    private String OkayBtn = "onlineBanking.GreenPin.OkayBtn";
    private String NextBtn = "onlineBanking.GreenPin.NextBtn";
    private String ConfirmBtn= "onlineBanking.GreenPin.ConfirmBtn";
    private String SetPin = "onlineBanking.GreenPin.SetPin";
    private String AccountsNextslide  = "onlineBanking.CC.AccountsNextslide";

    public void click_PlayEveryDayCard() throws Throwable {
        Wait.forSeconds(6000);
       // jsClick.elementBy(AccountsNextslide);
        jsClick.elementBy(PlayEverDayCard);
    }
    public void click_PlayEveryDayCard2() throws Throwable {
        verify.elementIsPresent(PlayEverDayCard2);
        jsClick.elementBy(AccountsNextslide);
        jsClick.elementBy(AccountsNextslide);
        jsClick.elementBy(PlayEverDayCard2);
    }
    public void click_ManageCards() throws Throwable {
       Wait.forSeconds(8000);
        click.elementBy(ManageCards);
    }

    public void click_CardImg() throws Throwable {
        Wait.forSeconds(8000);
        jsClick.elementBy(PlayEveryDayCardImg);
    }

    public void click_ChangePin() throws Throwable {
       Wait.forSeconds(2000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        Wait.forSeconds(2000);
        jsClick.elementBy(ChangePin);
    }

    public void enter_Pin(String pin1,String pin2,String pin3,String pin4,String pin5,String pin6) throws Throwable {
        type.data(Pin1,pin1);
        type.data(Pin2,pin2);
        type.data(Pin3,pin3);
        type.data(Pin4,pin4);
        type.data(Pin5,pin5);
        type.data(Pin6,pin6);
        Wait.forSeconds(5000);
    }

    public void enter_OTPPin(String pin1,String pin2,String pin3,String pin4,String pin5,String pin6) throws Throwable {
        type.data(OTPPin1,pin1);
        type.data(OTPPin2,pin2);
        type.data(OTPPin3,pin3);
        type.data(OTPPin4,pin4);
        type.data(OTPPin5,pin5);
        type.data(OTPPin6,pin6);
        Wait.forSeconds(5000);
    }

    public void consecutiveErrMsg() throws Throwable {
        verify.elementIsPresent(consecutiveNumericValuesErrMsg);
    }

    public void click_NextBtn() throws Throwable {
        jsClick.elementBy(NextBtn);
    }

    public void samePinErrMgs() throws Throwable {
        verify.elementIsPresent(SamePinErrMsg);
    }

    public void PinDoesntMatchErrMsg() throws Throwable {
        verify.elementIsPresent(doesntMatchPreviousPINInput);
    }

    public void click_confirmBtn() throws Throwable {
        click.elementBy(ConfirmBtn);
        Wait.forSeconds(5000);
    }

    public void verifyReminders() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementIsPresent(ReminderTitle);
        verify.elementIsPresent(ReminderText);
    }

    public void verify_InvalidOTPErrMsg() throws Throwable {
        Wait.forSeconds(2000);
        verify.elementIsPresent(InvalidOTPErr);
        click.elementBy(OkayBtn);
    }

    public void click_SetPin() throws Throwable {
        Wait.forSeconds(2000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        Wait.forSeconds(2000);
        jsClick.elementBy(SetPin);
    }
}
