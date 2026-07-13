package api.testscripts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GETAndPUTAlphabetical2 {
	public static void main(String[] args) {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		Response response = RestAssured.given()
		.when()
		.get("users")
		.then()
		.extract()
		.response();
//	    System.out.println("Get existing response : "+ response.getBody().asString());
	    
	    JSONArray jsonArray = new JSONArray(response.getBody().asString());
	    
	    List<JSONObject> list = new ArrayList<>();
	    
	    for (int i = 0; i < jsonArray.length(); i++) {
	    	list.add(jsonArray.getJSONObject(i));
		}
	    
	    list.sort(Comparator.comparing(obj -> obj.getString("name")));
	    
	    for (JSONObject jsonObject : list) {
			System.out.println("Alphabetical order : "+jsonObject.toString(2));
		}
	}

}
