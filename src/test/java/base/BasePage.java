package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.ConfigManager;

public abstract class BasePage {
	protected final WebDriver driver;
	protected final WebDriverWait wait;

	protected BasePage(WebDriver driver) {
		if (driver == null) {
			throw new IllegalArgumentException("WebDriver cannot be null");
		}
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigManager.getLong("waitTime")));
	}

	protected WebElement waitForVisible(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	};

	protected WebElement waitForClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	};

	protected void enterText(By locator, String value) {
		WebElement element = waitForVisible(locator);
		element.sendKeys(value);
	};

	protected void click(By locator) {
		waitForClickable(locator).click();
	};

	protected String getText(By locator) {
		return waitForVisible(locator).getText();
	};

	protected boolean isDisplayed(By locator) {
		return waitForVisible(locator).isDisplayed();
	};

	protected boolean waitForURLContains(String value) {
		return wait.until(ExpectedConditions.urlContains(value));
	}

}
