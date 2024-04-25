package com.looping;

import java.util.Scanner;

// 5 WAP to print factorial of given number
public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value, fact = 1;
		System.out.print("Enter value: ");
		value = scanner.nextInt();
		for (int i = value; i >= 1; i--) {
			fact *= i;
		}
		System.out.println(fact);
		scanner.close();
	}
}
