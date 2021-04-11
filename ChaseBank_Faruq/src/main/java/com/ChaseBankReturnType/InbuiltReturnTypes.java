package com.ChaseBankReturnType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Sajid
 * Both void 'return type' and return 'String type' are both inbuilt methods
 * with examples of attributes.      
 *
 */
public class InbuiltReturnTypes {
	
	static WebDriver driver;// static variable
	
	@BeforeTest // Inbuilt void 'return type' method.
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	/**
	 * @throws InterruptedException
	 * - priority in TestNG test methods can only be the @Test methods. 
	 * Lower the priority number; higher is the priority of the test case method. 
	 * Priority in TestNG contains only integer value. 
	 * The value can be negative, zero, or positive.
	 * - description : a string that gives information about the test it is attached to.
	 * - alwaysRun : This is used when we want to make sure a method always runs even if the 
	 * parameters on which the method depends, fails.
	 */
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
	
	/**
	 * - enabled : Disabling a test in TestNG can be achieved by setting the enabled attribute of 
	 * the @Test annotation to false . 
	 */
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
