# Author: Subha
# Functionality: FX validation
# Jira ID: ?
# Jira URL: ?

@Insurance @Regression
Feature: Insurance Functionality Validation

  #TC-INS-01
  @IN01
  Scenario: Validation of dashboard page for Insurance and market place page
    Given I'm on login page of UB online banking application
    When I am on the insurance page
    Then i verify the market place page

  #TC-INS-02
  @IN02
  Scenario: Validation of Inlife purchaed product from My Insurances
    Given I'm on login page of UB online banking application
    When I am on the insurance page
    Then I verify Inlife purchased product from My Insurances

  #TC-INS-03
  @IN03
  Scenario: Validation of accident product purchase
    Given I'm on login page of UB online banking application
    When I am on the insurance page
    And I cancel the previous accident insurance
    And I purchase the accident product
    Then I verify purchase successful title

  #TC-INS-04
  @IN04
  Scenario: Validation of in-app notification
    Given I'm on login page of UB online banking application
    When I click the transactions from Inbox
    Then I verify the details of successful purchased product





