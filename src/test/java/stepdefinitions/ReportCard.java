package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.ApplicationException;
import pages.ReportCardPage;

public class ReportCard {
    ReportCardPage reportCardPage=new ReportCardPage();

    @When("^I click the Playeveryday credit card listed in dashboard$")
    public void iClickThePlayeverydayCreditCardListedInDashboard() throws Throwable {
        reportCardPage.select_PlayeverydayCreditCard();
    }

    @And("^I Click on Manage card link$")
    public void iClickOnManageCardLink() throws Throwable {
        reportCardPage.clickManageCard();
    }

    @Then("^I Verify user can able to view Report Card$")
    public void iVerifyUserCanAbleToViewReportCard() throws Throwable {
        reportCardPage.verifyReportCard();
    }

    @When("^I  user to click on Report Card$")
    public void iUserToClickOnReportCard() throws Throwable {
        reportCardPage.clickReportCard();
    }

    @Then("^I Verify whether application navigates to Let’s lock your card first popup\\.$")
    public void iVerifyWhetherApplicationNavigatesToLetSLockYourCardFirstPopup() throws Throwable {
        reportCardPage.verify_LockYourCallPopup();
    }

    @And("^I Verify the popup buttons \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iVerifyThePopupButtonsAnd(String arg0, String arg1) throws Throwable {
        reportCardPage.verify_PopupButtons(arg0,arg1);
    }

    @And("^I  click on LOCK MY CARD Button on the popup\\.$")
    public void iClickOnLOCKMYCARDButtonOnThePopup() throws Throwable {
        reportCardPage.clickLockMyCard();
    }

    @Then("^I Verify whether success screen Your card is Locked is displayed upon locking card$")
    public void iVerifyWhetherSuccessScreenYourCardIsLockedIsDisplayedUponLockingCard() throws Throwable {
        reportCardPage.verify_LockedSuccessPage();
    }

    @And("^I Verify the popup buttons \"([^\"]*)\" and \"([^\"]*)\" in success screen$")
    public void iVerifyThePopupButtonsAndInSuccessScreen(String arg0, String arg1) throws Throwable {
        reportCardPage.verify_CardisLockedButtons(arg0,arg1);

    }

    @And("^I  click on GO BACK Button on the popup\\.$")
    public void iClickOnGOBACKButtonOnThePopup() throws Throwable {
        reportCardPage.clickGoBack();

    }

    @Then("^I Verify whether the card is able to view the unlocked card upon clicking GO BACK\\.$")
    public void iVerifyWhetherTheCardIsAbleToViewTheUnlockedCardUponClickingGOBACK() throws Throwable {
        reportCardPage.verify_CardisUnlocked();
    }

    @And("^I  click on MAYBE LATER Button on the popup\\.$")
    public void iClickOnMAYBELATERButtonOnThePopup() throws Throwable {
        reportCardPage.clickMaybeLater();
    }

    @Then("^I Verify whether the card is getting locked upon clicking MAYBE LATER\\.$")
    public void iVerifyWhetherTheCardIsGettingLockedUponClicking() throws Throwable {
        reportCardPage.verify_CardisLocked();
    }

    @And("^I  click on PROCEED TO CARD REPORTING Button on the popup\\.$")
    public void iClickOnPROCEEDTOCARDREPORTINGButtonOnThePopup() throws Throwable {
        reportCardPage.clickProceedToCardReporting();
    }

    @Then("^I Verify whether the user is able to navigate to card Replacement Details Page\\.$")
    public void iVerifyWhetherTheUserIsAbleToNavigateToCardReplacementDetailsPage() throws Throwable {
        reportCardPage.verify_CardReplacementDetailsHeader();

    }

    @And("^I Verify whether the user is able to view the Card replacement details screen$")
    public void iVerifyWhetherTheUserIsAbleToViewTheCardReplacementDetailsScreen() throws Throwable {
        reportCardPage.verify_ViewTheCardReplacement();
    }

    @Then("^I Verify whether the user is able to view the work address\\.$")
    public void iVerifyWhetherTheUserIsAbleToViewTheWorkAddress() throws Throwable {
        reportCardPage.verify_NoWorkAddressMessage();
    }

    @And("^User is able to click on the UPDATE ADDRESS button$")
    public void userIsAbleToClickOnTheUPDATEADDRESSButton() throws ApplicationException {
        reportCardPage.clickUpdateAddress();
    }

    @Then("^I Verify to view the details on Update address poup section$")
    public void iVerifyToViewTheDetailsOnUpdateAddressPoupSection() throws Throwable {
        reportCardPage.verify_UpdateAddressPopupsection();
    }

    @And("^I Verify whether the user is able to navigate to card replacement details page upon clicking GO BACK$")
    public void iVerifyWhetherTheUserIsAbleToNavigateToCardReplacementDetailsPageUponClickingGOBACK() throws Throwable {
        reportCardPage.verify_CardReplacementDetailsHeader();
    }

    @And("^I user is able to click on I NEED TO UPDATE MY ADDRESS button on the popup\\.$")
    public void iUserIsAbleToClickOnINEEDTOUPDATEMYADDRESSButtonOnThePopup() throws Throwable {
        reportCardPage.clickUpdateMyaddress();

    }

    @Then("^I Verify whether the user is able to navigate to the call popup details$")
    public void iVerifyWhetherTheUserIsAbleToNavigateToTheCallPopupDetails() throws Throwable {
        reportCardPage.verify_UpdateMyAddressPopupsection();
    }

    @And("^I user is able to click on  CONFIRM DELIVERY ADDRESS button$")
    public void iUserIsAbleToClickOnCONFIRMDELIVERYADDRESSButton() throws Throwable {
        reportCardPage.clickConfirmDeliveryaddress();
    }

    @Then("^I Verify whether user is able to navigate to Report CardPage$")
    public void iVerifyWhetherUserIsAbleToNavigateToPage() throws Throwable {
        reportCardPage.verify_ReportCardPage();

    }

    @And("^I user is able to view I lost my card and My card got stolen in Report Card page$")
    public void iUserIsAbleToViewILostMyCardAndMyCardGotStolenInReportCardPage() throws Throwable {
        reportCardPage.verify_ReportCardPageOptions();
    }

    @When("^I user is able to click on I lost my card$")
    public void iUserIsAbleToClickOn() throws Throwable {
        reportCardPage.clickLostMyCard();

    }

    @Then("^I Verify user is able to navigate to Report Lost Card details page and View Details\\.$")
    public void iVerifyUserIsAbleToNavigateToDetailsPageAndViewDetails() throws Throwable {
        reportCardPage.verify_ReportLostCardDetailsPage();

    }

    @And("^I Verify the user is able to input the details of location and date & time$")
    public void iVerifyTheUserIsAbleToInputTheDetailsOfLocationAndDateTime() {
    }

    @And("^I Verify whether the Report My Lost CARD button is enabled$")
    public void iVerifyWhetherTheButtonIsEnabled() throws Throwable {

    }

    @When("^I user navigate to Card replacement confirmation screen clicking on REPORT MY LOST CARD button\\.$")
    public void iUserNavigateToCardReplacementConfirmationScreenClickingOnButton() throws Throwable {

    }

    @Then("^I user is able to view Card Replacement Confirmation section$")
    public void iUserIsAbleToViewCardReplacementConfirmationSection() {
    }

    @And("^I Click on Work Address section$")
    public void iClickOnWorkAddressSection() throws ApplicationException {
        reportCardPage.clickWorkAddress();

    }
}
