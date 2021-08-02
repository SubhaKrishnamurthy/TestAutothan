package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InsurancePage;
import pages.WesternUnionPage;

public class Insurance {

    InsurancePage insurancePage = new InsurancePage();


    @When("^I am on the insurance page$")
    public void i_am_on_the_insurance_page() throws Throwable {
        insurancePage.click_viewInsuranceBtn();
    }

    @Then("^i verify the market place page$")
    public void i_verify_the_market_place_page() throws Throwable {
        insurancePage.Verify_MarketPlacePage();
    }

    @Then("^I verify Inlife purchased product from My Insurances$")
    public void i_verify_Inlife_purchaed_product_from_My_Insurances() throws Throwable {
        insurancePage.verify_InlifePurchasedProduct();
    }


    @When("^I cancel the previous accident insurance$")
    public void i_cancel_the_previous_accident_insurance() throws Throwable {
        insurancePage.cancelPreviousAccident();
    }

    @When("^I purchase the accident product$")
    public void i_purchase_the_accident_product() throws Throwable {
        insurancePage.purchase_AccidentProduct();
    }

    @Then("^I verify purchase successful title$")
    public void i_verify_purchase_successful_title() throws Throwable {
        insurancePage.verify_PurchaseSuccessTitle();
    }


    @When("^I click the transactions from Inbox$")
    public void i_click_the_transactions_from_Inbox() throws Throwable {
       insurancePage.click_Transactions();
    }

    @Then("^I verify the details of successful purchased product$")
    public void i_verify_the_details_of_successful_purchased_product() throws Throwable {
        insurancePage.verify_Details_PurchasedProduct();
    }

}