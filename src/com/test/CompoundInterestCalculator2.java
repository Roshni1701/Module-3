package com.test;

import java.util.Scanner;

// 22
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
