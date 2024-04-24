package com.basic;

import java.util.Scanner;

// 31 .Convert kilometers into meters
public class KilometersToMetersConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of kilometers:");
		double kilometers = scanner.nextDouble();

		System.out.println(kilometers + " kilometers is equal to " + kilometers * 1000 + " meters");
		scanner.close();
	}
}
