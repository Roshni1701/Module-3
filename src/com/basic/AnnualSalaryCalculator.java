package com.basic;

import java.util.Scanner;

// 18 Calculate person’s Annual salary
public class AnnualSalaryCalculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your hourly wage:");
		double hourlyWage = scanner.nextDouble();

		System.out.println("Enter the number of hours you work per week:");
		double hoursPerWeek = scanner.nextDouble();

		// assuming 52 working weeks
		double annualSalary = hourlyWage * hoursPerWeek * 52;

		System.out.printf("Your annual salary is: " + annualSalary);
		scanner.close();
	}
}
