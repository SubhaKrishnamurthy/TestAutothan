# Author: Rajasekar
# Functionality: ReportCard validation
# Jira ID: ?
# Jira URL: ?

@Reportcard
Feature: ReportCard Functionality Validation

   #TCN_001
  @ReportCard01
  Scenario: Verify whether application allows the user to View Report Card
    Given I'm on login page of UB online banking application with user "reportcard4" otp "111111"
    When I click the Playeveryday credit card listed in dashboard
    And I Click on Manage card link
    Then I Verify user can able to view Report Card

   #TCN_002
  @ReportCard02
  Scenario: Validation of  clicking "'REPORT CARD" option
    Given I'm on login page of UB online banking application with user "reportcard4" otp "111111"
    When I click the Playeveryday credit card listed in dashboard
    And I Click on Manage card link
    Then I Verify user can able to view Report Card
    When I  user to click on Report Card
    #Then I Verify whether application navigates to Let’s lock your card first popup.
    And  I Verify the popup buttons "GO BACK" and "LOCK MY CARD"

   #TCN_003
  @ReportCard03
  Scenario: Validation of Clicking "Lock my card" option
    Given I'm on login page of UB online banking application with user "reportcard4" otp "111111"
    When I click the Playeveryday credit card listed in dashboard
    And  I Click on Manage card link
    Then I Verify user can able to view Report Card
    When I  user to click on Report Card
    And  I  click on LOCK MY CARD Button on the popup.
    Then I Verify whether success screen Your card is Locked is displayed upon locking card
    And  I Verify the popup buttons "MAYBE LATER" and "PROCEED TO CARD REPORTING" in success screen

   #TCN_004
  @ReportCard04
  Scenario: Validation of clicking "Go Back" option
    Given I'm on login page of UB online banking application with user "reportcard4" otp "111111"
    When I click the Playeveryday credit card listed in dashboard
    And  I Click on Manage card link
    Then I Verify user can able to view Report Card
    When I  user to click on Report Card
    And  I  click on GO BACK Button on the popup.
    Then I Verify whether the card is able to view the unlocked card upon clicking GO BACK.

 #TCN_005
  @ReportCard05
  Scenario: Validation of "MAYBE LATER" button on card locked Success screen
    Given I'm on login page of UB online banking application with user "reportcard4" otp "111111"
    When I click the Playeveryday credit card listed in dashboard
    And  I Click on Manage card link
    Then I Verify user can able to view Report Card
    When I  user to click on Report Card
    And  I  click on LOCK MY CARD Button on the popup.
    And  I  click on MAYBE LATER Button on the popup.
    Then I Verify whether the card is getting locked upon clicking MAYBE LATER.

   #TCN_006
  @ReportCard06
  Scenario: Validation of "PROCEED TO CARD REPORTING" button on card locked Success screen
    Given I'm on login page of UB online banking application with user "reportcard4" otp "111111"
    When I click the Playeveryday credit card listed in dashboard
    And  I Click on Manage card link
    Then I Verify user can able to view Report Card
    When I  user to click on Report Card
    And  I  click on LOCK MY CARD Button on the popup.
    And  I  click on PROCEED TO CARD REPORTING Button on the popup.
    And  I Enter the OTP "111111" in OTP Page
    Then I Verify whether the user is able to navigate to card Replacement Details Page.
    And I Verify whether the user is able to view the Card replacement details screen

   #TCN_007
  @ReportCard07
  Scenario: Validation of "Work address" functionality
    Given I'm on login page of UB online banking application with user "reportcard4" otp "111111"
    When I click the Playeveryday credit card listed in dashboard
    And  I Click on Manage card link
    Then I Verify user can able to view Report Card
    When I  user to click on Report Card
    And  I  click on LOCK MY CARD Button on the popup.
    And  I  click on PROCEED TO CARD REPORTING Button on the popup.
    And  I Enter the OTP "111111" in OTP Page
    And I Click on Work Address section
    Then I Verify whether the user is able to view the work address.

   #TCN_008
  @ReportCard08
  Scenario: Validation of "update Address button of Home Address/Work Adress"
    Given I'm on login page of UB online banking application with user "reportcard4" otp "111111"
    When I click the Playeveryday credit card listed in dashboard
    And  I Click on Manage card link
    Then I Verify user can able to view Report Card
    When I  user to click on Report Card
    And  I  click on LOCK MY CARD Button on the popup.
    And  I  click on PROCEED TO CARD REPORTING Button on the popup.
    And  I Enter the OTP "111111" in OTP Page
    And User is able to click on the UPDATE ADDRESS button
    Then I Verify to view the details on Update address poup section
    And I Verify whether the user is able to navigate to card replacement details page upon clicking GO BACK
    When User is able to click on the UPDATE ADDRESS button
    And  I user is able to click on I NEED TO UPDATE MY ADDRESS button on the popup.
    Then I Verify whether the user is able to navigate to the call popup details

   #TCN_009
  @ReportCard09
  Scenario: Validation of "CONFIRM DELIVERY ADDRESS" and Validation of "Report My Lost Card" button
    Given I'm on login page of UB online banking application with user "reportcard4" otp "111111"
    When I click the Playeveryday credit card listed in dashboard
    And  I Click on Manage card link
    Then I Verify user can able to view Report Card
    When I  user to click on Report Card
    And  I  click on LOCK MY CARD Button on the popup.
    And  I  click on PROCEED TO CARD REPORTING Button on the popup.
    And  I Enter the OTP "111111" in OTP Page
    When User is able to click on the UPDATE ADDRESS button
    Then I Verify to view the details on Update address poup section
    And I Verify whether the user is able to navigate to card replacement details page upon clicking GO BACK
    When User is able to click on the UPDATE ADDRESS button
    And I user is able to click on  CONFIRM DELIVERY ADDRESS button
    Then I Verify whether user is able to navigate to Report CardPage
    And  I user is able to view I lost my card and My card got stolen in Report Card page
    When I user is able to click on I lost my card
    Then I Verify user is able to navigate to Report Lost Card details page and View Details.
    And I Verify the user is able to input the details of location and date & time
    And I Verify whether the Report My Lost CARD button is enabled
    When I user navigate to Card replacement confirmation screen clicking on REPORT MY LOST CARD button.
    Then I user is able to view Card Replacement Confirmation section

