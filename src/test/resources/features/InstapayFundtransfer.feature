# Author: Sundaresan Jeyamani
# Functionality: Instapay FundTransfer
# Jira ID: ?
# Jira URL: ?


 @Instapay
Feature: Instapay Fund Transfer

  @Instapay1
  Scenario: Validation of navigating transfer to Other Bank InstaPay
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"Peso Regular Savings **** **** 1750" and Toaccount "1014 0000 1643" and Amount"PHP 1,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Instapay2
  Scenario: Validation of Invalid OTP in the Instapay transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "111111" in OTP Page
    And I click the Submit Button
    Then I verify the Invalid OTP error message

  @Instapay3
  Scenario: Validation of entering amount more than account current balance
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I click the Next Button
    And I Enter the Amount "9999999999" in ub account transfer
    Then I verify the validation message for than account balance "Amount is greater than your current balance"

  @Instapay4
  Scenario: Validation of Next Button enabled only when all valid fields are entered
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I verify Next button is enabled


  @Instapay5
  Scenario:Validation of entering remarks greater than 256 characters in InstaPay
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks 256 chars

  @Instapay6
  Scenario:Validating the Transfer details screen without giving the amount and select purpose
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I click the Next Button
    And I verify Next button is not enabled

  @Instapay7
  Scenario:Validating the Edit functionality in Transfer review page in the InstaPay Transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I Click the fromaccountnumber edit
    And I click the from account number
    And I verify the Gotit button displayed or not
    And I Click the toaccountnumber edit
    And I select the Account number from saved recipient "101400001643"
    And I click the update Button
    And I verify the Gotit button displayed or not
    And I Click the Amount details edit
    And I Enter the Amount "2500" in ub account transfer
    And I click the update Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"Peso Regular Savings **** **** 1750" and Toaccount "1014 0000 1643" and Amount"PHP 2,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Instapay8
  Scenario:Validation of navigating to send/Request to other banks Send money via page on clicking back button in Transfer from screen
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I Click Back button
    And I Verify the Eonaccount Link
    And I Click the Logout Button

  @Instapay9
  Scenario:Validation of Not Eligible for Instapay and disabled for ineligible accounts in select recipient screen
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I search the Account number from saved recipient "147690634725"
    Then I verify Account number is disabled
    And I Verify "Not eligible for InstaPay" message displayed in the account number


  @Instapay10
  Scenario:Validation of Not Eligible for Instapay and disabled for ineligible accounts in select recipient in favourite tab
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I search the Account number from favourite recipient "147690634725"
    Then I verify Account number is disabled
    And I Verify "Not eligible for InstaPay" message displayed in the account number

  @Instapay11
  Scenario:Validation of selecting target account number from saved favourite recipient
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button

  @Instapay12
  Scenario:Validation click the cancel button in Instapay transfer transaction
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Instapay13
  Scenario:Validation of Amount Number digits in InstaPay
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the bank "Asia United Bank" from listbox
    And I Enter the Accountnumber"123412341234"
    And I enter the Accountname"###"
    Then I verify the error message"Account name is required"



  @Instapay14
  Scenario:Validation of Account Name filed in transfer page for Other Bank
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the bank "Asia United Bank" from listbox
    And I Enter the Accountnumber"123412341234"
    And I enter the Accountname"AB"
    Then I verify the error message accout name "Account name should be at least 4 characters long"

  @Instapay15
  Scenario:Validation of Account Number filed in transfer page for Other Bank InstaPay
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the bank "Asia United Bank" from listbox
    And I Enter the Accountnumber""
    And I enter the Accountname"ABCDEFGH"
    Then I verify the error message accout number "Accountnumber is required"

  @Instapay16
  Scenario:Validation of Next button is enabled when recipient bank select from bank list and enter the mandatory fields
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Instapay link
    And I click the from account number
    And I select the bank "Asia United Bank" from listbox
    And I Enter the Accountnumber"123412341234"
    And I enter the Accountname"ABCDEFGH"
    And I verify Next button is enabled
    And I click the Next Button


