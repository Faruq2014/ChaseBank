package com.ChaseBankConstructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicsOfConstructor {
WebDriver driver;

public BasicsOfConstructor(WebDriver driver) {
	super();
	this.driver = driver;
}


public void signInlink() {
	driver.findElement(By.partialLinkText("Sign In")).click();
}


}
