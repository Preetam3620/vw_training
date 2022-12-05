#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login

  @tag1
  Scenario: Valid Login
    Given I am on Echotrak login page
    When I enter "admin" and "admin123"
    And I click login button
    Then I can access my account
    
	Scenario: Invalid Login
    Given I am on Echotrak login page
    When I enter "guest" and "guest123"
    And I click login button
    Then An error message "Invalid Username/Passowrd" is displayed
 