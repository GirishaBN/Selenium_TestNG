package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import enums.BrowserType;
import enums.ExecutionMode;

public class DriverFactory {

	public static WebDriver initialize(String browserName,String executionMode) {
		BrowserType browser=BrowserType.from(browserName);
		ExecutionMode mode=ExecutionMode.from(executionMode);
		return switch (browser) {
		case CHROME -> new ChromeDriver();
		case FIREFOX -> new FirefoxDriver();
		case EDGE -> new EdgeDriver();
		};
	};

}
