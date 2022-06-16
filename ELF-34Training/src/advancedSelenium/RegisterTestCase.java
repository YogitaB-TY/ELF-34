package advancedSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTestCase {
	@Test(dataProvider = "Data")
	public void RegisterTC( String FirstName, String LastName, String email, String password,String gender) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.xpath("//input[@value='"+gender+"']")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();
		driver.close();
	}
	
	@DataProvider(name="Data")
	public Object[][] testData() throws EncryptedDocumentException, IOException{
		
		return WorkingWithMultipleRead.testData("Register");
		
		
	}

}
