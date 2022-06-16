package advancedSelenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Working_with_ExtentReports  {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		LocalDateTime systemDate=LocalDateTime.now();
		String ReportName=systemDate.toString().replaceAll(":", "-");
		ExtentReports report=new ExtentReports("./Reports/"+ReportName+"Report.html", false);
		ExtentTest test=report.startTest("ExtentDemo");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Browser is open");
		
		
		driver.get("https://www.zomato.com/");
		
		test.log(LogStatus.INFO, "Page is loaded");
		
		
		WebElement scrollEle=driver.findElement(By.xpath("//h5[contains(text(),'Marathahalli')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollEle);
		
		test.log(LogStatus.PASS, "Page is scrolled");
		test.log(LogStatus.INFO, test.addScreenCapture(screenCapture()));
		test.log(LogStatus.FATAL, "Header is not displayed");
		
		report.endTest(test);
		report.flush();
	}	
	
	public static String screenCapture() {
		
		
		LocalDateTime sysDate=LocalDateTime.now();
		String ScreenShotName=sysDate.toString().replaceAll(":", "-");
		String imPath="./Screenshots/"+ScreenShotName+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(imPath);
		try {
		FileHandler.copy(temp, dest);
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("Exception Handled");
		}
		
		return "."+imPath;
		
	}
	
	

}
