# Author: Sundaresan Jeyamani
# Functionality: PDDTS FundTransfer
# Jira ID: ?
# Jira URL: ?


 @PDDTS
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