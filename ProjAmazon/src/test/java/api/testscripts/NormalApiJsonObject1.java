package api.testscripts;

import org.json.JSONArray;
import org.json.JSONObject;

public class NormalApiJsonObject1 {
	public static void main(String[] args) {
		
	//	1. change username
		
		String jsonString="{\"username\":\"karthi\",\"Age\":25,\"Work\":\"IT\"}";
		
		 // Parse string into JSONObject
        JSONObject jsonObject = new JSONObject(jsonString);
     // Replace the value of "username"
        jsonObject.put("username", "Parthi");
        
        // Convert the updated JSONObject back to a JSON string
        String updatedJsonString = jsonObject.toString();
        
        System.out.println("Name update: "+updatedJsonString);
		
// 2. delete usernaem
        String jsonString2 = "{\"username\":\"karthi\",\"Age\":25,\"Work\":\"IT\"}";
        
        JSONObject jsonObject2=new JSONObject(jsonString2);
        
        jsonObject2.remove("username");
        
        System.out.println("removing username : "+jsonObject2.toString());
        
 // 3. JsonArry[{jsonObject}] - Added new username in "new object"
        
        String jsonArrayString = "[{\"Age\":25,\"Work\":\"IT\"}]";
        
        // Convert the JSON array string to a JSONArray
        JSONArray jsonArray=new JSONArray(jsonArrayString);
        
     // Create a JSONObject to represent the new data
        JSONObject newJsonObject = new JSONObject();
        newJsonObject.put("username", "parthi");
        
        // Add the new JSONObject to the JSONArray
        jsonArray.put(newJsonObject);
        
        // Convert the updated JSONArray back to a JSON string
        String updatedJsonArrayString = jsonArray.toString();

        // Print the updated JSON array string
        System.out.println("Json arry username: "+updatedJsonArrayString);
        
        
//4. JsonArry[jsonObject] - Added new username in existing object
        
        String jsonArrayString2 = "[{\"Work\":\"IT\",\"Age\":25}]";

        // Parse the JSON array
        JSONArray jsonArray2 = new JSONArray(jsonArrayString);

        // Get the first JSON object in the array
        JSONObject jsonObj = jsonArray2.getJSONObject(0);

        // Add the "username" field with a value
        jsonObj.put("username", "Karthi");

     //   jsonArray2.put(jsonObj);
        System.out.println(jsonArray2.toString());
        
//5. replace age as 30 for Id: 2
        
        String jsonArrayStr = "[{\"Id\":1,\"Age\":25,\"Work\":\"IT\"},{\"Id\":2,\"Age\":26,\"Work\":\"BPO\"},{\"Id\":3,\"Age\":27,\"Work\":\"Own\"}]";

        // Convert the JSON array string to a JSONArray
        JSONArray jsonArr = new JSONArray(jsonArrayStr);

        // Find the JSONObject with Id equal to 2 and update the "Age" field
        for (int i = 0; i < jsonArr.length(); i++) {
            JSONObject userObject = jsonArr.getJSONObject(i);
            if (userObject.getInt("Id") == 2) {
                userObject.put("Age", 30);
                break; // Break out of the loop after updating the value
            }
        }

        // Convert the updated JSONArray back to a JSON string
        String updatedJsonArrayStr = jsonArr.toString();

        // Print the updated JSON array string
        System.out.println(updatedJsonArrayStr);
        
        
 //6. replace 'ford' as 'audi'
        
        // Your JSON string
        String jsonCarString = "{\"name\":\"John\",\"age\":30,\"cars\":[\"Ford\", \"BMW\", \"Fiat\"]}";

        // Convert the JSON string to a JSONObject
        JSONObject jsonCarObject = new JSONObject(jsonCarString);

        // Get the "cars" array from the JSONObject
        JSONArray carsArray = jsonCarObject.getJSONArray("cars");

        // Iterate over the array to find and replace "Ford" with "Audi"
        for (int i = 0; i < carsArray.length(); i++) {
        //	String string = carsArray.getString(i);
            if ("Ford".equals(carsArray.getString(i))) {
                carsArray.put(i, "Audi");
                break; // Break out of the loop after updating the value
            }
        }

        // Convert the updated JSONObject back to a JSON string
        String updatedJsonCarString = jsonCarObject.toString();

        // Print the updated JSON string
        System.out.println(updatedJsonCarString);
}
}
