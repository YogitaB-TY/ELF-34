package advancedSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FireFoxTC extends BaseTest{
	
	@Test
	public void TC() {
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Reporter.log("Test Case PASS", false);
	}

}
