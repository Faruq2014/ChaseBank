			package com.ChaseBankVariables;
			
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.chrome.ChromeDriver;
			import org.testng.annotations.AfterTest;
			import org.testng.annotations.BeforeTest;
			import org.testng.annotations.Test;
			
			import io.github.bonigarcia.wdm.WebDriverManager;
			
			public class InstanceVariables {
			
				public  WebDriver driver;
				// public is the access modifier 
				//WebDriver is a interface, interface data type
				// driver is the variable name
			
				@BeforeTest
				public void openBrowser() {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					driver.get("https://locator.chase.com/");
				}
			
				@Test
				public void getTitle() {
					String title=driver.getTitle();
					System.out.println(title);
				}
			
				@Test
				void getUrl() {
					System.out.println(driver.getCurrentUrl());
				}
			
				@AfterTest
				private void tearDown() {
					driver.quit();
				}
			}
			
			
			
			
			
			
			
			
			
			
			
