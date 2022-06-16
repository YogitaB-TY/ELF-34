package classicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsPractice {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		//option.addArguments("--headless");
		option.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(option);
	
		driver.get("https://www.easemytrip.com/");
		System.out.println("Browser open");
		
		
	}

}
