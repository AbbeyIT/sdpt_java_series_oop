package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("Max", "Male", 18);  
		Toddler t = new Toddler("Kelly", "Female", 26, "Yo-yo");
		Kid k = new Kid("Toto", "Male", 6, "Beyblade", 1);
		
		p.checkStatus();
		t.checkStatus();
		
		t.drink();
		
		k.sayGradeLevel();

	}

}
