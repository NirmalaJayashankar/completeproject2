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
Feature: Add attachment file in PersonalDetails and delete records in the table

Background: Login to OrangeHRM Site
    Given User navigated to OrangeHRM Login Page
    When User enters username
    And User enters password
    And User clicks on Login button
     When User Clicks on Myinfo Module.
    And User Clicks on PersonalDetails button.
    Then Employee Personal details field should appear.
    
  @attachments
  Scenario: User should attach the document to records.
  
  When User click on Add button 
  Then User should select the file need to be attached
  And User should add comments in Commentfield
  And save the Details.
  Then Add one more File
 And Select and Download attached file.
And Select and Edit attached File.
 And Print all the document in a table
#  Then Search attached document.
And Delete all the document