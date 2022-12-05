package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		features = "src/test/resources/Features/BookingAPI.feature", 
		glue = "stepDefinitions", 
		plugin = { "pretty", "html:target/html-report.html" }, 
		monochrome = true)

public class TestRunner {

}
