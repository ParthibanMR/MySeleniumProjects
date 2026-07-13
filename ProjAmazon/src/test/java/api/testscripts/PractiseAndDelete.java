package api.testscripts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class PractiseAndDelete {
	public static void main(String[] args) throws IOException {
		 String jsonCarString = "{\"name\":\"John\",\"age\":30,\"cars\":[\"Ford\", \"BMW\", \"Fiat\"]}";
		 
		 JSONObject jo=new JSONObject(jsonCarString);
		 JSONArray jsonArray = jo.getJSONArray("cars");
		 
		 for (int i = 0; i < jsonArray.length(); i++) {
			if("Fiat".equals(jsonArray.getString(i))) {
				jsonArray.put(i, "Audi");
			}
		}
		 String updatedJsonCarString = jsonArray.toString();

	        // Print the updated JSON string
	        System.out.println(updatedJsonCarString);
		
	}
}
