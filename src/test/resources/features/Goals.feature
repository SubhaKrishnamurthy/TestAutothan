# Author: Subha
# Functionality: FX validation
# Jira ID: ?
# Jira URL: ?

@Goals @Regression
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






