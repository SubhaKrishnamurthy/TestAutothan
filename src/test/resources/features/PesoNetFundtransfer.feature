# Author: Sundaresan Jeyamani
# Functionality: PesoNet FundTransfer
# Jira ID: ?
# Jira URL: ?


 @PesoNet @Regression
Feature: PesoNet Fund Transfer

  @PesoNet1
  Scenario:Validation of navigating transfer to Other Bank PesoNet
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I select the reason "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    And I click the proceed with transfer
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"Peso Regular Savings **** **** 1750" and Toaccount "1014 0000 1643" and Amount"PHP 1,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @PesoNet2
  Scenario:Validation of transfering amount less than 200 for Pesonet transaction
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "100" in ub account transfer
    Then I Verify the error message "Amount should be at least PHP 200.00"

  @PesoNet3
  Scenario: Validation of Validation of entering invalid OTP in Pesonet transaction
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I select the reason "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    And I click the proceed with transfer
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "111111" in OTP Page
    And I click the Submit Button
    Then I verify the Invalid OTP error message

  @PesoNet4
  Scenario:Validation of selecting target account number from saved favourite recipient
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I select the reason "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    And I click the proceed with transfer
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"Peso Regular Savings **** **** 1750" and Toaccount "1014 0000 1643" and Amount"PHP 1,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @PesoNet5
  Scenario:Validation of entering amount more than account balance in Pesonet transaction
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I click the Next Button
    And I Enter the Amount "9999999999" in ub account transfer
    Then I verify the validation message for than account balance "Amount is greater than your current balance"

  @PesoNet6
  Scenario:Validation of selecting target account number from saved favourite recipient
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I select the reason "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    And I click the proceed with transfer
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"Peso Regular Savings **** **** 1750" and Toaccount "1014 0000 1643" and Amount"PHP 1,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @PesoNet7
  Scenario:Validating the Edit functionality in Transfer review page in the PesoNet Transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I select the reason "ADVERTISING"
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
    And I click the proceed with transfer
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"Peso Regular Savings **** **** 1750" and Toaccount "1014 0000 1643" and Amount"PHP 2,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @PesoNet8
  Scenario:Validation of navigating to Transfer to screen on clicking back button from Transfer details screen
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I click the Next Button
    And I Click Back button
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @PesoNet9
  Scenario:Validation of setting various frequency for scheduled Pesonet transfer for scheduled Pesonet transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "2500" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Quarterly"
    And I select the reason2 "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
   # And I select the reason2 "ADVERTISING"
    And I click the Repeat checkbox and select frequency as "Daily"
    And I select the reason2 "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
   # And I select the reason2 "ADVERTISING"
    And I click the Repeat checkbox and select frequency as "Weekly"
    And I select the reason2 "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    #And I select the reason2 "ADVERTISING"
    And I click the Repeat checkbox and select frequency as "Every 2 weeks"
    And I select the reason2 "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    #And I select the reason2 "ADVERTISING"
    And I click the Repeat checkbox and select frequency as "Monthly"
    And I select the reason2 "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    #And I select the reason2 "ADVERTISING"
    And I click the Repeat checkbox and select frequency as "Semi-Annually"
    And I select the reason2 "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    And I verify the Gotit button displayed or not
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
   # And I select the reason2 "ADVERTISING"
    And I click the Repeat checkbox and select frequency as "Annually"
    And I select the reason2 "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    And I click the proceed with transfer
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"Peso Regular Savings **** **** 1750" and Toaccount "1014 0000 1643" and Amount"PHP 2,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @PesoNet10
  Scenario: Validation of navigating to Transfer details page once transfer from account is selected if user has only two accounts
    Given I'm on login page of UB online banking application with user "cbautotest2" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I select the reason "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    And I click the proceed with transfer
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @PesoNet11
  Scenario:Validation of Leave a purpose filed only when user select OTHERS(Please specify)
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I select the reason "*OTHERS (Please specify)"
    And I Enter the reason in Leave purpose field "Testing"
    And I click the Next Button

  @PesoNet12
  Scenario:Validation click the cancel button in Pesonet transfer transaction
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "2500" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Quarterly"
    And I select the reason2 "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @PesoNet13
  Scenario:Validation of proceeding to next page without selecting purpose in PesoNet Transaction
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "2500" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Quarterly"
    And I verify Next button is not enabled

  @PesoNet14
  Scenario:Validation of Amount Number digits in Pesonet
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the bank "Asia United Bank" from listbox
    And I Enter the Accountnumber"123412341234"
    And I enter the Accountname"###"
    Then I verify the error message"Account name is required"

  @PesoNet15
  Scenario:Validation of Next button is enabled when recipient bank select from bank list and enter the mandatory fields
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the bank "Asia United Bank" from listbox
    And I Enter the Accountnumber"123412341234"
    And I enter the Accountname"ABCDEFGH"
    And I verify Next button is enabled
    And I click the Next Button


  @PesoNet16
  Scenario:Validation of Account Name filed in transfer page for Other Bank
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the bank "Asia United Bank" from listbox
    And I Enter the Accountnumber"123412341234"
    And I enter the Accountname"AB"
    Then I verify the error message accout name "Account name should be at least 4 characters long"

  @PesoNet17
  Scenario:Validation of Account Number filed in transfer page for Other Bank Pesonet
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the bank "Asia United Bank" from listbox
    And I Enter the Accountnumber""
    And I enter the Accountname"ABCDEFGH"
    Then I verify the error message accout number "Account number is required"

  @PesoNet18
  Scenario:Validation of entering future date in date field for PesoNet Transaction
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "2500" in ub account transfer
    And I Select the future date
    And I click the Repeat checkbox and select frequency as "Quarterly"
    And I select the reason2 "ADVERTISING"
    And I click the Next Button


  @PesoNet19
  Scenario:Validation of entering previous date in date field
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the Account number from favourite recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"PesoNet Transfer"
    And I click the Next Button
    And I Enter the Amount "2500" in ub account transfer
    Then I verify the previous date button is not exist


  @PesoNet20
  Scenario:Validation of submit transaction when recipient bank select from bank list and enter the mandatory fields
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    And I select the bank "Asia United Bank" from listbox
    And I Enter the Accountnumber"123412341234"
    And I enter the Accountname"ABCDEFGH"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I select the reason "ADVERTISING"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    And I click the proceed with transfer
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button





