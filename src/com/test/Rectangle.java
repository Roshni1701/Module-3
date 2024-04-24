package com.test;

import java.util.Scanner;

// 7 & 8
public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Length: ");
		double length = scanner.nextDouble();

		System.out.println("Enter Width: ");
		double width = scanner.nextDouble();

		double area = length * width;
		double perimeter = (2 * length) + (2 * width);

		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		
		scanner.close();
	}

}
