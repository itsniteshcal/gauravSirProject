package com.actitime.Users;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FibLib;
import com.actitime.genericLib.WebDriverCommonLib;
import com.actitime.pages.HomePage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.UsersListPage;

//@Listeners(com.actitime.genericLib.MyListener.class)
public class CreateUsers extends BaseTest{
	@Test
	public void createUserTest() throws Throwable {
		WebDriverCommonLib wdcl = new WebDriverCommonLib();
		FibLib fis = new FibLib();
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(fis.getPropKeyValue(PROP_PATH, "username"), fis.getPropKeyValue(PROP_PATH, "password"));
		String expectedPage = fis.getCellData(EXCEL_PATH, "invalid",2,1);
		wdcl.verifyPage(wdcl.getPageTitle(), expectedPage, "homePage");
		Thread.sleep(3000);
		HomePage hp = new HomePage(driver);
		hp.clickUsersTab();
		Thread.sleep(3000);
		String expecPage = fis.getCellData(EXCEL_PATH, "invalid", 3, 1);
		wdcl.verifyPage(wdcl.getPageTitle(), expecPage, "usersList");

		UsersListPage ul = new UsersListPage(driver);
		ul.clickAddUserBtn();
		Thread.sleep(2000);
		ul.getTextAccountInfo();
		wdcl.elementDisplayed(ul.getAccountInfo(), "AccountInformation page");
		//for(int j=0;j<fis.getRowCount(EXCEL_PATH, "USERS");j++) {
		String FIRST_NAME = fis.getCellData(EXCEL_PATH, "USERS", 0, 1);
		String MIDDLE_NAME = fis.getCellData(EXCEL_PATH, "USERS", 1, 1);
		String LAST_NAME = fis.getCellData(EXCEL_PATH, "USERS", 2, 1);
		String Email = fis.getCellData(EXCEL_PATH, "USERS", 3, 1);
		ul.addUser(FIRST_NAME, MIDDLE_NAME, LAST_NAME, Email);
		Thread.sleep(3000);
		ul.getAllElements();
		//1st method
		//		List<WebElement> allElements = driver.findElements(By.xpath("//table[@class='userNameContainer']"));
		//		
		//		for(int i=0;i<=allElements().size()-1;i++) {
		//		String text = allElements().get(i).getText();
		//		if(text.contains("kumar")) {
		//			allElements().get(i).click();
		//		}
		//
		//			
		//		}
		//2nd method
		ul.setAllElements();
		ul.setSelect();
		ul.setDropDrop();


	}
}



