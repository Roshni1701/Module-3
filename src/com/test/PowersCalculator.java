package com.test;

import java.util.Scanner;

// 33
public class PowersCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int num = scanner.nextInt();

		System.out.println(num + "^1 = " + num);
		System.out.println(num + "^2 = " + (num * num));
		System.out.println(num + "^3 = " + (num * num * num));

		scanner.close();
	}
}
