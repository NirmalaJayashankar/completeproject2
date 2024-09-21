package stepDefinitions;

import org.openqa.selenium.WebDriver;

import driverManager.WebDriverManager;
import io.cucumber.java.en.*;
import pageObjects.MyInfoPage;
import pageObjects.UploadFilePage;

public class UploadFileStepDefinition {
	WebDriver driver = WebDriverManager.getDriver();
	UploadFilePage uploadfile = new UploadFilePage(driver);

	@When("User should click on Profile Photo.")
	public void user_should_click_on_profile_photo() {
		uploadfile.clickOnPhotograph();
	}

	@When("Click on Add Icon.")
	public void click_on_add_icon() {
		uploadfile.clickOnAddIcon();
	    
	}

	
	@Then("Click on Save.")
	public void click_on_save() {
		
		uploadfile.clickOnSave();
	}

}
