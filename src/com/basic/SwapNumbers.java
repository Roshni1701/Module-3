package com.basic;

import java.util.Scanner;

// 21 Accept 2 numbers from user and swap 2 numbers with using 3rd variable and without using 3rd variable
public class SwapNumbers {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter num1: ");
		num1 = scanner.nextInt();

		System.out.print("Enter num2: ");
		num2 = scanner.nextInt();

		// With third variable
		num3 = num1;
		num1 = num2;
		num2 = num3;

		// without third variable
		/*
		 * num1 = num1 + num2; num2 = num1 - num2; num1 = num1 - num2;
		 */
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		scanner.close();
	}
}
