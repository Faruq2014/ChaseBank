package com.ChaseBankWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ImpliciteWait {
	public static WebDriver driver;

	@BeforeClass
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	public void ElementsToBeClickable() {
		/*
		 * Below is the syntax for checking an element is visible and enabled such that
		 * we can click on the element. We need to pass wait time and the locator as
		 * parameters.
		 * 
		 */
		WebDriverWait wait = new WebDriverWait(driver, 12);
		// WebElement element =
		// driver.findElement(By.xpath("(//div[@class='dropdown']/a)[2]"));
		// wait.until(ExpectedConditions.elementToBeClickable(element));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown']/a"))).click();

	}
	@Test
	public void ElementsToBeClickable2() {
	WebDriverWait wait = new WebDriverWait(driver,22);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown']/a"))).click();
	
	}
}
