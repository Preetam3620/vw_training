package stepDefinitions;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.WebBrowser;

public class AmazonSearch {
	WebDriver driver;
	
	@Given("I am on Amazon search page")
	public void i_am_on_amazon_search_page() {
		driver = WebBrowser.openBrowser("https://www.amazon.in/");
	}
	
	@When("I search for product {string}")
	public void i_search_for_product(String product) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	@Then("Results for product {string} are displayed")
	public void results_for_product_are_displayed(String product) {
		String title = driver.getTitle();
		assertTrue(title.contains(product));
	}


	@When("I filter using price {string}")
	public void i_filter_using_price(String string) throws InterruptedException {
		
//        driver.findElement(By.cssSelector("div#priceRefinements>ul>li:nth-child(2)")).click();
		List<WebElement> priceFilter = driver.findElements(By.cssSelector("div#priceRefinements>ul>li>span.a-list-item>a>span"));
//		List<WebElement> priceFilter = driver.findElements(By.cssSelector("div#priceRefinements>ul>li>span.a-list-item>a"));

		for (WebElement filter : priceFilter) {
			if(filter.getText().equals(string)) {
				filter.click();
				break;
			}
		}
	}
	
	@Then("The results are filtered")
	public void the_results_are_filtered() {
		driver.findElement(By.id("low-price")).getText();
	}

	@When("I sort by {string}")
	public void i_sort_by(String string) {
		driver.findElement(By.className("a-dropdown-prompt")).click();
		List<WebElement> sortOptions = driver.findElements(By.cssSelector("li.a-dropdown-item>a"));
		
		for (WebElement option : sortOptions) {
			if(option.getText().equals(string))
				option.click();
		}		
	}
	
	@Then("The results are sorted")
	public void the_results_are_sorted() {
		String expResult = "Avg. Customer Review";
		String actResult = driver.findElement(By.className("a-dropdown-prompt")).getText();
		assertEquals(expResult, actResult);
	}





}
