package com.ChaseBankAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoover1 {WebDriver driver;
@BeforeTest
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.navigate().to("https://www.assurancewireless.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
     } 
//@Test
public void mouseHoover() {
	WebElement account=driver.findElement(By.xpath("//a[@class='mainMenuBtn']"));
	Actions act = new Actions(driver);
	act.moveToElement(account).build().perform();
	driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
}

//@Test
public void mouseHoover1() {
	WebElement account=driver.findElement(By.xpath("//a[@class='mainMenuBtn']"));
	WebElement login=driver.findElement(By.xpath("(//a[text()='Login'])[1]"));
	Actions act = new Actions(driver);
	//act.moveToElement(account).moveToElement(login).click().build().perform();
	
	act.moveToElement(account)
	.moveToElement(login)
	.click()
	.build()
	.perform();
}
//*[@id='menu-inner']/ul/li[5]/ul/li


@Test
public void mouseHooverlist() {
	List<WebElement> account=driver.findElements(By.xpath("//*[@id='menu-inner']/ul/li[5]/ul/li"));
	System.out.println(account.size());
	for (int i = 0; i < account.size(); i++) {
		System.out.println(account.get(i).getText());
		System.out.println(account.get(i).getAttribute("id"));
		WebElement list=account.get(i);
		System.out.println(list.getAttribute("innerHTML"));
		boolean status=list.isEnabled();
		System.out.println(status);
		
		boolean status1=list.isDisplayed();
		System.out.println(status1);
		
		
	}
}
}
