package com.returntype.attributes;


public class BasicOfReturnAndVoid {
	
	public void myName() { //This is No Return Type/void method. There is no scope to modify.
		System.out.println("Mili");
	}
	
	public String myName1() { //This is Return Type String method
		String name = "My name is Mili";
		System.out.println(name);
		return name;
	}
	

	public static void main(String[] args) {
		
		BasicOfReturnAndVoid bor = new BasicOfReturnAndVoid();
		bor.myName();
		System.out.println(bor.myName1().toUpperCase());
		String res = bor.myName1().toLowerCase();//toLowerCase()/toUpperCase()...etc. are built in return type
		System.out.println(res);
	}

}

