package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import utils.WaitUtils;

public class TestNgBrowserLaunchExamplePages extends LoadableComponent<TestNgBrowserLaunchExamplePages>{
	
	public WebDriver driver;
	private boolean isPageLoaded;
	
	public TestNgBrowserLaunchExamplePages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		isPageLoaded=true;
	    WaitUtils.waitForSpinner(driver);
		
	}

}
