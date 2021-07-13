# Author: Subha
# Functionality: FX validation
# Jira ID: ?
# Jira URL: ?

@SplitBills @Regression
Feature: SplitBills Functionality Validation

  #TSSB01
  @SB01
  Scenario Outline: Validation of successful SPLIT BILL transfer for  Evenly Split option where amount requested is divided equally and navigate to New transcation
  Given  I'm on login page of UB online banking application
    When I click the Split bills under receive money
    And I enter the amount field as "100"
    And I select the split option as "Evenly"
    And I add one participant as "Sundar"
    And I enter the request payment message as "Testing01"
    And I Select the from account in the displayed account list
    And I click the next button
    And I click the Request payemnt php button
    Then I Verify Congratulation message,"<FromAccountName>","<FromAccountNumber>","<RequesingAmount>","<TotalBill>","<YourAmount>","<message>","<DepositToAccName>","<DepositToAccNumber>"
    Then I Click the New Transaction button Link
    And I Click the Logout Button
    Examples:
    |FromAccountName| FromAccountNumber |RequesingAmount|TotalBill  |YourAmount|message   |DepositToAccName|DepositToAccNumber|
    |Sundar         | 09457946537       | PHP 50.00     | PHP 100.00|PHP 50.00 |Testing01 |CARIN - ACTIVE  |    1750          |

    #TSSB02
    @SB02
    Scenario Outline: Validation of successful SPLIT BILL  transfer for Unevenly split option where Participent amount details is requested separately and navigate to Dashboard
      Given  I'm on login page of UB online banking application
      When I click the Split bills under receive money
      And I enter the amount field as "200"
      And I select the split option as "Unevenly"
      And I add one participant as "Sundar"
      And I enter the request payment message as "Testing02"
      And I Select the from account in the displayed account list
      And I enter YourPortion amount as "150" and RequesingFrom amount as "50"
      And I click the next button
      And I click the Request payemnt php button
      Then I Verify Congratulation message,"<FromAccountName>","<FromAccountNumber>","<RequesingAmount>","<TotalBill>","<YourAmount>","<message>","<DepositToAccName>","<DepositToAccNumber>"
      Then I Click the Go to Dashboard button Link
      And I Click the Logout Button
      Examples:
        |FromAccountName| FromAccountNumber |RequesingAmount|TotalBill   |YourAmount |message  |DepositToAccName|DepositToAccNumber|
        |Sundar         | 09457946537        | PHP 50.00    | PHP 200.00 |PHP 150.00 |Testing02|CARIN - ACTIVE  |  1022 2002 1750 |

    #TSSB03
    @SB03
    Scenario Outline: Validation of  successful SPLIT BILL  transfer for Each as split option where Amount Requested is the same for each participants and navigate to New transcation
      Given  I'm on login page of UB online banking application
      When I click the Split bills under receive money
      And I enter the amount field as "200"
      And I select the split option as "Each"
      And I add one participant as "Sundar"
      And I enter the request payment message as "Testing02"
      And I Select the from account in the displayed account list
      And I enter YourPortion amount as "150" and RequesingFrom amount as "50"
      And I click the next button
      And I click the Request payemnt php button
      Then I Verify Congratulation message,"<FromAccountName>","<FromAccountNumber>","<RequesingAmount>","<TotalBill>","<YourAmount>","<message>","<DepositToAccName>","<DepositToAccNumber>"
      Then I Click the Go to Dashboard button Link
      And I Click the Logout Button
      Examples:
        |FromAccountName| FromAccountNumber |RequesingAmount|TotalBill   |YourAmount |message  |DepositToAccName|DepositToAccNumber|
        |Sundar         | 09457946537        | PHP 50.00    | PHP 200.00 |PHP 150.00 |Testing02|CARIN - ACTIVE   | 1022 2002 1750  |

      #TSSB04
      @SB04
    Scenario Outline: Validation of Edit option in Review and Request page
      Given I'm on login page of UB online banking application
      When I click the Split bills under receive money
      And I enter the amount field as "100"
      And I select the split option as "Each"
      And I add one participant as "Sundar"
      And I enter the request payment message as "Testing04"
      And I Select the from account in the displayed account list
      And I click the next button
      And I click the edit button
      And I add one participant as "Aa"
      And I click the update Button
      And I click the Request payemnt php button
      Then I Verify Congratulation message,"<FromAccountName>","<FromAccountNumber>","<RequesingAmount>","<TotalBill>","<YourAmount>","<message>","<DepositToAccName>","<DepositToAccNumber>"
      Then I Click the New Transaction button Link
      Then I verify dashboard page
      And I Click the Logout Button

        Examples:
          |FromAccountName     | FromAccountNumber |RequesingAmount|TotalBill   |YourAmount |message  |DepositToAccName|DepositToAccNumber|
          |aaOKG1kLcFJs1DVkZaed | 62235584891      | PHP 100.00    | PHP 100.00 |PHP 300.00 |Testing04|CARIN - ACTIVE  | 1022 2002 1750 |

     #TSSB05
    @SB05
   Scenario: Validation of Cancel option in Review and Request page
     Given I'm on login page of UB online banking application
     When I click the Split bills under receive money
     And I enter the amount field as "100"
     And I select the split option as "Each"
     And I add one participant as "Sundar"
     And I enter the request payment message as "Testing05"
     And I Select the from account in the displayed account list
     And I click the next button
     And I click the cancel button and click no button
     And I click the cancel button and confirm cancel
     Then I verify dashboard page