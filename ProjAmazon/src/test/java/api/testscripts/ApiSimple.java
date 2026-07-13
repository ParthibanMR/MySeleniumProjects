package api.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.Log;

public class ApiSimple {
	
     public WebDriver driver;
     private String URL="https://jsonplaceholder.typicode.com";
	
    @BeforeClass
    @Parameters ("browser")
    public void browsers(@Optional("chrome") String browser) {
    	if (browser.equals("chrome")) {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
			Log.messsage("Chrome browser is launched");
		} else if(browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			Log.messsage("Edge browser is launched");
		} else {
			Log.messsage("There is no browser");
		}
    }
    
	@BeforeMethod (alwaysRun = true)
	public void setup() {	
		driver.get(URL);
	    driver.manage().window().maximize();
	    Log.messsage("Application is launched successfully");
	}
	
	@Test
	public void getCall() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; 
		Response response=RestAssured.given()
				.when()
				.get("/users") // GET request to the "users" endpoint
				.then()
				.statusCode(200) // Validate status code is 200 OK
				.extract()
				.response();
		
		//we can print body only - response body
	/*	String asString = response.getBody().asString();
		System.out.println(asString); */
		
//		//print raw response - like ststuscode, body, headrers ectc (other metadata) - not used
//		System.out.println(response.toString());
	

		 // Convert the response to a JsonPath object
        JsonPath jsonPath = response.jsonPath();
        
        //Extract the id of the first object in the array index
        int firstArryId = jsonPath.getInt("[0].id"); // JsonPath expression to get the first element's `id`
        String firstUserName = jsonPath.getString("name[0]"); 
        String firstUserCity = jsonPath.getString("address[0].city"); 
        
        int SecondArryId = jsonPath.getInt("[1].id");
        
        System.out.println("First ID: " + firstArryId);
        System.out.println("First name: " + firstUserName);
        System.out.println("First City: " + firstUserCity);
        System.out.println("Second ID: " + SecondArryId);
						
		
	}

}
