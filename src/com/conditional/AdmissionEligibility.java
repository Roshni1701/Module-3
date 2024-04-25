package com.conditional;

import java.util.Scanner;

// 15 Write a C program to determine eligibility for admission to a professional course based on the following criteria Eligibility Criteria : Marks in Maths >=65 and Marks in Phy >=55 and Marks in Chem>=50 and Total in all three subject >=190 or Total in Maths and Physics >=140  Input the marks obtained in Physics :65 Input the marks obtained in Chemistry :51 Input the marks obtained in Mathematics :72 Total marks of Maths, Physics and Chemistry : 188 Total marks of Maths and Physics : 137 The candidate is not eligible.
public class AdmissionEligibility {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter marks obtained in Physics: ");
		int physicsMarks = scanner.nextInt();

		System.out.print("Enter marks obtained in Chemistry: ");
		int chemistryMarks = scanner.nextInt();

		System.out.print("Enter marks obtained in Mathematics: ");
		int mathMarks = scanner.nextInt();

		int totalMarksAllSubjects = physicsMarks + chemistryMarks + mathMarks;
		System.out.println("Total marks of Maths, Physics, and Chemistry: " + totalMarksAllSubjects);

		int totalMarksMathsPhysics = physicsMarks + mathMarks;
		System.out.println("Enter total marks of Maths and Physics: " + totalMarksMathsPhysics);

		if (physicsMarks >= 65 && chemistryMarks >= 55 && mathMarks >= 50 && totalMarksAllSubjects >= 190
				|| totalMarksMathsPhysics >= 140) {
			System.out.println("The candidate is eligible for admission.");
		} else {
			System.out.println("The candidate is not eligible for admission.");
		}
		scanner.close();
	}
}
