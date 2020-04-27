package SDefination;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sd1 {
	WebDriver driver;
	
	@Given("user should navigates to TestMeApp on chrome browser")
	public void user_should_navigates_to_TestMeApp_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp");
	}

	@When("users should click on signUp link")
	public void users_should_click_on_signUp_link() {
	   driver.findElement(By.linkText("SignUp")).click();
	}

	@When("user enter with the username as {string}")
	public void user_enter_with_the_username_as(String user) {
	    driver.findElement(By.name("userName")).sendKeys(user);
	}

	@When("user enter with first name as {string}")
	public void user_enter_with_first_name_as(String firstn) {
		driver.findElement(By.name("firstName")).sendKeys(firstn);
	}

	@When("user enter with last name as {string}")
	public void user_enter_with_last_name_as(String lastn) {
		driver.findElement(By.name("lastName")).sendKeys(lastn);
	    
	}

	@When("user enter with password as {string}")
	public void user_enter_with_password_as(String pass) {
		driver.findElement(By.name("password")).sendKeys(pass);
	    
	}

	@When("user enter with confirm password as {string}")
	public void user_enter_with_confirm_password_as(String confirm) {
		driver.findElement(By.name("confirmPassword")).sendKeys(confirm);
	}

	@When("user selects the gender")
	public void user_selects_the_gender() {
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
	}

	@When("user enter with email as {string}")
	public void user_enter_with_email_as(String email) {
	    driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@When("user enter the mobile number as {string}")
	public void user_enter_the_mobile_number_as(String mob) {
		driver.findElement(By.name("mobileNumber")).sendKeys(mob);
	}

	@When("user enter the date of Birth as {string}")
	public void user_enter_the_date_of_Birth_as(String birth) {
		driver.findElement(By.name("dob")).sendKeys(birth);
	}

	@When("user enter with address as {string}")
	public void user_enter_with_address_as(String add) {
		driver.findElement(By.name("address")).sendKeys(add);
	}

	@When("user enter with security question")
	public void user_enter_with_security_question() {
	    driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]/option[2]")).click();
	}

	@When("user enter with answer as {string}")
	public void user_enter_with_answer_as(String color) {
		driver.findElement(By.name("answer")).sendKeys(color);
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
	    driver.findElement(By.name("Submit")).click();
	}

	@Then("user should verify registration success")
	public void user_should_verify_registration_success() {
		Assert.assertEquals(driver.getTitle(),"Login");
	    
	}
	
	@Given("user should click on SignIn link")
	public void user_should_click_on_SignIn_link() {
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@Given("user enters with username as {string}")
	public void user_enters_with_username_as(String user) {
	    driver.findElement(By.name("userName")).sendKeys(user);
	}

	@Given("username enters with password as {string}")
	public void username_enters_with_password_as(String pass) {
	    driver.findElement(By.name("password")).sendKeys(pass);
	}

	
	   
	
	@Given("user clicks on Lgn button")
	public void user_clicks_on_Lgn_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Given("user searches for product")
	public void user_searches_for_product() throws InterruptedException {
		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input"));
		Actions a=new Actions(driver);
		a.keyDown(search, Keys.SHIFT).sendKeys("head").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(4000);
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		/*WebElement elmt=driver.findElement(By.xpath("//a[@href='#']"));
        Actions a=new Actions(driver);
        a.moveToElement(elmt).click().build().perform();
        Thread.sleep(4000);
        WebElement subelmt=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/ul/li[1]/a/span"));
        
        a.moveToElement(subelmt).click().build().perform();
        Thread.sleep(4000);
        WebElement subelmt1=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/ul/li[1]/ul/li[1]/a/span"));
        a.moveToElement(subelmt1).click().build().perform();
*/
	}
	
	
	
	
	

	@Given("user adds the product to cart")
	public void user_adds_the_product_to_cart() {
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("user should verify product is added on cart or not")
	public void user_should_verify_product_is_added_on_cart_or_not() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	   Assert.assertEquals(driver.getTitle(), "View Cart");
	}




}
