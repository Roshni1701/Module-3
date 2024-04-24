package com.basic;

import java.util.Scanner;

// 25 Accept 5 expense from user and find average of expense
public class ExpenseCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double[] expenses = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter expense " + (i + 1) + ":");
			expenses[i] = scanner.nextDouble();
		}
		double totalExpense = 0;
		for (double expense : expenses) {
			totalExpense += expense;
		}
		double averageExpense = totalExpense / 5;

		System.out.println("Total expense: " + totalExpense);
		System.out.println("Average expense: " + averageExpense);

		scanner.close();
	}
}
