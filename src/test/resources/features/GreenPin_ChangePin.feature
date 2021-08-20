# Author: Subha
# Functionality: FX validation
# Jira ID: ?
# Jira URL: ?

@ChangePin @Regression
Feature: GreenPin-ChangePin Functionality Validation

  @CP01
  Scenario: Verify whether User is redirected to the page where user will enter PIN upon clicking 'Change Pin' option
    Given I'm on login page of UB online banking application with user "wu0003" otp "111111"
    When user clicks an playeveryday card
    And Click on manage cards
    And Click on Change Pin
    Then User able to enter six digits as 2345543

    @CP02
    Scenario: Verify whether user receives an error prompt when users input the consecutive digits as PIN
    Given I'm on login page of UB online banking application with user "wu0003" otp "111111"
    When user clicks an playeveryday card
    And Click on manage cards
    And Click on Change Pin
    Then User able to enter six digits as 123456
    And I click greenPin next Button
    Then User able to enter six digits as 123456
    And I click greenPin next Button
    Then User should be displayed with consecutive Numeric Values ErrMsg

  @CP03
  Scenario: Verify whether user receives an error prompt when users input the same digits as PIN
    Given I'm on login page of UB online banking application with user "wu0003" otp "111111"
    When user clicks an playeveryday card
    And Click on manage cards
    And Click on Change Pin
    Then User able to enter six digits as 111111
    And I click greenPin next Button
    Then User able to enter six digits as 111111
    And I click greenPin next Button
    Then User should be displayed with same Pin ErrMsg

   @CP04
   Scenario: Verify whether user receives error message that inputted PIN doesn't match the previous PIN input
     Given I'm on login page of UB online banking application with user "wu0003" otp "111111"
     When user clicks an playeveryday card
     And Click on manage cards
     And Click on Change Pin
     Then User able to enter six digits as 130495
     And I click greenPin next Button
     Then User able to enter six digits as 998875
     And I click greenPin next Button
     Then User able to enter six digits as 664805
     And I click greenPin Confirm Button
     Then User should be displayed with Pin Doesnt Match ErrMsg

    @CP05
    Scenario: Verify whether user is  displayed with the correct reminders upon changing a pin
      Given I'm on login page of UB online banking application with user "wu0003" otp "111111"
      When user clicks an playeveryday card
      And Click on manage cards
      And Click on Change Pin
      Then user verifies the correct Reminders

    @CP06
    Scenario: Verify whether user is displayed with the error prompt when users input invalid otp
      Given I'm on login page of UB online banking application with user "wu0003" otp "111111"
      When user clicks an playeveryday card
      And Click on manage cards
      And Click on Change Pin
      Then User able to enter six digits as 130495
      And I click greenPin next Button
      Then User able to enter six digits as 998875
      And I click greenPin next Button
      Then User able to enter six digits as 998875
      And I click greenPin Confirm Button
      And I Enter the OTP "445509" in OTP Page
      And I click the Submit Button
      Then I verify greenPin Invalid OTP error message
