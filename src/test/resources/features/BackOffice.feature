# Author: Subha
# Functionality: Backoffice validation
# Jira ID: ?
# Jira URL: ?

@BackOffice
Feature: Backoffice functionalities Validation

  @B01
  Scenario: TSB001_Validation of Manage clients tab for BRM user
    Given I am on login page of online banking backoffice application as SubhaBrm user
    When I click on the manage clients tab
    When I search for first name as "AZUCENA"
    Then I verify the list of users related to search
    When I search for last name as "DASMARINAS"
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










