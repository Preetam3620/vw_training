package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import util.WebBrowser;

public class Amazon {
	WebDriver driver;
	@Given("I am on the Amazon search page")
	public void i_am_on_the_amazon_search_page() {
		driver = WebBrowser.openBrowser("https://www.amazon.in/");
	}

	@When("I search for {string}")
	public void i_search_for(String product) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	@Then("Results for {string} are displayed")
	public void results_for_are_displayed(String product) {
		String title = driver.getTitle();
		assertTrue(title.contains(product));
	}

	@When("I search for a {string}")
	public void i_search_for_a(String product) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	@Then("Results for the {string} are displayed")
	public void results_for_the_are_displayed(String product) {
		String title = driver.getTitle();
		assertTrue(title.contains(product));		
	}




}
