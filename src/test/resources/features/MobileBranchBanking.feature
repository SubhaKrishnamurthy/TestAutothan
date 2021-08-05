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

  #TS284
  @MBB06
   Scenario: Validation of searching a branch from Select Branch screen and verify the branch address
    Given I'm on login page of UB online banking application with user "Autoloan1"
    When I click visit branch from dashboard
    And I click the select branch option
    And I search the branch as "Medical City"
    Then I verify the branch address as "G/F The Medical Arts Tower, Medical City Hospital,  1605 Ortigas Avenue Brgy. Rosario  PASIG"

    #TS290
    @MBB07
    Scenario: Validation of  Enter Account number  field in Book visit screen under Check Deposit and Cash Withdrawal and Cash Deposit sections in MBB
      Given I'm on login page of UB online banking application with user "Autoloan1"
      When I click visit branch from dashboard
      And I click the select branch option
      And I search the branch as "Vigan"
      And I select the date as "4"
      And I click the next button
      And I click add transaction button
      And I click add cash deposit button
      And I enter account number as "0291600"
      And I enter amount as "100"
      Then I Verify the Error message in the mobile number as "Invalid account number."
      And I enter account number as "232355454554"
      And I enter amount as "100"
      Then I verify no error message is displayed
      And I enter account number as "23235545455456780123"
      And I enter amount as "100"
      Then I verify account number value as "2323554545542323"

     #TS294
     @MBB08
    Scenario: Validation of error messages in Visit DETAILS screen in Mobile branch banking
       Given I'm on login page of UB online banking application with user "Autoloan1"
       When I click visit branch from dashboard
       And I click the select branch option
       And I search the branch as "Vigan"
       And I select the date as "4"
       And I click the next button
       And I click add transaction button
       And I click add cash deposit button
       And I enter account number as " "
       And I enter amount as " "
       Then I Verify the Error message in the mobile number as "Account number is required."
       And I enter account number as "029160078588"
       Then I Verify the Error message in the mobile number as "Amount is required."
       And I enter amount as "000000"
       And I enter account number as "029160078588"
       Then I Verify the Error message in the mobile number as "Invalid Amount."
       And I enter account number as "0291600"
       And I enter amount as "100000"
       Then I Verify the Error message in the mobile number as "Invalid account number."
       And I logout of UB online banking application

     #TS295
     @MBB09
    Scenario: Validation of cancelling the Visit from Review screen
       Given I'm on login page of UB online banking application with user "Autoloan1"
       When I click visit branch from dashboard
       And I click the select branch option
       And I search the branch as "Medical City"
       And I select the date as "3"
       And I click the next button
       And I click add transaction button
       And I click add cash deposit button
       And I enter account number as "029160078588"
       And I enter amount as "100"
       And I click the next button
       Then I verify review visit account number value as "0291 6007 8588"
       Then I verify review visit amount as "PHP 100.00"
       And I click the cancel visit review button
       And I click the Yes button
       Then I verify the select branch option is available

     #TS299
      @MBB10
      Scenario: Validation of error message in field when user tries to schedule a visit for current day
        Given I'm on login page of UB online banking application with user "Autoloan1"
        When I click visit branch from dashboard
        And I click the select branch option
        And I search the branch as "Medical City"
        Then I book visit if todays date is enabled
        And I verify error message after selecting todays date
        And I logout of UB online banking application

   #TS300
  @MBB11
    Scenario:  Validation of error message and completing the flow when user tries to schedule a visit for current day
    Given I'm on login page of UB online banking application with user "Accnumtest5"
    When I click visit branch from dashboard
    And I click the select branch option
    And I search the branch as "Medical City"
    Then I book visit if todays date is enabled
    And I edit the visit after selecting todays date
    And I logout of UB online banking application

    #TS303
    @MBB12
    Scenario: Validation of edit functionality in review page in MBB
      Given I'm on login page of UB online banking application with user "Autoloan1"
      When I click visit branch from dashboard
      And I click the select branch option
      And I search the branch as "The Ark - Insular Ayala"
      And I select todays date
      And I click the next button
      And I click add transaction button
      And I click add cash deposit button
      And I enter account number as "029160078588"
      And I enter amount as "100"
      And I click the next button
      And I edit the amount from review page
      Then I click book visit button
      And I cancel the visit
      And I logout of UB online banking application



