package com.basic;

import java.util.Scanner;

// 17 Calculate person’s insurance premium based on salary
public class InsurancePremiumCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final double PREMIUM_PERCENTAGE = 5.0; // 5%

		System.out.println("Enter your annual salary:");
		double salary = scanner.nextDouble();

		double insurancePremium = (PREMIUM_PERCENTAGE / 100) * salary;

		System.out.println("Your annual insurance premium is Rs" + insurancePremium);

		scanner.close();
	}
}
