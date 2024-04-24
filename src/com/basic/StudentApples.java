package com.basic;

import java.util.Scanner;

// 12 Accept number of students from user. I need to give 5 apples to each student. How many apples are required?
public class StudentApples {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of Students: ");
		int noOfStudents = scanner.nextInt();

		int applesPerStudent = 5;

		int totalApples = noOfStudents * applesPerStudent;

		System.out.println("Total Apples: " + totalApples);
		
		scanner.close();
	}
}
