package pageObjects;


import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyInfoPage extends BasePage{
	Actions myActions = new Actions(driver);
	public MyInfoPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath ="//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")	
	private WebElement myinfobttn;

	@FindBy(xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/a")	
	private WebElement personaldetailsbutton;

	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6")
	private WebElement personaldetailshead;

	@FindBy(name = "firstName")
	private WebElement firstnametextbox;


	@FindBy(name = "middleName")
	private WebElement middlenametextbox;

	@FindBy(name = "lastName")
	private WebElement lastnametextbox;

	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[1]/label")
	private WebElement nickname;

	@FindBy(xpath= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")
	private WebElement nicknametext;

	@FindBy(css ="#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > input")
	private WebElement employeeIDtextbox;

	@FindBy(xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")
	private WebElement otherID;
	

	@FindBy(xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")
	private WebElement licenseNumber;

	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
	private WebElement licenseExpirydate;


		@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div")
		private WebElement dropdown;
		
		@FindBy(xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div[83]/span")
		private WebElement Option;
		
		
		@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div")
		private WebElement maritalStatus;
		
		@FindBy(xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div[2]/div[3]/span")
		private WebElement status;

	@FindBy(xpath= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
	private WebElement dateOfBirth;

	@FindBy (xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span")
	private WebElement selectGender;

	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")
	private WebElement save;

	public void clickonmyinfo()
	{
		myinfobttn.click();
	}
	public void clickonpersonaldetails()
	{
		personaldetailsbutton.click();
	}

	public void enterfirstname(String firstname)
	{
		myActions.click(firstnametextbox)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL).perform();
		myActions.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();

		firstnametextbox.sendKeys(firstname);
	}

	public void entermiddlename(String middlename)
	{
		myActions.click(middlenametextbox)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL).perform();
		myActions.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();

		middlenametextbox.sendKeys(middlename);
	}
	public void enterlastname(String lastname)
	{
		myActions.click(lastnametextbox)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL).perform();
		myActions.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();

		lastnametextbox.sendKeys(lastname);
	}

	public void ifthereisnicknamefieldentername()
	{
	try
	{
		nicknametext.sendKeys("nimmu");
	}
	catch(Exception e)
	{
		System.out.println(e); 
	}

	}
		//			if(nickname.isDisplayed())
		//			{
		//				nicknametext.sendKeys("nimmu");
		//			}
		//			else
		//			{
		//		
		//				System.out.println("Nickname field not found");
		//			}

		//			
		//		if(nickname.isDisplayed()==true)
		//		{ 
		//			nicknametext.sendKeys("nimmu");
		//		}
		//		else if(nickname.isDisplayed()== false) 
		//		{
		//			 
		//			  System.out.println("Nickname Field not Displayed");
		//			 
		//		}
		//		else
		//		{
		//			System.out.println("invalid");	
		//		}
		//		
		
		
	public void enteremployeeID(String employeeID)
	{
		myActions.click(employeeIDtextbox)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL).perform();
		myActions.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();

		employeeIDtextbox.sendKeys(employeeID);

	}
	public void enterotherID(String otheriD)
	{
		myActions.click(otherID)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL).perform();
		myActions.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		otherID.sendKeys(otheriD);
	}
	public void personalDetailsHeadingShouldAppear()
	{
		assertTrue(personaldetailshead.isDisplayed());
		System.out.println("You are in personal Details page");
	}



	public void enterDriverLicenseNumber(String lNumber)
	{
		myActions.click(licenseNumber)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL).perform();
		myActions.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();

		licenseNumber.sendKeys(lNumber);
	}

	public void selectExpiryDate(String eDate)
	{

		myActions.click(licenseExpirydate)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL).perform();
		myActions.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();

		licenseExpirydate.sendKeys(eDate);
	}

		public void selectnationality()
		{
			dropdown.click();
			Option.click();
	    }
	
		
		public void selectMeritalStatus()
		{
			maritalStatus.click();
			status.click();
			
		}

	public void selectDtaeOfBirth(String dOB)
	{

		myActions.click(dateOfBirth)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL).perform();
		myActions.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		dateOfBirth.sendKeys(dOB);
	}

	public void selectGenderRadioButton()
	{
		selectGender.click();
	}

	public void clickOnSaveButton()
	{
		save.click();
	}
//PIM module
	
		
	
	@FindBy (xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
	private WebElement pIM;
	
	public void clickonPIMModule()
	{
	pIM.click();
	}
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span ")
	private WebElement configuration;
	
	public void ClickonConfiguration()
	{
		configuration.click();
	
	}
	
	@FindBy(xpath ="//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[1]/a")
	private WebElement optionField;
	
	public void selectOptionalField()
	{
		optionField.click();

	}
	

	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/label")
	private WebElement radiobttnField;
	
	
	public void clickonradiobutton()
	{
	if(radiobttnField.isSelected())
	{
		System.out.println("button is on");
		
	}
	else
	{
		radiobttnField.click();
	}
	}
	
	@FindBy(xpath =" //*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button")
	private WebElement saveButton;
	
	public void clickOnSaveBttn()
	{
		saveButton.click();

	}
	
	@FindBy(xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input")
	private WebElement militaryService;
	
	public void entermilitaryService()
	{
		militaryService.sendKeys("No");
	}
	
	@FindBy(xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[2]/div/div[2]/div/label/span/i")
	
	private WebElement smoker;

	public void selectsmoker()
	{
		smoker.click();
	}
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
	private WebElement selectbg;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[4]")
	private WebElement selectBpositive;
	
	
	public void selectbloodgroup()
	{
		selectbg.click();
		selectBpositive.click();
	}
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")
	private WebElement clickSave;
	
	public void clicksave()
	{
		clickSave.click();
	}

}

