	package com.ChaseBankreturnType;
	
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class TestNgAttributes {
		static WebDriver driver;// static variable
	
	@BeforeTest // special testng method
	public void openBrowser() {
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	
	@Test(priority=0,alwaysRun= true) // regular methods 
	public void openApplication() {
		driver.get("https://locator.chase.com/"); 
	}
	
	@Test(priority=2, dependsOnMethods = { "openApplication" })//attributes
	public static void getTitle() {
		String title=driver.getTitle(); //local variable
		System.out.println(title);
	}
	@Test(priority=1,enabled=false)
	public void getUrl() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	
	@AfterTest // special testng method
	private void tearDown() {
		driver.quit();
	}
	}