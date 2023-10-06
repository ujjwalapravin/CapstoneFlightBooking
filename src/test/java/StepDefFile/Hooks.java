package StepDefFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;

public class Hooks {
	
public static WebDriver driver;
	
	@Before
	public void setup() {
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("117");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
	}
    
	/*@Before
	public void beforeScenario() {
		System.out.println("This will run before the scenario");
	}
	@SuppressWarnings("deprecation")
	@After
	public void afterScenario(io.cucumber.java.Scenario sc) {
		System.out.println("This will run after the scenario");
		if(sc.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshot, "image/png");
		}else {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshot, "image/png");
		}
	}
	
	@After
	public void teardown() {
	driver.quit();
	}*/

}
