package com.looping;

import java.util.Scanner;

// 19 Pattern
public class Pattern3 {
	public static void main(String[] args) {
		System.out.print("Input number of n : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
