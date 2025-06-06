package main;

public class Employee {
	
	// Overloading 
	
	private String firstName, lastName;
	private String title, address, sex;
	
	private int age;
	
	Employee(String firstName, String lastName, String title, String address, String sex, int age){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.address = address;
		this.sex = sex;
		this.age = age;
	}
	
	// Overloading the Employee
	Employee(String firstName, String lastName, String title){
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
	}
 
}
