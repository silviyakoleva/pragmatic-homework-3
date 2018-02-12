package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver driver;

	public static void start() {
	
		System.out.println("Starting browser...");
		
		System.setProperty("webdriver.chrome.driver", "/users/Silvyia/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	public static void stop() {
		System.out.println("Stopping browser!");
		driver.close();		
	}
			

}
