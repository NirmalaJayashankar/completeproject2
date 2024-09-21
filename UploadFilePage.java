package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class UploadFilePage	extends BasePage{

		Actions myActions = new Actions(driver);
		public UploadFilePage(WebDriver driver)
		{
			super(driver);
		}

		@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/img")
		private WebElement photograph;
		
		public void clickOnPhotograph()
		{
			photograph.click();
		}
		
		@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[1]/div/div/div[2]/input")
		private WebElement addFile;
		
		public void clickOnAddIcon()
		{
			addFile.sendKeys("C:\\Users\\user\\Desktop\\spider.png");
		}
		
		
		@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/button")
		private WebElement save;
		
		public void clickOnSave()
		{
			save.click();
		}
		
		
		
		
}
