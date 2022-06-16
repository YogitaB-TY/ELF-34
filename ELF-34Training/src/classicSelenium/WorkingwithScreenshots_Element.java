package classicSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingwithScreenshots_Element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		WebElement popUp=driver.findElement(By.xpath("//div[contains(text(),'questions')]"));
		if(popUp.isDisplayed()) {
			
			File temp =popUp.getScreenshotAs(OutputType.FILE);
			File d= new File("./Screenshots/temp.png");
			try {
				FileHandler.copy(temp, d);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
