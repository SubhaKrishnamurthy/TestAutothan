# Author: Subha
# Functionality:  Card Control validation
# Jira ID: ?
# Jira URL: ?

@CC @Regression @RegressionNew
Feature: Card Control Functionality Validation

  #Transaction control functionality got changed. hence removed 3 scenarios ( TS130, TS131 and TS126 )
  #TS130
  #@CC01
  #Scenario: Validation of navigating to account details screen on clicking back button from transaction control screen
   #Given I'm on login page of UB online banking application with user "vinithatest1" otp "222222"
   #When I Select the card number in the dashboard
   #And I Click the Transaction controls
   #And I Click Back button
   #Then I Verify the Goals section in the dashboard
   #And I Click the Logout Button

    #TS131
   #@CC02
  #Scenario: Validation of navigating to dashboard screen on clicking back button from account details screen
   #  Given I'm on login page of UB online banking application with user "vinithatest1" otp "222222"
   #When I Select the card number in the dashboard
    # And I Click the Transaction controls
     #And I Click Back button
     #Then I Verify the Goals section in the dashboard
     #And I Click the Logout Button

   #TS126
  #@CC04
    #Scenario: Validation of card control functionality in account details screen when the card is unlocked
    #Given I'm on login page of UB online banking application with user "creditcard002" otp "222222"
    #When I Select the card number in the dashboard
    #And Click on manage cards only
    #Then I verify the card status and validate the functions

  #TS129
  @CC03
  Scenario: Validation of card control functionality in Transaction control screen when the card is unlocked
    Given I'm on login page of UB online banking application with user "creditcard" otp "111111"
    When I Select the card number in the dashboard
    And Click on manage cards only
    Then I unlock the card if card id locked
