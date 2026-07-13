package api.testscripts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;


public class ReastAsssuredGETCallReadAll2 {
	public static void main(String[] args) {
		
		
	try {
		String content = new String(Files.readAllBytes(Paths.get("src/test/resources/RestAssuredGetCallRead2.json")));
		
		JSONObject jsonObject = new JSONObject(content);
		
		JSONObject userObject = jsonObject.getJSONObject("user");
		System.out.println(userObject.toString());
		
		JSONArray addressArray = userObject.getJSONArray("addresses");
		
		//Array lenght are 2
		for(int i=0; i<addressArray.length(); i++) {
			JSONObject addressObjects = addressArray.getJSONObject(i);
			System.out.println("Inside address: " +addressObjects.toString());
		}
		
		  // Extract orders array
        JSONArray ordersArray = userObject.getJSONArray("orders");
        //inside oreders array length
        for (int i = 0; i < ordersArray.length(); i++) {
            JSONObject order = ordersArray.getJSONObject(i);
            System.out.println("Orders array: " +order.toString());
            
            JSONArray productJsonArray = order.getJSONArray("products");
            for (int j = 0; j < productJsonArray.length(); j++) {
            	JSONObject productObject = productJsonArray.getJSONObject(j);
            	System.out.println("Product object: " +productObject.toString());
            	System.out.println("-------------------");
            	
            	JSONObject features = productObject.getJSONObject("features");
              //  System.out.println("    Brand: " + features.getString("brand"));
            	System.out.println("features "+ features);
            	System.out.println("============");
            	
            	 JSONArray specsArray = features.getJSONArray("specs");
                 System.out.print("    Specs: ");
                 for (int k = 0; k < specsArray.length(); k++) {
                     System.out.print(specsArray.getString(k) + (k < specsArray.length() - 1 ? ", " : ""));
                 }
                 System.out.println();
             
			}
        }
        
        
		
		
		
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
