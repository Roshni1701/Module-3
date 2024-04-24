package com.basic;

import java.util.Scanner;

// 5 Find Area of Cube formula : a = 6a2
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
