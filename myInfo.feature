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
@myInfo_001
Feature: Enter Personal Details of employee and save in MyInfoModule.

  Background: Login to OrangeHRM Site
    Given User navigated to OrangeHRM Login Page
    When User enters username
    And User enters password
    And User clicks on Login button
    Then User should be on dashboard page
    When User click on PIM module.
    Then Click on Configuration Drop-down.
    And Select Optional Fields.
    And Click on RadioButton of Show Deprecated Fields.
    Then Save the details.

  @myInfo_personalD_001
  Scenario: Enter Personal Details in My Info Module.
    When User Clicks on Myinfo Module.
    And User Clicks on PersonalDetails button.
    Then Employee Personal details field should appear.
    When User Should enter FirstName
    And User Should Enter MiddleName
    And User Should enter LastName
    And User Should enter EmployeeID.
    And Enter Other ID.
    When If there is Nickname Field then enter nickname.
    When User should enter driverlicensenumber.
    Then user should select license expiry date.
    And user should select Nationality.
    And user should select MaritalStatus.
    And user should select Date of Birth.
    And User should select Gender.
    And User should Enter Military Service
    And Select smoker button.
       Then User should save the details.
 And Select blood group
 Then Click save
 