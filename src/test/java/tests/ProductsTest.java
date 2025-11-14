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
import utils.ExtentReportManager;
import utils.ScreenshotUtil;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ProductsTest extends BaseClass {

	ProductsPage productsPage;
	LoginPage loginPage;
	ExtentTest test;

	@BeforeClass
	public void setUpTest() throws InterruptedException {

		test = ExtentReportManager.getReportInstance().createTest("Products Test Suite");
		test.log(Status.INFO, "Setting up ProductsTest suite");

		setUp();
		test.log(Status.INFO, "Browser launched and navigated to URL");

		loginPage = new LoginPage(driver);
		productsPage = new ProductsPage(driver);

		// Login
		test.log(Status.INFO, "Logging in with valid credentials");
		loginPage.login("standard_user", "secret_sauce");
		Thread.sleep(1000);

		String loginCheck = driver.getCurrentUrl();
		if (loginCheck.contains("inventory")) {
			test.log(Status.PASS, "Login successful, now on Products page");
		} else {
			test.log(Status.FAIL, "Login failed, URL: " + loginCheck);
		}
	}

	@Test
	public void testAddTwoProductsFlow() throws InterruptedException {

		test = ExtentReportManager.getReportInstance().createTest("Add Two Products Flow Test");

		test.log(Status.INFO, "Starting test: Adding two products and completing process");

		// Execute full flow from ProductsPage
		productsPage.addTwoProductsFlow();
		test.log(Status.INFO, "Completed addTwoProductsFlow()");

		Thread.sleep(1000);

		// Verify navigation back to Products Page
		String currentUrl = driver.getCurrentUrl();
		test.log(Status.INFO, "Current URL after flow: " + currentUrl);

		Assert.assertTrue(currentUrl.contains("inventory"), "Not returned to products page after flow");

		test.log(Status.PASS, "Successfully returned to Products Page after full flow");
	}

	@AfterMethod
	public void captureTestResult(ITestResult result) {

		if (test == null) {
			test = ExtentReportManager.getReportInstance().createTest("Unknown Test (Null Test Object)");
		}

		if (result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, "Test Failed: " + result.getThrowable());

			// Capture Screenshot
			String screenshotName = result.getName() + "_" + System.currentTimeMillis();
			ScreenshotUtil.captureScreenshot(driver, screenshotName);

			String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";

			test.addScreenCaptureFromPath(screenshotPath);
			test.log(Status.FAIL, "Screenshot attached");

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Passed Successfully");
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Skipped");
		}

		ExtentReportManager.getReportInstance().flush();
	}

	@AfterClass
	public void tearDownTest() {
		test.log(Status.INFO, "Closing browser and ending ProductsTest suite");
		tearDown();
	}
}