package com.basic;

import java.util.Scanner;

// 4 & 11 4. Find Area of Square formula : a = a2 11. .Find circumference of square formula : C = 4 * a
public class Square {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value: "); // l, b, h
		int value = scanner.nextInt();

		double area = value * value;
		double circumference = 4 * value;

		System.out.println("Area of square: " + area);
		System.out.println("Circumference: " + circumference);
		
		scanner.close();
	}

}
