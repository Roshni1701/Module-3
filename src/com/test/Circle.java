package com.test;

import java.util.Scanner;

// 3
public class Circle {

	public static final double PI = 3.14;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Radius: ");
		int radius = scanner.nextInt();

		double area = PI * radius * radius;
		double circumference = 2 * PI * radius;

		System.out.println("Area: " + area);
		System.out.println("Circumference: " + circumference);
		
		scanner.close();
	}

}
