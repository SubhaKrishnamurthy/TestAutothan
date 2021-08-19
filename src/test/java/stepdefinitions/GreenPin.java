package stepdefinitions;

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

    @And("^Click on manage cards$")
    public void Click_on_manage_cards() throws Throwable {
        greenPin.click_ManageCards();
        greenPin.click_CardImg();
    }

    @And("^Click on Change Pin$")
    public void Click_on_Change_Pin() throws Throwable {
        greenPin.click_ChangePin();
    }

    @Then("^User able to enter six digits as pin$")
    public void User_able_to_enter_six_digits_as_pin(String pin1,String pin2,String pin3,String pin4,String pin5,String pin6) throws Throwable {
        greenPin.enter_Pin(pin1,pin2,pin3,pin4,pin5,pin6);
    }

    @Then("^User able to reenter six digits as pin$")
    public void User_able_to_reenter_six_digits_as_pin() throws Throwable {
        //greenPin.reenter_Pin();
    }

}
