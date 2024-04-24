package com.test;

import java.util.Scanner;

// 19
public class CompoundInterestCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the principal amount:");
		double principal = scanner.nextDouble();

		System.out.println("Enter the annual interest rate (in percentage):");
		double annualRate = scanner.nextDouble();

		double rate = annualRate / 100;

		System.out.println("Enter the number of times interest is compounded per year:");
		int compoundFrequency = scanner.nextInt();

		System.out.println("Enter the number of years:");
		int years = scanner.nextInt();

		double amount = principal * Math.pow(1 + (rate / compoundFrequency), compoundFrequency * years);
		double interest = amount - principal;

		System.out.printf("The compound interest after " + years + " years is: " + interest);
		scanner.close();
	}
}
