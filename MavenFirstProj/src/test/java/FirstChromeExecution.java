import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstChromeExecution {
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup(); -- before version 4.44.0// new verson this is no need
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='FPdoLc T14B5e iThwld']//input[@value=\"I'm Feeling Lucky\"]")).click();
		driver.manage().window().maximize();
	}

}
