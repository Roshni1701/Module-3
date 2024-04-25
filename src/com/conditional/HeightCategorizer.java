package com.conditional;

import java.util.Scanner;

// 8 WAP to accept the height of a person in centimeters and categorize the person according to their height.
public class HeightCategorizer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your height in centimeters: ");
		int height = scanner.nextInt();

		if (height < 150) {
			System.out.println("You are categorized as Very Short.");
		} else if (height <= 159) {
			System.out.println("You are categorized as Short.");
		} else if (height <= 179) {
			System.out.println("You are categorized as Average.");
		} else if (height <= 189) {
			System.out.println("You are categorized as Tall.");
		} else {
			System.out.println("You are categorized as Very Tall.");
		}
		scanner.close();
	}
}
