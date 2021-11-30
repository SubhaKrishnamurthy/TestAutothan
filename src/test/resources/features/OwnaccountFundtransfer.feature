# Author: Sundaresan Jeyamani
# Functionality: Own Account FundTransfer
# Jira ID: ?
# Jira URL: ?


 @Ownaccount @Regression
Feature: Own Account FundTransfer


  @Ownaccount1
  Scenario: Validation of not allowing own account transfer with one source account
    #Given I'm on login page of UB online banking application with otp "222222"
    Given I'm on login page of UB online banking application with user "Autoloan1" otp "222222"
    When I click the Send/Receive Money
    Then Ownacount link should not displayed

  @Ownaccount2
  Scenario: Validation of allowing own account transfer with mutilple source account
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1500" and remarks "OwnaccountDeposit"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"**** **** 1750" and Toaccount "1023 1001 1756" and Amount"PHP 1,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Ownaccount3
  Scenario: Validation of navigating to transfer clicking the cancel button for own account transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1500" and remarks "OwnaccountDeposit"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Ownaccount4
  Scenario: Validation of back button in transfer to Own account
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click Ownacount link
    And I click the from account number
    And I Click Back button
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Ownaccount5
  Scenario: Validation of Edit functionality in the Review page in Own Account with frequency
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1" and remarks "OwnaccountDeposit"
    And I click the Repeat checkbox and select frequency as "Quarterly"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I Click the fromaccountnumber edit
    And I click the from account number
    And I verify the Gotit button displayed or not
    And I Click the toaccountnumber edit
    And I click the to account number
    And I verify the Gotit button displayed or not
    And I Click the Amount details edit
    And I Enter the Amount "2" and remarks "OwnaccountDepositchange"
    And I click the update Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"**** **** 1750" and Toaccount "1023 1001 1756" and Amount"PHP 2.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Ownaccount6
  Scenario: Verifying the Own Account Transfer transaction for various frequency in Transfer Details page
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1" and remarks "OwnaccountDeposit"
    And I click the Repeat checkbox and select frequency as "Quarterly"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1" and remarks "OwnaccountDeposit"
    And I click the Repeat checkbox and select frequency as "Daily"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1" and remarks "OwnaccountDeposit"
    And I click the Repeat checkbox and select frequency as "Weekly"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1" and remarks "OwnaccountDeposit"
    And I click the Repeat checkbox and select frequency as "Every 2 weeks"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1" and remarks "OwnaccountDeposit"
    And I click the Repeat checkbox and select frequency as "Monthly"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1" and remarks "OwnaccountDeposit"
    And I click the Repeat checkbox and select frequency as "Semi-Annually"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Cancel button
    And I click the Yes button
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1" and remarks "OwnaccountDeposit"
    And I click the Repeat checkbox and select frequency as "Annually"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"**** **** 1750" and Toaccount "1023 1001 1756" and Amount"PHP 1.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Ownaccount7
  Scenario: Validation of entering remarks greater than 256 characters in own transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1500" and remarks with morethan 256 characters
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"**** **** 1750" and Toaccount "1023 1001 1756" and Amount"PHP 1,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Ownaccount8
  Scenario: Validation of navigating to Transfer details page once transfer from account is selected if user has only two accounts for own transfer
    Given I'm on login page of UB online banking application with user "cbautotest2" otp "222222"
    When I click the Send/Receive Money
    Then I Click Ownacount link
    And I click the from account number
    And I Enter the Amount "1500" and remarks "OwnaccountDeposit"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Ownaccount9
  Scenario: Validation of back button in Review Own account
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1" and remarks "OwnaccountDeposit"
    And I click the Repeat checkbox and select frequency as "Quarterly"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I Click Back button
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Ownaccount10
  Scenario: Validation of Edit functionality in the Review page in Own Account without frequency
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "1500" and remarks "OwnaccountDeposit"
    And I click the Next Button
    And I verify the Gotit button displayed or not
    And I Click the fromaccountnumber edit
    And I click the from account number
    And I verify the Gotit button displayed or not
    And I Click the toaccountnumber edit
    And I click the to account number
    And I verify the Gotit button displayed or not
    And I Click the Amount details edit
    And I Enter the Amount "2500" and remarks "OwnaccountDepositchange"
    And I click the update Button
    And I verify the Gotit button displayed or not
    And I click the Transfer button
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    #And I click the Submit Button
    Then I verify the Successful message is displayed
    And I Verify the Fromaccount"**** **** 1750" and Toaccount "1023 1001 1756" and Amount"PHP 2,500.00"and
    Then I Click the New Transaction button Link
    And I Verify the Ownaccount Link
    And I Click the Logout Button

  @Ownaccount11
  Scenario:Validation of amount field in the Transfer
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Receive Money
    Then I Click Ownacount link
    And I click the from account number
    And I click the to account number
    And I Enter the Amount "9999999999" in ub account transfer
    Then I verify the validation message for than account balance "Amount is greater than your current balance"

    #Scenario: Verifying the Transaction History for the Own Account Transfer








