package com.looping;

import java.util.Scanner;

// 7 WAP to print number in reverse order
public class ReverseNumber {
	public static void main(String[] args) {

		int number, reverse = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		number = scanner.nextInt();

		while (number != 0) {
			int rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;
		}
		System.out.println("Reverse Number: " + reverse);
		scanner.close();
	}
}
