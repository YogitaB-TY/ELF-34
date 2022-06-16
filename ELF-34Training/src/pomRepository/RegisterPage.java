package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement maleGender;
	public void maleGenderButton() {
		maleGender.click();
	}
	
	@FindBy(xpath = "//input[@id='gender-female']")
	WebElement femaleGender;
	public void femaleGenderButton() {
		femaleGender.click();
	}
	
	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement firstName;
	public void firstNameSendKeys(String value) {
		firstName.sendKeys(value);
	}
	
	@FindBy(xpath = "//input[@name='LastName']")
	WebElement lastName;
	public void lastNameSendKeys(String value) {
		lastName.sendKeys(value);
	}
	
	@FindBy(xpath = "//input[@name='Email']")
	WebElement email;
	public void emailSendKeys(String value) {
		email.sendKeys(value);
	}
	
	@FindBy(xpath = "//input[@name='Password']")
	WebElement password;
	public void passwordSendKeys(String value) {
		password.sendKeys(value);
	}
	
	@FindBy(xpath = "//input[@name='ConfirmPassword']")
	WebElement confirmPassword;
	public void confirmPasswordSendKeys(String value) {
		confirmPassword.sendKeys(value);
	}
	
	@FindBy(xpath = "//input[@name='register-button']")
	WebElement registerButton;
	public void registerButtonClick() {
		registerButton.click();
	}

}
