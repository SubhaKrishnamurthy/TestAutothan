# Author: Sundaresan Jeyamani
# Functionality: PDDTS FundTransfer
# Jira ID: ?
# Jira URL: ?


 @PDDTS @Regression
Feature: PesoNet Fund Transfer

  @PDDTS1
  Scenario:Validaiton of PDDTS Transfer option content
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I Verify PDDTS link isexist
    And I Verify the PDDTS Text verification "USD 10,000 transaction limit." and "Transactions before 3:00 PM cut-off are processed the same banking day. Transactions after cut-off, weekends or holidays are processed the next banking day."

  @PDDTS2
  Scenario:Validation of error message when transaction amount less than 10 USD
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click PDDTS Link
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I enter the Address details in PDDTS Address field
    And I click the Next Button
    And I enter the amount "5" less than 10USD in amount
    Then I verify the error "Amount should be at least USD 10."

  @PDDTS3
  Scenario:Validation of error message when transaction amount more than the account balance
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click PDDTS Link
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I enter the Address details in PDDTS Address field
    And I click the Next Button
    And I enter the amount "999999" more than account balance
    Then I verify the error "Amount is greater than your current balance"

  @PDDTS4
  Scenario:Validation of error message when transaction amount is more than transaction Limit
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click PDDTS Link
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I enter the Address details in PDDTS Address field
    And I click the Next Button
    And I enter the amount "600"
    Then I verify the error "The amount entered is greater than the current set limit. Please check your Transaction Limits settings"

  @PDDTS5
  Scenario: Verify if Review and Transfer screen is as per template
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click PDDTS Link
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I enter the Address details in PDDTS Address field
    And I click the Next Button
    And I enter the amount "10"
    And I select the reason "ADVERTISING"
    And I click the Next Button
    And I Verify the Fromaccount"Pete P Gamboa Foreign Currency Regular Savings **** **** 0695" and Toaccount "1014 0000 1643" and Amount"USD 10.00"and

  @PDDTS6
  Scenario: Verification of Pop-up content before successful transaction
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click PDDTS Link
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I enter the Address details in PDDTS Address field
    And I click the Next Button
    And I enter the amount "10"
    And I select the reason "ADVERTISING"
    And I click the Next Button
    And I Verify the Fromaccount"Pete P Gamboa Foreign Currency Regular Savings **** **** 0695" and Toaccount "1014 0000 1643" and Amount"USD 10.00"and
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    Then I verify the popup message"Transfers to other banks before the 3:00 PM cut-off are processed on the same banking day. Transfers after cut-off or on holidays are processed on the next banking day. Transfers to other banks are deemed valid and final. Please review transfer details before sending. Additional charges may be applied by the receiving bank for returned transaction due to incomplete or incorrect transfer details. The beneficiary may be charged by the receiving bank for any incoming transfer/remittance fee. For inquiries, please contact our 24-Hour Customer Service at +63 2 8841-8600 or send us an email at customer.service@unionbankph.com."
    And I click the proceed with transfer
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"Foreign Currency Regular Savings **** **** 0695" and Toaccount "1014 0000 1643" and Amount"USD 10.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @PDDTS7
  Scenario:Verification of Pop-up when same transfer is made on the same day
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click PDDTS Link
    And I select the Account number from saved recipient "101400001643"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Instapay Transfer"
    And I enter the Address details in PDDTS Address field
    And I click the Next Button
    And I enter the amount "10"
    And I select the reason "ADVERTISING"
    And I click the Next Button
    And I Verify the Fromaccount"Pete P Gamboa Foreign Currency Regular Savings **** **** 0695" and Toaccount "1014 0000 1643" and Amount"USD 10.00"and
    And I verify the Gotit button displayed

  @PDDTS8
  Scenario:Validation of Transfer from screen for user with single USD account
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click PDDTS Link
    Then I verify the Sendto page is displayed

  @PDDTS9
  Scenario:Validation of Transfer from screen for user with mutliple USD account
    Given I'm on login page of UB online banking application with user "huawei" otp "111111"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click PDDTS Link
    And I click the from account number
    Then I verify the Sendto page is displayed

  @PDDTS10
  Scenario:Verification of blank field error content in Transfer To screen
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click PDDTS Link


  @PDDTS11
  Scenario:Verification of invalid data error content in Transfer To screen
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I click the Other banks or Ewallet
    And I click PDDTS


