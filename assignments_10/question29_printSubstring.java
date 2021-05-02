package java_assignments.assignments_10;

public class question29_printSubstring {

	public static void main(String[] args) {

		limit("bla bla",3);
		
		
		
	}

	private static void limit(String str, int i) {

		String sub = str.substring(0, i);
		
		System.out.println(sub);
		
		
	}

}

/*
 Question-29

This method gets a string and an int, it returns a string. What it does is to limit the inputted string to a creating number of characters.

Sample Output:

     limit("abcd",2)
     returns "ab"

     limit("bla bla",3)
     returns "bla"
 
 
 */



