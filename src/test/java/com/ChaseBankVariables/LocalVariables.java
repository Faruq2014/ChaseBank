package com.ChaseBankVariables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocalVariables {


	@Test
	public void chromeTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://locator.chase.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test
	public void fireFoxTest() {
		WebDriverManager.firefoxdriver().setup();
	   WebDriver driver= new FirefoxDriver();
		driver.get("https://locator.chase.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	//@Test
	void InternetExplorer() {
		WebDriverManager.iedriver().setup();
		final WebDriver driver= new InternetExplorerDriver();
		driver.get("https://locator.chase.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test
	public void EdgeTest() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://locator.chase.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
