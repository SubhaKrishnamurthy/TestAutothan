package stepdefinitions;

import actions.Wait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import pages.GreenPinPage;
import pages.WesternUnionPage;

public class GreenPin {

    GreenPinPage greenPin = new GreenPinPage();

    @When("^user clicks an playeveryday card$")
    public void user_clicks_an_playeveryday_card() throws Throwable {
        greenPin.click_PlayEveryDayCard();
    }

    @When("^user clicks an playeveryday card2$")
    public void user_clicks_an_playeveryday_card2() throws Throwable {
        greenPin.click_PlayEveryDayCard2();
    }

    @And("^Click on manage cards$")
    public void Click_on_manage_cards() throws Throwable {
        greenPin.click_ManageCards();
        greenPin.click_CardImg();
    }

    @And("^Click on Change Pin$")
    public void Click_on_Change_Pin() throws Throwable {
        greenPin.click_ChangePin();
    }

    @Then("^User able to enter six digits as (\\d+)(\\d+)(\\d+)(\\d+)(\\d+)(\\d+)$")
    public void User_able_to_enter_six_digits_as_pin(String pin1,String pin2,String pin3,String pin4,String pin5,String pin6) throws Throwable {
        greenPin.enter_Pin(pin1,pin2,pin3,pin4,pin5,pin6);
    }

    @Then("^User should be displayed with consecutive Numeric Values ErrMsg$")
    public void user_should_be_displayed_with_consecutive_Numeric_Values_ErrMsg() throws Throwable {
       greenPin.consecutiveErrMsg();
    }

    @Then("^I click greenPin next Button$")
    public void i_click_greenPin_next_Button() throws Throwable {
        greenPin.click_NextBtn();
    }

    @Then("^User should be displayed with same Pin ErrMsg$")
    public void user_should_be_displayed_with_same_Pin_ErrMsg() throws Throwable {
        greenPin.samePinErrMgs();
    }

    @Then("^User should be displayed with Pin Doesnt Match ErrMsg$")
    public void user_should_be_displayed_with_Pin_Doesnt_Match_ErrMsg() throws Throwable {
        greenPin.PinDoesntMatchErrMsg();
    }

    @And("^I click greenPin Confirm Button$")
    public void I_click_greenPin_Confirm_Button() throws Throwable {
        greenPin.click_confirmBtn();
    }

    @Then("^user verifies the correct Reminders$")
    public void user_verifies_the_correct_Reminders() throws Throwable {
        greenPin.verifyReminders();
    }


    @Then("^I verify greenPin Invalid OTP error message$")
    public void i_verify_greenPin_Invalid_OTP_error_message() throws Throwable {
     greenPin.verify_InvalidOTPErrMsg();
    }

    @And("^Click on Set Pin$")
    public void Click_on_Set_Pin() throws Throwable {
        greenPin.click_SetPin();
    }

    @Then("^I Enter the OTP Pin \"([^\"]*)\" in OTP Page$")
    public void i_Enter_the_OTP_Pin_in_OTP_Page(String OTP) throws Throwable {
        Wait.forSeconds(8000);
        char[] ch=OTP.toCharArray();
        greenPin.enter_OTPPin(String.valueOf(ch[0]),String.valueOf(ch[1]),String.valueOf(ch[2]),
                String.valueOf(ch[3]),String.valueOf(ch[4]),String.valueOf(ch[5]));
        Wait.forSeconds(3000);
    }

}
