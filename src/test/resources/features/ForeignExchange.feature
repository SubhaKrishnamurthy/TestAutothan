# Author: Subha
# Functionality: FX validation
# Jira ID: ?
# Jira URL: ?

@FX @Regression @RegressionNew
Feature: Foreign Exchange functionality Validation

  #TCN003
@FX01
Scenario: Validate that the error message is displayed when the user has no USD and PHP accounts enrolled.
  Given I'm on login page of UB online banking application with user "billpay01" otp "111111"
  When I click on Foreign Exchange button in dashboard
  Then I verify Add Account and Cancel buttons by clicking SELLUSD button
  Then I verify Add Account and Cancel buttons by clicking BUYUSD button

  #TCN004
  @FX02
  Scenario: Validate that the error message is displayed when the source accounts fund is insufficient using BUY USD flow
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "111111"
    When I click on Foreign Exchange button in dashboard
    And I click BUYUSD button, select account and enter USD amount "10,000,000"
    Then I verify the amount exceeds error message

    #TCN005
  @FX03
  Scenario: Validate that the error message is displayed when the source accounts fund is insufficient using SELL USD flow
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "111111"
    When I click on Foreign Exchange button in dashboard
    And I click SELLUSD button, select account and enter USD amount "10,000,000"
    Then I verify the amount exceeds error message

    #TCN006
  @FX04
  Scenario: Validate that the daily transaction limit exceeded error message is displayed for Buy USD transaction if the daily transaction limit is exceeded.
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "111111"
    When I click on Foreign Exchange button in dashboard
    And I click BUYUSD button, select account and enter USD amount "200001"
    Then I verify the amount exceeds error message

    #TCN003-007
  @FX05
  Scenario: Validate Foreign Exchange BUY USD transaction page
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "111111"
    When I click on Foreign Exchange button in dashboard
    And I click BUYUSD button, select account and enter USD amount "5"
    And I select the value "Travel" in purpose dropdown section
    And I click the Next Button in FX
    And I click the SIGNATURE button
    And I click the save button in Signature screen
    And I click on Terms and Conditions options in E-Signature screen
    Then I Verify Terms and Conditions title in E-Signature screen
    And I click on OK button in E-Signature screen
    And I click the Next Button
    When I Click the Edit button in FX
    And I select USD amount "10"
    And I click the Update button in Buy USD section
    Then I Verify the Buying "USD 10.00" and Fromaccount "1022 2002 1750" and Purpose"Travel"
    When I click the Request Deal button in FX convert page
    When I click the Buy USD button in FX convert page
    And I Enter the OTP "111111" in OTP Page
    Then I verify the Deal Received Title message
    And I verify the DealSuccess message
    And I click the OK button


  @FX06
  Scenario: Validate Foreign Exchange SELL USD transaction page
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "111111"
    When I click on Foreign Exchange button in dashboard
    And I click SELLUSD button, select account and enter USD amount "5"
    #And I select the value "Travel" in purpose dropdown section
    And I click the Next Button in FX
    And I click the SIGNATURE button
    And I click the save button in Signature screen
    And I click on Terms and Conditions options in E-Signature screen
    Then I Verify Terms and Conditions title in E-Signature screen
    And I click on OK button in E-Signature screen
    And I click the Next Button
    When I Click the Edit button in FX
    And I select USD amount "10"
    And I click the Update button in Buy USD section
    Then I Verify the Selling amount "USD 10.00" and Fromaccount "0300 1000 0249"
    When I click the Request Deal button in FX convert page
    When I click the Sell USD button in FX convert page
    And I Enter the OTP "111111" in OTP Page
    Then I verify the Deal Received Title message
    And I verify the DealSuccess message
    And I click the OK button
