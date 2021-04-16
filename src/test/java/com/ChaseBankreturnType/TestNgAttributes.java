package com.ChaseBankreturnType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgAttributes {

	static WebDriver driver;
	
	@BeforeTest
	public void openBrowser(){
	
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	}
	
	@Test(priority=0)
	public void openApplication() {
	driver.get("https://locator.chase.com/");
	}	
		@Test(priority=2,dependsOnMethods= {"openapplication"})	//Attributes
	public static void getTitle() {	
	
	String title= driver.getTitle()	;// local variable
	System.out.println(title);
	}
	@Test(priority=1,enabled=true)
	public void getUrl() {
	String url=driver. getCurrentUrl();
	System.out.println(url);
	}
	
	
	@AfterTest
	private void tearDown() {
		driver.quit();
	}

		
		
		
		
		
		
		
		
		
		
	}
	