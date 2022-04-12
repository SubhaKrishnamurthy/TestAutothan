# Author: Subha
# Functionality: GreenPin-ChangePin
# Jira ID: ?
# Jira URL: ?

@GreenPin
Feature: GreenPin - ChangePin and SetPin Functionality Validation

  ##Change Pin
  @CP01 @Regression
  Scenario: Verify whether User is redirected to the page where user will enter PIN upon clicking 'Change Pin' option
    Given I'm on login page of UB online banking application with user "debitcard" otp "111111"
    When user clicks an playeveryday card
    And Click on manage cards
    And Click on Change Pin
    Then User able to enter six digits as 2345543

    @CP02 @Regression
    Scenario: Verify whether user receives an error prompt when users input the consecutive digits as PIN
    Given I'm on login page of UB online banking application with user "debitcard" otp "111111"
    When user clicks an playeveryday card
    And Click on manage cards
    And Click on Change Pin
    Then User able to enter six digits as 123456
#    And I click greenPin next Button
#    Then User able to enter six digits as 123456
#    And I click greenPin next Button
    Then User should be displayed with consecutive Numeric Values ErrMsg

  @CP03 @Regression
  Scenario: Verify whether user receives an error prompt when users input the same digits as PIN
    Given I'm on login page of UB online banking application with user "debitcard" otp "111111"
    When user clicks an playeveryday card
    And Click on manage cards
    And Click on Change Pin
    Then User able to enter six digits as 136801
#    And I click greenPin next Button
    Then User able to enter six digits as 136801
#    And I click greenPin next Button
    Then User should be displayed with same Pin ErrMsg

   @CP04 @Regression
   Scenario: Verify whether user receives error message that inputted PIN doesn't match the previous PIN input
     Given I'm on login page of UB online banking application with user "debitcard" otp "111111"
     When user clicks an playeveryday card
     And Click on manage cards
     And Click on Change Pin
     Then User able to enter six digits as 130495
#     And I click greenPin next Button
     Then User able to enter six digits as 998875
#     And I click greenPin next Button
     Then User able to enter six digits as 664805
#     And I click greenPin Confirm Button
     Then User should be displayed with Pin Doesnt Match ErrMsg

    @CP05 @Regression
    Scenario: Verify whether user is  displayed with the correct reminders upon changing a pin
      Given I'm on login page of UB online banking application with user "debitcard" otp "111111"
      When user clicks an playeveryday card
      And Click on manage cards
      And Click on Change Pin
      Then user verifies the correct Reminders

    @CP06 @Regression
    Scenario: Verify whether user is displayed with the error prompt when users input invalid otp
      Given I'm on login page of UB online banking application with user "debitcard" otp "111111"
      When user clicks an playeveryday card
      And Click on manage cards
      And Click on Change Pin
      Then User able to enter six digits as 130495
#      And I click greenPin next Button
      Then User able to enter six digits as 998875
#      And I click greenPin next Button
      Then User able to enter six digits as 998875
#      And I click greenPin Confirm Button
      And I Enter the OTP Pin "445509" in OTP Page
      #And I click the Submit Button
      Then I verify greenPin Invalid OTP error message

     ##Set Pin

    @SP07 @Regression
   Scenario: Verify whether User is redirected to the page where he/she will enter PIN upon clicking 'Set Pin' option
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then User able to enter six digits as 2345543
#
  @SP08 @Regression
  Scenario: Verify whether User want to re-enter his/her PIN so that correct PIN is entered
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then User able to enter six digits as 999999
    And I click greenPin next Button
    Then User able to enter six digits as 998875
    And I click greenPin next Button
    Then User able to enter six digits as 998875
    And I click greenPin Confirm Button
    And I Verify the OTP Filed is page is displayed

  @SP09 @Regression
  Scenario: Verify whether user receives an error prompt when users input the consecutive digits as PIN
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then User able to enter six digits as 123456
    And I click greenPin next Button
    Then User able to enter six digits as 123456
    And I click greenPin next Button
    Then User should be displayed with consecutive Numeric Values ErrMsg

  @SP10 @Regression
  Scenario: Verify whether user receives an error prompt when users input the same digits as PIN
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then User able to enter six digits as 111111
    And I click greenPin next Button
    Then User able to enter six digits as 111111
    And I click greenPin next Button
    Then User should be displayed with same Pin ErrMsg

  @SP11 @Regression
  Scenario: Verify whether user receives error message that inputted PIN doesn't match the previous PIN input
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then User able to enter six digits as 130495
    And I click greenPin next Button
    Then User able to enter six digits as 664805
    And I click greenPin next Button
    Then User able to enter six digits as 675432
    And I click greenPin Confirm Button
    Then User should be displayed with Pin Doesnt Match ErrMsg

  @SP12 @Regression
  Scenario: Verify whether user is  displayed with the correct reminders upon setting a pin
    Given I'm on login page of UB online banking application with user "useraccount" otp "111111"
    When user clicks an playeveryday card2
    And Click on manage cards2
    And Click on Set Pin
    Then user verifies the correct Reminders
