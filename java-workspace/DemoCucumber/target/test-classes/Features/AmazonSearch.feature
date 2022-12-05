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
Feature: AmazonSearch

  Background: Product Search
    Given I am on Amazon search page
    When I search for product "laptops"
    Then Results for product "laptops" are displayed

  @tag1
  Scenario: Filter By Price 
    When I filter using price "₹20,000 – ₹30,000"
    Then The results are filtered
  
  @tag1
  Scenario: Sort Results
    When I sort by "Avg. Customer Review"
    Then The results are sorted
    