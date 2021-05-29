package com.ChaseBankTestNgListeners;

import org.testng.Assert;
import org.testng.annotations.Test;
//@Listeners(ChaseBankListeners.class)
public class LoginTest extends BaseTest{
	
	
	@Test(priority=0)
	public void userNameTest() {
		//System.out.println("this is user name test");
	}
	
	@Test(priority=1)
	public void passwordTest() {
		//System.out.println("this is  password test");
	}
	
	@Test(priority=2)
	public void submitTest() {
		//System.out.println("this is submit test");
		Assert.assertEquals( 4, 5);
	}
	
	@Test(priority=3, dependsOnMethods="submitTest")
	public void forgetLinkTest() {
		//System.out.println("this is forget link test");
		
	}
	
	

}
