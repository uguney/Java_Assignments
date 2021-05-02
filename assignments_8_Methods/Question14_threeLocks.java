package java_assignments.assignments_8_Methods;

public class Question14_threeLocks {

	public static void main(String[] args) {

		
		threeLocks(true, false, true);
		
	}

	public static void threeLocks(boolean a, boolean b, boolean c) {

		if ((a == true && b == true) || (c == true)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
/*
 * Question-14
 * 
 * This one is about truth table logic, threeLocks gets 3 booleans and returns a
 * boolean.
 * 
 * It returns true only if both a and b are true or c is true.
 * 
 * https://en.wikipedia.org/wiki/Truth_table
 * 
 * 
 * 
 */