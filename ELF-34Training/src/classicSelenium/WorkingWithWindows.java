package classicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String parentWindow=driver.getWindowHandle();
		String parentTitle=driver.getTitle();
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Thread.sleep(5000);
		Set<String> allWindows=driver.getWindowHandles();
		for(String windows:allWindows) {
			
			if(!windows.equals(allWindows)) {
				driver.switchTo().window(windows);
			}
		}
		driver.findElement(By.xpath("//a[text()='Courses']")).click();
	}

}
