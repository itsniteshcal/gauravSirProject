package returning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InpectingActiTime {
	
	@FindBy(name="username") private WebElement userName;
	public WebElement getUsersTab() {
		return userName;
	}

	public void clickUsersTab() {
		userName.click();
		
	}
	public  InpectingActiTime(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	public ReturnGooglePage NavigatePage()
	{
		userName.sendKeys("admin");
		return new ReturnGooglePage();
	}
}
