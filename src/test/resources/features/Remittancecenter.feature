# Author: Sundaresan Jeyamani
# Functionality: Remittancecenter
# Jira ID: ?
# Jira URL: ?


 @RC @Regression
Feature: Remittancecenter

  @RC1
  Scenario:Validation of remittance center option if user is able to login into convergent web application
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I verify the remittancecenter link
    And I click the remittancecenter link
    And I click the getstarted link
    And I verify remittancecenterlbl link

  @RC2
  Scenario:Validation if user is able to initiate a Palwan Express transaction when click Next transaction details screen
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I verify the remittancecenter link
    And I click the remittancecenter link
    And I click the getstarted link
    And I click palawan express link
    And I click the remittancecenter proceed link
    And I enter the amount "200" and enter the purpose "Remittancecenter"
    And I click the click to select account and select account from list
    And I click the Next Button
    Then I verify the Servive fee should be displayed
    And I verify the cancel and proceed button isexist
    And I click the proceed button
    Then I verify the Sendto page is displayed in RC

  @RC3
  Scenario:Validation if user is able to complete a Palwan Express transaction - Review and Send screen
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I verify the remittancecenter link
    And I click the remittancecenter link
    And I click the getstarted link
    And I click palawan express link
    And I click the remittancecenter proceed link
    And I enter the amount "200" and enter the purpose "Remittancecenter"
    And I click the click to select account and select account from list
    And I click the Next Button
    Then I verify the Servive fee should be displayed
    And I verify the cancel and proceed button isexist
    And I click the proceed button
    Then I verify the Sendto page is displayed in RC
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537"
    And I enter the Address details in PDDTS Address field
    And I enter the Firstname "Fname" and Middlename"Mname" and Lastname"Lname"
    And I Select DOB and Nationality
    And I click the Next Button
    And I Verify the from accountno"1756" accountname"BAUTISTA,SALVEREGINA,M" transferamt"PHP100.00"purpose"Test"
    And I verify the  name "Lname,FnameM." and DOB"2004" nationality"FILIPINO"
    And I verify the mobileno"639841011885" mailid"sundaresan.jeyamani@unionbankph.com"adddress"25,B1GarnerStreet,SanAntonio,Manila,MetroManila"

  @RC4
  Scenario:Valiadtion of valid Recipient details in Remittance center Recipient details screen
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I verify the remittancecenter link
    And I click the remittancecenter link
    And I click the getstarted link
    And I click palawan express link
    And I click the remittancecenter proceed link
    And I enter the amount "200" and enter the purpose "Remittancecenter"
    And I click the click to select account and select account from list
    And I click the Next Button
    Then I verify the Servive fee should be displayed
    And I verify the cancel and proceed button isexist
    And I click the proceed button
    Then I verify the Sendto page is displayed in RC
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537"
    And I enter the Address details in PDDTS Address field
    And I enter the Firstname "Fname" and Middlename"Mname" and Lastname"Lname"
    And I Select DOB and Nationality
    And I click the Next Button

  @RC5
  Scenario:Validation when Click NewTransaction button in the summary screen to navigate to SendRequest screen
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I verify the remittancecenter link
    And I click the remittancecenter link
    And I click the getstarted link
    And I click palawan express link
    And I click the remittancecenter proceed link
    And I enter the amount "200" and enter the purpose "Remittancecenter"
    And I click the click to select account and select account from list
    And I click the Next Button
    Then I verify the Servive fee should be displayed
    And I verify the cancel and proceed button isexist
    And I click the proceed button
    Then I verify the Sendto page is displayed in RC
    And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537"
    And I enter the Address details in PDDTS Address field
    And I enter the Firstname "Fname" and Middlename"Mname" and Lastname"Lname"
    And I Select DOB and Nationality
    And I click the Next Button
    And I Verify the from accountno"1756" accountname"BAUTISTA,SALVEREGINA,M" transferamt"PHP100.00"purpose"Test"
    And I verify the  name "Lname,FnameM." and DOB"2004" nationality"FILIPINO"
    And I verify the mobileno"639841011885" mailid"sundaresan.jeyamani@unionbankph.com"adddress"25,B1GarnerStreet,SanAntonio,Manila,MetroManila"
    And I verify the Gotit button displayed or not
    And I click the reviewandsend checkbox
    And I click the reviewandsend php button
    And I click the cancel button in remittance center reviewandsend
    And I click the reviewandsend php button
    And I click the proceed with transfer
    #Then I Verify the OTP Filed is page is displayed
    And I Enter the OTP "222222" in OTP Page
    And I click the Submit in remittance center
    Then I verify the Successful message is displayed
    Then I Click the New Transaction button Link
    And I click palawan express link is exist
    And I Click the Logout Button

  @RC6
  Scenario:Validation if user is able to initiate a Palwan Express transaction amount field - Transaction details screen
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
    When I click the Send/Request
    Then I verify the remittancecenter link
    And I click the remittancecenter link
    And I click the getstarted link
    And I click palawan express link
    And I click the remittancecenter proceed link
    And I enter the amount "" and enter the purpose "Remittancecenter"
    And I click the click to select account and select account from list
    And  I Verify the next button is not enabled


    @RC7
    Scenario: Validation if user is able to perform cancel and Proceed with transfer - Review and Send screen
      Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
      When I click the Send/Request
      Then I verify the remittancecenter link
      And I click the remittancecenter link
      And I click the getstarted link
      And I click palawan express link
      And I click the remittancecenter proceed link
      And I enter the amount "200" and enter the purpose "Remittancecenter"
      And I click the click to select account and select account from list
      And I click the Next Button
      Then I verify the Servive fee should be displayed
      And I verify the cancel and proceed button isexist
      And I click the proceed button
      Then I verify the Sendto page is displayed in RC
      And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537"
      And I enter the Address details in PDDTS Address field
      And I enter the Firstname "Fname" and Middlename"Mname" and Lastname"Lname"
      And I Select DOB and Nationality
      And I click the Next Button
      And I Verify the from accountno"1756" accountname"BAUTISTA,SALVEREGINA,M" transferamt"PHP100.00"purpose"Test"
      And I verify the  name "Lname,FnameM." and DOB"2004" nationality"FILIPINO"
      And I verify the mobileno"639841011885" mailid"sundaresan.jeyamani@unionbankph.com"adddress"25,B1GarnerStreet,SanAntonio,Manila,MetroManila"
      And I verify the Gotit button displayed or not
      And I click the reviewandsend checkbox
      And I click the reviewandsend php button
      And I click the cancel button in remittance center reviewandsend
      And I click the reviewandsend php button
      And I click the proceed with transfer

    @RC8
    Scenario:Validation if user is able to initiate a Palwan Express transaction purpose field - Transaction details screen
      Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
      When I click the Send/Request
      Then I verify the remittancecenter link
      And I click the remittancecenter link
      And I click the getstarted link
      And I click palawan express link
      And I click the remittancecenter proceed link
      And I enter the amount "200" and enter the purpose ""
      And I click the click to select account and select account from list
      And I verify Next button is not enabled

    @RC9
    Scenario:Validation of Recipient Address field with leave it as blank in Remittance center Recipient details screen
      Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
      When I click the Send/Request
      Then I verify the remittancecenter link
      And I click the remittancecenter link
      And I click the getstarted link
      And I click palawan express link
      And I click the remittancecenter proceed link
      And I enter the amount "200" and enter the purpose "Remittancecenter"
      And I click the click to select account and select account from list
      And I click the Next Button
      Then I verify the Servive fee should be displayed
      And I verify the cancel and proceed button isexist
      And I click the proceed button
      Then I verify the Sendto page is displayed in RC
      And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537"
      And I leave the Address is blank and verify the validation

    @RC10
    Scenario:Validation if user is able to edit Palwan Express transaction - Review and Send screen
      Given I'm on login page of UB online banking application with user "cbautotest1" otp "222222"
      When I click the Send/Request
      Then I verify the remittancecenter link
      And I click the remittancecenter link
      And I click the getstarted link
      And I click palawan express link
      And I click the remittancecenter proceed link
      And I enter the amount "200" and enter the purpose "Remittancecenter"
      And I click the click to select account and select account from list
      And I click the Next Button
      Then I verify the Servive fee should be displayed
      And I verify the cancel and proceed button isexist
      And I click the proceed button
      Then I verify the Sendto page is displayed in RC
      And I enter the recipient email "ubpcbautomation1@gmail.com" mobilenumber "9457946537"
      And I enter the Address details in PDDTS Address field
      And I enter the Firstname "Fname" and Middlename"Mname" and Lastname"Lname"
      And I Select DOB and Nationality
      And I click the Next Button
      And I Verify the from accountno"1756" accountname"BAUTISTA,SALVEREGINA,M" transferamt"PHP100.00"purpose"Test"
      And I verify the  name "Lname,FnameM." and DOB"2004" nationality"FILIPINO"
      And I verify the mobileno"639841011885" mailid"sundaresan.jeyamani@unionbankph.com"adddress"25,B1GarnerStreet,SanAntonio,Manila,MetroManila"
      And I verify the Gotit button displayed or not
      And I click the edit button in remittance center
      And I enter the Firstname "Fchangename" and Middlename"Mchangename" and Lastname"Lchangename"
      And I click the update button in remittance center
      And I verify the  name "Lchangename,FchangenameM." and DOB"2004" nationality"FILIPINO"




