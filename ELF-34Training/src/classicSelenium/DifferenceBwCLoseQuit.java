package classicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferenceBwCLoseQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/browser-windows");
		driver.get("http://demowebshop.tricentis.com/");
		
		/*
		 * driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		 * driver.quit();
		 */
		
		driver.quit();
		//driver.close();
		
		
		driver.get("file:///C:/Users/User/Documents/TestYantra/ELF/ELF-34/LocatorsPractice.html");
		  
		 //1. Close will close the browser window. Quit will kill the server
		 //1. close will close only the parent window. Quit will close both the parent window and child window.
		 
	}

}
