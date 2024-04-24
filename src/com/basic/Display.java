package com.basic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// 1 Display This Information using printf a. Your Name b. Your Birth date c. Your Age d. Your Address
public class Display {

	public static void main(String[] args) {

		String name, address;
		LocalDate birthDate = null;
		int age;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Name: ");
		name = scanner.next();

		System.out.print("Enter a Birth Date (dd/mm/yyyy): ");
		String dateStr = scanner.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		birthDate = LocalDate.parse(dateStr, formatter);

		System.out.println("Enter Age: ");
		age = scanner.nextInt();

		System.out.println("Enter Address: ");
		address = scanner.next();

		System.out.println("Name: " + name);
		System.out.println("Birthdate: " + birthDate);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		
		scanner.close();

	}

}
