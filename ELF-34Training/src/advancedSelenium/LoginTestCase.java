package advancedSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestCase {
	
	@Test(dataProvider = "Test Data")
	public void testCase(String Email, String password) {
		
		  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.findElement(By.className("ico-login")).click();
		  driver.findElement(By.id("Email")).sendKeys(Email);
		  driver.findElement(By.id("Password")).sendKeys(password);
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  
		  if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
		  System.out.println("PASS: User is logged in"); 
		  } else {
			  
		  System.out.println("FAIL: User is not logged in"); }
		 
		driver.close();
	}
	@DataProvider(name = "Test Data",parallel = true)
	public Object[][] dataP() throws EncryptedDocumentException, IOException {
		 
		
		 return WorkingWithMultipleRead.testData("Login");
		
	}

}
