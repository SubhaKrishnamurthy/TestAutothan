# Author: Subha
# Functionality: Login page validation
# Jira ID: ?
# Jira URL: ?

@ManageRecipient @Regression
Feature: Manage Recipients functionalities Validation

  #TS078
  @MR01
  Scenario: Validation of adding new recipient screen- Manage Receipent
    Given I'm on login page of UB online banking application
    When I click on Send/Request link in dashboard
    And I click the manage recipient link
    And I click the Add recipient button
    Then I select bank name and enter details and Save
    And I delete the recipient
    And I logout of UB online banking application

  #TS079
  @MR02
  Scenario: Validation of   account name field in  Add recipient page
    Given I'm on login page of UB online banking application
    When I click on Send/Request link in dashboard
    And I click the manage recipient link
    And I click the Add recipient button
    Then I enter accountName less than 4 digits and verify Error message
    And I delete the recipient
    And I logout of UB online banking application

    #TS080
    @MR03
    Scenario: Validation of   account number field in  Add recipient page
      Given I'm on login page of UB online banking application
      When I click on Send/Request link in dashboard
      And I click the manage recipient link
      And I click the Add recipient button
      Then I enter accountNumber less than 12 digits and verify Error message
      And I delete the recipient
      And I logout of UB online banking application

      #TS081
  @MR04
  Scenario: Validation of adding new favourite recipient successfully
    Given I'm on login page of UB online banking application
    When I click on Send/Request link in dashboard
    And I click the manage recipient link
    And I click the Add recipient button
    Then I select bank name and enter details and Save as favorite
    And I delete the recipient
    And I logout of UB online banking application

  #TS083
  @MR05
  Scenario: Validation of entering  account name field for Update recipient
    Given I'm on login page of UB online banking application
    When I click on Send/Request link in dashboard
    And I click the manage recipient link
    And I search for the recipient "testts"
    Then I edit the account name
    And I logout of UB online banking application

    #TS084
  @MR06
  Scenario: Validation of entering  account number field for Update recipient
    Given I'm on login page of UB online banking application
    When I click on Send/Request link in dashboard
    And I click the manage recipient link
    And I search for the recipient "testts"
    Then I edit the account number
    And I logout of UB online banking application

    #TS086
  @MR07
    Scenario: Validation of changing the normal recipient to favourite recipient in edit recipient screen
    Given I'm on login page of UB online banking application
    When I click on Send/Request link in dashboard
    And I click the manage recipient link
    And I search for the recipient "testautomation3"
    Then I save the recipient as favorite and update
    And I search for the recipient "testautomation3"
    Then I save the recipient back to un favorite and update
    And I logout of UB online banking application

    #TS088
  @MR08
    Scenario: Validation of display of all favourite recipients under favourite tab
    Given I'm on login page of UB online banking application
    When I click on Send/Request link in dashboard
    And I click the manage recipient link
    And I click on the favorite tab
    And I search and verify for the recipient "Sundar_fav"
    And I search and verify for the recipient "Jinnew"
    And I search and verify for the recipient "Namjoon"
    And I logout of UB online banking application

    #TS087
    @MR09
    Scenario: Validation of deleting the existing recipient
      Given I'm on login page of UB online banking application
      When I click on Send/Request link in dashboard
      And I click the manage recipient link
      And I click on the existing recipient
      Then I delete the existing recipient
      And I logout of UB online banking application

      #TS085
    @MR10
     Scenario: Validation of updating existing normal recipient and favourite successfully
      Given I'm on login page of UB online banking application
      When I click on Send/Request link in dashboard
      And I click the manage recipient link
      And I click the Add recipient button
      Then I select bank name and enter details and Save as favorite
      And I search for the recipient, change accountNumber1 and update
      And I search for the recipient, change accountNumber2 and update
      And I search for the recipient, change accountNumber3 and update
      Then I delete the recent recipient
