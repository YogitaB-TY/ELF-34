package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTagName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * driver.get("file:///C:/Users/User/Documents/Selenium/HTMLDemoPage.html");
		 * 
		 * WebElement link= driver.findElement(By.tagName("e")); link.click();
		 * driver.close();
		 */
		driver.get("file:///C:/Users/User/Documents/Selenium/SampleHTMLPage.html");
		WebElement link=  driver.findElement(By.tagName("a"));
		//link.click();
		WebElement input=driver.findElement(By.tagName("input"));
		input.sendKeys("testyantra");
		
	}

}
