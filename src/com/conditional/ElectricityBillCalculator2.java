package com.conditional;

import java.util.Scanner;

// 25 Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: 
// For first 50 units Rs. 0.50/unit
// For next 100 units Rs. 0.75/unit
// For next 100 units Rs. 1.20/unit
// For unit above 250 Rs. 1.50/unit
// An additional surcharge of 20% is added to the bill
public class ElectricityBillCalculator2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of electricity units consumed: ");
		int unitsConsumed = scanner.nextInt();

		double totalBill = calculateElectricityBill(unitsConsumed);
		System.out.println("Total Electricity Bill: Rs. " + totalBill);
		scanner.close();
	}

	public static double calculateElectricityBill(int unitsConsumed) {
		double totalBill = 0;
		if (unitsConsumed <= 50) {
			totalBill += unitsConsumed * 0.50;
		} else {
			totalBill += 50 * 0.50;
			unitsConsumed -= 50;
		}
		if (unitsConsumed > 0) {
			if (unitsConsumed <= 100) {
				totalBill += unitsConsumed * 0.75;
			} else {
				totalBill += 100 * 0.75;
				unitsConsumed -= 100;
			}
		}
		if (unitsConsumed > 0) {
			if (unitsConsumed <= 100) {
				totalBill += unitsConsumed * 1.20;
			} else {
				totalBill += 100 * 1.20;
				unitsConsumed -= 100;
			}
		}
		if (unitsConsumed > 0) {
			totalBill += unitsConsumed * 1.50;
		}
		totalBill *= 1.20;
		return totalBill;
	}
}
