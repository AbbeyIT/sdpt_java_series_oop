package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		// Polymorphism
		Animal d = new Dog();
		Animal c = new Cat();

		
		d.makeSound();
		c.makeSound();
		
		
		Enemy e = new Enemy();
		Enemy se = new StrongEnemy("Carlos");
		Enemy we = new WeakEnemy();
		
		
		se.showStats();
		se.dialog();
		
		we.showStats();
		we.dialog();

	}

}
