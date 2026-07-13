package api.testscripts;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GETAndPUTCall {
	public static void main(String[] args) {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		Response response = RestAssured.given()
		.when()
		.get("/users/1")
		.then()
		.extract()
		.response();
	    System.out.println("Get existing response : "+ response.getBody().asString());
	    
	    // Step 2: Modify the existing JSON
	    JSONObject requestBody = new JSONObject(response.getBody().asString());
	    requestBody.put("username", "Parthi");
	    requestBody.put("email", "Parthiban2gmail.com");
	    
	 // Step 3: Perform PUT request with modified data
	    
	    Response putResponse = RestAssured.given()
	    		.contentType(ContentType.JSON)
	    		.body(requestBody.toString())
	    		.when()
	    		.put("/users/1")
	    		.then()
	    		.extract()
	    		.response();
	    
	    System.out.println("Put response body: "+ putResponse.asString());
		
	}

}
