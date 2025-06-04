package student_obj_simulation;

public class Student {
	
	String firstName;
	String lastName;
	int year;
	String course;
	String section;
	float midtermGrade;
	float finalGrade;
	
	Student(String firstName, String lastName, int year, String course, String section, float midtermGrade, float finalGrade){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.course = course;
		this.section = section;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
	}
	
	void introduceSelf() {
		System.out.println("Full Name: " + firstName + " " + lastName);
		System.out.println("Course: " + course);
		System.out.println("Year: " + year);
		System.out.println("Section: " + section);
	}
	
	void evaluateGrade() {
		float average;
		average = (midtermGrade + finalGrade)/2;
		System.out.println("Average: " + average);
		
		if (average > 100) {
			System.out.println("Invalid Grade");
		} else if (average >= 98 ) {
			System.out.println("With Highest Honors");
		} else if (average >= 95 ){
			System.out.println("With High Honors");
		} else if (average >= 90 ){
			System.out.println("With Honors");
		} else if (average >= 75 ){
			System.out.println("Passed");
		} else if (average <= 75 ){
			System.out.println("Failed");
		}
		
	}

}
