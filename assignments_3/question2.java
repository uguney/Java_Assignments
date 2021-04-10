package java_assignments.assignments_3;

public class question2 {

	public static void main(String[] args) {


		ageCalculator("Ozzy", 2006);
		

	}
	
	public static int ageCalculator(String name, int birthYear) {
		
		int currentYear=2021;
		int age=currentYear-birthYear;
		
		System.out.println("Hello, " + name + "! Based on your input, your age is " + age + " :)");	

		
		return age;
				
	}
	
	
	

}
