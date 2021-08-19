# Author: Subha
# Functionality: FX validation
# Jira ID: ?
# Jira URL: ?

@ChangePin @Regression
Feature: GreenPin-ChangePin Functionality Validation

  @CP01
  Scenario: Verify whether User is redirected to the page where user will enter PIN upon clicking 'Change Pin' option
    Given I'm on login page of UB online banking application with user "instapay2001" otp "222222"
    When user clicks an playeveryday card
    And Click on manage cards
    And Click on Change Pin
    Then User able to enter six digits as pin

  Scenario: Verify whether user is able  to submit my Change Pin request and user is able  to submit my Change Pin request
    Given I'm on login page of UB online banking application with user "instapay2001" otp "222222"
    When user clicks an playeveryday card
    And Click on manage cards
    And Click on Change Pin
    Then User able to enter six digits as pin
    And I click the next button
    Then User able to reenter six digits as pin
    And I Enter the OTP "222222" in OTP Page
    #Then Success screen should be displayed for the Change Pin

