package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import advancedSelenium.BaseTest;
import advancedSelenium.WorkingWithMultipleRead;
import advancedSelenium.Working_With_PropertyFile;
import pomRepository.HomePage;
import pomRepository.LoginPage;
import pomRepository.WelcomePage;

public class LoginTC extends BaseTest{

	@Test(dataProvider = "testData")
	public void TC_01(String email, String password) throws IOException{
		driver.get(Working_With_PropertyFile.readProp("URL"));
		WelcomePage welcome=new WelcomePage(driver);
		welcome.clickLogin();
		LoginPage login=new LoginPage(driver);
		login.emailSendKeys(email);
		login.passwordSendKeys(password);
		login.loginButtonClick();
		HomePage home=new HomePage(driver);
		try {
			if(home.getLogoutLink().isEnabled()) {
				Reporter.log("PASS: User is logged in", true);
			}
		}catch (NoSuchElementException e) {
			Reporter.log("FAIL: USer is not logged in", true);
		}
		

	}
	@DataProvider(name = "testData")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		return WorkingWithMultipleRead.testData("Login");
	}
}
