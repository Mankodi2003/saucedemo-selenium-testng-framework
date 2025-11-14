package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

	WebDriver driver;

	// Constructor
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	By firstProduct = By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']");
	By secondProduct = By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']");
	By addToCartBtn = By.xpath("//button[contains(@id,'add-to-cart')]");
	By backToProductsBtn = By.id("back-to-products");
	By productTitle = By.className("inventory_details_name");

	// Click first product
	public void selectFirstProduct() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(firstProduct).click();
	}

	// Click second product
	public void selectSecondProduct() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(secondProduct).click();
	}

	// Click Add to Cart button
	public void clickAddToCart() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(addToCartBtn).click();
	}

	// Click Back to Products button
	public void clickBackToProducts() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(backToProductsBtn).click();
	}

	// Get product title text
	public String getProductTitle() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(productTitle).getText();
	}

	// One full flow: first product -> add -> back -> second product -> add -> back
	public void addTwoProductsFlow() throws InterruptedException {
		// First product
		selectFirstProduct();
		clickAddToCart();
		clickBackToProducts();

		// Second product
		selectSecondProduct();
		clickAddToCart();
		clickBackToProducts();
	}
}