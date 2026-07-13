package api.testscripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class InterviewQuestions {
	public static void main(String[] args) {
	
	//1. How do you check if a key exists in a JSONObject
	 String jsonString = "{ \"name\": \"Parthi\", \"age\": 30, \"location\": \"Chennai\" }";
	 JSONObject jo=new JSONObject(jsonString);
	 
	 //Check if key "age" exists
	 if(jo.has("age")) {
		 int int1 = jo.getInt("age");
		 System.out.println("Age of Parthi : "+int1);
	 } else {
         System.out.println("Key 'age' not found.");
     }
	 
	//Check if key "email" exists
	 if (jo.has("email")) {
         System.out.println("Email: " + jo.getString("email"));
     } else {
         System.out.println("Key 'email' not found.");
     }
	 
	 
	 //2. How can you modify a specific object inside a JSONArray based on a condition
	 String data = "[{\"id\":1,\"name\":\"Arun\"},{\"id\":2,\"name\":\"Karthi\"}]";
     JSONArray array = new JSONArray(data);

     for (int i = 0; i < array.length(); i++) {
         JSONObject user = array.getJSONObject(i);
         if (user.getInt("id") == 2) {
             user.put("name", "Karthik Updated name");
         }
     }

     System.out.println(array.toString(2));
	
	
	//3. How do you convert a JSONArray to a Java List<Map<String, Object>>?
	String data2 = "[{\"name\":\"Parthi\",\"age\":30},{\"name\":\"Arun\",\"age\":28}]";
    JSONArray array2 = new JSONArray(data2);
    
    List<Map<String, Object>> list = new ArrayList<>();
    
    for (int i = 0; i < array2.length(); i++) {
        JSONObject obj = array2.getJSONObject(i);
//        Map<String, Object> map = obj.toMap();  // Convert JSONObject to Map
//        list.add(map);
        list.add(obj.toMap());
    }
    for (Map<String, Object> item : list) {
		System.out.println("Map Items: "+item);
	}
}
	
	//4. How do you validate nested values in a JSON response using Rest Assured?
	
	

}
