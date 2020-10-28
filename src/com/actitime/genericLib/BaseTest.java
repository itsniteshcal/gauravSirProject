package com.actitime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
/**
 * This class is the base for every TestScripts
 * Every Test Script Extends this class to access common methods
 * @author nitish
 *
 */
public class BaseTest implements IAutoConsts{
	public static WebDriver driver;
	/**
	 * This generic reusable method is used to open the browser and enter test URL
	 * @throws Throwable
	 */
	@BeforeClass
	public void openBrowser() throws Throwable {

		FibLib flib = new FibLib();
		String browserValue = flib.getPropKeyValue(PROP_PATH,"browser" );

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Invalid browser name");
		}
		//wbdw.waitForPageLoad();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String test_url = flib.getPropKeyValue(PROP_PATH, "url");
		driver.get(test_url);
	}
	/**
	 * This generic method is used to close the browser
	 */
//	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
