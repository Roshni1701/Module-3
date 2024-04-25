package com.conditional;

import java.util.Scanner;

// 6 Find the Character Is Vowel or Not
public class VowelCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a character: ");
		String input = scanner.next().toLowerCase();

		if (input.length() == 1) { // Check if the input is a single character
			char ch = input.charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " is a vowel.");
			} else {
				System.out.println(ch + " is not a vowel.");
			}
		} else {
			System.out.println("Error: Please enter a single character.");
		}
		scanner.close();
	}
}
