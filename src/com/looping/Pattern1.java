package com.looping;

import java.util.Scanner;

// 19 Pattern
public class Pattern1 {
	public static void main(String[] args) {
		System.out.print("Input number of n : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 1) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
