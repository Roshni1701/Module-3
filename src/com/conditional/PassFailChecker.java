package com.conditional;

import java.util.Scanner;

// 7. Accept marks from user and check pass or fail
public class PassFailChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Defining the passing mark
		int passingMark = 50;

		System.out.print("Enter your marks: ");
		int marks = scanner.nextInt();

		if (marks >= passingMark) {
			System.out.println("You passed with " + marks + " marks.");
		} else {
			System.out.println("You failed with " + marks + " marks.");
		}
		scanner.close();
	}
}
