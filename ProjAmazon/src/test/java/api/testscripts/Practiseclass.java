package api.testscripts;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

public class Practiseclass {
	 public static void main(String[] args) throws IOException {
		 
		 List<JSONObject> li = new ArrayList<>();
		 
		 JSONArray jsonArray = new JSONArray("["
	                + "{\"Name\": \"Parthi\", \"mobile\": \"1234\"},"
	                + "{\"Name\": \"Karthi\", \"mobile\": \"12345\"},"
	                + "{\"Name\": \"Hari\", \"mobile\": \"3456\"}"
	                + "]");
		 
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			li.add(jsonObject);
		}
		System.out.println("List objects: "+li);
		
		 li.sort(Comparator.comparing(obj -> obj.getString("Name")));
		 
		 System.out.println("After comparator: "+li);
		
//		 for (int i = 0; i < li.size(); i++) {
//        	System.out.println(li.get(i));
//			}
		 
		 //Adding new id
		 for (int i = 0; i < li.size(); i++) {
        	 JSONObject jsonObject = li.get(i);
        	 jsonObject.put("id", i+1);
       	 System.out.println(jsonObject.toString());
		}
	 }
}