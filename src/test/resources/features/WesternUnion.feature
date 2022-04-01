# Author: Subha
# Functionality: WesternUnion validation
# Jira ID: ?
# Jira URL: ?

@WU @Regression @RegressionNew
Feature: WesternUnion Functionality Validation

    #TC-WU-01
    @WU01
    Scenario: Validation if user is able to navigate to the Western union Deposit Cash screen
     Given I'm on login page of UB online banking application with user "wu0001" otp "111111"
     When I am on the western union page
     Then I verify the western union header
     And I Click the Logout Button

  #TC-WU-02
  @WU02
  Scenario: Validation if user is able to navigate to the Western union Deposit Cash screen
    Given I'm on login page of UB online banking application with user "wu0001" otp "111111"
    When I am on the western union page
    Then I verify the western union header
    And I enter mtcn code as "1234567890"
    Then I verify mtcn code as "1234567890"
    And I enter mtcn code as "123456789"
    Then I verify error message for entering less than 10 digits
    And I enter mtcn code as "12345678908976"
    Then I verify mtcn code as "1234567890"
    And I enter mtcn code as "ASCFD#$@%&^%djsbd"
    Then I verify mtcn code as ""
    And I enter mtcn amount as "0"
    Then I verify invalid amount error message
    And I Click the Logout Button

  #TC-WU-03
  @WU03
  Scenario: Validation of invalid mtcn code and amount entered
    Given I'm on login page of UB online banking application with user "wu0001" otp "111111"
    When I am on the western union page
    Then I verify the western union header
    And I enter mtcn code as "3769172332"
    And I enter mtcn amount as "10"
    And I enter the other details
    And I click the goals next button
    Then I verify invalid code error message
    And I click the goals ok button
    And I Click the Logout Button

    #TC-WU-04
  @WU04
    Scenario: Validation of MTCN code field when Duplicate/Repeated MTCN code is entered
    Given I'm on login page of UB online banking application with user "wu0001" otp "111111"
    When I am on the western union page
    Then I verify the western union header
    And I enter mtcn code as "8599229029"
    And I enter mtcn amount as "1.01"
    And I enter the other details
    And I click the goals next button
    Then I verify mtcn code already claimed error message
    And I click the goals ok button
    And I Click the Logout Button
