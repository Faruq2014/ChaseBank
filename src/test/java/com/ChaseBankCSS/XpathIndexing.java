package com.ChaseBankCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathIndexing {
	
static WebDriver driver;// static variable
	
	@BeforeTest 
	public void openBrowser() {
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	
	
	@Test(priority=0)  
	public void openApplication() { 
		driver.get("https://facebook.com/");
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
	}
	

}
