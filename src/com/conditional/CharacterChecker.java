package com.conditional;

import java.util.Scanner;

// 9 C Program to Check UpperCase or LowerCase or Digit or Special Character
public class CharacterChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a single character: ");
		String input = scanner.nextLine();

		if (input.length() == 1) {
			char ch = input.charAt(0);
			if (Character.isUpperCase(ch)) {
				System.out.println(ch + " is an uppercase letter.");
			} else if (Character.isLowerCase(ch)) {
				System.out.println(ch + " is a lowercase letter.");
			} else if (Character.isDigit(ch)) {
				System.out.println(ch + " is a digit.");
			} else {
				System.out.println(ch + " is a special character.");
			}
		} else {
			System.out.println("Error: Please enter exactly one character.");
		}
		scanner.close();
	}
}
