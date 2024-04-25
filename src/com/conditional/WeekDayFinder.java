package com.conditional;

import java.util.Scanner;

// 22 WAP to input the week number and print week day.
public class WeekDayFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the week number (1-7): ");
		int weekNumber = scanner.nextInt();

		if (weekNumber < 1 || weekNumber > 7) {
			System.out.println("Invalid week number. Please enter a number between 1 and 7.");
		} else {
			String weekDay = getWeekDay(weekNumber);
			System.out.println("Day of the week: " + weekDay);
		}
		scanner.close();
	}

	public static String getWeekDay(int weekNumber) {
		switch (weekNumber) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 7:
			return "Sunday";
		default:
			return "Invalid";
		}
	}
}