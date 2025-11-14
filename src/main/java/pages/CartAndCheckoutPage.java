package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartAndCheckoutPage {

	WebDriver driver;

	// Constructor...
	public CartAndCheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators...
	By cartbtn = By.xpath("//a[@class='shopping_cart_link']");
	By checkoutbtn = By.xpath("//button[@id='checkout']");
	By firstname = By.id("first-name");
	By lastname = By.id("last-name");
	By postalcode = By.id("postal-code");
	By continuebtn = By.xpath("//input[@id='continue']");
	By finishbtn = By.xpath("//button[@id='finish']");
	By backtohomebtn = By.xpath("//button[@id='back-to-products']");

	// Actions...
	public void clickCartBtn() {
		driver.findElement(cartbtn).click();
	}

	public void clickCheckoutBtn() {
		driver.findElement(checkoutbtn).click();
	}

	public void enterDetails(String fname, String lname, String postal) throws InterruptedException {
		driver.findElement(firstname).clear();
		driver.findElement(firstname).sendKeys(fname);
		Thread.sleep(1000);

		driver.findElement(lastname).clear();
		driver.findElement(lastname).sendKeys(lname);
		Thread.sleep(1000);

		driver.findElement(postalcode).clear();
		driver.findElement(postalcode).sendKeys(postal);
		Thread.sleep(1000);
	}

	public void clickContinueBtn() {
		driver.findElement(continuebtn).click();
	}

	public void finishBtn() {
		driver.findElement(finishbtn).click();
	}

	public void backToHomeBtn() {
		driver.findElement(backtohomebtn).click();
	}
}