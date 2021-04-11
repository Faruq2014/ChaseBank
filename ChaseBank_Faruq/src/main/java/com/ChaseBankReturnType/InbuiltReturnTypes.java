package com.ChaseBankReturnType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Sajid
 * Both void 'return type' and return 'String type' are both inbuilt Java methods which 
 *
 */
public class InbuiltReturnTypes {
	
	static WebDriver driver;// static variable
	
	@BeforeTest // Inbuilt void 'return type' method.
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test(priority = 0, description = "Test 0: Open Application", alwaysRun = true)
	public void openApplication() throws InterruptedException {// Inbuilt void 'return type' method.
		driver.get("https://www.zegna.com/");
		Thread.sleep(1000L);
	}
	
	@Test(priority = 2, description = "Test 2: Get Title", dependsOnMethods = {"openApplication"})
	public void getTitle() {// Inbuilt return 'String type' method.
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority = 1, description = "Test 1: Get Current URL", enabled = false)
	public void getCurrentURL() { // Inbuilt return 'String type' method.
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
		
	@AfterTest // Inbuilt void 'return type' method.
	public void tearDown() {
		driver.quit();
	}
	
}
