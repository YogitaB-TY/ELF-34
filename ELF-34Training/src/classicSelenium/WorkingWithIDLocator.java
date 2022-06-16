package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIDLocator {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("http://demowebshop.tricentis.com/");
		
		String title=driver.getTitle();
		
		if(title.contains("Demo")) {
			System.out.println("Pass: Demo web shop is open");
		}
		driver.findElement(By.className("ico-register")).click();
		
		String regTitle= driver.getTitle();
		if(regTitle.contains("Register")) {
			System.out.println("Pass: Register Page is displayed");
		}
		String userName="dhbhb";
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys(userName);
		driver.findElement(By.id("LastName")).sendKeys("lnnvhb");
		driver.findElement(By.id("Email")).sendKeys("bfhbh@jijuhb.com");
		driver.findElement(By.id("Password")).sendKeys("nkjni56");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("nkjni56");
		driver.findElement(By.id("register-button")).click();
		
		if(driver.findElement(By.className("ico-logout")).isDisplayed()) {
			System.out.println("Pass: User is registered successfully");
		}
		
		driver.findElement(By.cssSelector("div ul li:nth-child(2) a[class='ico-logout")).click();
	}

}
