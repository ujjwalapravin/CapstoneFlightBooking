package StepDefFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFlyAway {
	
WebDriver driver = Hooks.driver;

	@Given("I have launched the FlyAway application")
	public void i_have_launched_the_FlyAway_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get("http://localhost:8080/FlyAway/login");
		  Thread.sleep(3000);
	}

	@When("I enter created Email id")
	public void i_enter_created_Email_id() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement Emailid = driver.findElement(By.name("email_id"));
	   Emailid.sendKeys("user6@user6.com");
	   Thread.sleep(1000);
	}

	@When("I enter created password")
	public void i_enter_created_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement passwd = driver.findElement(By.name("pwd"));
		   passwd.sendKeys("user6");
		   Thread.sleep(1000);

	}

	@Then("I should click on login")
	public void i_should_click_on_login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//button[text()='Login']")).click();
	   Thread.sleep(1000);

	}}
