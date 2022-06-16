package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithKeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTF= driver.findElement(By.xpath("//input[@id='email']"));
		emailTF.sendKeys("Yogita");
		//Actions action=new Actions(driver);
		emailTF.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		emailTF.sendKeys(Keys.BACK_SPACE);
		

	}

}
