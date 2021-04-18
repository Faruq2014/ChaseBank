package com.ChaseBankLocatorsXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegularXpath {
	
	 WebDriver driver;
		
		@BeforeTest 
		public void openBrowser() {
		
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get("https://www.facebook.com/"); 
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		
		//@Test 
		public void signinOrTest() {
	 driver.findElement(By.xpath("//input[@id='min']|//input[@name='email']")).clear();
	 driver.findElement(By.xpath("//input[@name='email'] | //input[@id='min']")).sendKeys("jjjj");
	 driver.findElement(By.xpath("//input[@id='min']|//input[@name='email']")).clear();
	 driver.findElement(By.xpath("//input[@type='password'or @id='pass']")).sendKeys("rttete");
		}
		
		//@Test 
		public void signinAndTest() {
			 driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("hhh");;
		}
		
		//@Test 
		public void signinStartsWithTest() {
			 driver.findElement(By.xpath("//*[starts-with(@id,'u_0_d')]")).click();
		}
		
		//@Test 
		public void signinContainTest() {
			 driver.findElement(By.xpath("//a[contains(@id,'0_2')]")).click();
		}
		
		//@Test 
		public void signinTextTest() {
		WebElement text=driver.findElement(By.xpath("//h2[text()='Connect with friends and the world around you on Facebook.']"));
		System.out.println(text);
		driver.findElement(By.xpath("//a[text()='Pages']")).click();
		}
		
		//@Test 
		public void signinFollowingTest() {
		WebElement text=driver.findElement(By.xpath("//h2[text()='Connect with friends and the world around you on Facebook.']"));
		System.out.println(text);
		//driver.findElement(By.xpath("//*[@class='uiList localeSelectorList _2pid _509- _4ki _6-h _6-j _6-i']//following::li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='pageFooter']//following::ul/li[1]/a")).click();
		}
		
		@Test 
		public void signinContainTextest() {
			WebElement text=driver.findElement(By.xpath("//*[contains(text(),'Connect with friends and the world')]"));
		System.out.println(text);
		}
  

}
