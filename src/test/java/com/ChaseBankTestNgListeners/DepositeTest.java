package com.ChaseBankTestNgListeners;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ChaseBankListeners.class)
public class DepositeTest extends BaseTest{
	
	
	@Test(priority=0)
	public void selectAmountTest() {
		//System.out.println("this is selectAmountTest test");
		Assert.assertEquals( 5, 4);
	}
	
	@Test(priority=1, dependsOnMethods="selectAmountTest")
	public void confrimAmountTest() {
		//System.out.println("this is  confrimAmountTest test");
	}
	
	@Test(priority=2)
	public void checkBalanceTest() {
		//System.out.println("this is checkBalanceTest test");
	
	}
	
	@Test(priority=3)
	public void logOutTest() {
		//System.out.println("this is logOutTest test");
		
	}
	

	

}
