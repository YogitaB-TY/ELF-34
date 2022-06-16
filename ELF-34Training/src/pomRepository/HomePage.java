package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "ico-logout")
	private WebElement logoutLink;
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}
	public void logoutClick() {
		logoutLink.click();
	}
	
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Books')]")
	WebElement booksLink;
	public void booksClick() {
		booksLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Computers')]")
	WebElement computersLink;
	public void computersClick() {
		computersLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Electronics')]")
	WebElement electronicsLink;
	public void electronicsClick() {
		electronicsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Apparel')]")
	WebElement apparalsLink;
	public void apparalsClick() {
		apparalsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Digital downloads')]")
    WebElement digitalDownloadsLink;
	public void digitalDownloadsClick() {
		digitalDownloadsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Jewelry')]")
    WebElement jewelryLink;
	public void jewelryClick() {
		jewelryLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Gift Cards')]")
    WebElement giftCardsLink;
	public void giftCardsClick() {
		giftCardsLink.click();
	}


}
