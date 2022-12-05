package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		features = "src/test/resources/POMFeatures", 
		glue = "steps", 
		plugin = { "pretty", "html:target/html-report.html" }, 
		monochrome = true)
*/


@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		features = "src/test/resources/Features/AmazonSearch.feature", 
		glue = "stepDefinitions", 
		plugin = { "pretty", "html:target/html-report.html" }, 
		monochrome = true)

public class TestRunner {

}
