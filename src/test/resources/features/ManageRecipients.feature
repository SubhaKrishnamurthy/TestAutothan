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
    Then I select bank name as "UCPB" and enter details and Save
    And I delete the recipient
    And I logout of UB online banking application
