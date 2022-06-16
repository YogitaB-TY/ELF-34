package classicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseForCSSselector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		
		driver.get("http://demowebshop.tricentis.com/");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input[value='Search store']"))));
		
		
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Books");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		try {
		if(driver.findElement(By.cssSelector("input[value='Computer']")).isDisplayed()) {
			System.out.println("Pass: Search is successful");
		}
		}
		catch (NoSuchElementException e) {
			System.out.println("Fail: search is unsuccessful");
		}
		
		
		/*
		 * else { System.out.println("Fail: search is unsuccessful"); }
		 */
		
	
	}

}
