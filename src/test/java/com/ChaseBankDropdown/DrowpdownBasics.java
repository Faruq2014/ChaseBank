package com.ChaseBankDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrowpdownBasics {
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
		driver.findElement(By.cssSelector("[id^='u_0_2']")).click();
		driver.findElement(By.cssSelector("[name^='firstname']")).sendKeys("Banna");
		driver.findElement(By.cssSelector("[name^='lastname']")).sendKeys("Banna");
		
		
		// create an web element variable
		WebElement month = driver.findElement(By.cssSelector("[id='month']"));
		Select monthSelect = new Select(month); // nesting the webelemnt with select class
		          //writing one line instead 
		//Select monthSelect = new Select(driver.findElement(By.cssSelector("[id='month']")));
		//monthSelect.selectByIndex(3); // you can select three different ways
		//monthSelect.selectByValue("2");// index and value is two different things
		monthSelect.selectByVisibleText("Jan");
		
	List<WebElement>listOfMonths=monthSelect.getOptions();// use options class to print all the values
	   System.out.println(listOfMonths.size());
	for (int i = 0; i < listOfMonths.size(); i++) {// use loop to print the values.
		System.out.println(listOfMonths.get(i).getText());
	}
		

	}
	
}
