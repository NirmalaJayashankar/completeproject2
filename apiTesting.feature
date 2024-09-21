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
@apiTesting
Feature: API testing Scenario.

  @apiTestingGetMethod
  Scenario Outline: Validate the details of GET request.
    When User send a GET request to get the details of user"<user>"
    Then The response status code should be 200.
    And First name should be equal to "<FirstName>"

    Examples: 
      | user | FirstName |
      |    1 | George    |
      
      
      @apiTestingPostMethod
      Scenario: Validate the creation of user
      When I send a Post request with user details
      Then New user has to be created with the specified details
       
	 @apiTestingPostMethod_DDT
      Scenario Outline: Validate the creation of user
      When i send POST request with user details as "<name>" and "<job>"
      Then The status code should be 201
      And the response body should contain name as "<name>" and job as "<job>"
      
      Examples:
      |name|job|
      |Nirmala|Student|
      
      @apiTestingdeleteMethod
      
      Scenario:  Validate the Deletion of user
      When I send Delete Request of a user.
      Then The Statuscode should be 204
      