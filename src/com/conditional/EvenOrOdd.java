package com.conditional;

import java.util.Scanner;

// 11 WAP to find number is even or odd using ternary operator
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();

		String result = (number % 2 == 0) ? "even" : "odd";
		System.out.println("The number " + number + " is " + result + ".");
		scanner.close();
	}
}
