package inheritance;

public class Kid extends Toddler{
	
	int gradeLevel;
	
	Kid(String name, String sex, int age, String game, int gradeLevel){
		super(name, sex, age, game);
		this.gradeLevel = gradeLevel;
	}
	
	void sayGradeLevel() {
		System.out.println("I am " + gradeLevel);
	}

}
