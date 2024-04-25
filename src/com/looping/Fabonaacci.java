package com.looping;

import java.util.Scanner;

// 6 WAP to print Fibonacci series up to given numbers
public class Fabonaacci {

	public static void main(String[] args) {

		int firstTerm = 1, secondTerm = 1, n, nextTerm;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value of n:");
		n = scanner.nextInt();
		System.out.println("Fibonacci Series:");

		for (int i = 1; i <= n; ++i) {
			if (i != n)
				System.out.print(firstTerm + ",");
			else
				System.out.print(firstTerm);
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		scanner.close();
	}
}
