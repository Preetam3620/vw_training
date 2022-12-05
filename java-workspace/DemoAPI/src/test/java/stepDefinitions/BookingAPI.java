package stepDefinitions;

import java.util.Map;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import util.Payload;

public class BookingAPI {
	RequestSpecification reqSpec;
	ResponseSpecification resSpec;
	Response response;
	@Before
	public void getSpecs() {
		reqSpec = new RequestSpecBuilder().log(LogDetail.ALL)
				.addHeader("content-type", "application/json")
				.setBaseUri("https://restful-booker.herokuapp.com/booking").build();
		
		resSpec = new ResponseSpecBuilder().log(LogDetail.ALL)
				.expectContentType(ContentType.JSON)
				.expectStatusCode(200).build();
	}
	
	@Given("The request specification for create booking API")
	public void the_request_specification_for_create_booking_api(DataTable dataTable) {
		Map<String, String> data = dataTable.asMap();
		reqSpec = given().spec(reqSpec)
				.body(Payload.createBooking(data.get("firstname"),data.get("lastname"),data.get("checkin"),data.get("checkout")));
	}
	
	@When("I invoke create booking api using POST request")
	public void i_invoke_create_booking_api_using_post_request() {
		response = reqSpec.when().post("/booking");
	}
	@Then("The status code is {int}")
	public void the_status_code_is(Integer expStatusCode) {
		response.then().statusCode(expStatusCode);
	}
	@Then("Response has {string} equal to {string}")
	public void response_has_equal_to(String path, String expValue) {
		response.then().body(path, equalTo(expValue));
	}
	
	@Given("The request specification for get booking API")
	public void the_request_specification_for_get_booking_api() {
		reqSpec = given().spec(reqSpec).pathParam("id", 11);
	}
	@When("I invoke get booking api using GET request")
	public void i_invoke_get_booking_api_using_get_request() {
		response = reqSpec.when().get("/booking/{id}");
	}






}
