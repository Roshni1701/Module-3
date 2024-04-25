package com.conditional;

import java.util.Scanner;

// 20 Write a program in C to read any Month Number in integer and display the number of days for this month
public class MonthDaysCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the month number (1-12): ");
		int monthNumber = scanner.nextInt();

		if (monthNumber < 1 || monthNumber > 12) {
			System.out.println("Invalid month number. Please enter a number between 1 and 12.");
		} else {
			int daysInMonth = getDaysInMonth(monthNumber);
			System.out.println("Number of days in the month: " + daysInMonth);
		}
		scanner.close();
	}

	public static int getDaysInMonth(int monthNumber) {
		switch (monthNumber) {
		case 1: // January
		case 3: // March
		case 5: // May
		case 7: // July
		case 8: // August
		case 10: // October
		case 12: // December
			return 31;
		case 4: // April
		case 6: // June
		case 9: // September
		case 11: // November
			return 30;
		case 2: // February
			return 28; // assuming non-leap year
		default:
			return -1; // Invalid month number
		}
	}
}
