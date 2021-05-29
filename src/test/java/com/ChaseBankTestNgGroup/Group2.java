package com.ChaseBankTestNgGroup;

import org.testng.annotations.Test;

public class Group2 {
	
	@Test(groups={"smoke","sprint11","regression"})
	public void loginTest() {
		System.out.println("this is login test=grpup2");
	}
	
	@Test(groups= {"smoke","regression"})
	public void mouseHoverTest() {
		System.out.println("this is mouseHover test=grpup2");
	}
	
	@Test(groups= {"sprint11"})
	public void dropdownTest() {
		System.out.println("this is dropdown test=grpup2");
		sajid();
	}
	
	public void sajid() {
		System.out.println("my name is sajid");
	}

}
