package com.basic;

import java.util.Scanner;

// 14 Find ascii value of given number
public class ASCII2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a numeric character (0-9):");
		char numericChar = scanner.next().charAt(0);

		if (Character.isDigit(numericChar)) {
			System.out.println("The ASCII value of '" + numericChar + "' is: " + (int) numericChar);
		} else {
			System.out.println("Invalid input! Please enter a numeric character.");
		}
		scanner.close();
	}
}
