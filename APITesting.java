package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class APITesting {

	Response response, postResponse, postResult, deleteResponse;
	String postBody;
	
	@When("User send a GET request to get the details of user{string}")
	public void user_send_a_get_request_to_get_the_details_of_user(String user) {
		response=  RestAssured.get("https://reqres.in/api/users/"+ user);
	}
	@Then("The response status code should be {int}.")
	public void the_response_status_code_should_be(Integer int1) {
		int statuscode = response.getStatusCode();
		assertEquals(200, statuscode);
	}
	@Then("First name should be equal to {string}")
	public void first_name_should_be_equal_to(String firstname) {
	    String actualfirstname=response
	    		.jsonPath()
	    		.getString("data.first_name");
	    
	    assertEquals(firstname, actualfirstname);
	}
	
	
// Post request with DDT

	@When("i send POST request with user details as {string} and {string}")
	public void i_send_post_request_with_user_details_as_and(String name, String job) {
	   String requestBody="{\r\n"
	   		+ "    \"name\": \"Nirmala\",\r\n"
	   		+ "    \"job\": \"Student\"\r\n"
	   		+ "}";
	   postResponse= RestAssured.given()
			   .contentType(ContentType.JSON)
			   .body(requestBody).when()
			   .post("https://reqres.in/api/users");
	}
	@Then("The status code should be {int}")
	public void the_status_code_should_be(Integer int1) {
		int actualstatuscode= postResponse.statusCode();
	   assertEquals(201, actualstatuscode);
	}
	@Then("the response body should contain name as {string} and job as {string}")
	public void the_response_body_should_contain_name_as_and_job_as(String name, String job) {
		String actualname=postResponse
				.jsonPath()
				.getString("name");
		String actualjob=postResponse
				.jsonPath()
				.getString("job");
		
		assertEquals(name,actualname );
		assertEquals(job, actualjob);
	}

// POST REQUEST WITHOUT DDT
	
	@When("I send a Post request with user details")
	public void i_send_a_post_request_with_user_details() {
	     postBody=" {\r\n"
	    		+ "    \"name\": \"Nirmala\",\r\n"
	    		+ "    \"job\": \"leader\"\r\n"
	    		+ "}";
		
	    postResult= RestAssured.given()
				   .contentType(ContentType.JSON)
				   .body(postBody).when()
				   .post("https://reqres.in/api/users");
	}
	@Then("New user has to be created with the specified details")
	public void new_user_has_to_be_created_with_the_specified_details() {
	   
		postResult
				.jsonPath()
				.getString("Nirmala");
		postResult
				.jsonPath()
				.getString("leader");
		
	
	}
	
	// Delete Request
	
	@When("I send Delete Request of a user.")
	public void i_send_delete_request_of_a_user() {
	   deleteResponse= RestAssured.given().delete("https://reqres.in/api/users/2");
	}
	@Then("The Statuscode should be {int}")
	public void the_statuscode_should_be(Integer int1)
	{
		int code = deleteResponse.getStatusCode();
		assertEquals(204, code);
	}



}
