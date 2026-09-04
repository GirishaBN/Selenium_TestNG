package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ConfigManager;
import driver.DriverFactory;
import driver.DriverManager;

public abstract class BaseTest {

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		String browser=ConfigManager.getString("browserName");
		String mode=ConfigManager.getString("mode");
		WebDriver webDriver =DriverFactory.initialize(browser,mode);
		DriverManager.setDriver(webDriver);
		String url=ConfigManager.getString("baseURL");
		DriverManager.getDriver().get(url);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		try {
		WebDriver webDriver=DriverManager.getDriver();
		if(webDriver!=null)
			webDriver.quit();
		}
		finally {
		DriverManager.removeDriver();
		}
	}
}
