package FaceBookLogIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLocators {

	
WebDriver driver;	
	
@BeforeTest	
	
public void openbrowser() {	
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();	
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


driver.get("https://www.facebook.com/");

}

@Test
public void IdTest() {
	
driver.findElement(By.id("email")).sendKeys("zubaida");



driver.findElement(By.id("pass")).sendKeys("zubaida");


driver.findElement(By.id("Email or Phone Number")).sendKeys("703");

driver.findElement(By.className("inputtextclass=\"_li\"")).sendKeys("text");
driver.findElement(By.name("login")).click();
driver.findElement(By.partialLinkText("Forgot ")).click();
}

@AfterTest(enabled=false)

public void finishTest() {
driver.quit();

}
}



	
	
	
	
	
	

