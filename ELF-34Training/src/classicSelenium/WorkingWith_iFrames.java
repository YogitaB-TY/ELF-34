package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_iFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Downloads/iframe.html");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='FR1']")));
		
		driver.findElement(By.xpath("//a[contains(text(),'MOVIES')]")).click();
		driver.switchTo().parentFrame();
		

	}

}
