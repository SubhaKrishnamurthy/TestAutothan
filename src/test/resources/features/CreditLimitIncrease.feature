# Author: Rajasekar
# Functionality: Credit Limit Increase
# Jira ID: ?
# Jira URL: ?

@CLI
Feature: Credit Limit Increase Request -  Functionality Validation

  ##Credit Limit Increase
  @CLI01 @Regression
  Scenario: Validation of Credit Limit Increase request for  less than the Current Limit
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the  Credit card account
    And  click the Request Increase button for Credit Card
    Then I Verify the Application display the Pop Message
    And I Click on GotIt button
    And  Check Application allow to enter (or) Slide less than the Current Limit

  @CLI02 @Regression
  Scenario: Validation of Credit Limit Increase request If amount entered is above maximum allowed
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the  Credit card account
    And  click the Request Increase button for Credit Card
    Then I Verify the Application display the Pop Message
    And I Click on GotIt button
    And  Check Application allow to enter the amount entered is above maximum allowed

  @CLI03 @Regression
  Scenario: Validation of Credit Limit Increase request  If amount is not in increments of 1000s
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the  Credit card account
    And  click the Request Increase button for Credit Card
    Then I Verify the Application display the Pop Message
    And I Click on GotIt button
    And  Check Application allow to enter the amount is not in increments of 1000s




