# Author: Sundaresan Jeyamani
# Functionality: ManageTransfer
# Jira ID: ?
# Jira URL: ?


 @ManageTransfer @Regression
Feature: ManageTransfer

  @ManageTransfer1
  Scenario:Validation of Fund transfer - to own bank under transferred tab
    Given I'm on login page of UB online banking application with user "cbautotest2" otp "222222"
    When I click the Send/Request
    Then I Click Ownacount link
    And I click the from account number
    And I Enter the Amount "1500" and remarks "OwnaccountDeposit"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Store the Reference Number and transaction date
    Then I Verify the values "PHP10.00" and "102220021750"  and "102310011756" in Recenent transactions
    And I Click the Logout Button

  @ManageTransfer2
  Scenario:Validation of Fund transfer - to another UBP bank transfer details under transferred tab and Transaction history
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I Click UBacount link
    And I click the from account number
    And I enter the UBP account number "000010118779" and account name "Other UBP Account"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"Peso Regular Savings **** **** 1750" and Toaccount "0000 1011 8779" and Amount"PHP 1,500.00"and


  @ManageTransfer3
  Scenario:Validation of Fund transfer - to EON account transfer details under transferred tab and Transaction history
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "109453257914"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"Peso Regular Savings **** **** 1750" and Toaccount "1094 5325 7914" and Amount"PHP 1,500.00"and


  @ManageTransfer4
  Scenario:Validation of Fund transfer - to Pesonet account transfer details under transferred tab and Transaction history
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
