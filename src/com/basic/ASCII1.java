package com.basic;

import java.util.Scanner;

// 13 .Find character value from ascii
public class ASCII1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter ASCII code (0-127): ");
		int asciiCode = scanner.nextInt();

		if (asciiCode < 0 || asciiCode > 127) {
			System.out.println("Invalid ASCII code! Please enter a value between 0 and 127.");
		} else {
			char character = (char) asciiCode;
			System.out.println("The character for ASCII code " + asciiCode + " is '" + character + "'.");
		}
		scanner.close();

	}
}
