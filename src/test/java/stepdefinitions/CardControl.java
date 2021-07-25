package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CardControl_Page;
import pages.WesternUnionPage;

public class CardControl {

    CardControl_Page ccPage = new CardControl_Page();

    @When("^I Select the card number in the dashboard$")
    public void i_Select_the_card_number_in_the_dashboard() throws Throwable {
        ccPage.selectCard();
    }

    @When("^I Click the Transaction controls$")
    public void i_Click_the_Transaction_controls() throws Throwable {
        ccPage.clickTransactionControls();
    }

    @Then("^I unlock the card if card id locked$")
    public void i_unlock_the_card_if_card_id_locked() throws Throwable {
        ccPage.unlockCard();
    }

    @Then("^I verify the card status and validate the functions$")
    public void i_verify_the_card_status_and_validate_the_functions() throws Throwable {
        ccPage.verifyCardStatus_ValidateFunctionality();
    }

}