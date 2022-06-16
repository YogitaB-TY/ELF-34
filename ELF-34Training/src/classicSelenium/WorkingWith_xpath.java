package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='close']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
		
	}

}
