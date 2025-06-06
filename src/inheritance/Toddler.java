package inheritance;

public class Toddler extends Person{
	
	// Inheritance
	
	String game;
	
	Toddler(String name, String sex, int age, String game){
		super(name, sex, age); // Overriding 
		this.game = game;
	}
	
	void drink() {
		System.out.println("Drinking Milk");
	}
	
	// Overriding Method
	void checkStatus() {
		super.checkStatus();
		System.out.println("Game: " + game);
	}

}
