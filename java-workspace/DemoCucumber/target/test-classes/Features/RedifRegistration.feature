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
Feature: Rediff

  @tag1
  Scenario: Rediff Registration
    Given I am on Rediff registration page
    When I enter registration details as
    |fullName | Preetam Maske |
    |mailId		| preetam.maske@gmail.com	|
    |password | preetam123		|
   	|gender		| m							|
   	|date_day	|	10						|
   	|date_mon	|	JAN						|
   	|Date_Year|	2000					|
   	|city			| Gurgaon				|
   	And I click on create account
   	Then Error "Invalid captcha code." is displayed