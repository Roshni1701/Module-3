package com.test;

import java.util.Scanner;

// 6
public class TriangleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Breadth: ");
		int breadth = scanner.nextInt();

		System.out.print("Enter heigth: ");
		int heigth = scanner.nextInt();

		double area = 0.5 * breadth * heigth;

		System.out.println("Area: " + area);
		
		scanner.close();
	}

}
