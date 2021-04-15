package com.ChaseBankTania;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGinbuiltMethod {

	/**
	 * 
	 *  This method will run before every test case
	 *  usually we do all kinds of initialization inside this method 
	 */
	@BeforeTest
	public void setup() {

	}
	
	/** 
	 * This method will provide external data source
	 * like xml file or database
	 * @return
	 * @throws Exception
	 */
	@DataProvider(name = "Provider")
	public Object[][] provide() throws Exception {
		return new Object[][] { {} };
	}
	
	/**
	 * Simple test method
	 * 
	 */
	@Test
	public void testNG() {
	}

	/**
	 * This method will depend on testNG method
	 */
	@Test(priority = 2, dependsOnMethods = { "testNG" }) // attributes
	public void testTitle() {

	}

	@AfterTest
	public void close() {

	}

}
