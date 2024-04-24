package com.basic;

import java.util.Scanner;

// 23 WAP to calculate swap 2 numbers with using of multiplication and division.
public class SwapNumbers2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter num1: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter num2: ");
		int num2 = scanner.nextInt();

		num1 = num1 * num2;
		num2 = num1 / num2;
		num1 = num1 / num2;

		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		scanner.close();
	}
}
