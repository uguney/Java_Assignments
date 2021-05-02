package java_assignments.assignments_8_Methods;

public class Question9_biggerNumber {

	public static void main(String[] args) {

		
		max(35,10);
		
		
	}

	public static void max(int x, int max) {

		if (x > max) {
			System.out.println(max);
		} else {
			System.out.println(x);
		}

	}

}

/*
 * Question-9
 * 
 * Create a method called max. It gets two ints, x and max. x is the test case,
 * max is what we test against.
 * 
 * if x is bigger then max return max in any other case return x.
 * 
 * for example:
 * 
 * max(1,10) returns 1
 * 
 * max(11,5) returns 5
 * 
 * 
 * 
 */
