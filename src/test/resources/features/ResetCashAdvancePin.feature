# Author: Rajasekar
# Functionality: Cash Advance Pin
# Jira ID: ?
# Jira URL: ?

@RCAPin
Feature: ResetCashAdvancePin

 ##Reset Cash Advance Pin
  @RCA01
  Scenario: Verify whether application displays "Reset Cash Advance Pin" option
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option

  @RCA02
  Scenario: Verify whether application allow user to clear the entered pin by clicking "CLEAR PIN" option
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option
    And I Verify whether application displays the Reset cash label descripton as "Update your 6-digit Credit Card PIN"
    When I click on Reset Cash Advance Pin option
    And User able to enter six digits as 130495
    Then Verify application allow user to clear the entered pin by clicking "CLEAR PIN" option

  @RCA03
  Scenario: Verify whether user receives error message that inputted PIN doesn't match the previous PIN input
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option
    When I click on Reset Cash Advance Pin option
    And User able to enter six digits as 130495
    And User able to enter six digits as 998875
    Then User should be displayed with Pin Doesnt Match ErrMsg

  @RCA04
  Scenario: Verify whether user receives an error prompt when users input the consecutive digits as PIN
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option
    When I click on Reset Cash Advance Pin option
    And User able to enter six digits as 123456
    Then User should be displayed with consecutive Numeric Values ErrMsg

  @RCA05
  Scenario: Verify whether user receives an error prompt when users input the same digits as PIN
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option
    When I click on Reset Cash Advance Pin option
    And User able to enter six digits as 111111
    And User able to enter six digits as 111111
    Then User should be displayed with same Pin ErrMsg

  @RCA06
  Scenario: Verify whether user is  displayed with the correct reminders upon changing a pin
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the listed accounts from Reset
    And I Click on Manage card link
    Then I Verify whether application displayed "Reset Cash Advance Pin" option
    When I click on Reset Cash Advance Pin option
    Then user verifies the correct Reminders


