package com.ChaseBankVariables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Faruq
 * A class contain five things
 * 1. variables
 * 2. constructor
 * 3. method 
 * 4. static block
 * 5. instance block. 
 *
 */
public class MixedVariables {

	static WebDriver driver;// static variable
	String browser="chrome"; //instance variable
	static String env="loc"; // static variable



	//constructor 
	public MixedVariables() {
		super();
	}

	
	@BeforeTest // special testng method
	public void openBrowser() {
		if (browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();

		}else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();}
		else {
			System.out.println("Browser was not intiate properly");
		}

		// System.out.println("I am running on "+browser );
	}
	
	@Test // regular methods 
	public void openApplication() {
		driver.get("https://locator.chase.com/"); 
	}
	
	@Test(dependsOnMethods = { "openApplication" })//attributes
	public static void getTitle() {
		String title=driver.getTitle(); //local variable
		System.out.println(title);
	}

	@AfterTest // special testng method
	private void tearDown() {
		driver.quit();
	}

	// instance block
	{
		System.out.println("We are running on  "+browser);
		System.out.println("Automation engineer name is Faruq");
		//System.out.println("Local time: "+System.getenv());
		System.out.println("User name : "+System.getProperty("user.name"));
		System.out.println("Time zone  : "+System.getProperty("user.timezone"));
		System.out.println("os name : "+System.getProperty("os.name"));
		System.out.println("os version : "+System.getProperty("os.version"));
		System.out.println("java version : "+System.getProperty("java.version"));

	} 

	// static block 
	static {
		if (env.equalsIgnoreCase("loc")) {
			System.out.println("running on local environment");
		} else {
			System.out.println("running on local qa environment");
		}
	}
}
