package FaceBookLogIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathStartsWith {


	WebDriver driver;

@BeforeTest

public void openBrowser() {

WebDriverManager.chromedriver(). setup();

driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.facebook.com/");	
}
	@Test()
	public void startsWithXpath() {
	
	driver.findElement(By.xpath("//startswith [@class='9nq2 marginBottom16px']")).sendKeys("ggg");
	
	}
	@AfterTest(enabled=false)

	public void finishTest() {
	driver.quit();	
	
	}
}
	
	
	
	
	
	
	

}
