package StepDefFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		features="src/test/java/featuresFiles",
		plugin ={"pretty","html:target/html-cucumber","json:target/cucumber/report.json"},
		glue="StepDefFiles",
		tags= {"@smoke"}
		
		
		)
public class TestRunner {
	

}
