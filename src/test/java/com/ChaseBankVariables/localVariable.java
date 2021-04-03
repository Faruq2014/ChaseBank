package com.ChaseBankVariables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class localVariable {
	
	
	public void chrometest () {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://locator.chase.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

	 
		
	}




