package com.test;

import java.util.Scanner;

// 20
public class SalaryCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your monthly salary:");
		double monthlySalary = scanner.nextDouble();

		double insurancePremium = monthlySalary * 0.10;
		double remainingSalaryAfterInsurance = monthlySalary - insurancePremium;
		double loanInstallment = remainingSalaryAfterInsurance * 0.10;
		double remainingSalary = remainingSalaryAfterInsurance - loanInstallment;

		System.out.printf(
				"Your monthly salary after deducting insurance premium and loan installment is Rs" + remainingSalary);
		scanner.close();
	}
}
