package api.testscripts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;


public class ReastAsssuredGETCallReadAll {
	public static void main(String[] args) {
		
		
	try {
		String content = new String(Files.readAllBytes(Paths.get("src/test/resources/RestAssuredGetCallRead.json")));
		
		JSONArray jsonArray=new JSONArray(content);
		
		//whole objects (entire)
//		for (int i = 0; i < jsonArray.length(); i++) {
//			JSONObject jsonObject = jsonArray.getJSONObject(i);
//			System.out.println(jsonObject.toString());
//		}
		
//		JSONObject jsonObject = jsonArray.getJSONObject(1);
//		for (int i = 0; i < jsonObject.length(); i++) {
//			Object object = jsonObject.get("address");	
//			System.out.println(object.toString());		    
//		}
/*	//	json object id-1 full print
	//	System.out.println(jsonObject.toString()); */
		
		//whole first object
		JSONObject firstObject = jsonArray.getJSONObject(0);
        System.out.println(firstObject.toString());
        
        //wholeobject inside address object
        JSONObject addressObject = firstObject.getJSONObject("address");
        System.out.println("Address only : "+addressObject);
        JSONObject geoObject = addressObject.getJSONObject("geo"); // inside address object geoobject located
        System.out.println(geoObject);
        
        
        // Extract latitude and longitude
        String lat = geoObject.getString("lat");
        String lng = geoObject.getString("lng");

        // Print geo details
        System.out.println("Geo Object: " + geoObject);
        System.out.println("Latitude: " + lat);
        System.out.println("Longitude: " + lng); 
		
	/*	JSONObject firstObject = jsonArray.getJSONObject(1);
		String website = firstObject.getString("website");
		System.out.println("Website Details: "+website); */
		
	/*	JSONObject firstObject = jsonArray.getJSONObject(0);
		JSONObject companyObject = firstObject.getJSONObject("company");
		System.out.println(companyObject.toString()); */
		
	/*	JSONObject jsonObject = jsonArray.getJSONObject(2);
		JSONObject addressObject = jsonObject.getJSONObject("address");
		System.out.println(addressObject.toString());
		String streetString = addressObject.getString("street");
		System.out.println(streetString); */
		

		
		
		
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
