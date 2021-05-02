package com.ChaseBankDropdown;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrowpdownAssertion {
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
			
		WebElement month = driver.findElement(By.cssSelector("[id='month']"));
		Select monthSelect = new Select(month); 
			monthSelect.selectByVisibleText("Jan");
		
	List<WebElement>listOfMonths=monthSelect.getOptions(); 
	Assert.assertEquals(listOfMonths.size(), 12);
	   System.out.println(listOfMonths.size());
	for (int i = 0; i < listOfMonths.size(); i++) {
	
		System.out.println(listOfMonths.get(4).getText());
		Assert.assertEquals(listOfMonths.get(4).getText(), "April");
		
		break;
	}
		

	}
	
}
