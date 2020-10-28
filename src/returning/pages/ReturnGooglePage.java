package returning.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;

public class ReturnGooglePage extends BaseTest {
	@Test
	public void inspect()
	{
		InpectingActiTime ne = new InpectingActiTime(driver);
		ne.NavigatePage();
	}

}
