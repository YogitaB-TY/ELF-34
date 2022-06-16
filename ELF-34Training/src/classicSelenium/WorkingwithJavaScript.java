package classicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithJavaScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver 	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.xpath("//a[contains(text(),'jdk-8u333-linux-x64.tar.gz')]")).click();
		Thread.sleep(2000);
		WebElement clickEle=driver.findElement(By.xpath("//a[contains(text(),'Download jdk-8u333-linux-x64.tar.gz')]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", clickEle);
	}

}
