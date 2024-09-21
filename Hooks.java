
  package stepDefinitions;
  import driverManager.WebDriverManager;
import io.cucumber.java.After; 
  import io.cucumber.java.Before;
  
  public class Hooks {
  
  @Before 
  public void setUp()
  {
	  // This will initialize the WebDriver before each scenario 
	  WebDriverManager.getDriver();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");

                   }
  
  
//  @After
//  public void tearDown()
//  { 
//	  // This will close the WebDriver after each scenario
//  WebDriverManager.closeDriver();
//  }
//  
  }
 