package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement emailTextField;
	public void emailSendKeys(String value) {
		emailTextField.sendKeys(value);
	}
	@FindBy(xpath = "//input[@id='Password']")
	WebElement passwordTextField;
	public void passwordSendKeys(String value) {
		passwordTextField.sendKeys(value);
	}
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;
	public void loginButtonClick() {
		loginButton.click();
	}
	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement searchTextField;
	public void search(String value) {
		searchTextField.sendKeys(value);
	}
	@FindBy(xpath = "//input[@type='submit']")
	WebElement searchButton;
	public void searchButtonClick() {
		searchButton.click();
	}
	public void searchAndClick(String value) {
		searchTextField.sendKeys(value);
		searchButton.click();
	}

}
