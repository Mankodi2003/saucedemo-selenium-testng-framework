package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected static WebDriver driver;

	public static void setUp() {
		WebDriverManager.chromedriver().setup();

		// ✅ Create ChromeOptions and launch in Guest Mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest"); // <-- This enables Guest Mode
//		options.addArguments("--start-maximized"); // Optional: open maximized

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
