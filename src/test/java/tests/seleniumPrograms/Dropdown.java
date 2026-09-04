package tests.seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
@Test
public void selectOption() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.testmuai.com/selenium-playground/select-dropdown-demo/");
	WebElement dropown=driver.findElement(By.id("select-demo"));
	Select select=new Select(dropown);
	select.deSelectByContainsVisibleText("Sunday");
	select.selectByIndex(2);
	select.selectByValue("Friday");
	Thread.sleep(Duration.ofSeconds(10));
	driver.close();
}
}
