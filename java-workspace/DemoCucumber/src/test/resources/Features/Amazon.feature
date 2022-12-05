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
Feature: Amazon

  @tag1
  Scenario: Product Search
    Given I am on the Amazon search page
    When I search for "laptops"
    Then Results for "laptops" are displayed

  @tag2
  Scenario Outline: Product Search 
    Given I am on the Amazon search page
    When I search for a "<product>"
    Then Results for the "<product>" are displayed

    Examples: 
      | product |
      | mobiles |
      | shoes 	|
