package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.WebBrowser;

public class RediffRegistration {
	WebDriver driver;

	@Given("I am on Rediff registration page")
	public void i_am_on_rediff_registration_page() {
		driver = WebBrowser.openBrowser("https://is.rediff.com/signup/register");
	}
	@When("I enter registration details as")
	public void i_enter_registration_details_as(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> data = dataTable.asMap();
		driver.findElement(By.id("fullname")).sendKeys(data.get("fullName"));
		driver.findElement(By.id("emailid")).sendKeys(data.get("mailId"));
		driver.findElement(By.id("pass")).sendKeys(data.get("password"));
		driver.findElement(By.id("repass")).sendKeys(data.get("password"));
		// gender
		List<WebElement> radios = driver.findElements(By.name("sex"));
		for(WebElement rb: radios) {
			if(rb.getAttribute("value").equals(data.get("gender")));
			{
				rb.click();
				break;
			}
		}
		// day
		Select dropDownDay = new Select(driver.findElement(By.id("date_day")));
		dropDownDay.selectByVisibleText(data.get("date_day"));
		// date_mon
		Select dropDownMonth = new Select(driver.findElement(By.id("date_mon")));
		dropDownMonth.selectByVisibleText(data.get("date_mon"));
		// Date_Year
		Select dropDownYear = new Select(driver.findElement(By.name("Date_Year")));
		dropDownYear.selectByVisibleText(data.get("Date_Year"));
		// location
		driver.findElement(By.id("signup_city")).sendKeys(data.get("city"));
		
	}

	@When("I click on create account")
	public void i_click_on_create_account() {
		driver.findElement(By.id("btn_register")).click();
	}

	@Then("Error {string} is displayed")
	public void error_is_displayed(String expError) {
		String actError = driver.findElement(By.className("red")).getText();
		assertEquals(actError, expError);
	}




}
