package com.listReturning;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FetchList {
	@FindBy(name="q") private WebElement searchBox;
	public WebElement getTab() {
		return searchBox;
	}

	public void clickTab() {
		searchBox.sendKeys("google");

	}
	@FindBy(xpath="//div[@class='sbl1']") private List<WebElement> TakeAllElement;
	public List<WebElement> getAllElements() {
		return TakeAllElement;
	}

	public void TakeAllElements() throws Throwable {
		for(int i=0;i<=TakeAllElement.size()-1;i++) {
			String selectDropDown = TakeAllElement.get(i).getText();
			Thread.sleep(3000);
			System.out.println(selectDropDown);
			if(selectDropDown.contains("Quality Control")) {
				TakeAllElement.get(i).click();
			}
			else {
				System.out.println("no element present");
			}
		}
	}

	public  FetchList(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


}
