package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreditLimitIncreasePage;

public class CreditLimitIncrease {

    CreditLimitIncreasePage CreditLimitIncreasePage =new CreditLimitIncreasePage();

    @When("^user click on the  Credit card account$")
    public void userClickOnTheCreditCardAccount() throws Throwable {
        CreditLimitIncreasePage.click_CreditCardAccount();
    }
    @And("^click the Request Increase button for Credit Card$")
    public void clickTheRequestIncreaseButtonForCreditCard() throws Throwable {
        CreditLimitIncreasePage.click_RequestIncrease();
    }
    @Then("^I Verify the Application display the Pop Message$")
    public void iVerifyTheApplicationDisplayThePopMessage() throws Throwable {
        CreditLimitIncreasePage.Verify_RIPopupMessage();
    }
    @And("^I Click on GotIt button$")
    public void iClickOnGotItButton() throws Throwable {
        CreditLimitIncreasePage.click_GotIt();
    }
    @And("^Check Application allow to enter \\(or\\) Slide less than the Current Limit$")
    public void checkApplicationAllowToEnterOrSlideLessThanTheCurrentLimit() throws Throwable {
        CreditLimitIncreasePage.click_Slider();
    }

    @And("^Check Application allow to enter the amount entered is above maximum allowed$")
    public void checkApplicationAllowToEnterTheAmountEnteredIsAboveMaximumAllowed() {
        
    }

    @And("^Check Application allow to enter the amount is not in increments of (\\d+)s$")
    public void checkApplicationAllowToEnterTheAmountIsNotInIncrementsOfS(int arg0) {
    }

}
