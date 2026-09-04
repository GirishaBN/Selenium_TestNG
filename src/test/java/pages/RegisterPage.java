package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class RegisterPage extends BasePage {
	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	private final By firstName = By.id("input-firstname");
	private final By lastName = By.id("input-lastname");
	private final By email = By.id("input-email");
	private final By telephone = By.id("input-telephone");
	private final By password = By.id("input-password");
	private final By confirmPassword = By.id("input-confirm");
	private final By agreeCheckbox = By.cssSelector("input[type=checkbox]");
	private final By submit = By.cssSelector("input[type=submit]");

	public void registerUser(String firstName, String lastName, String email, String telephone, String password,
			String confirmPassword) {
		enterText(this.firstName, firstName);
		enterText(this.lastName, lastName);
		enterText(this.email, email);
		enterText(this.telephone, telephone);
		enterText(this.password, password);
		enterText(this.confirmPassword, confirmPassword);
		click(agreeCheckbox);
		click(submit);
	};
	
	public boolean isRegistrationSuccessful() {
	    return waitForURLContains("route=account/success");
	}

}
