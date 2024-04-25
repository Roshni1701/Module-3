package com.conditional;

import java.util.Scanner;

// 4 WAP to make simple calculator (operation include Addition, Subtraction, Multiplication, Division, modulo) using conditional statement
public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number:");
		double num1 = scanner.nextDouble();

		System.out.println("Enter the second number:");
		double num2 = scanner.nextDouble();

		System.out.println("Choose an operation:");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		System.out.println("5. Modulo (%)");
		int choice = scanner.nextInt();

		double result = 0;
		switch (choice) {
		case 1:
			result = num1 + num2;
			System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
			break;
		case 4:
			if (num2 != 0) {
				result = num1 / num2;
				System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
			} else {
				System.out.println("Error! Division by zero is not allowed.");
			}
			break;
		case 5:
			if (num2 != 0) {
				result = num1 % num2;
				System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
			} else {
				System.out.println("Error! Modulo by zero is not allowed.");
			}
			break;
		default:
			System.out.println("Invalid choice! Please choose a valid operation.");
		}
		scanner.close();
	}
}
