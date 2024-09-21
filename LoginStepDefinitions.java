package stepDefinitions;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import driverManager.WebDriverManager;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class LoginStepDefinitions {
//	WebDriver driver;
	LoginPage loginPage;
	WebDriver driver = WebDriverManager.getDriver();
	/*
	 * @Given("Chrome browser is launched") public void chrome_browser_is_launched()
	 * { driver = new ChromeDriver(); driver.manage().window().maximize();
	 * System.out.println("Chrome browser launched");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
	 */

	@Given("User navigated to OrangeHRM Login Page")
	public void user_navigated_to_orange_hrm_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enters username")
	public void user_enters_username() {
		loginPage = new LoginPage(driver);
		loginPage.enterUserName("Admin");
	}

	@When("User enters password")
	public void user_enters_password() {
		loginPage.enterPassword("admin123");
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}

	@Then("User should be on dashboard page")
	public void user_should_be_on_dashboard_page() {
		WebElement dashboard = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span"));
		assertTrue(dashboard.isDisplayed());
	}

}







/*
 * package stepDefinitions;
 * 
 * import static org.junit.Assert.assertTrue;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import driverManager.WebDriverManager; import io.cucumber.java.en.*; import
 * pageObjects.LoginPage;
 * 
 * public class LoginStepDefinitions {
 * 
 * WebDriver driver = WebDriverManager.getDriver(); LoginPage loginPage = new
 * LoginPage(driver);
 * 
 * 
 * 
 * @Given("Chrome browser is launched.") public void
 * chrome_browser_is_launched() {
 * 
 * driver.manage().window().maximize();
 * System.out.println("Chrome browser launched");
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 * 
 * 
 * }
 * 
 * @Given("user navigated to Orange HRM Login Page.") public void
 * user_navigated_to_orange_hrm_login_page() { driver.get(
 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 * 
 * }
 * 
 * 
 * @When("User enters UserName.") public void user_enters_user_name() {
 * WebElement uname = driver.findElement(By.name("username"));
 * uname.sendKeys("Admin"); }
 * 
 * @When("User Enters password.") public void user_enters_password() {
 * WebElement passwordtxtbox = driver.findElement(By.name("password"));
 * passwordtxtbox.sendKeys("admin123"); }
 * 
 * @When("User clicks on Login button.") public void
 * user_clicks_on_login_button() { loginPage.clickOnLogin(); }
 * 
 * 
 * @When("User Enters username {string}") public void
 * user_enters_username(String username) {
 * 
 * loginPage.enterUserName(username); }
 * 
 * @When("User Enters password {string}") public void
 * user_enters_password(String password) { // loginPage = new LoginPage(driver);
 * loginPage.enterPassword(password); }
 * 
 * // @When("User clicks on Login button.") // public void
 * user_clicks_on_login_button() { // loginPage = new LoginPage(driver); //
 * loginPage.clickOnLogin(); // }
 * 
 * @Then("user should be on Dashboard page.") public void
 * user_should_be_on_dashboard_page() { WebElement dashboard =
 * driver.findElement(By.tagName("h6")); assertTrue(dashboard.isDisplayed()); }
 * 
 * @Then("user shoul see the text with tagname{string}") public void
 * user_shoul_see_the_text_with_tagname(String tagname) { WebElement text =
 * driver.findElement(By.tagName(tagname)); assertTrue(text.isDisplayed());
 * 
 * }
 * 
 * @Then("user should see the text {string} in current page URL.") public void
 * user_should_see_the_text_in_current_page_url(String text) { String
 * currentpageurl = driver.getCurrentUrl();
 * assertTrue(currentpageurl.contains(text)); } }
 */