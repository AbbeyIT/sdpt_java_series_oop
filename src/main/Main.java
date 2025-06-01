package main;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.firstName = "Alex";
		p.lastName = "Albon";
		p.sex = 'M';
		p.age = 29;
		
		System.out.println(p.firstName);
		System.out.println(p.age);
	}

}
