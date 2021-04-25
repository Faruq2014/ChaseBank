package com.ChaseBankCSS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceCSS2 {
	
static WebDriver driver;// static variable
	
	@BeforeTest 
	public void openBrowser() {
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	
	
	//@Test(priority=1)  
	public void directChiledCSStest() { 
		//always going to click first child
 driver.findElement(By.cssSelector("[class='uiList pageFooterLinkList _509- _4ki _703 _6-i']>li")).click();
	
		
	}
	
	//@Test(priority=2)  
	public void directListofChiledCSStest() {
		// you can click any child
 driver.findElement(By.cssSelector("[class='uiList pageFooterLinkList _509- _4ki _703 _6-i']>li:nth-child(3)")).click();
	
		
	}
	
	@Test(priority=2)  
	public void directFirstChiledCSStest() {
		// you can click any child
 //driver.findElement(By.cssSelector("[class='uiList pageFooterLinkList _509- _4ki _703 _6-i']>li:first-child")).click();
 driver.findElement(By.cssSelector("[class^='uiList pageFooterLinkList ']>li:first-child")).click();
	
		
	}
	

	

}
