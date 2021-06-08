# Author: Subha
# Functionality: Login page validation
# Jira ID: ?
# Jira URL: ?

@ManageRecipient @Regression
Feature: Manage Recipients functionalities Validation

  #TS078
  @MR1
  Scenario: Validation of adding new recipient screen- Manage Receipent
    Given I'm on login page of UB online banking application
    When I click on Send/Request link in dashboard
    And I click the manage recipient link
    And I click the Add recipient button
    And I select bank name as "UCBP"
    And I enter account name,number and click save button
    And I delete the recipient
    And I logout of UB online banking application
