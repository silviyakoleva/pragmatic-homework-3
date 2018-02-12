package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.IsInteraction;

import utils.Browser;

public class AdminLoginPage {

	private static final String URL = "http://shop.pragmatic.bg/admin/";

	private static final By USERNAME = By.id("input-username");
	private static final By PASSWORD = By.id("input-password");
	private static final By LOGIN = By.xpath(".//button[@type='submit' and @class='btn btn-primary']");
	private static final By LOGIN_VALIDATION_ERROR = By.xpath("//div [@ class='alert alert-danger alert-dismissible']");
	private static final By SALES_DROPDOWN = By.xpath("//a [@ aria-expanded='false']");
	private static WebElement usernameField;
	private static WebElement passwordField;
	private static WebElement loginButton;

	private static boolean isInitialized = false;

	public static void goTo() {
		Browser.driver.get(URL);
	}

	public static void init() {
		usernameField = Browser.driver.findElement(USERNAME);
		passwordField = Browser.driver.findElement(PASSWORD);
		loginButton = Browser.driver.findElement(LOGIN);

		isInitialized = true;
	}

	public static void login(String username, String password) throws Throwable {

		if(!isInitialized) init();

		usernameField.sendKeys(username);
		Thread.sleep(1000);

		passwordField.sendKeys(password);
		Thread.sleep(1000);

		loginButton.click();

	}

	public static void neshto() {

		if(!isInitialized) init();
	}

	public static String getValidationError() {
		return Browser.driver.findElement(LOGIN_VALIDATION_ERROR).getText();
	}

}
