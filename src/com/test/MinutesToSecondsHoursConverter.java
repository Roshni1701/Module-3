package com.test;

import java.util.Scanner;

// 29
public class MinutesToSecondsHoursConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of minutes:");
		int minutes = scanner.nextInt();

		int seconds = minutes * 60;
		double hours = (double) minutes / 60;

		System.out.println(minutes + " minutes is equal to " + seconds + " seconds");
		System.out.println(minutes + " minutes is equal to " + hours + " hours");
		scanner.close();
	}
}
