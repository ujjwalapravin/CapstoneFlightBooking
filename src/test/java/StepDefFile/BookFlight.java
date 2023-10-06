package StepDefFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookFlight {
	WebDriver driver = Hooks.driver;
	@Given("I have launched the FlyAway application for Booking Flight")
	public void i_have_launched_the_FlyAway_application_for_Booking_Flight() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get("http://localhost:8080/FlyAway/home");
		  Thread.sleep(3000);
	}

	@When("I click on BookFlight")
	public void i_click_on_BookFlight() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[@href=\"bookflight?id=3\"]")).click();
	    Thread.sleep(1000);
	}

	@Then("I click on Complete Booking Flight")
	public void i_click_on_Complete_Booking_Flight() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//a[@href=\"completepurchase\"]")).click();
	   Thread.sleep(1000);
	}

	@Then("I click on see your Bookings")
	public void i_click_on_see_your_Bookings() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//a[@href=\"memberbookings\"]")).click();
	   Thread.sleep(1000);
	}

}
