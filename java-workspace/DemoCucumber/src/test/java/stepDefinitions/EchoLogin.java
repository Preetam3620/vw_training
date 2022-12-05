package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.WebBrowser;

public class EchoLogin {
	WebDriver driver;
	
	@Given("I am on Echotrak login page")
	public void i_am_on_echotrak_login_page() {
		driver = WebBrowser.openBrowser("https://www.echotrak.com/Login.aspx?ReturnUrl=%2fLoginEmp.aspx");
	}
	
	@When("I enter {string} and {string}")
	public void i_enter_and(String username, String password) {
		driver.findElement(By.id("txtCustomerID")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	@When("I click login button") 
	public void i_click_login_button() {
		driver.findElement(By.name("Butsub")).click();
	}
	
	@Then("I can access my account")
	public void i_can_access_my_account() {
		System.out.println("Done");
	}
	
	@Then("An error message {string} is displayed")
	public void an_error_message_is_displayed(String expError) {
		String actError = driver.findElement(By.id("lblMsg")).getText();
		assertEquals(actError, expError);
	}

}
