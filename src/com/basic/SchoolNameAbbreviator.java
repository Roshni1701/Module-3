package com.basic;

import java.util.Scanner;

// 15 Convert school’s name in abbreviated form
public class SchoolNameAbbreviator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the full name of the school:");
		String fullName = scanner.nextLine();

		String[] words = fullName.split("\\s+");

		StringBuilder abbreviation = new StringBuilder();

		for (String word : words) {
			if (!word.equalsIgnoreCase("of") && !word.equalsIgnoreCase("the") && !word.equalsIgnoreCase("and")
					&& !word.equalsIgnoreCase("for") && !word.equalsIgnoreCase("at")) {
				abbreviation.append(word.charAt(0));
			}
		}
		System.out.println("Abbreviated form: " + abbreviation.toString().toUpperCase());
		scanner.close();
	}

}
