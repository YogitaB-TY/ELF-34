package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWith_RightClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
		
		//act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
	 act.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double')]"))).build().perform();	
	}

}
