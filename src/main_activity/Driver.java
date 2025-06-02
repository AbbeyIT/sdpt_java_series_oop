package main_activity;

public class Driver {
	
	String firstName;
	String lastName;
	int points;
	
	Driver(String firstName, String lastName, int points){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.points = points;
		
		System.out.println(firstName + " Created");
		System.out.println(lastName + " Created");
		System.out.println(points + " Points");
	}

}
