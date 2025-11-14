package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// Locators
	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");
	By errorMsg = By.cssSelector("h3[data-test='error']");

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Actions
	public void enterUsername(String user) throws InterruptedException {
		driver.findElement(username).sendKeys(user);
		Thread.sleep(1000);
	}

	public void enterPassword(String pass) throws InterruptedException {
		driver.findElement(password).sendKeys(pass);
		Thread.sleep(1000);
	}

	public void clickLogin() throws InterruptedException {
		driver.findElement(loginBtn).click();
		Thread.sleep(1000);
	}

	public void login(String user, String pass) throws InterruptedException {
		enterUsername(user);
		enterPassword(pass);
		clickLogin();
	}

	public String getErrorMessage() {
		return driver.findElement(errorMsg).getText();
	}
}