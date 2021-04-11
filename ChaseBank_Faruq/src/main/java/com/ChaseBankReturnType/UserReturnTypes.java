package com.ChaseBankReturnType;

public class UserReturnTypes {

	public static void main(String[] args) {
		basic();
		UserReturnTypes  rt = new UserReturnTypes();
		rt.special();
		String type3 = rt.special();
		String type4 = "Replacement return type.";
		System.out.println(type3.replaceAll(type3, type4));
		System.out.println(type3.toUpperCase());

	}
	
	public static void basic() {
		String type1 = "This is a void 'return type'.";
		System.out.println(type1);
	}
	
	public String special() {
		String type2 = "This is a return 'return type'.";
		System.out.println(type2);
		return type2;
	}

}
