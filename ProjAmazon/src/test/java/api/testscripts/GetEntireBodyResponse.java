package api.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetEntireBodyResponse {
	public static void main(String[] args) {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		Response response = RestAssured.given()
		.when()
		.get("/users")
		.then()
		.extract()
		.response();
		
		int statusCode = response.getStatusCode();
		System.out.println("statusCode: " +statusCode);
	}

}
