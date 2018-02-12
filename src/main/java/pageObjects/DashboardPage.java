package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Browser;

public class DashboardPage {
	public static By initialHeading = By.xpath("//h1");

	public static String getHeading() {
		return Browser.driver.findElement(initialHeading).getText();
	}
}



