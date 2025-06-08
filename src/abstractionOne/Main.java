package abstractionOne;

public class Main {

	public static void main(String[] args) {
		
		Animal d = new Dog();
		Animal c = new Cat();
		
		d.makeSound();
		c.makeSound();
		
		d.setName("Leo");
		c.setName("Roscoe");
		
		d.showName();
		c.showName();

	}

}
