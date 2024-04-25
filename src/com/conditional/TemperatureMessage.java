package com.conditional;

import java.util.Scanner;

// 16 Write a C program to read temperature in centigrade and display a suitable message according to the temperature state below: Temp < 0 then Freezing weather Temp 0-10 then Very Cold weather Temp 10-20 then Cold weather Temp 20-30 then Normal in Temp Temp 30-40 then Its Hot Temp >=40 then Its Very Hot
public class TemperatureMessage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the temperature in Celsius: ");
		double temperature = scanner.nextDouble();
		String message;

		if (temperature < 0) {
			message = "Freezing weather";
		} else if (temperature >= 0 && temperature <= 10) {
			message = "Very Cold weather";
		} else if (temperature > 10 && temperature <= 20) {
			message = "Cold weather";
		} else if (temperature > 20 && temperature <= 30) {
			message = "Normal in Temp";
		} else if (temperature > 30 && temperature <= 40) {
			message = "It's Hot";
		} else {
			message = "It's Very Hot";
		}
		System.out.println(message);
		scanner.close();
	}
}
