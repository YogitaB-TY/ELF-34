package advancedSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test(threadPoolSize = 2, invocationCount = 10)
	public void LoginTestCase() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/");
		/*
		 * System.out.println(name); System.out.println(seasons);
		 */
		driver.close();
	}
	
	
	  @Test 
	  public void demo() { 
		  
		  System.out.println("Demo"); 
	}
	 

	/*
	 * @DataProvider(name = "Test Data", parallel = true) public Object[][] dataP()
	 * throws EncryptedDocumentException, IOException {
	 * 
	 * 
	 * return WorkingWithMultipleRead.testData("series");
	 * 
	 * }
	 */
}
