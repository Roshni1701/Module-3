package com.conditional;

import java.util.Scanner;

// 18 Write a C program to calculate profit and loss on a transaction. 
public class ProfitLossCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the cost price: ");
		double costPrice = scanner.nextDouble();

		System.out.print("Enter the selling price: ");
		double sellingPrice = scanner.nextDouble();

		double profitOrLoss = sellingPrice - costPrice;

		String result;
		if (profitOrLoss > 0) {
			result = "Profit";
		} else if (profitOrLoss < 0) {
			result = "Loss";
		} else {
			result = "No Profit No Loss";
		}

		System.out.println("Result: " + result);
		if (!result.equals("No Profit No Loss")) {
			System.out.println("Amount: $" + Math.abs(profitOrLoss));
		}
		scanner.close();
	}
}