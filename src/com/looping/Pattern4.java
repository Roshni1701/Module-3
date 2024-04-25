package com.looping;

import java.util.Scanner;

// 19 Pattern
public class Pattern4 {
	public static void main(String[] args) {
		System.out.print("Input number of n : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a++ + " ");
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
