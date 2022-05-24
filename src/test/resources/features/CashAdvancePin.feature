# Author: Rajasekar
# Functionality: Cash Advance Pin
# Jira ID: ?
# Jira URL: ?

@CAPin
Feature: Cash Advance Pin - Set Cash Advance Pin and Reset Cash Advance Pin Functionality Validation

  ##Set Cash Advance Pin
  @CA01 @Regression
  Scenario: Verify whether application displays "Set Cash Advance Pin" option
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts
    And I Click on Manage card link
    Then I Verify whether application displays "Set Cash Advance Pin" option

  @CA02 @Regression
  Scenario: Verify whether application allow user to clear the entered pin by clicking "CLEAR PIN" option
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts
    And I Click on Manage card link
    Then I Verify whether application displays "Set Cash Advance Pin" option
    And I Verify whether application displays the label descripton as "Use your 6-digit PIN to withdraw from the ATM"
    When I click on Set Cash Advance Pin option
    And User able to enter six digits as 130495
    Then Verify application allow user to clear the entered pin by clicking "CLEAR PIN" option

  @CA03 @Regression
  Scenario: Verify whether user receives error message that inputted PIN doesn't match the previous PIN input
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts
    And I Click on Manage card link
    Then I Verify whether application displays "Set Cash Advance Pin" option
    When I click on Set Cash Advance Pin option
    And User able to enter six digits as 130495
    And User able to enter six digits as 998875
    Then User should be displayed with Pin Doesnt Match ErrMsg

    @CA04 @Regression
    Scenario: Verify whether user receives an error prompt when users input the consecutive digits as PIN
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts
      And I Click on Manage card link
    Then I Verify whether application displays "Set Cash Advance Pin" option
    When I click on Set Cash Advance Pin option
    And User able to enter six digits as 123456
    Then User should be displayed with consecutive Numeric Values ErrMsg

  @CA05 @Regression
  Scenario: Verify whether user receives an error prompt when users input the same digits as PIN
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts
    And I Click on Manage card link
    Then I Verify whether application displays "Set Cash Advance Pin" option
    When I click on Set Cash Advance Pin option
    And User able to enter six digits as 111111
    And User able to enter six digits as 111111
    Then User should be displayed with same Pin ErrMsg

    @CA06 @Regression
    Scenario: Verify whether user is  displayed with the correct reminders upon changing a pin
      Given I'm on login page of UB online banking application with user "capin01" otp "111111"
      When user click on the listed accounts
      And I Click on Manage card link
      Then I Verify whether application displays "Set Cash Advance Pin" option
      When I click on Set Cash Advance Pin option
      Then user verifies the correct Reminders

    @CA07 @Regression
    Scenario: Verify whether user is displayed with the error prompt when users input invalid otp
      Given I'm on login page of UB online banking application with user "capin01" otp "111111"
      When user click on the listed accounts
      And I Click on Manage card link
      Then I Verify whether application displays "Set Cash Advance Pin" option
      When I click on Set Cash Advance Pin option
      Then User able to enter six digits as 130495
      Then User able to enter six digits as 130495
      And I Enter the OTP Pin "445509" in OTP Page
      Then I verify greenPin Invalid OTP error message

     ##Reset Cash Advance Pin

  @RCA07 @Regression
  Scenario: Verify whether application displays "Reset Cash Advance Pin" option
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option


  @RCA08 @Regression
  Scenario: Verify whether application allow user to clear the entered pin by clicking "CLEAR PIN" option
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option
    And I Verify whether application displays the Reset cash label descripton as "Update your 6-digit Credit Card PIN"
    When I click on Reset Cash Advance Pin option
    And User able to enter six digits as 130495
    Then Verify application allow user to clear the entered pin by clicking "CLEAR PIN" option

  @RCA09 @Regression
  Scenario: Verify whether user receives error message that inputted PIN doesn't match the previous PIN input
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option
    When I click on Reset Cash Advance Pin option
    And User able to enter six digits as 130495
    And User able to enter six digits as 998875
    Then User should be displayed with Pin Doesnt Match ErrMsg

  @RCA10 @Regression
  Scenario: Verify whether user receives an error prompt when users input the consecutive digits as PIN
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option
    When I click on Reset Cash Advance Pin option
    And User able to enter six digits as 123456
    Then User should be displayed with consecutive Numeric Values ErrMsg

  @RCA11 @Regression
  Scenario: Verify whether user receives an error prompt when users input the same digits as PIN
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option
    When I click on Reset Cash Advance Pin option
    And User able to enter six digits as 111111
    And User able to enter six digits as 111111
    Then User should be displayed with same Pin ErrMsg


  @RCA12 @Regression
  Scenario: Verify whether user is  displayed with the correct reminders upon changing a pin
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option
    When I click on Reset Cash Advance Pin option
    Then user verifies the correct Reminders


