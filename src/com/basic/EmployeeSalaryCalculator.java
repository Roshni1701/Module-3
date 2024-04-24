package com.basic;

import java.util.Scanner;

// 24 Accept 5 employees name and salary and count average and total salary
public class EmployeeSalaryCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] employeeNames = new String[5];
		double[] employeeSalaries = new double[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter name of employee " + (i + 1) + ":");
			employeeNames[i] = scanner.nextLine();

			System.out.println("Enter salary of employee " + (i + 1) + ":");
			employeeSalaries[i] = scanner.nextDouble();

			scanner.nextLine();
		}

		double totalSalary = 0;
		for (double salary : employeeSalaries) {
			totalSalary += salary;
		}
		double averageSalary = totalSalary / 5;

		System.out.println("Total salary of all employees: " + totalSalary);
		System.out.println("Average salary of all employees: " + averageSalary);
		scanner.close();
	}
}
