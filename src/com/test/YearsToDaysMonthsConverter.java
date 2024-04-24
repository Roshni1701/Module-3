package com.test;

import java.util.Scanner;

// 28
public class YearsToDaysMonthsConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of years:");
		int years = scanner.nextInt();

		int days = years * 365;
		int months = years * 12;

		System.out.println(years + " years is approximately " + days + " days");
		System.out.println(years + " years is approximately " + months + " months");
		scanner.close();
	}
}