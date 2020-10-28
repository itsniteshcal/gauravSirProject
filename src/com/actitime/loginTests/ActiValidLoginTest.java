package com.actitime.loginTests;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FibLib;
import com.actitime.genericLib.WebDriverCommonLib;
import com.actitime.pages.LoginPage;
//openBrowser
/**
 * 
 * @author nitish
 *
 */

public class ActiValidLoginTest extends BaseTest {
	//public static void main(String[] args) throws Throwable {

	@Test
	public void actiValidLoginTest() throws Throwable  {
//		WebDriverCommonLib wlib = new WebDriverCommonLib();
//		FibLib fis = new FibLib();
//		//  enter valid username ,password and click on Login
//		LoginPage lp =new LoginPage(driver);
//		lp.loginToApp(fis.getPropKeyValue(PROP_PATH, "username"), fis.getPropKeyValue(PROP_PATH, "password"));
//
//		Thread.sleep(4000);
//		//verify the home page is displayed or not
//		String actualHomePageTitle = driver.getTitle();
//		String expectedHomePageTitle = fis.getCellData(EXCEL_PATH, "invalid",2,1);
//		wlib.verifyPage(actualHomePageTitle, expectedHomePageTitle, "homePage");
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FibLib fis = new FibLib();
	   LoginPage lp = new LoginPage(driver);
	   lp.loginToApp(fis.getPropKeyValue(PROP_PATH, "username"), fis.getPropKeyValue(PROP_PATH, "password"));
//verify HomePage is displayed or not
	   
	  String expectedHomeTitle = fis.getCellData(EXCEL_PATH, "invalid", 2, 1);
	  String actualPage = wlib.getPageTitle();
	   wlib.verifyPage(actualPage, expectedHomeTitle, "HomePage");
	   

		


	}
}
