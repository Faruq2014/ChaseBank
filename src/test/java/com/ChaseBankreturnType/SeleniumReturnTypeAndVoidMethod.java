package com.ChaseBankreturnType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumReturnTypeAndVoidMethod {
static WebDriver driver;// static variable
	
	@BeforeTest // special testng method
	public void openBrowser() {
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	
	/**
	 *inbuilt void method.
	 *all the general rule for void method apply
	 *you can not modify a void method. 
	 */
	@Test(priority=0)  
	public void openApplication() { 
		driver.get("https://locator.chase.com/");
	}
	
	/**inbuilt return type method
	 * we can modify.
	 * we must comply with data type
	 
	 * 
	 */
	@Test(priority=1)
	public void getTitle() {
		String title=driver.getTitle();
		System.out.println(( title).toUpperCase());
	}
	
	/*** we can increase the scope of data
	 * we can not decrease the scope of the data
	 */
	@Test(priority=2)
	public void getUrl() {
	Object url=driver.getCurrentUrl();
	// driver.getCurrentUrl(); method is a string method
	// we are increasing the scope.
	Object urlString=url.toString().toUpperCase();
	System.out.println(urlString);
	}
	
	
}
