package InitialHeading;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import pageObjects.AdminLoginPage;
import pageObjects.DashboardPage;

import utils.Browser;

public class DashboardTests {

	private static final String USERNAME = "admin";
	private static final String PASSWORD = "parola123!";

	@Before
	public void setUp() throws Throwable {
		Browser.start();
		Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		AdminLoginPage.goTo();
		AdminLoginPage.login(USERNAME, PASSWORD);
	}

	@After
	public void tearDown() {
	}	

	@Test
	public void checkHeading() throws Throwable {
		assertEquals("initial heading Dashboard", "Dashboard", DashboardPage.getHeading());
		

	}

}


