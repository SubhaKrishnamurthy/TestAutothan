# Author: Subha
# Functionality: FX validation
# Jira ID: ?
# Jira URL: ?

@MBB @Regression
Feature: Mobile Branch Banking Functionality Validation

  #TS281
  @MBB01
  Scenario: Validation MBB section in Dashboard and MBB screen
  Given I'm on login page of UB online banking application with user "Autoloan1"
  When I click visit branch from dashboard
  Then I Verfiy the Mobile branch banking screen
  And I logout of UB online banking application

   #TS282
  @MBB02
  Scenario: Validation of MBB screen on clicking MBB card from dashboard
    Given I'm on login page of UB online banking application
    When I click visit branch from dashboard
    Then I Verfiy the Mobile branch banking screen
    And I logout of UB online banking application

    #TS283
  @MBB03
 Scenario: Validation of Select branch screen and error message validation
    Given I'm on login page of UB online banking application with user "Autoloan1"
    When I click visit branch from dashboard
    When I click the select branch option
    And I click the search icon
    Then I verify the branch required error message as "Branch is required"

    #TS285
  @MBB04
 Scenario: Validation of sections in MBB screen when no current day visit,no upcoming visit and no history details
   Given I'm on login page of UB online banking application with user "Autoloan1"
   When I click visit branch from dashboard
   Then I Verify the message in the today section

    #TS302
  @MBB05
    Scenario: Validate View more  button is not displayed in upcoming and History section when visits in that section are less than 3
    Given I'm on login page of UB online banking application with user "Autoloan1"
    When I click visit branch from dashboard
    Then I verify no View more buttton in upcoming section and History section
