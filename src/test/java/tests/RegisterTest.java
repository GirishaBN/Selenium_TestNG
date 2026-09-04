package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseTest;
import driver.DriverManager;
import pages.HomePage;
import pages.RegisterPage;
import testdata.TestDataGenerator;

public class RegisterTest extends BaseTest {
	private RegisterPage registerPage;
	private HomePage homePage;

	@BeforeMethod(alwaysRun = true)
	public void setUpPage() {
		WebDriver driver=DriverManager.getDriver();
		registerPage = new RegisterPage(driver);
		homePage = new HomePage(driver);
	}

	@Test(groups = { "smoke", "regression" })
	public void registerUser_withValidData_shouldBeSuccessful() {
		homePage.openRegisterPage();
		String email = TestDataGenerator.uniqueEmail("shyam_sundar");
		String password = TestDataGenerator.uniquePassword("shyam");
		registerPage.registerUser("Shyam", "Sundar", email, "789456123", password, password);
		Assert.assertTrue(registerPage.isRegistrationSuccessful(), "Registration should be successful");
	}
}
