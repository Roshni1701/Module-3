package com.conditional;

import java.util.Scanner;

// 2 Write a Java program to read the value of an integer m and display the value of m is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0
public class IntegerValueChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of m:");
		int m = scanner.nextInt();

		if (m > 0) {
			System.out.println("The value of m is 1");
		} else if (m == 0) {
			System.out.println("The value of m is 0");
		} else {
			System.out.println("The value of m is -1");
		}
		scanner.close();
	}

}
