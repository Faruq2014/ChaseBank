package com.returntype.attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReturnTypeInTestNg {
static WebDriver driver;
	
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test(priority=1, description = "This is first test case")
	public void openApplication() {
		driver.get("https://www.chase.com/");
	}
	
	@Test(dependsOnMethods= {"getUrl"}, timeOut=200)
	public void passTest() throws InterruptedException  {
		System.out.println("This is time out");
		Thread.sleep(500);
	}
	
	//@Test(priority=2)
	@Test(dependsOnMethods= {"openApplication"},description = "This is second test case")
	public void getAppTitle() {  // non-return user defined method
		String gt = driver.getTitle();  //built-in String return method
		System.out.println("Title: "+gt);
		
	}
	
	//@Test(priority=2,enabled = true)
	@Test(dependsOnMethods= {"getAppTitle"})
	public void getUrl() {
		String gcrl = driver.getCurrentUrl(); //built-in String return method
		System.out.println("Current url is: "+gcrl);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit(); //built-in non-return/void method
	}
	
	




}
