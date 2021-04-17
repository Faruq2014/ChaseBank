package com.ChaseBankTania;
import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int quaters;
		System.out.println("Enter quaters ");
		quaters = scnr.nextInt();
		
		int diems;
		System.out.println("Enter diems ");
		diems = scnr.nextInt();
		

		int nickles;
		System.out.println("Enter nickles ");
		nickles = scnr.nextInt();
		

		int pennies;
		System.out.println("Enter pennies ");
		pennies = scnr.nextInt();
		
		int totalCents;
		double dollars;
		totalCents = (quaters * 25) + (diems * 10) + (nickles * 5) + pennies;
		dollars = (double) totalCents / 100;
		System.out.printf("Amount: $%.2f\n", dollars);

	}

}
