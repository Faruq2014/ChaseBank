package FaceBookLogIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OrAndXpath {
	WebDriver driver;
	
	@BeforeTest

	public void openBrowser() {

	WebDriverManager.chromedriver(). setup();

	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");

	}


	@Test
	public void ORANDtest() {
	driver.findElement(By.xpath("//input[@type='password'or@id='pass']")).sendKeys("zubaida");

	driver.findElement(By.xpath("//input[@id='loginbutton'and @name='login'] ")).click();

}
	
	@AfterTest(enabled=false)

	public void finishTest() {
	driver.quit();	
	
	}
	
}
	
	
	
	
	
}