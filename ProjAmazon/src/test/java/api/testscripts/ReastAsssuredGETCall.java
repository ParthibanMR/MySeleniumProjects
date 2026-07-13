package api.testscripts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReastAsssuredGETCall {
	public static void main(String[] args) throws IOException {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		
		Response response = RestAssured.given()
		.when()
		.get("/users")
		.then()
		.statusCode(200)
		.extract()
		.response();
		 
		
		String asString = response.asString();
		System.out.println("Full string :"+asString);
		
		JSONArray jsonArray=new JSONArray(asString);
		
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			System.out.println(jsonObject.toString());
			
//			int id = jsonObject.getInt("id");
//			 String name = jsonObject.getString("name");
//	            String username = jsonObject.getString("username");
//	            String email = jsonObject.getString("email");
//	            
//	            System.out.println("User ID: " + id);
//	            System.out.println("Name: " + name);
//	            System.out.println("Username: " + username);
//	            System.out.println("Email: " + email);
	            
	            // Access nested "address" object
//	            JSONObject address = jsonObject.getJSONObject("address");
//	            String street = address.getString("street");
//	            String suite = address.getString("suite");
//	            String city = address.getString("city");
//	            String zipcode = address.getString("zipcode");
//
//	            System.out.println("Address: ");
//	            System.out.println("  Street: " + street);
//	            System.out.println("  Suite: " + suite);
//	            System.out.println("  City: " + city);
//	            System.out.println("  Zipcode: " + zipcode);
//	            System.out.println("---------------");
//			
		
	}
	}
}
