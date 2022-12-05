package basic;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EmployeeAPI {
	RequestSpecification reqSpec;
	Response response;
	@Test
	public void createEmployee() {
		RestAssured.baseURI = "https://reqres.in/";
		
		reqSpec = given().log().all().header("content-type", "application/json")
				.body("{\r\n"
						+ "		\"name\": \"morpheus\", \r\n"
						+ "		\"job\": \"leader\"\r\n"
						+ "}");
		
		response = reqSpec.when().post("/api/users");
		response.then().log().all().assertThat().statusCode(201)
		.body("name", equalTo("morpheus"))
		.body("job", equalTo("leader"));
	}
	
	@Test
	public void updateEmployee() {
		RestAssured.baseURI = "https://reqres.in";
		
		reqSpec = given().log().all().header("content-type" , "application/json").pathParam("id", 2);
		
		response = reqSpec.when().put("/api/users/{id}");
		response.then().log().all().assertThat().statusCode(200);
	}
	
	@Test
	public void deleteEmployee() {
		RestAssured.baseURI = "https://reqres.in";
		
		reqSpec = given().log().all().header("content-type", "application/json").pathParam("id", 2);
		
		response = reqSpec.when().delete("/api/users/{id}");
		response.then().log().all().assertThat().statusCode(204);
	}
	
}
