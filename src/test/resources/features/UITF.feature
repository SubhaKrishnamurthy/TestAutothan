# Author: Subha
# Functionality: UITF validation
# Jira ID: ?
# Jira URL: ?

@UITF
Feature: UITF Validation

  #TCUITF02
  @UITF01
  Scenario: Validation of adding the UITF account on UITF account number field
    Given I'm on login page of UB online banking application with user "padmapriyah1" otp "222222"
    When I click on Add existing account
    Then I verify next button is disabled when I leave account number field as blank
    Then I verify next button is disabled when I Enter account number with less than 12 digits
    Then I verify Next button is enabled when I enter account number more than 16 digits and should not allow more than 16 digits
    Then I verify Invalid account number error message is displayed when I Enter the non existing UITF account number

  #TCUITF03
  @UITF02
   Scenario: Validation of Account details screen and Validation of Recent transaction screen
    Given I'm on login page of UB online banking application with user "padmapriyah1" otp "222222"
    When I click on the UITF account in the dashboard
    Then I verify the recent transactions label and view more button
    And I verify the other buttons after clicking the view more button

    #TCUITF04
  @UITF03
    Scenario: Validation of Transaction details screen
    Given I'm on login page of UB online banking application with user "padmapriyah1" otp "222222"
    When I click on the UITF account in the dashboard
    Then I verify the recent transactions label and view more button
    When I click on the Subscription product
    Then I Verify whether the Subscription Transaction details screen is displayed
    #When I click on the UITF account in the dashboard
    #When I click on the Redemption product
    #Then I Verify whether the Redemption Transaction details screen is displayed

  #TCUITF07
  @UITF04
    Scenario: Validation of whether user can view the UITF option in other option section, permission page for UITF products, UITF product list with various filters and filter the productunder dashboard
    Given I'm on login page of UB online banking application with user "padmapriyah1" otp "222222"
    When I click on the UITF element in the dashboard
    When user selects the filter as All
    Then I verify whether the user can view the all UITF products in the list
    When user selects the filter as PHP fixed income
    Then I verify whether the user can view the list of UITF product related to PHP fixed income
    When user selects the filter as USD fixed income
    Then I verify whether the user can view the list of UITF product related toUSD fixed income
    When user selects the filter as Equity
    Then I verify whether the user can view the list of UITF product related to Equity
    When user selects the filter as Multi-Asset
    Then I verify whether the user can view the list of UITF product related to Multi-Asset

    #TCUITF08
  @UITF05
  Scenario: Validation of user can view the UITF product details screen  under dashboard
    Given I'm on login page of UB online banking application with user "padmapriyah1" otp "222222"
    When I click on the UITF element in the dashboard
    When user can click on particular product in the list
    Then I Verify whether the user can view all the performances and also product details of product by chart

    #TCUITF05
  @UITF06
  Scenario: Validation of user can perform UITF subscription
    Given I'm on login page of UB online banking application with user "padmapriyah1" otp "222222"
    When I click on the UITF account in the dashboard
    And I click on Subscribe button
    And I provide all subscription details in Subscription Form page
    And I proceed Subscribe in Subscription Review page
    Then I verify the success message in Subscription Success page

#TCUITF06
#  @UITF07
#  Scenario: Validation of user can perform UITF Redemption
#    Given I'm on login page of UB online banking application with user "padmapriyah1" otp "222222"
#    When I click on the UITF account in the dashboard
#    And I click on redeem button
#    And I provide all redemption details in Redemption Form page
#    And I proceed redeem in Redemption Review page
#    Then I verify the success message in Redemption Success page



