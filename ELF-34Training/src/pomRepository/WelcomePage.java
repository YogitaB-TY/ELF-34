package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "ico-register")
	private WebElement registerLink;
	
	public WebElement getRegister() {
		return registerLink;
	}
	
	@FindBy(className = "ico-login")
	private WebElement loginLink;
	
	public void clickLogin() {
		loginLink.click();
	}
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement cartLink;
	
	
	public void cartClick() {
		cartLink.click();
	}
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;
	
	public void wishlistClick() {
		wishlistLink.click();
	}
	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchTextField;
	public void search(String value) {
		searchTextField.sendKeys(value);
	}
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchButton;
	public void searchButtonClick() {
		searchButton.click();
	}
	public void searchAndClick(String value) {
		searchTextField.sendKeys(value);
		searchButton.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Books')]")
	private WebElement booksLink;
	public void booksClick() {
		booksLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Computers')]")
	private WebElement computersLink;
	public void computersClick() {
		computersLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Electronics')]")
	private WebElement electronicsLink;
	public void electronicsClick() {
		electronicsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Apparel')]")
	private WebElement apparalsLink;
	public void apparalsClick() {
		apparalsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Digital downloads')]")
	private WebElement digitalDownloadsLink;
	public void digitalDownloadsClick() {
		digitalDownloadsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Jewelry')]")
	private WebElement jewelryLink;
	public void jewelryClick() {
		jewelryLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Gift Cards')]")
	private WebElement giftCardsLink;
	public void giftCardsClick() {
		giftCardsLink.click();
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getCartLink() {
		return cartLink;
	}
	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public WebElement getBooksLink() {
		return booksLink;
	}
	public WebElement getComputersLink() {
		return computersLink;
	}
	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	public WebElement getApparalsLink() {
		return apparalsLink;
	}
	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}
	public WebElement getJewelryLink() {
		return jewelryLink;
	}
	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}
	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}
	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}
	public void setCartLink(WebElement cartLink) {
		this.cartLink = cartLink;
	}
	public void setWishlistLink(WebElement wishlistLink) {
		this.wishlistLink = wishlistLink;
	}
	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}
	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}
	public void setBooksLink(WebElement booksLink) {
		this.booksLink = booksLink;
	}
	public void setComputersLink(WebElement computersLink) {
		this.computersLink = computersLink;
	}
	public void setElectronicsLink(WebElement electronicsLink) {
		this.electronicsLink = electronicsLink;
	}
	public void setApparalsLink(WebElement apparalsLink) {
		this.apparalsLink = apparalsLink;
	}
	public void setDigitalDownloadsLink(WebElement digitalDownloadsLink) {
		this.digitalDownloadsLink = digitalDownloadsLink;
	}
	public void setJewelryLink(WebElement jewelryLink) {
		this.jewelryLink = jewelryLink;
	}
	public void setGiftCardsLink(WebElement giftCardsLink) {
		this.giftCardsLink = giftCardsLink;
	}

}
