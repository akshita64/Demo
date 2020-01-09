package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class DemoWebShop {
	 WebDriver driver= new ChromeDriver();	
	@Given("User launches the DemoWebshop App")
	public void user_launches_the_DemoWebshop_App() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_d2.03.07\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");						
    	 driver.get("http://demowebshop.tricentis.com/");
    	 driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User clicks on SignIn button")
	public void user_clicks_on_SignIn_button() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("User Provides the valid data for all the feilds")
	public void user_Provides_the_valid_data_for_all_the_feilds() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/label")).click();
		driver.findElement(By.id("FirstName")).sendKeys("akshita");
		driver.findElement(By.id("LastName")).sendKeys("pandey");
		driver.findElement(By.id("Email")).sendKeys("akshitapandey64@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("akshita64");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("akshita64");
		
	}

	@When("User clicks in submit button at the end of the form")
	public void user_clicks_in_submit_button_at_the_end_of_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id='register-button']")).click();
	}

	@Then("verifies the result of the registration")
	public void verifies_the_result_of_the_registration() {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText().contains("akshitapandey64@gmail.com"));
	}

	@Then("Prints the message")
	public void prints_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText().contains("Your registration completed"));
		
	}

	@Given("Application launched by registered user")
	public void application_launched_by_registered_user() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		 driver.close();
		 driver.get("http://demowebshop.tricentis.com/");
    	 driver.manage().window().maximize();
		
	}

	@Then("User access the Login Link")
	public void user_access_the_Login_Link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}

	@Then("Provides the valid data as input")
	public void provides_the_valid_data_as_input() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
       driver.findElement(By.id("Email")).sendKeys("akshitapandey64@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("akshita64");
		driver.findElement(By.xpath("//*[@id='RememberMe']")).click();
	}

	@Then("Verifies the login status")
	public void verifies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[2]/div[1]/h2")).getText().contains("Welcome to our store"));
		
	}

}
