package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		
		WebElement source=driver.findElement(By.xpath("(//div[contains(text(),'Rome')])[2]"));
		Thread.sleep(2000);
		WebElement target=driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act=new Actions(driver);
		act.clickAndHold(source).perform();
		act.release(target).perform();
		//act.dragAndDrop(source, target).perform();
		
	}

}
