package com.actitime.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersListPage {
	@FindBy(xpath="//div[.='New User']") private WebElement addUserBtn;
	
	public WebElement getAddUserBtn() {
		return addUserBtn;
	}

	public void clickAddUserBtn() {
		addUserBtn.click();
	}
	
	public UsersListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[.='Account Information' and @class='sectionHeader'])[2]") private WebElement accountInfo;
	public WebElement getAccountInfo() {
		return accountInfo;
	}

	public String getTextAccountInfo() {
		System.out.println(accountInfo.getText());
		return accountInfo.getText(); 
	}
	@FindBy(id="createUserPanel_firstNameField") private WebElement firstNameTab;
	@FindBy(id="createUserPanel_middleNameField") private WebElement middleNameTab;
	@FindBy(id="createUserPanel_lastNameField") private WebElement lastNameTab;
	@FindBy(id="createUserPanel_emailField") private WebElement emailTab;
	@FindBy(xpath="//div[.='Save & Send Invitation']") private WebElement clickBtn;
	@FindBy(xpath="(//span[.='Close'])[1]") private WebElement clickClose;
	
	
	@FindBy(xpath="//table[@class='userNameContainer']") private List<WebElement> allElements;
	
	
	
	@FindBy(xpath="//div[@class='item']") private List<WebElement> dropDrop;
	@FindBy(xpath="(//div[.='-- department not assigned --'])[1]") private WebElement select;
public WebElement getSelect() {
		return select;
	}

	public void setSelect() {
		select.click(); 
	}

public List<WebElement> getDropDrop() {
		return dropDrop;
	}

	public void setDropDrop() {
		for(int i=0;i<=dropDrop.size()-1;i++) {
			String selectDropDown = dropDrop.get(i).getText();
			if(selectDropDown.contains("Quality Control")) {
				dropDrop.get(i).click();
			}
		}
	}

public void addUser(String FIRST_NAME,String MIDDLE_NAME,String LAST_NAME,String Email) {
	firstNameTab.sendKeys(FIRST_NAME);
	middleNameTab.sendKeys(MIDDLE_NAME);
	lastNameTab.sendKeys(LAST_NAME);
	emailTab.sendKeys(Email);
	clickBtn.click();
	clickClose.click();
	
	
}



public List<WebElement> getAllElements() {
	return allElements;
	
}
//you can also write getAllElements insted allElements because getAllElements also returning the allElements.
public void setAllElements() {
	for(int i=0;i<=allElements.size()-1;i++) {
		String text = allElements.get(i).getText();
		if(text.contains("kumar")) {
			getAllElements().get(i).click();
		}
	}
}

public WebElement getClickClose() {
	return clickClose;
}

public void setClickClose(WebElement clickClose) {
	this.clickClose = clickClose;
}

public WebElement getFirstNameTab() {
	return firstNameTab;
}

public void setFirstNameTab(WebElement firstNameTab) {
	this.firstNameTab = firstNameTab;
}

public WebElement getMiddleNameTab() {
	return middleNameTab;
}

public void setMiddleNameTab(WebElement middleNameTab) {
	this.middleNameTab = middleNameTab;
}

public WebElement getLastNameTab() {
	return lastNameTab;
}

public void setLastNameTab(WebElement lastNameTab) {
	this.lastNameTab = lastNameTab;
}

public WebElement getEmailTab() {
	return emailTab;
}

public void setEmailTab(WebElement emailTab) {
	this.emailTab = emailTab;
}

public WebElement getClickBtn() {
	return clickBtn;
}

public void setClickBtn(WebElement clickBtn) {
	this.clickBtn = clickBtn;
}

public void setAddUserBtn(WebElement addUserBtn) {
	this.addUserBtn = addUserBtn;
}

public void setAccountInfo(WebElement accountInfo) {
	this.accountInfo = accountInfo;
}


















}
