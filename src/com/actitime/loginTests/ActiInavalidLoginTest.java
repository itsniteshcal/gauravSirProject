package com.actitime.loginTests;

import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FibLib;
import com.actitime.genericLib.WebDriverCommonLib;
import com.actitime.pages.LoginPage;

public class ActiInavalidLoginTest extends BaseTest {
	@Test
		public void actiInvalidLoginTest() throws Throwable {
		
		LoginPage lp = new LoginPage(driver);	
		FibLib flib = new FibLib();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
	for(int i=1;i<=flib.getRowCount(EXCEL_PATH, "practice");i++){
		lp.loginToApp(flib.getCellData(EXCEL_PATH, "practice", i, 0), flib.getCellData(EXCEL_PATH, "practice", i, 1));
		Thread.sleep(3000);
	wlib.elementDisplayed(lp.geterrMsg(), "ErrorMsg");
		flib.writeDataIntoExcel(EXCEL_PATH, "practice", i, 2, "pass");
	}
		}

}
