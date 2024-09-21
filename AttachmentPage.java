package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AttachmentPage  extends BasePage
{
		Actions myActions = new Actions(driver);
		public AttachmentPage(WebDriver driver) {
			super(driver);
		}
		@FindBy (xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")
private WebElement addButton;
		
		public void clickonaddbutton()
		{
			addButton.click();
		}
@FindBy(xpath =" //*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/input")
private WebElement attachedFile;

public void attachment()
{
	attachedFile.sendKeys("C:\\Users\\user\\Desktop\\EXCEL.xlsx");
}
			
@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[2]/div/div/div/div[2]/textarea ")
private WebElement comment;

public void addComment()
{
	comment.sendKeys("Document");
}

@FindBy(xpath= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/button[2]")
private WebElement save;

public void clickonsavebutton()
{
	save.click();
}



@FindBy (xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button/i")
private WebElement addButton2;
		
		public void clickonaddbutton2()
		{
			addButton2.click();

		}
@FindBy(xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/input ")
private WebElement attachedFile2;

public void attachment2()
{
	attachedFile.sendKeys("C:\\Users\\user\\Desktop\\Inspire Honda.docx");
}
			
@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[2]/div/div/div/div[2]/textarea ")
private WebElement comment0;

public void addComment0()
{
	comment.sendKeys("Document2");
}
				
@FindBy(xpath= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/button[2]")
private WebElement save0;

public void clickonsavebutton0()
{
	save0.click();
}




@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[3]/div/div[2]/div/div/div[1]/div/div/label/span/i")
private WebElement selectattachedFile;

@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[3]/div/div[2]/div/div/div[8]/div/button[3]/i")
private WebElement downloadSelectedFile;

public void SelectandDownloadAttachedFile()
{
	selectattachedFile.click();
	downloadSelectedFile.click();
}

@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[3]/div/div[2]/div/div/div[8]/div/button[1]/i")
private WebElement editDocument;

@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/div/div/div/div[2]/textarea")
private WebElement comment2;

@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[4]/button[2]")
private WebElement save2;

public void SelectAndEditDocument()
{
	selectattachedFile.click();
	editDocument.click();
	myActions.click(comment2)
	.keyDown(Keys.CONTROL)               
	.sendKeys("a")
	.keyUp(Keys.CONTROL)
	.perform();
	myActions.keyDown(Keys.DELETE)
	.keyUp(Keys.DELETE).
	sendKeys("Excel Document").perform();
	save2.click();
}


@FindBy (xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[3]/div/div[1]/div/div[1]/div/label/span/i")
private WebElement selectAll;

@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[2]/div/div/button/i")
private WebElement deleteAll;

@FindBy(xpath="//*[@id='app']/div[3]/div/div/div/div[3]/button[2]/i")
private WebElement confirmDelete;

public void selectAndDeletefile()
{
	selectAll.click();
	deleteAll.click();
	confirmDelete.click();
}

public void printallElementinaRow()
{
	for(int i = 1; i<=2; i++) {							
		 for(int j = 2; j<=4; j++)
		 {
			 WebElement Celldata = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[3]/div/div[2]/div["+i+"]/div/div["+j+"]"));
			 System.out.println(Celldata.getText());
		 }


}


}
}
