		package com.ChaseBankVariables;
		
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.AfterTest;
		import org.testng.annotations.BeforeTest;
		import org.testng.annotations.Test;
		
		import io.github.bonigarcia.wdm.WebDriverManager;
		
		public class MethodInTestNg {
		
			public  WebDriver driver;
			// public is the access modifier 
			//WebDriver is a interface, interface data type
			// driver is the variable name
		
			@BeforeTest //special type of testng method which alway run before.
			public void openBrowser() {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get("https://locator.chase.com/");
			}
		
			@Test// inbuilt testng method which can run without main method.
			public void titleTest() {
				System.out.println(driver.getTitle());
				 url();
			}
		    
			// method
			public void url() {
				System.out.println(driver.getCurrentUrl());
			}
			
		
			@AfterTest//special type of testng method which alway run after.
			public void tearDown() {
				driver.quit();
			}
		
		}
