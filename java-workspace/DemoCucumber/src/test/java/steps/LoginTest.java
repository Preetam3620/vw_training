package steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	@Given("I am on Echotrak login page")
	public void i_am_on_echotrak_login_page() {
		String pageHeading = SetUp.login().getPageHeading();
		assertEquals(pageHeading, "EchoTrak sign-in");
	}
	@When("I enter {string} and {string}")
	public void i_enter_and(String username, String password) {
		SetUp.login().login(username, password);
	}
	@Then("I can access my account")
	public void i_can_access_my_account() {
		System.out.println("Done");	
		SetUp.login().clearData();
	}

	@Then("An error message {string} is displayed")
	public void an_error_message_is_displayed(String expError) {
		String actError = SetUp.login().getError();
		assertEquals(actError, expError);
	}




}
