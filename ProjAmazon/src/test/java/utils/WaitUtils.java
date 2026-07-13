package utils;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitUtils {
	static StopWatch stopWatch;
	static String cssSpinner = "app-spinner-loader div";
	private static By allSpinners = By.cssSelector(cssSpinner);
	public static int maxElementWait = 1500;
	
	public static void waitForSpinner(final WebDriver driver) {
		try {
			stopWatch=new StopWatch();
			stopWatch.start();
			
			(new WebDriverWait(driver, Duration.ofSeconds(2)).pollingEvery(Duration.ofMillis(500))
			.ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
			.withMessage("Spinners/Page not loading"))
			.until(ExpectedConditions.visibilityOf(driver.findElement(allSpinners)));
			(new WebDriverWait(driver, Duration.ofSeconds(1)).pollingEvery(Duration.ofMillis(500))
					.ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
					.withMessage("Spinners/page not loading"))
					.until(ExpectedConditions.invisibilityOf(driver.findElement(allSpinners)));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Log.messsage("Catched Spinner load");
			stopWatch.stop();
		}
		
	}
	
	public static void waitForElementPresent(WebDriver driver, int seconds, WebElement elementTocheck, String msg) {
		(new WebDriverWait(driver, Duration.ofSeconds(seconds)).pollingEvery(Duration.ofMillis(300))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class).withMessage(msg))
				.until(ExpectedConditions.visibilityOf(elementTocheck));

	}
	
	public static void waitForAllElementPresent(WebDriver driver, int seconds, List<WebElement> elementTocheck, String msg) {
		(new WebDriverWait(driver, Duration.ofSeconds(seconds)).pollingEvery(Duration.ofMillis(300))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class).withMessage(msg))
				.until(ExpectedConditions.visibilityOfAllElements(elementTocheck));

	}
	
	public static boolean waitForElement(WebDriver driver, WebElement element, int waitCount) {
		return waitForElement(driver, element, waitCount);
	}

}
