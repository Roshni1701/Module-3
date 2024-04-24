package com.basic;

import java.util.Scanner;

// 22 Calculate compound interest (Compound Interest formula:
//      a. Formula to calculate compound interest annually is given by: Amount= P(1 + R/100)t
//      b. Compound Interest = Amount – P

public class CompoundInterestCalculator2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the principal amount:");
		double principal = scanner.nextDouble();

		System.out.println("Enter the annual interest rate (in percentage):");
		double annualRate = scanner.nextDouble();

		System.out.println("Enter the number of years:");
		int years = scanner.nextInt();

		double amount = principal * Math.pow(1 + (annualRate / 100), years);
		double compoundInterest = amount - principal;

		System.out.printf("The compound interest after " + years + " years is: " + compoundInterest);
		scanner.close();
	}
}
