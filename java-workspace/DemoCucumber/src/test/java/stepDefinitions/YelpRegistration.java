package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.WebBrowser;

public class YelpRegistration {

	WebDriver driver;
	
	@Given("I am Yelp Registration page")
	public void i_am_yelp_registration_page() {
		driver = WebBrowser.openBrowser("https://www.yelp.com/signup?return_url=https://www.yelp.com/");
	}
	
	@When("I enter registration data as")
	public void i_enter_registration_data_as(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> data = dataTable.asMap();
		driver.findElement(By.id("first_name")).sendKeys(data.get("firstname"));
		driver.findElement(By.id("last_name")).sendKeys(data.get("lastname"));
		driver.findElement(By.id("email")).sendKeys(data.get("email"));
		driver.findElement(By.id("password")).sendKeys(data.get("password"));
		Select ddMonth = new Select(driver.findElement(By.name("birthdate_m")));
		ddMonth.selectByVisibleText(data.get("month"));
	}
	
	@When("I click on Sign Up")
	public void i_click_on_sign_up() {
		driver.findElement(By.id("signup-button")).click();
	}

	@Then("A new account is created")
	public void a_new_account_is_created() {
		System.out.println("Done");
	}


}
