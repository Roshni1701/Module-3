package com.test;

import java.util.Scanner;

// 27
public class DaysToMonthsConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of days:");
		int days = scanner.nextInt();

		double months = (double) days / 30;
		System.out.printf(days + " days is approximately " + months);
		scanner.close();
	}
}
