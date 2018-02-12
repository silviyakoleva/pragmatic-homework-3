package login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pageObjects.AdminLoginPage;
import utils.Browser;

public class AdminLoginNegativeTests {

	private static final String INVALID_USERNAME = "gosho";
	private static final String INVALID_PASSWORD = "parola666@";

	@Before
	public void setUp() {
		Browser.start();
	}

	@Test
	public void unsuccessfulLogin() throws Throwable {
		AdminLoginPage.goTo();
		Thread.sleep(1000);

		AdminLoginPage.login(INVALID_USERNAME, INVALID_PASSWORD);


		Assert.assertTrue(AdminLoginPage.getValidationError().contains("No match for Username and/or Password."));
	}
	@After
	public void tearDown() {
		Browser.stop();
	}
}		

