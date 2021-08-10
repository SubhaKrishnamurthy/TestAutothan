# Author: Subha
# Functionality: FX validation
# Jira ID: ?
# Jira URL: ?

@RequestPayment @Regression
Feature: Request Payment Functionality Validation

  #TS093
  @RP01
    Scenario: Validation of proceeding to next page without entering amount Request Payment
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I enter the amount field as ""
    And I select the split option as "Evenly"
    And I add one participant as "Jaya"
    And I enter the request payment message as "Test Request payment"
    And I Select the from account in the displayed account list
    Then I Verify the next button is not enabled

    #TS094
  @RP02
    Scenario: Validation of entering non-numeric characters in amount field in Request Payment
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I enter the amount field as "qwswe@@@#ffer"
    And I select the split option as "Evenly"
    Then I Verify values in the Amount filed as ""

    #TS095
  @RP03
  Scenario: Validation of entering amount more than account current balance in Request Payment
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I enter the amount field as "999999999"
    And I select the split option as "Evenly"
    And I add one participant as "Jaya"
    Then I Verify the Error message in the amount field as "Total amount exceeds allowed limit"

    #TS096
    @RP04
    Scenario: Validation of setting Split option as Evenly for Request payment
      Given I'm on login page of UB online banking application
      When I click the Request payment under receive money
      And I enter the amount field as "100"
      And I select the split option as "Evenly"
      And I add one participant as "Jaya"
      And I enter the request payment message as "Test"
      And I Select the from account in the displayed account list
      And I click the next button
      And I click the Request payemnt php button
      Then I Verify the Congratulation message along with other details in the request payment final page
      Then I Click the New Transaction button Link
      And I Click the Logout Button

      #TS097
      @RP05
      Scenario: Validation of description when Split option is selected evenly,unevenly and each for Request payment
        Given I'm on login page of UB online banking application
        When I click the Request payment under receive money
        Then I Verify the description value as "Use this option to divide PHP 0.00 evenly among all participants."
        And I enter the amount field as "100"
        And I select the split option as "Evenly"
        Then I Verify the description value as "Use this option to divide PHP 100 evenly among all participants."
        And I select the split option as "Unevenly"
        Then I Verify the description value as "Use this option to manually set the amount for each participant. PHP 100 will be the total or max amount requested from all participants."
        And I select the split option as "Each"
        Then I Verify the description value as "Use this option to request PHP 100 from each participant."

        #TS098
      @RP06
      Scenario: Validation of setting Split option as Unevenly for Request payment
        Given I'm on login page of UB online banking application
        When I click the Request payment under receive money
        And I enter the amount field as "100"
        And I select the split option as "Unevenly"
        And I add one participant as "Jaya"
        And I enter the request payment message as "Test"
        And I Select the from account in the displayed account list
        And I enter the amount field for another participant as "100"
        And I click the next button
        And I click the Request payemnt php button
        Then I Verify the Congratulation message along with other details in the request payment final page
        Then I Click the New Transaction button Link
        And I Click the Logout Button

        #TS099
      @RP07
      Scenario: Validation of setting Split option as Each for Request payment
        Given I'm on login page of UB online banking application
        When I click the Request payment under receive money
        And I enter the amount field as "100"
        And I select the split option as "Each"
        And I add one participant as "Jaya"
        And I enter the request payment message as "Test"
        And I Select the from account in the displayed account list
        And I click the next button
        And I click the Request payemnt php button
        Then I Verify the Congratulation message along with other details in the request payment final page
        Then I Click the New Transaction button Link
        And I Click the Logout Button

     #TS100
    @RP08
      Scenario: Validation of add participent with Invalid Name and Mobile number
        Given I'm on login page of UB online banking application
        When I click the Request payment under receive money
        And I enter the amount field as "100"
        And I select the split option as "Unevenly"
        And I click on Add participant and Add icon in the Request payment
        And I input the name as "TestAutomation"
        And I Enter the mobile number as five digits "12345"
        Then I Verify the Error message in the mobile number as "Mobile Number should have 11 digits"

      #TS101
  @RP09
      Scenario: Validation of Amount Requested is divided equally within the participants for Evenly split option
      Given I'm on login page of UB online banking application
      When I click the Request payment under receive money
      And I enter the amount field as "100"
      And I select the split option as "Evenly"
      And I add one participant as "Jaya"
      And I add one participant as "09228499484"
      And I enter the request payment message as "Test"
      And I Select the from account in the displayed account list
      And I click the next button
      And I click the Request payemnt php button
    Then I Verify Congratulation message,split amount as "PHP 50.00","PHP 50.00",total amt as "PHP 100.00" along with other details in request payment final page
    Then I Click the New Transaction button Link
      And I Click the Logout Button

    #TS102
  @RP10
  Scenario: Validation of Participent amount details in Requesting from when split option is selected as Unevenly
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I enter the amount field as "100"
    And I select the split option as "Unevenly"
    And I add one participant as "Jaya"
    And I add one participant as "09228499484"
    And I split the amount as "40" and "60"
    And I enter the request payment message as "Test"
    And I Select the from account in the displayed account list
    And I click the next button
    And I click the Request payemnt php button
    Then I Verify Congratulation message,split amount as "PHP 40.00","PHP 60.00",total amt as "PHP 100.00" along with other details in request payment final page
    Then I Click the New Transaction button Link
    And I Click the Logout Button

     #TS103
    @RP11
    Scenario: Validation of Amount Requested is the same for each participants for Each split option
      Given I'm on login page of UB online banking application
      When I click the Request payment under receive money
      And I enter the amount field as "100"
      And I select the split option as "Each"
      And I add one participant as "Jaya"
      And I add one participant as "09228499484"
      And I enter the request payment message as "Test"
      And I Select the from account in the displayed account list
      And I click the next button
      And I click the Request payemnt php button
      Then I Verify Congratulation message,split amount as "PHP 100.00","PHP 100.00",total amt as "PHP 200.00" along with other details in request payment final page
      Then I Click the New Transaction button Link
      And I Click the Logout Button

      #TS107
    @RP12
      Scenario: Validation of Error message under total amount requested,Next button is disabled if the Total Amount is not equal with the Requested Amount when split option is selected as Unevenly
      Given I'm on login page of UB online banking application
      When I click the Request payment under receive money
      And I enter the amount field as "100"
      And I select the split option as "Unevenly"
      And I add one participant as "Jaya"
      And I add one participant as "09228499484"
      And I split the amount as "40" and "40"
      And I enter the request payment message as "Test"
      Then I Verify the total amount error message in the total amount field

    #TS108
  @RP13
    Scenario: Validation of Editing the Participent amount details in  Requesting from when split option is selected as Evenly
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I enter the amount field as "100"
    And I add one participant as "Jaya"
    And I add one participant as "09228499484"
    And I enter the request payment message as "Test"
    Then I verify that amount is splitted to the participants as "50" "50" and input for amount is disabled

    #TS109
  @RP14
    Scenario: Validation of Editing Requesting from fields when split option is selected as Each
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I enter the amount field as "100"
    And I select the split option as "Each"
    And I add one participant as "Jaya"
    And I add one participant as "09228499484"
    And I enter the request payment message as "Test"
    Then I verify that amount is splitted to the participants as "100" "100" and input for amount is disabled

     #TS110
  @RP15
    Scenario: Validation of Editing Participent amount details in Requesting from when split option is selected as Unevenly
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I enter the amount field as "100"
    And I select the split option as "Unevenly"
    And I add one participant as "Jaya"
    And I add one participant as "09228499484"
    And I split the amount as "40" and "60"
    Then I verify that amount is splitted to the participants as "40" "60" and input for amount is enabled

    #TS111
    @RP16
    Scenario: Validation of navigating to hang on popup by clicking the Cancle button
      Given I'm on login page of UB online banking application
      When I click the Request payment under receive money
      And I enter the amount field as "100"
      And I select the split option as "Each"
      And I add one participant as "Jaya"
      And I enter the request payment message as "Test"
      And I Select the from account in the displayed account list
      And I click the next button
      And I click the cancel button and confirm cancel
      Then I verify dashboard page
      When I click the Request payment under receive money
      And I enter the amount field as "100"
      And I select the split option as "Each"
      And I add one participant as "Jaya"
      And I enter the request payment message as "Test"
      And I Select the from account in the displayed account list
      And I click the next button
      And I click the cancel button and click no button
      Then I verify the account name and account number

     #TS112
      @RP17
      Scenario: Validation of mask/unmask Account number under deposit to field
        Given I'm on login page of UB online banking application
        When I click the Request payment under receive money
        And I enter the amount field as "100"
        And I select the split option as "Each"
        And I add one participant as "Jaya"
        And I enter the request payment message as "Test"
        And I Select the from account in the displayed account list
        And I click the next button
        And I click the Deposit to account number
        Then I verify the Deposit to account number

        #TS113
        @RP18
      Scenario: Validation of editing Requesting from in review and request screen and message equal 256
        Given I'm on login page of UB online banking application
        When I click the Request payment under receive money
        And I enter the amount field as "50"
        And I select the split option as "Each"
        And I add one participant as "Jaya"
        And I enter the request payment message as "raaIYaADGHERkPuvhdaJKgiuxEXTNuCgSnkfrvxpwyOrUWXItyKrCbyOnZcQsRTdSwcFtGaoXBkkCLleFHwzarOkXbMaHNKKgIBIaDRQzgSpIvqVGKbxWgQFUeKmyylDksQOpvrDUNNISOftdlZkePMHGbOyvGFuHfLDTirGQZdOKTTEPhQiVJkwGSOerEbatMGQFrcgyLUPtjfegpBrDPLXUnnKCDondtqEeCPKTENdXFHhHSIaLUvYqwiuvKme"
        And I Select the from account in the displayed account list
        And I click the next button
        And I click the edit button
        And I enter the amount field as "100"
        And I click the update Button
        And I click the Request payemnt php button
        Then I Click the New Transaction button Link
        Then I verify dashboard page
        And I Click the Logout Button

    #TS114
  @RP19
    Scenario: Validation of entering Message greater than 256 characters in Request Payment
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I enter the amount field as "100"
    And I select the split option as "Each"
    And I add one participant as "Jaya"
    And I enter the request payment message as "iMoLrSjmWUKRJVZiMwXjghQXJicqaJCXersBOWHwnQlVWLsNmdTCEefYkTEvGMXUwjmKslzbGYhCQAfHAkXGYwCidhbJToTGaGgeKtfLThtlQKzCweJaSbnZnKUXgccARJGRdIbxczdXBrtDIsWuxpCUKoTUJxmqqTbkdbllduyjVkDnxpVnwxmbvsDPiCpgjOnLcdneUPmcHYjSTEcprVyhhGDSUKVCZvJHhIdGxXoJfkJdZZFJpeSnAlyGtiQiFSYp"
    And I Select the from account in the displayed account list
    And I click the next button
    And I click the Request payemnt php button
    Then I Click the New Transaction button Link
    Then I verify dashboard page
    And I Click the Logout Button

   #TS115
  @RP20
    Scenario: Validation of navigating to send/Request page on clicking back button in Request payment screen
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I Click Back button
    Then I verify dashboard page
    And I Click the Logout Button

#TS116
  @RP21
  Scenario: Validation of navigating to  send/Request page on clicking  back button in review and request screen
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I enter the amount field as "100"
    And I select the split option as "Each"
    And I add one participant as "Jaya"
    And I enter the request payment message as "kJdZZ"
    And I Select the from account in the displayed account list
    And I click the next button
    And I Click Back button
    Then I verify dashboard page
    And I Click the Logout Button

#TS117
  @RP22
  Scenario: Validation of navigating to Transfer details page once transfer from account is selected if user has only two accounts
  Given I'm on login page of UB online banking application with user "cbautotest2"
    When I click the Request payment under receive money
    And I enter the amount field as "100"
    And I select the split option as "Each"
    And I add one participant as "Jaya"
    And I enter the request payment message as "Test"
    And I Select the from account in the displayed account list
    And I click the next button
    And I click the Request payemnt php button
    Then I Verify the Congratulation message along with other details in the request payment final page for two user account
    Then I Click the New Transaction button Link
    And I Click the Logout Button

    #TS118
  @RP23
  Scenario: Validation of displaying appropriate colours for Target account and display the UBP accounts for which requesting payment
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I enter the amount field as "100"
    And I select the split option as "Each"
    And I add one participant as "Jaya"
    And I enter the request payment message as "Test"
    And I see the from account in the displayed account list
    Then I verify the Account Number BackGround color
    Then I verify From and To account number

    #TS119
  @RP24
  Scenario: Validation of add participent with valid details with out saving as favorite
    Given I'm on login page of UB online banking application
    When I click the Request payment under receive money
    And I enter the amount field as "100"
    And I select the split option as "Unevenly"
    And I click on Add participant and Add icon in the Request payment
    And I input the name as "name1"
    And I Enter the mobile number as five digits "name2"
    And I click on save button
    And I click the BuyLoad link in the send request page
    And I Click the Manage contacts link in the Buyload
    And I search for the participant as "name3"
    Then I verify the participants account name and account number




