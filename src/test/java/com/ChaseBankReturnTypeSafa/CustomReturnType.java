package com.ChaseBankReturnTypeSafa;

public class CustomReturnType {

	public static void main(String[] args) {
	CustomReturnType custom = new CustomReturnType();
	String checkString1=custom.checkStringMethod();
	String checkString2 = checkString1.toUpperCase();
	System.out.println(checkString2);
	System.out.println(checkString1.charAt(0));
	
	custom.checkVoidMethod();
	}

	public void checkVoidMethod() {
		System.out.println("This is a method with void return type");
	}
	public String checkStringMethod() {
		String checkString = "This is a String retrun type method";
		System.out.println(checkString);
		return checkString;
	}

}
