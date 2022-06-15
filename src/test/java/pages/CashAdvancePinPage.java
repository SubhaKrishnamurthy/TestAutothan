package pages;

import actions.Wait;
import base.Keywords;

public class CashAdvancePinPage extends Keywords {

    private String SetCardAccount  = "onlineBanking.CashAdvancePin.SetCardAccount";
    private String ResetCardAccount  = "onlineBanking.CashAdvancePin.ResetCardAccount";
    private String SetCashAdvancePin  = "onlineBanking.CashAdvancePin.SetCashAdvancePin";
    private String SixDigitPin  = "onlineBanking.CashAdvancePin.SixDigitPin";
    private String SixDigitCreditPin  = "onlineBanking.CashAdvancePin.SixDigitCreditPin";
    private String ClearPin  = "onlineBanking.CashAdvancePin.ClearPin";
    private String ResetCashAdvancePin  = "onlineBanking.CashAdvancePin.ResetCashAdvancePin";

    public void click_CardAccount() throws Throwable {
        Wait.forSeconds(5000);
        click.elementBy(SetCardAccount);
    }
    public void click_ResetCardAccount() throws Throwable {
        Wait.forSeconds(5000);
        jsClick.elementBy(ResetCardAccount);
    }

    public void verifySetCashAdvancedPin(String PIN)throws Throwable {
        Wait.forSeconds(5000);
        verify.elementTextMatching(SetCashAdvancePin, PIN);
    }
    public void verifySixDigitPin(String SixDigit)throws Throwable {
        verify.elementTextMatching(SixDigitPin, SixDigit);
    }
    public void verifySixDigitCreditPin(String SixDigit)throws Throwable {
        verify.elementTextMatching(SixDigitCreditPin, SixDigit);
    }
    public void click_SetCardPin() throws Throwable {
        Wait.forSeconds(2000);
        click.elementBy(SetCashAdvancePin);
    }
    public void click_ResetCardPin() throws Throwable {
        Wait.forSeconds(2000);
        click.elementBy(ResetCashAdvancePin);
    }
    public void click_ClearPin() throws Throwable {
        verify.elementIsPresent(ClearPin);
        click.elementBy(ClearPin);
    }
    public void verifyResetCashAdvancedPin(String PIN)throws Throwable {
        Wait.forSeconds(10000);
        verify.elementTextMatching(ResetCashAdvancePin, PIN);
    }

}
