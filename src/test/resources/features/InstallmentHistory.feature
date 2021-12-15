# Author: Subha
# Functionality: InstallmentHistory validation
# Jira ID: ?
# Jira URL: ?

@InstallmentHistory
Feature: Installment History Functionality Validation

  @IH01
Scenario: Validation of viewing installment history when user has installments
  Given I'm on login page of UB online banking application with user "krelotatest" otp "222222"
  When user selects credit card2 listed in dashboard
  Then user able to verify icons and other details of the screen
  When user clicks installment history icon
  Then Application should navigate to installment history screen
  When user selects any transaction listed under installment history
  Then Application should navigate to installment details screen
  And user verifies application displays required details under installment details

@IH02
Scenario: Validation of viewing installment history when user has no installments
  Given I'm on login page of UB online banking application with user "krelotatest" otp "222222"
  When user selects credit card1 listed in dashboard
  When user clicks installment history icon
  Then Verify application displays "You currently do not have any installments" under installment history


@IH03
Scenario: Validation of installment history transactions, upcoming due date reminder section, broken-down payment schedules
  Given I'm on login page of UB online banking application with user "krelotatest" otp "222222"
  When user selects credit card2 listed in dashboard
  When user clicks installment history icon
  Then Application should navigate to installment history screen
  When user selects any transaction listed under installment history
  Then Application should navigate to installment details screen
  Then user verifies installment history and due date reminder and broken down payment schedules

@IH04
Scenario: Validation of view statement
  Given I'm on login page of UB online banking application with user "krelotatest" otp "222222"
  When user selects credit card2 listed in dashboard
  And user click to view statement icon
  And user to select month and year
  Then Verify application displays all the details under view statement
  When user to click DOWNLOAD STATEMENT in View Statement
  And user to click DOWNLOAD PDF
  Then Verify Application is display Download status message
  And Verify Application is display success screen message
  And I click the OK button

  @IH05
  Scenario: Validation Download Statement
    Given I'm on login page of UB online banking application with user "krelotatest" otp "222222"
    When user selects credit card2 listed in dashboard
    And user to click DOWNLOAD STATEMENT
    And user to select month and year
     And user to click DOWNLOAD PDF
    Then Verify Application is display Download status message
    And Verify Application is display success screen message
    And I click the OK button




