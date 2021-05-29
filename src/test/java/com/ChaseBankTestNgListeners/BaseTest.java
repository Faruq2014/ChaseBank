package com.ChaseBankTestNgListeners;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	@BeforeTest()
	public void init() {
	System.out.println("this is before test");	
	}
	
	@AfterTest
	public void destroy() {
		System.out.println("this after test");
	}
}
