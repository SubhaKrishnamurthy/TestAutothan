# Author: Sundaresan Jeyamani
# Functionality: EonAccount FundTransfer
# Jira ID: ?
# Jira URL: ?

 @EonAccount @Regression
Feature: EonAccount Fund Transfer

  @EonAccount1
  Scenario: Validation of Login functionality with valid and Invalid inputs
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
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"**** **** 1750" and Toaccount "1094 5325 7914" and Amount"PHP 1,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Eonaccount Link
    And I Click the Logout Button

  @EonAccount2
  Scenario:Validation of navigating transfer to EON Account for Invalid Account number
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "555544443333"
    Then I Verify Error message "Invalid EON account number" displayed account number field

  @EonAccount3
  Scenario:Validation of back button in transferfrom EON account
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I Click the EOnaccount fundtransfer Link
    And I Click Back button
    And I Verify the Dashboard page is displayed
    And I Click the Logout Button

  @EonAccount4
  Scenario:Validation of selecting target account number from saved receipient in EON Account Transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And I select the Account number from saved recipient "109453257914"
    And I click the Next Button

  @EonAccount5
  Scenario:Validation of Edit functionality in the Review page of EON Account Transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "109453257914"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I Click the fromaccountnumber edit
    And I click the from account number
    And I verify the Gotit button displayed or not
    And I Click the toaccountnumber edit
    And Enter the Eon Account Number "109453257914"
    And I click the update Button
    And I verify the Gotit button displayed or not
    And I Click the Amount details edit
    And I Enter the Amount "2500" in ub account transfer
    And I click the update Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"**** **** 1750" and Toaccount "1094 5325 7914" and Amount"PHP 2,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Eonaccount Link
    And I Click the Logout Button

  @EonAccount6
  Scenario:Validation of navigating to transfer clicking the cancel button for EON Account Transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "109453257914"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Eon Account Transfer"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click the EOnaccount fundtransfer Link

  @EonAccount7
  Scenario:Validation of selecting target account number from favourite receipient in EON Account Transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And I select the Account number from favourite recipient "109453257914"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"Eon Account Transfer"
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Annually"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"**** **** 1750" and Toaccount "1094 5325 7914" and Amount"PHP 1.00"and
    Then I Click the New Transaction button Link
    And I Verify the Eonaccount Link
    And I Click the Logout Button

  @EonAccount8
  Scenario:Verifying the EON Account Transfer transaction for various frequency in Transfer Details page
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "109453257914"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"EON Account Transfer"
    #And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Quarterly"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "109453257914"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"EON Account Transfer"
    #And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Daily"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "109453257914"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"EON Account Transfer"
    #And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Weekly"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "109453257914"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"EON Account Transfer"
    #And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Every 2 weeks"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "109453257914"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"EON Account Transfer"
    #And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Monthly"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "109453257914"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"EON Account Transfer"
    #And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Semi-Annually"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "109453257914"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"EON Account Transfer"
    #And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Annually"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed

  @EonAccount9
  Scenario:Validation of amount field in the Transfer Page
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I Click the EOnaccount fundtransfer Link
    And I click the from account number
    And Enter the Eon Account Number "109453257914"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"EON Account Transfer"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "9999999999" in ub account transfer
    Then I verify the validation message for than account balance "Amount is greater than your current balance"