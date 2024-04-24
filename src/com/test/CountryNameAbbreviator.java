package com.test;

import java.util.Scanner;

// 16
public class CountryNameAbbreviator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the full name of the country:");
		String fullName = scanner.nextLine();

		String[] words = fullName.split("\\s+");

		StringBuilder abbreviation = new StringBuilder();

		for (String word : words) {
			if (words.length == 1) {
				abbreviation.append(word.charAt(0));
				abbreviation.append(word.charAt(1));
			} else
				abbreviation.append(word.charAt(0));
		}

		System.out.println("Abbreviated form: " + abbreviation.toString().toUpperCase());
		scanner.close();
	}

}
