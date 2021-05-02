package com.ChaseBankAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysEnter {
public WebDriver driver;
	
	@BeforeTest 
	public void openBrowser() {
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@Test
	public void dropdownTest() {
		
		driver.findElement(By.cssSelector("[id^='email']")).sendKeys("Banna");
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("Banna");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
		

	}
	
}
