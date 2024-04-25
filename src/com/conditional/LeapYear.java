package com.conditional;

import java.util.Scanner;

// 3 WAP to check if the given year is a leap year or not.
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the year:");
		int year = scanner.nextInt();

		boolean isLeapYear = false;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			isLeapYear = true;
		}
		if (isLeapYear) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
		scanner.close();
	}
}