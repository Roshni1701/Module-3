package com.conditional;

import java.util.Scanner;

// 13 WAP to find minimum number among 3 numbers using ternary operator 
public class MinOfThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();

		System.out.print("Enter third number: ");
		int num3 = scanner.nextInt();

		int min = num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
		System.out.println("The minimum number is " + min);
		scanner.close();
	}
}
