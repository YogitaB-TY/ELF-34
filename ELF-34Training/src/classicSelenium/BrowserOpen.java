package classicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpen {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/");   // it waits untill a page is loaded.
		
		//driver.get("file:///C:/Users/User/Documents/Selenium/HTMLDemoPage.html");
		
		//driver.close();
		//driver.quit();
		
		//driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		driver.navigate().forward();	
	}

}
