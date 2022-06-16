package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		Select sortBydropDown=new Select(dropdown);
		List<WebElement> options= sortBydropDown.getOptions();
		
		/*
		 * for(WebElement wb:options) { System.out.println( wb.getText()); }
		 */
		for (int i = 0; i < options.size(); i++) {
			if(options.get(i).getText().contains("Low")){
				System.out.println(i);
			}
		}
		
		
	}

}
