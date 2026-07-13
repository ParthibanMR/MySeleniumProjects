package api.testscripts;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiComplexFileRead {
	/*public static void main(String[] args) {
		try {
			String pathLoaction=new String(Files.readAllBytes(Paths.get("src/test/resources/ApiComplex.json")));
			JSONObject jsonObject=new JSONObject(pathLoaction);
			
			JSONObject firstStoreObject = jsonObject.getJSONObject("store");
			JSONArray bookArray=firstStoreObject.getJSONArray("book");
			
			for (int i = 0; i < bookArray.length(); i++) {
				JSONObject bookObjects = bookArray.getJSONObject(i);
				
				//Books arry[{}] - inside objects printed
			//	System.out.println(bookObjects.toString());
				String titile = bookObjects.getString("title");
				JSONArray jsonArrayRatings = bookObjects.getJSONArray("ratings");
				
				//  // Access the first book object (index 0) - fist object ratings alone
	        //    JSONObject firstBook = bookArray.getJSONObject(0);
				
				System.out.println("Ratings for " + titile );
				for (int j = 0; j < jsonArrayRatings.length(); j++) {
					System.out.println("Rating " + (j + 1) + ": " + jsonArrayRatings.getInt(j));
				}
			} 
			
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} */
	
	//2. Examples
	public static void main(String[] args) {
		try {
			String pathOfJsonFile=new String(Files.readAllBytes(Paths.get("src/test/resources/ApiComplex.json")));
			
			JSONObject jsonObject=new JSONObject(pathOfJsonFile);
			
			//Print last value
//			 int expensive = jsonObject.getInt("expensive");
//			 System.out.println(expensive);
			
			//Print last key - value
			// Access and print the key and value of "expensive"
            String key = "expensive";
            if (jsonObject.has(key)) {
                int value = jsonObject.getInt(key);
                System.out.println(key + ": " + value);
            } else {
                System.out.println("Key '" + key + "' not found in JSON.");
            }
			
			JSONObject storeObject = jsonObject.getJSONObject("store");
			JSONArray electronicArray = storeObject.getJSONArray("electronics");
			
			//inside electronics Array we print all details
			System.out.println(electronicArray.toString());
			
			//First object
//			"electronics": [
//			                {
//			                  "type": "tablet",
//			                  "brand": "Apple",
//			                  "features": {
//			                    "connectivity": ["wifi", "4G"],
//			                    "batteryLife": "10 hours"
//			                  }
			
			JSONObject firstElctronicArrayObject = electronicArray.getJSONObject(0);
			//first object key and values
			Object object = firstElctronicArrayObject.get("brand");
			System.out.println("First object brand : "+object.toString());
			

		// "features": {
//            "connectivity": ["wifi", "4G"],
//            "batteryLife": "10 hours"
//          }
			
			JSONObject featuresJsonObject = firstElctronicArrayObject.getJSONObject("features");
			JSONArray connectivityJsonArray = featuresJsonObject.getJSONArray("connectivity");
			
			 System.out.print("Connectivity options: ");
			 for (int i = 0; i < connectivityJsonArray.length(); i++) {
				    System.out.print(connectivityJsonArray.getString(i));
				    
				    if (i<connectivityJsonArray.length()-1) {
						System.out.print(",");
					}
				    System.out.println();
			 }
			 
			 String batteryLife = featuresJsonObject.getString("batteryLife");
			System.out.println("Battery life: "+batteryLife);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
