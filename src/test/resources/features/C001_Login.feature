# Author: Sundaresan Jeyamani
# Functionality: Login page validation
# Jira ID: ?
# Jira URL: ?


@Regression @Login
Feature: Login Page Validation


  @Login1
  Scenario: Validation of Login functionality with valid and Invalid inputs
    Given I'm on login page of convergent banking mobile application

  @Login2
  Scenario: Validation of creation of BRM user role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation "BRM" details