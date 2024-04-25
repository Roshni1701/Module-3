package com.looping;

import java.util.Scanner;

// 2 WAP to take 10 no. Input from user find out below values a. How many Even numbers are there b. How many odd numbers are there
// c. Sum of even numbers d. Sum of odd numbers
public class OperationOnArray {
	public static void main(String[] args) {
		int numbers[] = new int[10];
		int sumOfEven = 0, sumOfOdd = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 values: ");
		for (int i = 0; i < 10; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println("Even Numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sumOfEven += numbers[i];
				System.out.println(numbers[i]);
			}
		}
		System.out.println("Odd Numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				sumOfOdd += numbers[i];
				System.out.println(numbers[i]);
			}
		}
		System.out.println("The sum of even numbers: " + sumOfEven);
		System.out.println("The sum of even numbers: " + sumOfOdd);
		scanner.close();
	}
}
