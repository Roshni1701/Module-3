package com.looping;

import java.util.Scanner;

// Write a program to find out the max from given number (E.g., No: -1562 Max number is 6)
public class MaxNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		
		char maxDigit = findMaxDigit(Math.abs(number));
		System.out.println(maxDigit);
		
		scanner.close();
	}

	private static char findMaxDigit(int number) {
		String numStr = Integer.toString(number);
        char maxDigit = '0';

        for (char digit : numStr.toCharArray()) {
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }
		return maxDigit;
	}
}
