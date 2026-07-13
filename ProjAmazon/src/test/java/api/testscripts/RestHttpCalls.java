package api.testscripts;

import io.restassured.*;
import io.restassured.http.ContentType;

public class RestHttpCalls {
	public static void main(String[] args) {
		
		String requestBody = "{ \"name\": \"morpheus\", \"job\": \"leader\" }";
		
		String response = RestAssured.given()
		.baseUri("https://reqres.in/api")
		.header("Content-Type", "application/json")
		.body(requestBody)
		.when()
		.post("/users")
		.then()
		.statusCode(201)
		.extract()
		.response()
		.asString();
		
		System.out.println(response);
		
	}

}
