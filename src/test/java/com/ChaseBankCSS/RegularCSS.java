package com.ChaseBankCSS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegularCSS {
	
static WebDriver driver;// static variable
	
	@BeforeTest 
	public void openBrowser() {
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	
	@Test(priority=0)  
	public void regularCSStest() { 
		
		// in css id=#
	    driver.findElement(By.cssSelector("[id='email']")).sendKeys("aaaa");
		//driver.findElement(By.cssSelector("#email")).sendKeys("dddd");
	    
	    
		// in css class = . 
	   // driver.findElement(By.cssSelector("[class='inputtext']")).sendKeys("aaaa");
	//	driver.findElement(By.cssSelector(".inputtext")).sendKeys("dddd");
		
		//driver.findElement(By.xpath("//input[@id='email']"));
	}
	
	@Test(priority=1)  
	public void startsWithCSStest() { 
		// in css id=#
		//driver.findElement(By.cssSelector("#email")).sendKeys("dddd");
		// in css class = . 
		//in css ^= starts-with

		 driver.findElement(By.cssSelector("[id^='u_0_d_']")).click();
		
		
	}
	
	@Test(priority=2)  
	public void endsWithCSStest() { 
		// in css id=#
		//driver.findElement(By.cssSelector("#email")).sendKeys("dddd");
		// in css class = . 
		//in css ^= starts-with
		//in css $= ends-with

		// driver.findElement(By.cssSelector("[id$='_0_2_Yo']")).click();
		 //[data-testid$='_email']
		 driver.findElement(By.cssSelector("[data-testid$='_email']")).sendKeys("yyyy");
		
		
	}
	

}
