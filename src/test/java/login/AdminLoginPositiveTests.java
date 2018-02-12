package login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pageObjects.AdminLoginPage;
import utils.Browser;

public class AdminLoginPositiveTests {

	private static final String USERNAME = "admin";
	private static final String PASSWORD = "parola123!";

	@Before
	public void setUp() {
		Browser.start();
	}

	@After
	public void tearDown() {
		Browser.stop();
	}	

	@Test
	public void successfulLogin1() throws Throwable {

		AdminLoginPage.goTo();
		Thread.sleep(1000);

		AdminLoginPage.login(USERNAME, PASSWORD);

		Thread.sleep(1000);	
	}
}
