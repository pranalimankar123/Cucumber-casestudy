package SDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sd2 {
	WebDriver driver;
	@Given("Alex has registered in to TestMeApp")
	public void alex_has_registered_in_to_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Selenium\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp");
        driver.findElement(By.linkText("SignUp")).click();
        driver.findElement(By.name("userName")).sendKeys("alex123");
        driver.findElement(By.name("firstName")).sendKeys("Alex");
        driver.findElement(By.name("lastName")).sendKeys("Alex1");
        driver.findElement(By.name("password")).sendKeys("pass@123");
        driver.findElement(By.name("confirmPassword")).sendKeys("pass@123");
        driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
        driver.findElement(By.name("emailAddress")).sendKeys("email@gmail.com");
        driver.findElement(By.name("mobileNumber")).sendKeys("9867567875");
        driver.findElement(By.name("dob")).sendKeys("04/12/1998");
        driver.findElement(By.name("address")).sendKeys("Pune");
        driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]/option[2]")).click();
        driver.findElement(By.name("answer")).sendKeys("pink");
        driver.findElement(By.name("Submit")).click();
        
        //driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.name("userName")).sendKeys("alex123");
	    driver.findElement(By.name("password")).sendKeys("pass@123");
	    driver.findElement(By.name("Login")).click();
        

	}

	@When("Alex search a particular product like headphone")
	public void alex_search_a_particular_product_like_headphone() throws InterruptedException {
		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input"));
		Actions a=new Actions(driver);
		a.keyDown(search, Keys.SHIFT).sendKeys("head").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(4000);
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	
	@When("try to proceed to payment")
	public void try_to_proceed_to_payment() {
		Actions a= new Actions(driver);
		WebElement addtocart=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a/span"));
        a.moveToElement(addtocart).click().build().perform();
        driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	}


	@Then("TestMeApp verify the success page")
	public void testmeapp_verify_the_success_page() throws InterruptedException {
driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
		
		driver.findElement(By.name("ShippingAdd")).sendKeys("Mumbai");
		
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");

		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
		
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		
	}



}
