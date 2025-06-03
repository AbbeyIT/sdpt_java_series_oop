package main;

public class Main {

	public static void main(String[] args) {
		
		
		// Person.java
		Person p = new Person("Alex", "Albon", 'M', 29); //Constructors
		
//		p.firstName = "Alex";
//		p.lastName = "Albon";
//		p.sex = 'M';
//		p.age = 29;
		
		System.out.println(p.firstName);
		System.out.println(p.age);
		
		
		// Product.java
		Product p1 = new Product("Albono",  4.6f);
		System.out.println(p1.price);
		
		
		//Character.java
		Character c = new Character("George", "Hi Mate", 100, 100,10); 
		System.out.println(c.dialog);	
		c.introduce();
		
	}

}
