package com.ChaseBankLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ChaseBankConstructor.BasicsOfConstructor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegularLocators {

	
 WebDriver driver;// static variable
	
	@BeforeTest 
	public void openBrowser() {
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/"); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	@Test 
	public void signinTest() {
   driver.findElement(By.id("email")).sendKeys("fff@hmail.com");
  // driver.findElement(By.linkText("Forgot Password?")).click();
   driver.findElement(By.partialLinkText("Forgot")).click();
	
	}




}
