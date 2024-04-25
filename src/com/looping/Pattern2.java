package com.looping;

import java.util.Scanner;

// 19 Pattern
public class Pattern2 {
	public static void main(String[] args) {
		System.out.print("Input number of n : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
