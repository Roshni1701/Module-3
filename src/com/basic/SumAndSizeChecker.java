package com.basic;

import java.util.Scanner;

// 32 Accept 2 numbers and find out its sum check it size
public class SumAndSizeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int number1 = scanner.nextInt();

		System.out.println("Enter the second number:");
		int number2 = scanner.nextInt();

		int sum = number1 + number2;
		int size = String.valueOf(sum).length();
		System.out.println("Sum of the two numbers: " + sum);
		System.out.println("Size of the sum (number of digits): " + size);
		scanner.close();
	}
}
