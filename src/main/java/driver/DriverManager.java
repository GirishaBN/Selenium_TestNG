package driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
	private static ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

	public static void setDriver(WebDriver driver) {
		DRIVER.set(driver);
	};

	public static WebDriver getDriver() {
		return DRIVER.get();
	};

	public static void removeDriver() {
		WebDriver driver = DRIVER.get();
		if (driver != null) {
			driver.quit();
			DRIVER.remove();
		}

	};
}
