package classicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDisabledTextField {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver 	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://demoapp.skillrary.com/");
        WebElement TF=driver.findElement(By.xpath("//input[@type='text']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[1].value='Yogita';", TF);	
	}

}
