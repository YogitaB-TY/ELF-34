package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithWebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		/*
		 * WebElement
		 * element=driver.findElement(By.xpath("//a[contains(@class,'register')]"));
		 * System.out.println(element.getRect());
		 * System.out.println(element.getCssValue("color"));
		 * System.out.println(element.getClass());
		 * System.out.println(element.getAttribute("class"));
		 * System.out.println(element.getTagName());
		 * System.out.println(element.getText());
		 * System.out.println(element.getLocation());
		 * System.out.println(element.getSize()); //element.submit(); driver.close();
		 */
		WebElement searchTF= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		  searchTF.sendKeys("computers");
		 // driver.findElement(By.xpath("//input[@id='small-searchterms']")).submit();
		 
		Actions action=new Actions(driver);
		action.sendKeys(searchTF, Keys.ENTER).perform();
		
	}

}
