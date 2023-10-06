package StepDefFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewRegistrationStepDef {
	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  driver.get("http://localhost:8080/FlyAway/signup");
	  Thread.sleep(3000);
	}


	@When("I enter username")
	public void i_enter_username() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement userName = driver.findElement(By.name("email_id"));
		userName.sendKeys("user6@user6.com");
		Thread.sleep(1000);
	}

	@When("I enter password")
	public void i_enter_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement userName = driver.findElement(By.name("pwd"));
		userName.sendKeys("user6");
		Thread.sleep(1000);
	}

	@When("I enter confirm password")
	public void i_enter_conefirm_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  
		WebElement userName = driver.findElement(By.name("pwd2"));
		userName.sendKeys("user6");
		Thread.sleep(1000);
	}

	@When("I enter Name")
	public void i_enter_Name() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement userName = driver.findElement(By.name("name"));
		userName.sendKeys("user6");
		Thread.sleep(1000);
	}

	@When("I enter adress")
	public void i_enter_adress() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement userName = driver.findElement(By.name("address"));
		userName.sendKeys("user6");
		Thread.sleep(1000);
	}

	@When("I enter city")
	public void i_enter_city() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement userName = driver.findElement(By.name("city"));
		userName.sendKeys("user6");
		Thread.sleep(1000);
	}

	@Then("I should land on home page")
	public void i_should_land_on_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement signup = driver.findElement(By.xpath("//button[text()='Signup']"));
		signup.click();
		Thread.sleep(1000);
	}

	@Then("I should click on login page")
	public void i_should_click_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
     WebElement signhomepage = driver.findElement(By.xpath("//a[@href=\"login\"]"));
     signhomepage.click();
}
}