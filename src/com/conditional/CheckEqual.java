package com.conditional;

import java.util.Scanner;

// 1  Write a C program to accept two integers and check whether they are equal or not
public class CheckEqual {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first integer:");
		int num1 = scanner.nextInt();

		System.out.println("Enter the second integer:");
		int num2 = scanner.nextInt();

		if (num1 == num2) {
			System.out.println("The two integers are equal.");
		} else {
			System.out.println("The two integers are not equal.");
		}
		scanner.close();
	}
}
