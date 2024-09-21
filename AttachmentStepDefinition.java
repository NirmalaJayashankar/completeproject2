package stepDefinitions;

import org.openqa.selenium.WebDriver;

import driverManager.WebDriverManager;
import io.cucumber.java.en.*;
import pageObjects.AttachmentPage;


public class AttachmentStepDefinition {
	WebDriver driver = WebDriverManager.getDriver();
	AttachmentPage attachments= new AttachmentPage(driver);
	
	@When("User click on Add button")
	public void user_click_on_add_button() {
		attachments.clickonaddbutton();
	}
	@Then("User should select the file need to be attached")
	public void user_should_select_the_file_need_to_be_attached() {
		attachments.attachment();
	  
	}
	@Then("User should add comments in Commentfield")
	public void user_should_add_comments_in_commentfield() {
		attachments.addComment();
	    
	}
	@Then("save the Details.")
	public void save_the_details() {
		attachments.clickonsavebutton();
	    
	}

	@Then("Add one more File")
	public void Add_one_more_File() {
		attachments.clickonaddbutton2();
		attachments.attachment2();
		attachments.addComment0();
		attachments.clickonsavebutton0();
	}
	// Table Search
	
	@Then("Select and Delete the file")
	public void Select_and_Delete_the_file()
	{
		
		attachments.selectAndDeletefile();	   
	}
	
	@Then("Select and Download attached file.")
	public void select_and_download_attached_file() 
	{
		attachments.SelectandDownloadAttachedFile();
	}
	
	
	@Then("Select and Edit attached File.")
	public void select_and_edit_attached_file() 
	{
	  attachments.SelectAndEditDocument();
	}
	
	@Then("Print all the document in a table")
	public void Print_all_the_document_in_a_table()
	{
		attachments.printallElementinaRow();
	}
	
	
	@Then("Search attached document.")
	public void search_attached_document()
	{
	  
	}
	
	@Then("Delete all the document")
	public void Delete_all_the_document()
	{
		attachments.selectAndDeletefile();
	}


	
}
