package com.ChaseBankTestNgGroup;

import org.testng.annotations.Test;

public class Group1 {
	
	@Test(groups={"smoke","funnctional","regression"})
	public void loginTest() {
		System.out.println("this is login test");
	}
	
	@Test(groups= {"smoke","regression"})
	public void mouseHoverTest() {
		System.out.println("this is mouseHover test");
	}
	
	@Test(groups= {"smoke"})
	public void dropdownTest() {
		System.out.println("this is dropdown test");
	}

}
