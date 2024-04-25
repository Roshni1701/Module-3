package com.conditional;

import java.util.Scanner;

// 19 Write a program in C to calculate and print the electricity bill of a given customer. The customer ID, name, and unit consumed by the user should be captured from the keyboard to display the total amount to be paid to the customer. The charge are as follow:
// Unit								Charge/unit
// upto 350											 @1.20
// 350 and above but less than 600						 @1.50
// 600 and above but less than 800						 @1.80
// 800 and above										 @2.00
// If bill exceeds Rs. 800 then a surcharge of 18% will be charged and the minimum bill should be of Rs. 256/-

public class ElectricityBillCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Customer ID: ");
		int customerId = scanner.nextInt();

		System.out.println("Enter Customer Name: ");
		String customerName = scanner.next();

		System.out.println("Enter Units Consumed: ");
		int unitsConsumed = scanner.nextInt();

		double totalCharge;
		if (unitsConsumed <= 350) {
			totalCharge = unitsConsumed * 1.20;
		} else if (unitsConsumed < 600) {
			totalCharge = 350 * 1.20 + (unitsConsumed - 350) * 1.50;
		} else if (unitsConsumed < 800) {
			totalCharge = 350 * 1.20 + 250 * 1.50 + (unitsConsumed - 600) * 1.80;
		} else {
			totalCharge = 350 * 1.20 + 250 * 1.50 + 200 * 1.80 + (unitsConsumed - 800) * 2.00;
		}

		if (totalCharge > 800) {
			totalCharge *= 1.18; // Applying 18% surcharge
		}

		if (totalCharge < 256) {
			totalCharge = 256;
		}

		System.out.println("\nElectricity Bill");
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Units Consumed: " + unitsConsumed);
		System.out.println("Total Amount to be Paid: Rs. " + totalCharge);
		scanner.close();
	}
}
