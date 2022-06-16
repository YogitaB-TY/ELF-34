package classicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookWindowTC {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/");
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
		Set<String> allWindows= driver.getWindowHandles();
		for(String s:allWindows) {
			if(!s.equals(parentWindow)) {
				driver.switchTo().window(s);
				driver.close();
			}
		}		
		
	}

}
