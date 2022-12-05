package steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeLoginTest {

	@Given("I am on Echotrak Emp login page")
	public void i_am_on_echotrak_emp_login_page() { 
		SetUp.login().navigateEmployee();
	}
	@When("Employee enter {string} and {string}")
	public void employee_enter_and(String username, String password) {
		SetUp.elogin().empLogin(username, password);
	}
	@Then("Employee can access my account")
	public void employee_can_access_my_account() {
		System.out.println("Done");
		SetUp.elogin().clearData();
	}
	@Then("Error message {string} on employee login")
	public void error_message_on_employee_login(String expError) {
		String actError = SetUp.elogin().getError();
		assertEquals(actError, expError);
	}

}
