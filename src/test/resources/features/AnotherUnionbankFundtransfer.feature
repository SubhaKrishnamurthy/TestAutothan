# Author: Sundaresan Jeyamani
# Functionality: Another UB Account FundTransfer
# Jira ID: ?
# Jira URL: ?

 @OtherUBaccount @Regression
Feature: Another Unionbank FundTransfer


  @OtherUBaccount1
  Scenario: Validation of navigating transfer to UB Account for valid Account number
    When I store the version of the application
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click UBacount link
    And I click the from account number
    And I enter the UBP account number "000010118779" and account name "Other UBP Account"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"**** **** 1750" and Toaccount "0000 1011 8779" and Amount"PHP 1,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @OtherUBaccount2
  Scenario: Validation of navigating transfer to UBP Account for Invalid OTP
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click UBacount link
    And I click the from account number
    And I enter the UBP account number "000010118779" and account name "Other UBP Account"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "555555" in OTP Page
    #And I click the Submit Button
    Then I verify the Invalid OTP error message

  @OtherUBaccount3
  Scenario: Validation of navigating transfer to UBP Account for Invalid Account number
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click UBacount link
    And I click the from account number
    And I enter the UBP account number "111122223333" and account name "Other UBP InvalidAccount"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    #And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Invalid Account number error message "Invalid target account"

  @OtherUBaccount4
  Scenario: Validation of Edit functionality in the Review page of UBP Account
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click UBacount link
    And I click the from account number
    And I enter the UBP account number "000010118779" and account name "Other UBP Account"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I Click the fromaccountnumber edit
    And I click the from account number
    And I verify the Gotit button displayed or not
    And I Click the toaccountnumber edit
    And I enter the UBP account number "000010118779" and account name "Other UBP Account"
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
    And I Verify the Fromaccount"**** **** 1750" and Toaccount "0000 1011 8779" and Amount"PHP 2,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @OtherUBaccount5
  Scenario: Validation of selecting target account number from saved receipient in Transfer to UBP
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from saved recipient "100570037881"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"UB Account Transfer"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button

  @OtherUBaccount6
  Scenario: Validation of selecting target account number from Favourite receipient in Transfer to UBP
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from favourite recipient "10057003788"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"UB Account Transfer"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed

  @OtherUBaccount7
  Scenario: Validation of navigating to transfer clicking the cancel button for UBP Account Transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click UBacount link
    And I click the from account number
    And I enter the UBP account number "000010118779" and account name "Other UBP Account"
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @OtherUBaccount8
  Scenario:Validation of entering remarks greater than 256 characters in UBP Account
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from saved recipient "100570037881"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks morethan 256
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1500" in ub account transfer
    And I click the Next Button

  @OtherUBaccount9
  Scenario:Verifying the UBP Account Transfer transaction for various frequency in Transfer Details page
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from saved recipient "100570037881"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"UB Account Transfer"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Quarterly"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from saved recipient "100570037881"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"UB Account Transfer"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Daily"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from favourite recipient "100570037881"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"UB Account Transfer"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Weekly"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from favourite recipient "100570037881"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"UB Account Transfer"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Every 2 weeks"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from favourite recipient "100570037881"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"UB Account Transfer"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Monthly"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from favourite recipient "100570037881"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"UB Account Transfer"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I click the Repeat checkbox and select frequency as "Semi-Annually"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from favourite recipient "100570037881"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"UB Account Transfer"
    And I verify Next button is enabled
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

  @OtherUBaccount10
  Scenario: Validation of Transfer to another UBP account with future date
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from favourite recipient "100570037881"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"UB Account Transfer"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "1" in ub account transfer
    And I Select the future date
    And I click the Repeat checkbox and select frequency as "Quarterly"
    And I click the Next Button


  @OtherUBaccount11
   Scenario:Validation of amount field in the Transfer Page
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click UBacount link
    And I click the from account number
    And I select the Account number from favourite recipient "100570037881"
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537" and remarks"UB Account Transfer"
    And I verify Next button is enabled
    And I click the Next Button
    And I Enter the Amount "9999999999" in ub account transfer
    Then I verify the validation message for than account balance "Amount is greater than your current balance"