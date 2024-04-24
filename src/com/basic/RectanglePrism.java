package com.basic;

import java.util.Scanner;

// 10 find the area of a rectangular prism formula : A=2(wl+hl+hw)
public class RectanglePrism {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Length: ");
		double length = scanner.nextDouble();

		System.out.println("Enter Width: ");
		double width = scanner.nextDouble();

		System.out.println("Enter Height: ");
		double height = scanner.nextDouble();

		double area = 2 * (width * length + height * length + height * width);

		System.out.println("Area: " + area);
		
		scanner.close();
	}

}
