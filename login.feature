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

#@tag
#Feature: Orange HRM login feature

 # @tag1
  #Scenario: Login to orenge HRM Site.
   #Given Chrome browser is launched.
    #And user navigated to Orange HRM Login Page.
    #When User enters UserName.
    #And User Enters password.
    #And User clicks on Login button.
    #Then user should be on Dashboard page.

  #@tag2
  #Scenario: Login to Orange HRM site with parameters.
  # Given Chrome browser is launched.
  #  And user navigated to Orange HRM Login Page.
  #  When User Enters username "Admin"
  #  And User Enters password "admin123"
  #  And User clicks on Login button.
  #  Then user should be on Dashboard page.
    
  #  @tag3
   # Scenario Outline: Login to Orange HRM with differant set of parameters(DDT)
   # Given Chrome browser is launched.
   # And user navigated to Orange HRM Login Page.
   # When User Enters username "<username>"
   # And User Enters password "<password>"
    #And User clicks on Login button.
    #Then user shoul see the text with tagname"<tagname>"
   # Then user should see the text "<text>" in current page URL.
    
    
   # Examples: 
   # | username | password | tagname |text|
   # |   Admin  | admin1234 | 		h5	|login|
   # |aadmins   | admins123|		h5	|login|
   # |Admin     | admin123 |		h6	|dashboard|
    @tagLogin
Feature: Orange HRM Login feature

  @tag1
  Scenario: Login to OrangeHRM Site
    Given User navigated to OrangeHRM Login Page
    When User enters username
    And User enters password
    And User clicks on Login button
    Then User should be on dashboard page
	
	@tag2
  Scenario: Login to OrangeHRM Site with parameters
    #Given Chrome browser is launched
    And User navigated to OrangeHRM Login Page
   # When User enters username "Admin"
    #And User enters password "admin123"
    #And User clicks on Login button
    #Then User should be on dashboard page
    