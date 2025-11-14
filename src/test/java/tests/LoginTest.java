package tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import utils.ExtentReportManager;
import utils.ScreenshotUtil;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginTest extends BaseClass {

	ExtentTest test;

	@BeforeMethod
	public void beforeMethod() {
		setUp();
	}

	@Test(priority = 1)
	public void verifyValidLogin() throws InterruptedException {
		test = ExtentReportManager.getReportInstance().createTest("Valid Login Test");

		test.log(Status.INFO, "Starting Valid Login Test");

		LoginPage loginPage = new LoginPage(driver);
		test.log(Status.INFO, "Entering valid username and password");

		loginPage.login("standard_user", "secret_sauce");
		test.log(Status.INFO, "Clicked Login button");

		String currentUrl = driver.getCurrentUrl();
		test.log(Status.INFO, "Current URL: " + currentUrl);

		Assert.assertTrue(currentUrl.contains("inventory"), "Login failed for valid credentials!");
		test.log(Status.PASS, "Valid login verified successfully");
	}

	@Test(priority = 2)
	public void verifyInvalidLogin() throws InterruptedException {
		test = ExtentReportManager.getReportInstance().createTest("Invalid Login Test");

		test.log(Status.INFO, "Starting Invalid Login Test");

		LoginPage loginPage = new LoginPage(driver);
		test.log(Status.INFO, "Entering invalid username and password");

		loginPage.login("wrong_user", "wrong_pass");
		test.log(Status.INFO, "Clicked Login button");

		String error = loginPage.getErrorMessage();
		test.log(Status.INFO, "Captured Error Message: " + error);

		Assert.assertTrue(error.contains("Epic sadface"), "Error message not displayed correctly!");
		test.log(Status.PASS, "Invalid login error message verified successfully");
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (test == null) {
			test = ExtentReportManager.getReportInstance().createTest("Unknown Test (Extent Test was null)");
		}

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test Case Failed: " + result.getThrowable());

			// Capture Screenshot
			String screenshotName = result.getName() + "_" + System.currentTimeMillis();
			ScreenshotUtil.captureScreenshot(driver, screenshotName);

			String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";

			test.addScreenCaptureFromPath(screenshotPath);
			test.log(Status.FAIL, "Screenshot attached: " + screenshotPath);

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Case Passed");
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case Skipped");
		}

		ExtentReportManager.getReportInstance().flush();
		tearDown();
	}
}