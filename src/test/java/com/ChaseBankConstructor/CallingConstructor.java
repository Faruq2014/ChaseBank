package com.ChaseBankConstructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CallingConstructor {
	
static WebDriver driver;// static variable
	
	@BeforeTest // special testng method
	public void openBrowser() {
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://locator.chase.com/"); 
		}
	
	@Test 
	public void signinTest() {
	BasicsOfConstructor bc = new BasicsOfConstructor(driver);
	bc.signInlink();
	
	}


}
