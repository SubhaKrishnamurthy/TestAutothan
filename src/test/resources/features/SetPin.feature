# Author: Subha
# Functionality: GreenPin-ChangePin
# Jira ID: ?
# Jira URL: ?

@SetPin @RegressionNew
Feature: SetPin Validation

   ##Set Pin

  @SP01
  Scenario: Verify whether User is redirected to the page where he/she will enter PIN upon clicking 'Set Pin' option
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then User able to enter six digits as 2345543

  @SP02
  Scenario: Verify whether User want to re-enter his/her PIN so that correct PIN is entered
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then User able to enter six digits as 998875
    Then User able to enter six digits as 998875
    And I Verify the OTP Filed is page is displayed

  @SP03
  Scenario: Verify whether user receives an error prompt when users input the consecutive digits as PIN
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then User able to enter six digits as 123456
    Then User should be displayed with consecutive Numeric Values ErrMsg

  @SP04
  Scenario: Verify whether user receives an error prompt when users input the same digits as PIN
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then User able to enter six digits as 111111
    Then User should be displayed with same Pin ErrMsg

  @SP05
  Scenario: Verify whether user receives error message that inputted PIN doesn't match the previous PIN input
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then User able to enter six digits as 130495
    Then User able to enter six digits as 664805
    Then User should be displayed with Pin Doesnt Match ErrMsg

  @SP06
  Scenario: Verify whether user is  displayed with the correct reminders upon setting a pin
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then user verifies the correct Reminders
