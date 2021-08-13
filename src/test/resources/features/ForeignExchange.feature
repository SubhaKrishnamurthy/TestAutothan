# Author: Subha
# Functionality: FX validation
# Jira ID: ?
# Jira URL: ?

@FX @Regression
Feature: Foreign Exchange functionality Validation

  #TCN003
@FX01
Scenario: Validate that the error message is displayed when the user has no USD and PHP accounts enrolled.
  Given I'm on login page of UB online banking application with user "subbu1"
  When I click on Foreign Exchange button in dashboard
  Then I verify Add Account and Cancel buttons by clicking BUYUSD button
  Then I verify Add Account and Cancel buttons by clicking SELLUSD button

  #TCN004
  @FX02
  Scenario: Validate that the error message is displayed when the source accounts fund is insufficient using BUY USD flow
    Given I'm on login page of UB online banking application
    When I click on Foreign Exchange button in dashboard
    And I click BUYUSD button, select account and enter USD amount "10,000,000"
    Then I verify the amount exceeds error message

    #TCN005
  @FX03
  Scenario: Validate that the error message is displayed when the source accounts fund is insufficient using SELL USD flow
    Given I'm on login page of UB online banking application
    When I click on Foreign Exchange button in dashboard
    And I click SELLUSD button, select account and enter USD amount "10,000,000"
    Then I verify the amount exceeds error message

    #TCN006
  @FX04
  Scenario: Validate that the daily transaction limit exceeded error message is displayed for Buy USD transaction if the daily transaction limit is exceeded.
    Given I'm on login page of UB online banking application
    When I click on Foreign Exchange button in dashboard
    And I click BUYUSD button, select account and enter USD amount "200001"
    Then I verify the amount exceeds error message

