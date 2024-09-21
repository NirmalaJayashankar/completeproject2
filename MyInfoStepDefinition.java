package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driverManager.WebDriverManager;
import io.cucumber.java.en.*;

import pageObjects.MyInfoPage;

public class MyInfoStepDefinition {
	WebDriver driver = WebDriverManager.getDriver();
	MyInfoPage myinfo = new MyInfoPage(driver);
			
	
	@When("User Clicks on Myinfo Module.")
	public void user_clicks_on_myinfo_module() {
		myinfo.clickonmyinfo();
		
	}

	@When("User Clicks on PersonalDetails button.")
	public void user_clicks_on_personal_details_button() {
		myinfo.clickonpersonaldetails();
	}

	@Then("Employee Personal details field should appear.")
	public void employee_personal_details_field_should_appear() {
	    myinfo.personalDetailsHeadingShouldAppear();
	}

	@When("User Should enter FirstName")
	public void user_should_enter_first_name_firstname() {
		myinfo.enterfirstname("Nirmala");
	}

	@When("User Should Enter MiddleName")
	public void user_should_enter_middle_name_middlename() {
		myinfo.entermiddlename("Kiruvale");
	}

	@When("User Should enter LastName")
	public void user_should_enter_last_name() {
		myinfo.enterlastname("jayashankar");
	}
	
	@When("If there is Nickname Field then enter nickname.")
	public void if_there_is_nickname_field_then_enter_nickname() {
	   myinfo.ifthereisnicknamefieldentername();
	}

	@When("User Should enter EmployeeID.")
	public void user_should_enter_employee_id() {
		myinfo.enteremployeeID("12345");
	}
	
	@When("Enter Other ID.")
	public void enter_other_id() {
		myinfo.enterotherID("14281428");
	}

	@When("User should enter driverlicensenumber.")
	public void user_should_enter_driverlicensenumber() {
		myinfo.enterDriverLicenseNumber("ka12b6598");
		
	}
	
	@Then("user should select license expiry date.")
	public void user_should_select_license_expiry_date() {
		myinfo.selectExpiryDate("2027-06-08");
	}

	@Then("user should select Nationality.")
	public void user_should_select_nationality() {
		myinfo.selectnationality();
	}
	

	@Then("user should select MaritalStatus.")
	public void user_should_select_marital_status() {
	   myinfo.selectMeritalStatus();
	}



	
	@Then("user should select Date of Birth.")
	public void user_should_select_date_of_birth() {
		myinfo.selectDtaeOfBirth("1994-04-28");
	   
	}

	@Then("User should select Gender.")
	public void user_should_select_gender() {
		myinfo.selectGenderRadioButton();
	   
	}

	@Then("User should save the details.")
	public void user_should_save_the_details() {
		myinfo.clickOnSaveButton();

	}

	@When("User click on PIM module.")
	public void user_click_on_pim_module() {
		myinfo.clickonPIMModule();
	}
	@Then("Click on Configuration Drop-down.")
	public void click_on_configuration_drop_down() {
		myinfo.ClickonConfiguration();
	   
	}
	@Then("Select Optional Fields.")
	public void select_optional_fields() {
		myinfo.selectOptionalField();
	   
	}
	@Then("Click on RadioButton of Show Deprecated Fields.")
	public void click_on_radio_button_of_show_deprecated_fields() {
		myinfo.clickonradiobutton();
	}
	@Then("Save the details.")
	public void save_the_details() {
		myinfo.clickOnSaveBttn();
	}

	@Then("User should Enter Military Service")
	public void user_should_enter_military_service() {
		
		myinfo.entermilitaryService();
	}
	@Then("Select smoker button.")
	public void select_smoker_button() {
		myinfo.selectsmoker();
	   
	}

@Then("Select blood group")
public void Select_blood_group()
{
	myinfo.selectbloodgroup();
}

@Then("Click save")
public void Click_save()
{
	myinfo.clicksave();
}

}
