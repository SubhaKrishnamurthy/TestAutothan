# Author: Subha
# Functionality: FX validation
# Jira ID: ?
# Jira URL: ?

@PayBills @Regression
Feature: PayBills Functionality Validation
  #TS159
  @PB01
  Scenario: Navigation of Pay bills screen,Billers tab and search in MyBillers and Favourites and biller List
    Given I'm on login page of UB online banking application
    When I am on the PayBills page
    And I search for the biller "ABRA" in Billers list
    Then I verify the value as "ABRA" in search result1
    And I search for the billler "Automation" in Favorites list
    Then I verify the value as "Automation" in search result1
    And I search for the billler "Automation" in MyBillers
    Then I verify the value as "Automation" in search result1

#TS160
  @PB02
Scenario: Validation of navigating back to Pay bills screen on closing the select billers screen
  Given I'm on login page of UB online banking application
  When I am on the PayBills page
  And I search for the biller "ABRA" in Billers list
  And I Click Back button
  Then I logout of UB online banking application

    #TS161
  @PB03
  Scenario: Validation of Pay bills screen,Billers tab and search in MyBillers and Favourites and biller List
    Given I'm on login page of UB online banking application
    When I am on the PayBills page
    And I search for the biller "UNION" in Billers list
    Then I verify the value as "UNIONBANK MASTERCARD" in search result1
    And I verify the value as "UNIONBANKMASTERCARD" in search result2
    And I search for the billler "Autotest" in Favorites list
    Then I verify the value as "Autotest1" in search result1
    And I verify the value as "Autotest2" in search result2
    And I search for the billler "Autotest" in MyBillers
    Then I verify the value as "Autotest1" in search result1
    And I verify the value as "Autotest2" in search result2
    Then I logout of UB online banking application

    #TS165
  @PB04
  Scenario: Validation of displaying error message in "Amount" field when user enters amount more than the current balance
    Given I'm on login page of UB online banking application
    When I am on the PayBills page
    And I search for the billler "Veco" in MyBillers
    Then I click the search result1
    And I click the Next Button
    And I Select the from account
    And I enter the amount field as "9999999999999"
    And I click the Date field
    Then I Verify the Error message in the mobile number as "Amount is greater than your current balance"

  #TS167
  @PB05
  Scenario: Validation of  clicking cancel button in Review and Pay screen for Pay Bill Transaction
    Given I'm on login page of UB online banking application
    When I am on the PayBills page
    And I search for the billler "Veco" in MyBillers
    Then I click the search result1
    And I Enter the account in account ID filed as "82028711016"
    And I click the Next Button
    And I Select the from account
    And I enter the amount field as "100"
    And I click the Submit Button
    And I click the cancel button
    And I click the Yes button
    And I am on the PayBills page
    Then I logout of UB online banking application

  #TS170
  @PB06
    Scenario: validate user lands in Review and pay screen when user clicks back button from editing Biller Information Screen
    Given I'm on login page of UB online banking application
    When I am on the PayBills page
    And I search for the billler "Veco" in MyBillers
    Then I click the search result1
    And I click the Next Button
    And I Select the from account
    And I enter the amount field as "100"
    And I click the Submit Button
    And I Click the Edit button
    And I Click Back button
    Then I verify the pay php button
    Then I logout of UB online banking application

  #TS171
  @PB07
  Scenario: Validate Frequency and End Date fields are displayed when the user checks Repeat checkbox
    Given I'm on login page of UB online banking application
    When I am on the PayBills page
    And I search for the biller "MAPFRE INSULAR INSURANCE CORP" in Billers list
    Then I click the search result1
    And I enter paymentReferenceNo as "0006992990424204" PayorsName as "MANUEL CANAPI SUNGA" and PolicyNo as "2312001000781"
    And I click the Next Button
    And I Select the from account
    And I enter the amount field as "100"
    And I Click the Repeat check box
    Then I Verify the Frequency Listbox and End Date Listbox are displaying
    Then I logout of UB online banking application

    #TS172
  @PB08
  Scenario: Validation of displaying error message in Biller information and payment details screen when fileds are blank
    Given I'm on login page of UB online banking application
    When I am on the PayBills page
    And I search for the biller "UNIONBANK VISA" in Billers list
    Then I click the search result1
    And I enter visa number as "test"
    Then I verify the branch required error message as "VISA Card Number is required"
    And I enter visa number as "1234567812345670"
    And I click the Next Button
    And I Select the from account
    And I enter the amount field as ""
    And I Click the Repeat check box
    Then I verify the branch required error message as "Amount is Required"
    Then I logout of UB online banking application

    #TS173
  @PB09
    Scenario: Validate next button is disabled by default in Biller information and Review screen when user doesn’t enter any fields
    Given I'm on login page of UB online banking application
    When I am on the PayBills page
    And I search for the biller "UNIONBANK VISA" in Billers list
    Then I click the search result1
    And I enter visa number as "1234567812345670"
    And I Verify next button is "enabled"
    And I click the Next Button
    And I Select the from account
    And I Verify next button is "disabled"

 #TS174
  @PB10
  Scenario: Validation of displaying error message when user enters invalid card number in biller information screen
    Given I'm on login page of UB online banking application
    When I am on the PayBills page
    And I search for the biller "UNIONBANK VISA" in Billers list
    Then I click the search result1
    And I enter visa number as "1234567812345670"
    And I click the Next Button
    And I Select the from account
    And I enter the amount field as "100"
    And I click the Next Button
    And I click the Pay Bills php button
    Then I verify review page error message as "Card Number you entered is invalid."

