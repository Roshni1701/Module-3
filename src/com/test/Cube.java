package com.test;

import java.util.Scanner;

// 5
public class Cube {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value: "); // l, b, h
		int value = scanner.nextInt();

		double surfaceArea = 6 * value * value;

		System.out.println("surfaceArea: " + surfaceArea);
		
		scanner.close();
	}

}
