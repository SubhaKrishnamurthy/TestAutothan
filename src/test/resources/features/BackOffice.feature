# Author: Subha
# Functionality: Login page validation
# Jira ID: ?
# Jira URL: ?

@BackOffice @Regression
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
      Then I verify view transfer logs and click one of the logs
      Then I Verify and click the Email, SMS, Email and SMS buttons
      Then I successfully logout by clicking the Logout Button

      @B03
      Scenario:  TSBO03_Validation of Bills paid logs for BRM user
        Given I am on login page of online banking backoffice application as SubhaBrm user
        When I click on the manage clients tab
        When I search for first name as "cbautotest1"
        Then I verify the list of users related to search
        When I click on the active user
        Then I click active account in customer information page
        Then I verify Bills paid logs and click one of the logs
        Then I Verify and click the Email, SMS, Email and SMS buttons
        Then I successfully logout by clicking the Logout Button

    @B04
      Scenario: TSBO04_Validation of Load Purchase requests for BRM user
      Given I am on login page of online banking backoffice application as SubhaBrm user
      When I click on the manage clients tab
      When I search for first name as "cbautotest1"
      Then I verify the list of users related to search
      When I click on the active user
      Then I click active account in customer information page
      Then I verify load purchase logs and click one of the logs
      Then I Verify and click the Email, SMS, Email and SMS buttons
      Then I successfully logout by clicking the Logout Button

    @B05
      Scenario: TSBO05_Validation of Invalid Signup tab for BRM user
      Given I am on login page of online banking backoffice application as SubhaBrm user
      When I click on the manage Invalid SignUps tab
      And I select Add FAQ Type as "First Name"
      And I enter "test" in search text and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "Last Name"
      And I enter "test" in search text and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "Account Number"
      And I enter "109340000703" in search text and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "Mobile No"
      And I enter "639494082075" in search text and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "CIF"
      And I enter "R802017092" in search text and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "CIF Type"
      And I select CIF type as "Finacle" and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "CIF Type"
      And I select CIF type as "Card Pro" and click search button
      Then I verify Invalid signup search results

      @B06
      Scenario: TSBO06_Validation of searching client user in search bar by firstName,lastName,Mobile,Email,Account number for SSO user
        Given I am on login page of online banking backoffice application as SubhaBrm user
        When I click on the manage clients tab
        When I search for first name as "Subha1"
        Then I verify the list of users related to search
        When I search for first name as "Krish1"
        Then I verify the list of users related to search
        When I search for first name as "9177164171"
        Then I verify the list of users related to search
        When I search for first name as "mamsar_das@yahoo.com"
        Then I verify the list of users related to search
        When I search for first name as "101190027727"
        Then I verify the list of users related to search
        Then I successfully logout by clicking the Logout Button

    @B07
      Scenario: TSBO07_Validation of Edit profile for SSO user
      Given I am on login page of online banking backoffice application as Subha user
      When I click on the manage clients tab
      When I search for first name as "Subha2"
      When I click on the active user
      And I verify customer Information Title
      And I click on customer information Edit profile button
      And I edit customer last name as "Test"
      And I click the edit user ID update button
      And I enter edit reason as "Name change" and click on Save button
      Then I successfully logout by clicking the Logout Button
      Given I am on login page of online banking backoffice application as SubhaBrm user
      And I click manage profile changes for approval
      And I click users approve for "Subha2"
      And I enter approve reason as "Please Approve" and click confirm approve button
      Then I successfully logout by clicking the Logout Button
            #Repeat steps to edit profile back to original profile
      Given I am on login page of online banking backoffice application as Subha user
      When I click on the manage clients tab
      When I search for first name as "Subha2"
      When I click on the active user
      And I verify customer Information Title
      And I click on customer information Edit profile button
      And I edit customer last name as "Krish2"
      And I click the edit user ID update button
      And I enter edit reason as "Name change" and click on Save button
      Then I successfully logout by clicking the Logout Button
      Given I am on login page of online banking backoffice application as SubhaBrm user
      And I click manage profile changes for approval
      And I click users approve for "Subha2"
      And I enter approve reason as "Please Approve" and click confirm approve button
      Then I successfully logout by clicking the Logout Button

    @B08
    Scenario:  TSBO08_Validation of Edit User ID for SSO user
      Given I am on login page of online banking backoffice application as Subha user
      When I click on the manage clients tab
      When I search for first name as "Subha2"
      When I click on the active user
      And I verify customer Information Title
      And I click on customer information Edit UserID button
      And I edit userID as "automationtesting2nw"
      And I click the edit user ID update button
      And I enter edit reason as "testing" and click on Save button
      Then I successfully logout by clicking the Logout Button
      Given I am on login page of online banking backoffice application as SubhaBrm user
      And I click manage User ID changes for approval
      And I click users approve for User ID "Subha2"
      And I enter approve reason as "Please Approve" and click confirm approve button
      Then I successfully logout by clicking the Logout Button
      #Repeat steps to edit back to original ID
      Given I am on login page of online banking backoffice application as Subha user
      When I click on the manage clients tab
      When I search for first name as "Subha2"
      When I click on the active user
      And I verify customer Information Title
      And I click on customer information Edit UserID button
      And I edit userID as "automationtesting2"
      And I click the edit user ID update button
      And I enter edit reason as "testing" and click on Save button
      Then I successfully logout by clicking the Logout Button
      Given I am on login page of online banking backoffice application as SubhaBrm user
      And I click manage User ID changes for approval
      And I click users approve for User ID "Subha2"
      And I enter approve reason as "Please Approve" and click confirm approve button
      Then I successfully logout by clicking the Logout Button

      @B09
        Scenario:  TSBO09_Validation of Confirm approval for deactivation of user for SSO user
        Given I am on login page of online banking backoffice application as Subha user
        When I click on the manage clients tab
        When I search for first name as "Subha2"
        Then I verify the list of users related to search
        When I click on the active user
        And I verify customer Information Title
        And I click customer information Deactivate button
        And I enter deactivate reason as "Testing" and click confirm deactivate button
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as SubhaBrm user
        And I click manage profile changes for approval
        And I click users approve for "Subha2"
        And I enter approve reason as "Please Approve" and click confirm approve button
        Then I successfully logout by clicking the Logout Button
        #Repeat to activate
        Given I am on login page of online banking backoffice application as Subha user
        When I click on the manage clients tab
        When I search for first name as "Subha2"
        Then I verify the list of users related to search
        When I click on the active user
        And I verify customer Information Title
        And I click customer information activate button
        And I enter activate reason as "Testing" and click confirm activate button
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as SubhaBrm user
        And I click manage profile changes for approval
        And I click users approve for "Subha2"
        And I enter approve reason as "Please Approve" and click confirm approve button
        Then I successfully logout by clicking the Logout Button

  @B10
  Scenario: TSBO10_Validation of Confirm disapproval for deactivation of user for SSO user
    Given I am on login page of online banking backoffice application as Subha user
    When I click on the manage clients tab
    When I search for first name as "Subha2"
    Then I verify the list of users related to search
    When I click on the active user
    And I verify customer Information Title
    And I click customer information Deactivate button
    And I enter deactivate reason as "Testing" and click confirm deactivate button
    Then I successfully logout by clicking the Logout Button
    Given I am on login page of online banking backoffice application as SubhaBrm user
    And I click manage profile changes for approval
    And I click users dispprove for "Subha2"
    And I enter disapprove reason as "Please disApprove" and click confirm disapprove button
    Then I successfully logout by clicking the Logout Button
    #Repeat for confirmation
    Given I am on login page of online banking backoffice application as Subha user
    When I click on the manage clients tab
    When I search for first name as "Subha2"
    When I click on the active user
    And I verify customer Information Title
    And I verify customer information Deactivate button

  @B11
  Scenario: TSBO11_Validation of Confirm cancel for deactivation of same user for SSO user
    Given I am on login page of online banking backoffice application as Subha user
    When I click on the manage clients tab
    When I search for first name as "Subha2"
    Then I verify the list of users related to search
    When I click on the active user
    And I verify customer Information Title
    And I click customer information Deactivate button
    And I enter deactivate reason as "Testing" and click confirm deactivate button
    When I click on the accounts tab
    And I click manage profile changes for approval
    And I click users cancel for "Subha2"
    And I enter cancel reason as "PleaseApprove" and click confirm cancel button
    When I click on the manage clients tab
    When I search for first name as "Subha2"
    Then I verify the list of users related to search
    When I click on the active user
    And I verify customer Information Title
    And I verify customer information Deactivate button
    Then I successfully logout by clicking the Logout Button