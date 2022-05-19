package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditLimitIncrease {
    @When("^user click on the  Credit card account$")
    public void userClickOnTheCreditCardAccount() {
        
    }

    @And("^click the Request Increase button for Credit Card$")
    public void clickTheRequestIncreaseButtonForCreditCard() {
        
    }

    @Then("^I Verify the Application display the Pop Message$")
    public void iVerifyTheApplicationDisplayThePopMessage() {
        
    }

    @And("^Check Application allow to enter \\(or\\) Slide less than the Current Limit$")
    public void checkApplicationAllowToEnterOrSlideLessThanTheCurrentLimit() {


    }

    @And("^Check Application allow to enter the amount entered is above maximum allowed$")
    public void checkApplicationAllowToEnterTheAmountEnteredIsAboveMaximumAllowed() {
        
    }

    @And("^Check Application allow to enter the amount is not in increments of (\\d+)s$")
    public void checkApplicationAllowToEnterTheAmountIsNotInIncrementsOfS(int arg0) {
    }
}
