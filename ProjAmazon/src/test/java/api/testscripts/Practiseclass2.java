package api.testscripts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Practiseclass2 {
	 public static void main(String[] args) throws IOException {
		 
		 String content = new String(Files.readAllBytes(Paths.get("src/test/resources/RestAssuredGetCallRead2.json")));
		 
		// JSONArray ja=new JSONArray(content);
		 JSONObject jo=new JSONObject(content);
		 
//		 for (int i = 0; i < jo.length(); i++) {
//			 JSONObject userObject = jo.getJSONObject("user");
//			 System.out.println(userObject); //techanially full
//	 }	 
		 JSONObject usersObject = jo.getJSONObject("user");
		 int id = usersObject.getInt("id");
		 String emailString = usersObject.getString("email");
		 System.out.println(id);
		 System.out.println(emailString);
		 
		 
//		 JSONArray addressesArray = usersObject.getJSONArray("addresses");
//		 for (int i = 0; i < addressesArray.length(); i++) {
//			 JSONObject jsonObjectINAddresses = addressesArray.getJSONObject(i);
//			 System.out.println(jsonObjectINAddresses);
//		}
		 
		 
		 JSONArray ordersArray = usersObject.getJSONArray("orders");
		 for (int i = 0; i < ordersArray.length(); i++) {
			 JSONObject ordersObject = ordersArray.getJSONObject(i);
			// System.out.println("OrdersArray"+ordersObject);
			 
			 JSONArray productsArray = ordersObject.getJSONArray("products");
			 for (int j = 0; j < productsArray.length(); j++) {
				 JSONObject productsObjects = productsArray.getJSONObject(j);
				// System.out.println("productsObjects"+productsObjects);
				
				 if(productsObjects.getInt("productId")==2001) {
					 JSONObject featureObject = productsObjects.getJSONObject("features");
					// System.out.println("featureObject"+featureObject);
					 JSONArray specsARray = featureObject.getJSONArray("specs");
					 
					 for (int k = 0; k < specsARray.length(); k++) {
						  String string = specsARray.getString(k);
						  
						 // System.out.println("specs Array String: "+string);
						  
						  if(string.equals("512GB SSD")) {
							  System.out.println(string);
						  }
					}
				 }
				
			 }
		}
		
	 }
}