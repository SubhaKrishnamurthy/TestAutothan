# Author: Rajasekar
# Functionality: Credit Limit Increase
# Jira ID: ?
# Jira URL: ?

@CLI @RegressionNew
Feature: Credit Limit Increase Request Validation

  ##Credit Limit Increase
  @CLI01
  Scenario: Validation of Credit Limit Increase request for  less than the Current Limit
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the  Credit card account
    And  click the Request Increase button for Credit Card
    Then I Verify the Application display the Pop Message
    When I Click on GotIt button
    And  Check Application allow to enter (or) Slide less than the Current Limit

  @CLI02
  Scenario: Validation of Credit Limit Increase request If amount entered is above maximum allowed
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the  Credit card account
    And  click the Request Increase button for Credit Card
    Then I Verify the Application display the Pop Message
    When I Click on GotIt button
    And I Enter the Amount "600000" in new credit limit
    And  Check Application allow to enter the amount entered is above maximum allowed

  @CLI03
  Scenario: Validation of Credit Limit Increase request  If amount is not in increments of 1000s
    Given I'm on login page of UB online banking application with user "capin01" otp "111111"
    When user click on the  Credit card account
    And  click the Request Increase button for Credit Card
    Then I Verify the Application display the Pop Message
    When I Click on GotIt button
    And I Enter the Amount "122222" in new credit limit
    And  Check Application allow to enter the amount is not in increments of 1000s




