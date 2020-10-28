package com.listReturning;

import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;

public class CaturingPage extends BaseTest{
	@Test
	public void listElements() throws Throwable {
		FetchList FL = new FetchList(driver);
		FL.clickTab();
		FL.TakeAllElements();
		
	}
	

}
