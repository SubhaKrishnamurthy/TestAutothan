package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonMethodsPage;
import pages.Dashboard_Home_Page;
import pages.GoalsPage;
import pages.WesternUnionPage;

public class WesternUnion {

    WesternUnionPage westernUnionPage = new WesternUnionPage();

    @When("^I am on the western union page$")
    public void i_am_on_the_western_union_page() throws Throwable {
        westernUnionPage.clickWesternUnion();
    }

    @Then("^I verify the western union header$")
    public void i_verify_the_western_union_header() throws Throwable {
        westernUnionPage.verifyHeader();
    }


    @Then("^I enter mtcn code as \"([^\"]*)\"$")
    public void i_enter_mtcn_code_as(String arg1) throws Throwable {
        westernUnionPage.enterMTCNCode(arg1);
    }

    @Then("^I verify mtcn code as \"([^\"]*)\"$")
    public void i_verify_mtcn_code_as(String arg1) throws Throwable {
        westernUnionPage.verifyMTCNCode(arg1);
    }

    @Then("^I verify error message for entering less than (\\d+) digits$")
    public void i_verify_error_message_for_entering_less_than_digits(int arg1) throws Throwable {
        westernUnionPage.verifyErrMsg_Lessthan10Digits();
    }

    @Then("^I enter mtcn amount as \"([^\"]*)\"$")
    public void i_enter_mtcn_amount_as(String arg1) throws Throwable {
        westernUnionPage.enterMTCNAmt(arg1);
    }

    @Then("^I verify invalid amount error message$")
    public void i_verify_invalid_amount_error_message() throws Throwable {
        westernUnionPage.verifyInvalidAmtErrMsg();
    }


    @Then("^I enter the other details$")
    public void i_enter_the_other_details() throws Throwable {
        westernUnionPage.enterOtherDetails_WU();
    }

    @Then("^I verify invalid code error message$")
    public void i_verify_invalid_code_error_message() throws Throwable {
        westernUnionPage.verifyInvalidCodeErrMsg();
    }

    @Then("^I verify mtcn code already claimed error message$")
    public void i_verify_mtcn_code_already_claimed_error_message() throws Throwable {
        westernUnionPage.verifyMTCNAlreadyClaimed();
    }

}