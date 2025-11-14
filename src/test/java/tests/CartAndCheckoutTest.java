package tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.ProductsPage;
import pages.CartAndCheckoutPage;
import utils.ExtentReportManager;
import utils.ScreenshotUtil;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CartAndCheckoutTest extends BaseClass {

	LoginPage loginPage;
	ProductsPage productsPage;
	CartAndCheckoutPage cartPage;
	ExtentTest test;

	@BeforeClass
	public void setUpTest() throws InterruptedException {

		test = ExtentReportManager.getReportInstance().createTest("Cart & Checkout Test Suite");
		test.log(Status.INFO, "Launching browser and starting CartAndCheckoutTest");

		setUp();
		test.log(Status.INFO, "Browser opened and navigated to SauceDemo");

		loginPage = new LoginPage(driver);
		productsPage = new ProductsPage(driver);
		cartPage = new CartAndCheckoutPage(driver);

		// Login
		test.log(Status.INFO, "Logging in with valid credentials");
		loginPage.login("standard_user", "secret_sauce");
		Thread.sleep(1000);

		if (driver.getCurrentUrl().contains("inventory")) {
			test.log(Status.PASS, "Login successful, now on Products page");
		} else {
			test.log(Status.FAIL, "Login failed — URL: " + driver.getCurrentUrl());
		}
	}

	@Test
	public void testFullCheckoutFlow() throws InterruptedException {

		test = ExtentReportManager.getReportInstance().createTest("Full Checkout Flow Test");
		test.log(Status.INFO, "Starting full checkout flow test");

		// Add products
		test.log(Status.INFO, "Adding two products using addTwoProductsFlow()");
		productsPage.addTwoProductsFlow();
		Thread.sleep(1000);

		// CART
		test.log(Status.INFO, "Clicking Cart Icon");
		cartPage.clickCartBtn();
		Thread.sleep(500);

		// CHECKOUT
		test.log(Status.INFO, "Clicking Checkout Button");
		cartPage.clickCheckoutBtn();
		Thread.sleep(500);

		// ENTER DETAILS
		test.log(Status.INFO, "Entering Checkout Details: John Doe, 380001");
		cartPage.enterDetails("John", "Doe", "380001");
		Thread.sleep(500);

		test.log(Status.INFO, "Clicking Continue Button");
		cartPage.clickContinueBtn();
		Thread.sleep(500);

		test.log(Status.INFO, "Clicking Finish Button");
		cartPage.finishBtn();
		Thread.sleep(500);

		test.log(Status.INFO, "Clicking Back to Home Button");
		cartPage.backToHomeBtn();
		Thread.sleep(500);

		// ASSERTION
		String finalUrl = driver.getCurrentUrl();
		test.log(Status.INFO, "Final URL: " + finalUrl);

		Assert.assertTrue(finalUrl.contains("inventory"), "Not returned to products page after checkout!");

		test.log(Status.PASS, "Checkout flow completed successfully & returned to Products Page");
	}

	@AfterMethod
	public void captureResult(ITestResult result) {

		if (test == null) {
			test = ExtentReportManager.getReportInstance().createTest("Unknown Test Execution");
		}

		if (result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, "Test Failed: " + result.getThrowable());

			// Screenshot on failure
			String screenshotName = result.getName() + "_" + System.currentTimeMillis();
			ScreenshotUtil.captureScreenshot(driver, screenshotName);

			String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";

			test.addScreenCaptureFromPath(screenshotPath);
			test.log(Status.FAIL, "Screenshot Attached");
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Passed");
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Skipped");
		}

		ExtentReportManager.getReportInstance().flush();
	}

	@AfterClass
	public void tearDownTest() {
		test.log(Status.INFO, "Closing browser and ending CartAndCheckoutTest suite");
		tearDown();
	}
}