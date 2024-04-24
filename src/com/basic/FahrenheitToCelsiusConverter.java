package com.basic;

import java.util.Scanner;

// 26 Convert temperature Fahrenheit to Celsius
public class FahrenheitToCelsiusConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter temperature in Fahrenheit:");
		double fahrenheit = scanner.nextDouble();

		double celsius = (5.0 / 9.0) * (fahrenheit - 32);

		System.out.printf("Temperature in Celsius: " + celsius);
		scanner.close();
	}
}
