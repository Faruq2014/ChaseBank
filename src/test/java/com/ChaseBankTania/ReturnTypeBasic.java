package com.ChaseBankTania;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReturnTypeBasic {
	static WebDriver driver;

	@BeforeTest
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@AfterTest
	public void tearDown() {
		System.out.println("close");

	}

}
