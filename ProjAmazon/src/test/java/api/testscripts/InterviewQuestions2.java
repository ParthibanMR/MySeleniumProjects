package api.testscripts;

import org.json.JSONObject;
import org.openqa.selenium.logging.LogEntry;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.Log;
import static org.hamcrest.Matchers.equalTo;


public class InterviewQuestions2 {
	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		Response response = RestAssured.given()
		.contentType(ContentType.JSON)
        .when()
        .get("/users/1")
        .then()
        .body("name", equalTo("Leanne Graham"))
        .extract()        
        .response();
        
		System.out.println("Original Response: " +response.asString());
		
		JSONObject jo=new JSONObject(response.asString());
		
		jo.put("UsernameADD1", "Parthi");
		jo.put("UsernameADD2", "Karthi");
		
		JSONObject jsonObjectCompany = jo.getJSONObject("company");
		jsonObjectCompany.put("Amount", "1000");
		
		Response response2 = RestAssured
	            .given()
	                .contentType(ContentType.JSON)
	                .body(jo.toString())
	            .when()
	                .put("/users/1")  // Updating user with ID 1
	            .then()
	                .statusCode(200)
	                .extract()
	                .response();
		
		System.out.println("After put call update: "+ response2.asString());
		
		
		
		

//        // Step 1: Create the updated data
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("id", 1);  // ID is required for PUT
//        requestBody.put("name", "Parthi Updated");
//        requestBody.put("email", "parthi.new@example.com");
//
//        // Step 2: Send PUT request
//        Response response = RestAssured
//            .given()
//                .contentType(ContentType.JSON)
//                .body(requestBody.toString())
//            .when()
//                .put("/users/1")  // Updating user with ID 1
//            .then()
//                .statusCode(200) // JSONPlaceholder will return 200
//                .extract().response();
//
//        // Step 3: Print the response
//        System.out.println("PUT Response Body:\n" + response.getBody().asString());
    }
}
