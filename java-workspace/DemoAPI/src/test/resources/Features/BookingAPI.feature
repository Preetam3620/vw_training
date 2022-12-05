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
Feature: Booker API

  @tag1
  Scenario: Create Booking
    Given The request specification for create booking API
    | firstname | Jim 				|
    | lastname 	| Brown 			|
    | checkin 	| 2018-01-01 	|
    | checkout 	| 2019-01-01 	|
    When I invoke create booking api using POST request
    Then The status code is 200
    And Response has "booking.firstname" equal to "Jim" 

  @tag1 
  Scenario: Get Booking
    Given The request specification for get booking API
    When I invoke get booking api using GET request
    Then The status code is 200
    And Response has "booking.firstname" equal to "Sally"