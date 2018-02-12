package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Browser;

public class CategoriesPage {

	public static void goToCatalog() {
		WebElement goToCatalog = Browser.driver.findElement(By.xpath("//li [@id='menu-catalog']"));
		goToCatalog.click();
	}
	public static void goToCategories() {
		WebElement goToCategories = Browser.driver.findElement(By.xpath("//li [@id='menu-catalog']/ul/li/a[contains(text(), 'Categories')]"));
		goToCategories.click();
	}
	public static By initialHeading = By.xpath("//h1");

	public static String getHeading() {
		return Browser.driver.findElement(initialHeading).getText();
	}
}

