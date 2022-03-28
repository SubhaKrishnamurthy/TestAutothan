# Author: Subha
# Functionality: Goals validation
# Jira ID: ?
# Jira URL: ?

@Goals @Regression @RegressionNew
Feature: Goals Functionality Validation

    #TS306
    @G01
    Scenario: Validate GOAL Button  in the dashboard
    Given I'm on login page of UB online banking application
    Then I Verify the Goals section in the dashboard
    Then I click Goals manage button
    When I Click the add button in goals section
    Then I Verify the goals add section page is displayed

   #TS307
    @G02
    Scenario: Validate set goal in goals section
        Given I'm on login page of UB online banking application
        Then I Verify from account number page should be displayed
        Then I Verify the Goals section in the dashboard
        Then I click Goals manage button
        When I Click the add button in goals section
        Then I Verify the goals add section page is displayed
        And I Check if user able to select goals type in the goals section and Click the select goal button
        When I Enter the below 30 characters in goal name as "Goal1Goal2Goal3Goal4Goal5"
        When I Enter the below 30 characters in goal name as "Goal1Goal2Goal3Goal4Goal5Goal6Goal7"
        Then I Verify next button is "disabled"
        And I Verify the goal name error as "Goal name must not exceed 30 characters in length"
        When I Enter the below 30 characters in goal name as "Goal1Goal2Goal3Goal4Goal5"
        Then I Verify next button is "enabled"
        Then I Verify the Goals amount as "5,000"
        When I Click the "plus" icon for increment goals amount
        Then I Verify the Goals amount as "5,500"
        When I Click the "minus" icon for increment goals amount
        Then I Verify the Goals amount as "5,000"

        #TS308
        @G03
        Scenario: Validate save frequency in goals section
            Given I'm on login page of UB online banking application
            Then I Verify from account number page should be displayed
            Then I Verify the Goals section in the dashboard
            Then I click Goals manage button
            When I Click the add button in goals section
            Then I Verify the goals add section page is displayed
            And I Check if user able to select goals type in the goals section and Click the select goal button
            When I Enter the below 30 characters in goal name as "Goal1Goal2Goal3Goal4Goal5"
            Then I Verify next button is "enabled"
            Then I Verify the Goals amount as "5,000"
            When I Click the "plus" icon for increment goals amount
            Then I Verify the Goals amount as "5,500"
            And I click the next button
            When I Click the frequency weekly in goals section
            When I Click the frequency monthly in goals section
            When I Click the frequency quarterly in goals section
            Then I Verify the Goals amount as "500"
            And I Click the tomorrows date in goals section
            And I Click the select account in the goals section
            Then I Verify the savings account numbers are displaying
            And I Select the savings account number displaying
            Then I Verify next button is "enabled"

 #TS309
    @G04
    Scenario: Validate KICKSTART popup screen
        Given I'm on login page of UB online banking application
        Then I Verify from account number page should be displayed
        Then I Verify the Goals section in the dashboard
        Then I click Goals manage button
        When I Click the add button in goals section
        Then I Verify the goals add section page is displayed
        And I Check if user able to select goals type in the goals section and Click the select goal button
        When I Enter the below 30 characters in goal name as "Goal1Goal2Goal3Goal4Goal5"
        Then I Verify next button is "enabled"
        Then I Verify the Goals amount as "5,000"
        When I Click the "plus" icon for increment goals amount
        Then I Verify the Goals amount as "5,500"
        And I click the next button
        When I Click the frequency weekly in goals section
        When I Click the frequency monthly in goals section
        When I Click the frequency quarterly in goals section
        Then I Verify the Goals amount as "500"
        And I Click the tomorrows date in goals section
        And I Click the select account in the goals section
        Then I Verify the savings account numbers are displaying
        And I Select the savings account number displaying
        Then I Verify next button is "enabled"
        And I click the next button
        Then I verify and click may be later button
        And I verify the review page header
        And I click the Goals review page cancel button
        And I click the Yes button
        Then I Verify from account number page should be displayed
        Then I Verify the Goals section in the dashboard
        Then I click Goals manage button
        When I Click the add button in goals section
        Then I Verify the goals add section page is displayed
        And I Check if user able to select goals type in the goals section and Click the select goal button
        When I Enter the below 30 characters in goal name as "Goal1Goal2Goal3Goal4Goal5"
        Then I Verify next button is "enabled"
        Then I Verify the Goals amount as "5,000"
        When I Click the "plus" icon for increment goals amount
        Then I Verify the Goals amount as "5,500"
        And I click the next button
        When I Click the frequency weekly in goals section
        When I Click the frequency monthly in goals section
        When I Click the frequency quarterly in goals section
        Then I Verify the Goals amount as "500"
        And I Click the tomorrows date in goals section
        And I Click the select account in the goals section
        Then I Verify the savings account numbers are displaying
        And I Select the savings account number displaying
        Then I Verify next button is "enabled"
        And I click the next button
        Then I verify and click may be later button
        And I verify the review page header

    #TS310
    @G05
    Scenario: Validate review and set goal screen
        Given I'm on login page of UB online banking application
        Then I Verify from account number page should be displayed
        Then I Verify the Goals section in the dashboard
        Then I click Goals manage button
        When I Click the add button in goals section
        Then I Verify the goals add section page is displayed
        And I Check if user able to select goals type in the goals section and Click the select goal button
        When I Enter the below 30 characters in goal name as "Goal1Goal2Goal3Goal4Goal5"
        Then I Verify next button is "enabled"
        Then I Verify the Goals amount as "5,000"
        When I Click the "plus" icon for increment goals amount
        Then I Verify the Goals amount as "5,500"
        And I click the next button
        When I Click the frequency weekly in goals section
        When I Click the frequency monthly in goals section
        When I Click the frequency quarterly in goals section
        Then I Verify the Goals amount as "500"
        And I Click the tomorrows date in goals section
        And I Click the select account in the goals section
        Then I Verify the savings account numbers are displaying
        And I Select the savings account number displaying
        Then I Verify next button is "enabled"
        And I click the next button
        And I click the Deposit PHP button
        And I verify the review page header

    #TS311
    @G06
    Scenario: Validate Edit goal name under review and set goal
        Given I'm on login page of UB online banking application
        Then I Verify from account number page should be displayed
        Then I Verify the Goals section in the dashboard
        Then I click Goals manage button
        When I Click the add button in goals section
        Then I Verify the goals add section page is displayed
        And I Check if user able to select goals type in the goals section and Click the select goal button
        When I Enter the below 30 characters in goal name as "GoalName"
        Then I Verify next button is "enabled"
        Then I Verify the Goals amount as "5,000"
        When I Click the "plus" icon for increment goals amount
        Then I Verify the Goals amount as "5,500"
        And I click the next button
        When I Click the frequency weekly in goals section
        When I Click the frequency monthly in goals section
        When I Click the frequency quarterly in goals section
        Then I Verify the Goals amount as "500"
        And I Click the tomorrows date in goals section
        And I Click the select account in the goals section
        Then I Verify the savings account numbers are displaying
        And I Select the savings account number displaying
        Then I Verify next button is "enabled"
        And I click the next button
        And I click the Deposit PHP button
        And I verify the review page header
        And I Verify the goal name as "GoalName"
        When I Edit the goal name as "GoalNameChange"
        Then I Verify the goal name as "GoalNameChange"


#TS312
    @G07
    Scenario: Validate Edit Target amount under review and set goal
        Given I'm on login page of UB online banking application
        Then I Verify from account number page should be displayed
        Then I Verify the Goals section in the dashboard
        Then I click Goals manage button
        When I Click the add button in goals section
        Then I Verify the goals add section page is displayed
        And I Check if user able to select goals type in the goals section and Click the select goal button
        When I Enter the below 30 characters in goal name as "GoalName"
        Then I Verify next button is "enabled"
        Then I Verify the Goals amount as "5,000"
        When I Click the "plus" icon for increment goals amount
        Then I Verify the Goals amount as "5,500"
        And I click the next button
        When I Click the frequency weekly in goals section
        When I Click the frequency monthly in goals section
        When I Click the frequency quarterly in goals section
        Then I Verify the Goals amount as "500"
        And I Click the tomorrows date in goals section
        And I Click the select account in the goals section
        Then I Verify the savings account numbers are displaying
        And I Select the savings account number displaying
        Then I Verify next button is "enabled"
        And I click the next button
        And I click the Deposit PHP button
        And I verify the review page header
        Then I Verify the review page Goals amount as "5,500"
        And I edit the goal amount
        Then I Verify the review page Goals amount as "5,000"

     #TS313
    @G08
    Scenario: Validate Edit From Account under review and set goal
        Given I'm on login page of UB online banking application
        Then I Verify from account number page should be displayed
        Then I Verify the Goals section in the dashboard
        Then I click Goals manage button
        When I Click the add button in goals section
        Then I Verify the goals add section page is displayed
        And I Check if user able to select goals type in the goals section and Click the select goal button
        When I Enter the below 30 characters in goal name as "GoalName"
        Then I Verify next button is "enabled"
        Then I Verify the Goals amount as "5,000"
        When I Click the "plus" icon for increment goals amount
        Then I Verify the Goals amount as "5,500"
        And I click the next button
        When I Click the frequency weekly in goals section
        When I Click the frequency monthly in goals section
        When I Click the frequency quarterly in goals section
        Then I Verify the Goals amount as "500"
        And I Click the tomorrows date in goals section
        And I Click the select account in the goals section
        Then I Verify the savings account numbers are displaying
        And I Select the savings account number2 displaying
        Then I Verify next button is "enabled"
        And I click the next button
        And I click the Deposit PHP button
        And I verify the review page header
        And I verify the Goals account name as "SALVE REGINA BAUTISTA" and account number as "**** **** 1756"
        And I edit the goal account
        And I verify the Goals account name as "CARIN ANGELICA MUNOZ BERINA" and account number as "**** **** 1750"

    #TS314
    @G09
    Scenario: Validate the top up goal
     Given I'm on login page of UB online banking application
     Then I Verify from account number page should be displayed
     Then I Verify the Goals section in the dashboard
     And I select the existing goal test
     And I click the top up button
     And I Click  the +100php element in the goals section
     When I Enter the top up amount as "20"
     Then I Verify the error message for topup amount
     When I Enter the top up amount as "200"
     Then I Verify next button is "enabled"

    #TS335
    @G10
    Scenario: Validate Edit Topup amount under review and  Top Up screen
        Given I'm on login page of UB online banking application
        Then I Verify from account number page should be displayed
        Then I Verify the Goals section in the dashboard
        And I select the existing goal test
        And I click the top up button
        And I Click  the +100php element in the goals section
        When I Enter the top up amount as "100"
        And I click the goals next button
        Then I verify the top up amount amount as "100"
        And I click the topup review edit button
        And I Click  the +100php element in the goals section
        When I Enter the top up amount as "100"
        And I click the goals next button
        And I Click the topup submit button in review page
        Then I click the goals ok button

     #TS336
    @G11
        Scenario: Validate Pause Goal in Goal details screen
        Given I'm on login page of UB online banking application
        Then I Verify from account number page should be displayed
        Then I Verify the Goals section in the dashboard
        And I select the existing goal test
        Then I pass goal and submit if pause goal button exists

     #TS337
    @G12
    Scenario: Validate Resume Goal in Goal details screen
        Given I'm on login page of UB online banking application
        Then I Verify from account number page should be displayed
        Then I Verify the Goals section in the dashboard
        And I select the existing goal test
        Then I resume goal and submit if resume goal button exists

    #TS338
    @G13
    Scenario: Validate not Achived Goal Withdrawal
        Given I'm on login page of UB online banking application
        Then I Verify from account number page should be displayed
        Then I Verify the Goals section in the dashboard
        Then I click Goals manage button
        When I Click the add button in goals section
        Then I Verify the goals add section page is displayed
        And I Check if user able to select goals type in the goals section and Click the select goal button
        When I Enter the below 30 characters in goal name as "GoalName"
        Then I Verify next button is "enabled"
        Then I Verify the Goals amount as "5,000"
        And I click the next button
        When I Click the frequency weekly in goals section
        When I Click the frequency monthly in goals section
        When I Click the frequency quarterly in goals section
        Then I Verify the Goals amount as "500"
        And I Click the tomorrows date in goals section
        And I Click the select account in the goals section
        Then I Verify the savings account numbers are displaying
        And I Select the savings account number2 displaying
        Then I Verify next button is "enabled"
        And I click the next button
        And I click the Deposit PHP button
        And I verify the review page header
        And I click start saving button
        Then I Verify the goal success message
        And I click the goals ok button
        And I select the existing goal
        And I withdraw the goal
        And I click the goals ok button
        #And I Click the Logout Button
