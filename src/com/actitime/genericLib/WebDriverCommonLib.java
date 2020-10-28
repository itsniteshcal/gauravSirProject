package com.actitime.genericLib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
/**
 * This generic class contains all the controls of webdriver Interface
 * @author nitish
 *
 */
public class WebDriverCommonLib extends BaseTest  {
	/**
	 * This generic reusable method is used to wait for page and its element to load
	 */
	public void waitForPageLoad() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	/**
	 * This generic reusable method is used to wait for visibility of a particular element
	 * @param locator
	 */
	public void waitForElementVisibility(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	/**
	 * This generic reusable method is used to get the title of a particular web page
	 * @return
	 */
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
		}
	/**
	 * This generic reusable method is used to select a particular option in the dropdown
	 * by using Visible Text
	 * @param element
	 * @param index
	 */
	public void select (WebElement element,int index ) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * This generic reusable method is used to select a particular option in the dropdown
	 * by using Visible Text
	 * @param element
	 * @param text
	 */
	
public void select(WebElement element,String text) {
	Select sel = new Select(element);
	sel.selectByVisibleText(text);
	}
/**
 * This generic reusable method is used to select a particular option in the dropdown
 * by using Visible Text
 * @param element
 * @param value
 */
public void select(String value,WebElement element ) {
	Select sel = new Select(element);
	sel.selectByValue(value);
}
/**
 * This generic reusable method is used to mouse hover on a particular element
  * @param target
 */
public void mouseHouser(WebElement target) {
	Actions ac = new Actions(driver);
	ac.moveToElement(target).perform();
	}
/**
 * This generic reusable method is used to compare the expected and actual results
 * and verify the given page
 * @param actualPage
 * @param expectedPage
 * @param pageName
 */
public void verifyPage(String actualPage,String expectedPage,String pageName) {
	Assert.assertEquals(actualPage, expectedPage);
	Reporter.log(pageName+" is displayed ==>PASS", true);
	
		
	}
public void elementDisplayed(WebElement element,String elementName) {
	System.out.println(element.isDisplayed());
	Assert.assertTrue(element.isDisplayed());
	Reporter.log(elementName+"is Displayed ==>pass", true);
}
public void forSelect(List<WebElement> allElements,String checkElement) {
	for(int i=0;i<=allElements.size()-1;i++) {
		String text = allElements.get(i).getText();
		if(text.contains(checkElement)) {
			allElements.get(i).click();


		}
	}
}
}


