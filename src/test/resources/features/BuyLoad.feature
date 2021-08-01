# Author: Sundaresan Jeyamani
# Functionality: BuyLoad
# Jira ID: ?
# Jira URL: ?


 @BuyLoad
Feature: BuyLoad

  @BuyLoad1
  Scenario:Validation of Buyload on clicking Select Contact from buyload
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist

  @BuyLoad2
  Scenario:Validation of contacts in contacts screen using name of user in MyContacts
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I enter the name "Sundar" in search field
    And I click the search result
    And I click the Next Button
    And I click the from account number
    And I select the value "100" in buy load screen
    And I click the Next Button
    And I click purchaseload button
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button in buyload
    And I verify tansfer successful displayed
    #And I Verify the buyload details "" and "" and ""

  @BuyLoad3
  Scenario:Validation of contacts in contacts screen using Mobile number of user in MyContacts
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I enter the name "9457946537" in search field
    And I click the search result
    And I click the Next Button
    And I click the from account number
    And I select the value "100" in buy load screen
    And I click the Next Button
    And I click purchaseload button
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button in buyload
    And I verify tansfer successful displayed
    #And I Verify the buyload details "" and "" and ""

  @BuyLoad4
  Scenario:Validation of contacts in contacts screen using Mobile number of user in Favorites
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I click the favourite link
    And I enter the name "9457946537" in search field
    And I click the search result
    And I click the Next Button
    And I click the from account number
    And I select the value "100" in buy load screen
    And I click the Next Button
    And I click purchaseload button
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button in buyload
    And I verify tansfer successful displayed
    #And I Verify the buyload details "" and "" and ""

  @BuyLoad5
  Scenario:Validation of contacts in contacts screen using name of user in Favorites
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I click the favourite link
    And I enter the name "Sundar" in search field
    And I click the search result
    And I click the Next Button
    And I click the from account number
    And I select the value "100" in buy load screen
    And I click the Next Button
    And I click purchaseload button
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button in buyload
    And I verify tansfer successful displayed
    #And I Verify the buyload details "" and "" and ""

  @BuyLoad6
  Scenario:Validation of Buyload more than account current balance
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I click the favourite link
    And I enter the name "Sundar" in search field
    And I click the search result
    And I click the Next Button
    And I click the from account number low balance
    And I select the value "100" in buy load screen
    And I click the Next Button
    And I verify the error message low balance account

  @BuyLoad7
    Scenario: Validation of navigating to Buy load screen on clicking new purchase button in Buy load success page
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I click the favourite link
    And I enter the name "Sundar" in search field
    And I click the search result
    And I click the Next Button
    And I click the from account number
    And I select the value "100" in buy load screen
    And I click the Next Button
    And I click purchaseload button
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit Button in buyload
    And I verify tansfer successful displayed
    And I verify the new purchase link
    And I verify the select contact is exist

  @BuyLoad8
  Scenario: Validation of navigating to Buyload screen on clicking back button in Review and purchase
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I click the favourite link
    And I enter the name "Sundar" in search field
    And I click the search result
    And I click the Next Button
    And I click the from account number
    And I select the value "100" in buy load screen
    And I click the Next Button
    And I Click Back button
    And I Verify the Dashboard page is displayed
    And I Click the Logout Button

  @BuyLoad9
  Scenario: Validation of navigating to Buyload screen on clicking back button in purachase from
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I click the favourite link
    And I enter the name "Sundar" in search field
    And I click the search result
    And I click the Next Button
    And I Click Back button
    And I Verify the Dashboard page is displayed
    And I Click the Logout Button

  @BuyLoad10
  Scenario:Validation of entering invalid OTP in Buy Load Transaction
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I click the favourite link
    And I enter the name "Sundar" in search field
    And I click the search result
    And I click the Next Button
    And I click the from account number
    And I select the value "100" in buy load screen
    And I click the Next Button
    And I click purchaseload button
    And I Enter the OTP "555555" in OTP Page
    And I click the Submit Button in buyload
    And I verify the Invalid OTP error message

  @BuyLoad11
  Scenario:Validation of editing from account,amount and mobile number in review and purchase screen
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I click the favourite link
    And I enter the name "Sundar" in search field
    And I click the search result
    And I click the Next Button
    And I click the from account number
    And I select the value "100" in buy load screen
    And I click the Next Button
    And I click the fromaccount edit button
    And I click the from account number
    And I click the mobilenumber edit button
    And I enter the mobilenumber "09457946537"
    And I click the Next Button
    And I select the value "100" in buy load screen
    And I click the Next Button
    And I click the amount edit button
    And I select the value "100" in buy load screen
    And I click the Next Button


  @BuyLoad12
  Scenario:Validation of navigating to cancel purchase popup on clicking Cancel button in Review and Purchase
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I click the favourite link
    And I enter the name "Sundar" in search field
    And I click the search result
    And I click the Next Button
    And I click the from account number
    And I select the value "100" in buy load screen
    And I click the Next Button
    And I click the Cancel button
    And I click the cancel purchase button
    And I verify the select contact is exist

  @BuyLoad13
  Scenario:Validation of entering valid and invalid Mobile number
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I click select contact in the buyload page
    And I verify the mobile number is exist
    And I click the select from list
    And I click the favourite link
    And I enter the name "Sundar" in search field
    And I click the search result
    #And I enter the mobilenumber "09457946537"
    And I Verify the next button is enabled
    And I enter the mobilenumber "09841011885"
    And I verify the "Please enter a valid PH Mobile Number." error message

  @BuyLoad14
  Scenario:Validation of mycontacts and favourites search using Name,Mobile Number
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I Click the Manage contacts link in the Buyload
    And I enter the name"sundar"
    And I click the search icon in buyload
    And I verify the search results "Sundar" and "09457946537"
    And I enter the name"09457946537"
    And I click the search icon in buyload
    And I verify the search results "Sundar" and "09457946537"
    And I click the favourite link in buyload
    And I enter the name"sundar"
    And I click the search icon in buyload
    And I verify the search results "Sundar" and "09457946537"
    And I enter the name"09457946537"
    And I click the search icon in buyload
    And I verify the search results "Sundar" and "09457946537"

  @BuyLoad15
  Scenario:Validation of edit and delete contact in mycontacts
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I Click the Manage contacts link in the Buyload
    And I click the addcontact in buyload
    And I enter the name "mycontacts" and mobile"09841011885" in add contact deatils
    And I click the save button in manage contact
    And I enter the name"09841011885"
    And I click the search icon in buyload
    And I verify the search results "mycontacts" and "09841011885"
    And I click the search result link
    And I click the edit button in manage contact
    And I change the buyload contat name"mycontactsnew"
    And I click the update Button
    And I enter the name"09841011885"
    And I click the search icon in buyload
    And I verify the search results "mycontactsnew" and "09841011885"
    And I click the search result link
    And I click the delete button in manage contact
    And I click the Yes button
    And I enter the name"09841011885"
    And I click the search icon in buyload
    And I verify "No enrolled contacts found"

  @BuyLoad16
  Scenario:Validation of edit and delete contact in favuorites
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the BuyLoad link in the send request page
    Then I Click the Manage contacts link in the Buyload
    And I click the favourite link in buyload
    And I click the addcontact in buyload
    And I enter the name "favuorites" and mobile"09841011885" in add contact deatils
    And I click the save button in manage contact
    And I enter the name"09841011885"
    And I click the search icon in buyload
    And I verify the search results "favuorites" and "09841011885"
    And I click the search result link
    And I click the edit button in manage contact
    And I change the buyload contat name"favuoritesnew"
    And I click the update Button
    And I enter the name"09841011885"
    And I click the search icon in buyload
    And I verify the search results "favuoritesnew" and "09841011885"
    And I click the search result link
    And I click the delete button in manage contact
    And I click the Yes button
    And I enter the name"09841011885"
    And I click the search icon in buyload
    And I verify "No enrolled contacts found"



