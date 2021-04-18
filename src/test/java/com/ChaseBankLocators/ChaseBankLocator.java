package com.ChaseBankLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChaseBankLocator {

	
	 WebDriver driver;// static variable
		
		@BeforeTest 
		public void openBrowser() {
		
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get("https://www.chase.com/"); 
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		
		@Test 
		public void signinTest() throws InterruptedException {
	   driver.findElement(By.xpath("(//a[text()='Open an account'])[2]")).click();
	  // driver.findElement(By.xpath("//input[@name='email']")).sendKeys("fffaa");
	   driver.findElement(By.xpath("//div[@id='hero-universal']/div/div/div/div/div/div/div/div/div/a")).click();
	 // driver.findElement(By.xpath("	//*[@id='existingChaseCustomerOptionId-input-1']")).click();
	   Thread.sleep(2000);
	   int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("how many i frame in this page " + size);
	   Thread.sleep(2000);
	   //driver.findElement(By.id("existingChaseCustomerOptionId-input-1")).click();
		}


		//*[@id='existingChaseCustomerOptionId-input-1']



}
