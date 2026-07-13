package api.testscripts;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;


public class ApiSimpleFileRead {
	public static void main(String[] args) {
	
	//JSONParser jsonParser=new JSONParser();
	
	try {
	//FileReader fileReader=new FileReader("src/test/resources/ApiSample.json");
	//JSONObject jsonObject=(JSONObject) jsonParser.parse(fileReader);
		 String content = new String(Files.readAllBytes(Paths.get("src/test/resources/ApiSample.json")));
         JSONObject jsonObject = new JSONObject(content);
	
	//JSONArray jsonArray=(JSONArray) jsonObject.get("users");
         JSONArray usersArray=jsonObject.getJSONArray("users");
	
//	for (Object object : jsonArray) {
//		String string = object.toString();
//		System.out.println(string);
         
         //first data inside array
        
         
         JSONObject user1 = usersArray.getJSONObject(0);
      // Access properties inside the JSONObject
         int id1 = user1.getInt("id");
         String name1 = user1.getString("name");
         // Print out the details
         System.out.println("User ID1: " + id1);
         System.out.println("Name1: " + name1);
         
         
       //Second data inside array
         JSONObject user2 = usersArray.getJSONObject(1);
         // Access properties inside the JSONObject
            int id2 = user2.getInt("id");
            String name2 = user2.getString("name");
            // Print out the details
            System.out.println("User ID2: " + id2);
            System.out.println("Name2: " + name2);
         
            //here objects details only printed inside array, if you want data details alone you can print
         // Iterate over the users array to extract all details
         for (int i = 0; i < usersArray.length(); i++) {
             JSONObject user = usersArray.getJSONObject(i);
             //object data onlu print
             System.out.println(user.get("address"));
             
      /*       //all details
             int id = user.getInt("id");
             String name = user.getString("name");
             
             // Access the nested "address" object
             JSONObject address = user.getJSONObject("address");
             String city = address.getString("city");
             String zipcode = address.getString("zipcode");
             
             // Print all details
             System.out.println("User ID: " + id);
             System.out.println("Name: " + name);
             System.out.println("City: " + city);
             System.out.println("Zipcode: " + zipcode);
             System.out.println("-----"); */
         }
	
//	fileReader.close();
         
	} catch (Exception e) {
		e.printStackTrace();
	}}

}
