package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class purchase {
	WebDriver driver;
	@Given("TestMeApp opened by user")
	public void testmeapp_opened_by_user() {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.navigate().to("http://localhost:8083/TestMeApp/");
		 driver.findElement(By.partialLinkText("SignIn")).click();
	}


	@When("User enter username as {string} in username field")
	public void user_enter_username_as_in_username_field(String un) {
		
		driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("user enter password as {string} in password{int} field")
	public void user_enter_password_as_in_password_field(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Then("user press Login button")
	public void user_press_Login_button() {
		driver.findElement(By.name("Login")).click();
	    
	}

	@Then("Login done successfully")
	public void login_done_successfully() {
		Assert.assertTrue(driver.getTitle().contains("Home"));
	    
	}

	@When("user points to all categories")
	public void user_points_to_all_categories() {
		

		driver.findElement(By.partialLinkText("All Categories")).click();
	}

	@When("user selects Electronics")
	public void user_selects_Electronics() {
		driver.findElement(By.linkText("Electronics")).click();
	    
	}

	@Then("user selects Headphone")
	public void user_selects_Headphone() {
		
		driver.findElement(By.linkText("Head Phone")).click();
	}

	@Then("user searches for headphone")
	public void user_searches_for_headphone() {
	    driver.findElement(By.xpath("//input[@placeholder='Search here...']")).sendKeys("head");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user adds headphone to cart")
	public void user_adds_headphone_to_cart() {
		driver.findElement(By.partialLinkText("Add to cart")).click();
		
	}

	@Then("user click on cart")
	public void user_click_on_cart() {
		driver.findElement(By.partialLinkText("Cart")).click();
	}

	@Then("user clicks on checkout")
	public void user_clicks_on_checkout() {
		driver.findElement(By.partialLinkText("Checkout")).click();
	}

	@Then("appliance bought")
	public void appliance_bought() {
	    System.out.println("Head Phones bought");
	    driver.close();
	}


}
