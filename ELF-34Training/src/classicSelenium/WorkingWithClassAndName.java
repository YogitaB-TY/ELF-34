package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassAndName {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/User/Documents/Selenium/LocatorsPractice.html");
		WebElement uN= driver.findElement(By.className("username"));
		uN.sendKeys("Yogita");
		WebElement rB=driver.findElement(By.name("b"));
		rB.click();
	}

}
