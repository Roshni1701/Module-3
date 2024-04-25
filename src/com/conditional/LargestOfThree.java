package com.conditional;

import java.util.Scanner;

// 14 WAP to find the largest of three numbers
public class LargestOfThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();

		System.out.print("Enter the third number: ");
		double num3 = scanner.nextDouble();

		double largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
		System.out.println("The largest number is: " + largest);
		scanner.close();
	}
}
