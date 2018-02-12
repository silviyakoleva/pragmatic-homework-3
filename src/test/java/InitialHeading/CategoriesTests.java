package InitialHeading;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.AdminLoginPage;
import pageObjects.CategoriesPage;
import utils.Browser;

public class CategoriesTests {

	private static final String USERNAME = "admin";
	private static final String PASSWORD = "parola123!";

	@Before
	public void setUp() throws Throwable {
		Browser.start();
		Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		AdminLoginPage.goTo();
		Thread.sleep(1000);
		AdminLoginPage.login(USERNAME, PASSWORD);
		Thread.sleep(1000);
	}

	@After
	public void tearDown() {
		Browser.stop();
	}

	@Test
	public void initialCategories() throws Throwable {
		CategoriesPage.goToCatalog();
		CategoriesPage.goToCategories();
		assertEquals("Categories", CategoriesPage.getHeading());
	}
}
