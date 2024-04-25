package com.conditional;

import java.util.Scanner;

// 17 Write a C program to check whether a triangle can be formed with the given values for the angles
public class TriangleFormation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the three angles of the triangle:");
		System.out.print("Angle 1: ");
		int angle1 = scanner.nextInt();

		System.out.print("Angle 2: ");
		int angle2 = scanner.nextInt();

		System.out.print("Angle 3: ");
		int angle3 = scanner.nextInt();

		boolean isValidTriangle = (angle1 + angle2 + angle3) == 180;
		if (isValidTriangle) {
			System.out.println("The given angles can form a valid triangle.");
		} else {
			System.out.println("The given angles cannot form a valid triangle.");
		}

		scanner.close();
	}
}
