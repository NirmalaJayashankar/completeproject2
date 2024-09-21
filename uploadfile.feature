
@myinfo_uploadfile
Feature:Ess user should able to edite/upload photogrsph and save.

 Background:
 Login to OrangeHRM Site
    Given User navigated to OrangeHRM Login Page
    When User enters username
    And User enters password
    And User clicks on Login button
     When User Clicks on Myinfo Module.
   
    
    @myinfo_uploadfile_01
    
      Scenario: ESS user should able to edit/upload the profile photo by clicking on photograph
      When User should click on Profile Photo.
      And Click on Add Icon.
         And Click on Save.
      