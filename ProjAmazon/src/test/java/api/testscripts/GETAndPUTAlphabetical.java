package api.testscripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GETAndPUTAlphabetical {
	public static void main(String[] args) {
	
        // Step 1: Create a JSONArray
        JSONArray jsonArray = new JSONArray("["
                + "{\"Name\": \"Parthi\", \"mobile\": \"1234\"},"
                + "{\"Name\": \"Karthi\", \"mobile\": \"12345\"},"
                + "{\"Name\": \"Hari\", \"mobile\": \"3456\"}"
                + "]");
        
        List<JSONObject> jsonList = new ArrayList<>();

//         for (int i = 0; i < jsonArray.length(); i++) {
//			JSONObject jsonObject = jsonArray.getJSONObject(i);
//			System.out.println(jsonObject.toString());
//		}
        
        for (int i = 0; i < jsonArray.length(); i++) {
            jsonList.add(jsonArray.getJSONObject(i));
        }
        
      //  System.out.println(jsonList);
        
        // Step 3: Sort the List based on the "Name" field
        jsonList.sort(Comparator.comparing(obj -> obj.getString("Name")));
        
     // Step 4: Print each JSONObject in the sorted order
        System.out.println("Printing sorted objects by Name:");
        
//        for (int i = 0; i < jsonList.size(); i++) {
//        	System.out.println(jsonList.get(i));
//		}
        
//        for (JSONObject jsonObject : jsonList) {
//        	System.out.println(jsonObject.toString(2)); //pretty printing
//		}
        
        for (int i = 0; i < jsonList.size(); i++) {
        	 JSONObject jsonObject = jsonList.get(i);
        	 jsonObject.put("id", i+1);
//        	 System.out.println(jsonObject.toString());
		}
        System.out.println(jsonList.toString());
        
//        for (int i = 0; i < jsonList.size(); i++) {
//            System.out.println(jsonList.toString());
//        } 
        
		
	}

}
