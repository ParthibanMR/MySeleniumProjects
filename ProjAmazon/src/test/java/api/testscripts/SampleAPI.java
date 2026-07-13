package api.testscripts;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleAPI {
public static void main(String[] args) {
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		Response response = RestAssured.given()
		.header("Content-Type", "application json")
		.when()
		.get("users")
		.then()
		.statusCode(200)
		.extract()
		.response();
		
		System.out.println("Response body: "+response.getBody().asString());
//		System.out.println(response.asString());
		
		JSONArray jsonArray = new JSONArray(response.getBody().asString());
		
//		JSONObject jsonObject = jsonArray.getJSONObject(0);
//		String string = jsonObject.getString("email");
//		System.out.println("First Json object email: "+string);
		
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
//			System.out.println("json object lists: " + jsonObject.toString());
			
			if(jsonObject.getString("email").equals("Sincere@april.biz")) {
				jsonObject.put("email", "Sincere@april.bizzzzzz");
			}		
		}
		
		System.out.println("2 things" +jsonArray.toString(2));
		
}

}
