package main_activity;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// USER INPUT Object Creation
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First Name: ");
		String firstName = scan.nextLine();
		
		System.out.print("Last Name: ");
		String lastName = scan.nextLine();
		
		System.out.print("Points: ");
		int points = scan.nextInt();
		
		Driver d1 = new Driver(firstName, lastName, points);

	}

}
