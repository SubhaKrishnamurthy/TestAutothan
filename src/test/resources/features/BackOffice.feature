# Author: Subha
# Functionality: Login page validation
# Jira ID: ?
# Jira URL: ?

@BackOffice @Regresion
Feature: Backoffice functionalities Validation

  @B01
  Scenario: TSB001_Validation of Manage clients tab for BRM user
    Given I am on login page of online banking backoffice application as SubhaBrm user
    When I click on the manage clients tab
    When I search for first name as "Subha1"
    Then I verify the list of users related to search
    When I search for last name as "Krish1"
    Then I verify the list of users related to search
    When I search for mobileNumber as "9177164171"
    Then I verify the list of users related to search
    When I search for emailID as "mamsar_das@yahoo.com"
    Then I verify the list of users related to search
    When I search for accountNumber as "101190027727"
    Then I verify the list of users related to search
    When I search for invalidAccountNumber as "123456789123"
    Then I verify no list of users
    Then I successfully logout by clicking the Logout Button

    @B02
    Scenario: TSBO02_Validation of Fund transfer logs for BRM user
      Given I am on login page of online banking backoffice application as SubhaBrm user
      When I click on the manage clients tab
      When I search for first name as "cbautotest1"
      Then I verify the list of users related to search
      When I click on the active user
      Then I click active account in customer information page
      #Then I verify view transfer logs and click one of the logs
      #Then I Verify and click the Email, SMS, Email and SMS buttons
      #Then I successfully logout by clicking the Logout Button
