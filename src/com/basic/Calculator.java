package com.basic;

import java.util.Scanner;

//2 Write a program to make Simple calculator (to make addition, subtraction, multiplication, division and modulo)
public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = scanner.nextInt();

		System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
		String operation = scanner.next();

		int result = performOperation(firstNumber, secondNumber, operation);
		System.out.println("Answer: " + result);
		
		scanner.close();

	}

	private static int performOperation(int firstNumber, int secondNumber, String operation) {
		int result = 0;

		if (operation.equals("+")) {
			result = firstNumber + secondNumber;
		} else if (operation.equals("-")) {
			result = firstNumber - secondNumber;
		} else if (operation.equals("*")) {
			result = firstNumber * secondNumber;
		} else if (operation.equals("/")) {
			result = firstNumber / secondNumber;
		} else if (operation.equals("%")) {
			result = firstNumber % secondNumber;
		} else {
			System.out.println("Invalid Operations");
		}

		return result;
	}

}
