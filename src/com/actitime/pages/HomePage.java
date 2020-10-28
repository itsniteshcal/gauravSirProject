package com.actitime.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(xpath="//div[@id='container_users']") private WebElement usersTab;
	
	public WebElement getUsersTab() {
		return usersTab;
	}

	public void clickUsersTab() {
		usersTab.click();
		
	}
	public  HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
