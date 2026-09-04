package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class HomePage extends BasePage {
	private final By myAccountMenu=By.cssSelector("a[title=\"My Account\"]");
	private final By registerLink=By.xpath("//a[text()=\"Register\"]");
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public void openRegisterPage()
	{
		click(myAccountMenu);
		click(registerLink);
	}
}
