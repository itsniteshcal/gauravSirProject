
package com.actitime.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	@FindBy(id="username") private WebElement unTB;	
	public WebElement getUnTB() {
		return unTB;
	}
	public void setUnTB(String un) {
		unTB.sendKeys(un);
	}
	@FindBy(name="pwd") private WebElement pwTB;
	public WebElement getPwTB() {
		return pwTB;
	}
	public void setPwTB(String pswd) {
		pwTB.sendKeys(pswd);
		}
	@FindBy(xpath="//div[.='Login ']") private WebElement loginBtn;
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void clickLoginBtn() {
		loginBtn.click();
		
	}
	@FindBy(xpath="//a") private List<WebElement> countLinks;
//	public WebElement getCountallLinks() {
//		return countLinks;
//		}
	public void CountallLinks() {
System.out.println(countLinks.size());
	}
	public void loginToApp(String un) {
		unTB.sendKeys(un);
	}
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']") private WebElement errMSG;
	public WebElement geterrMsg() {
		return errMSG;
	}
	public void seterrMsg() {
	//	System.out.println(errMSG+"displayed");
	//	if(errMSG.isDisplayed()) {
		//	System.out.println(errMSG.getText());
			Assert.assertTrue(true,errMSG.getText());
		//}
}
	
	
				
		public void loginToApp(String un,String pwd) {
		unTB.sendKeys(un);
		pwTB.sendKeys(pwd);
		loginBtn.click();
	}
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
