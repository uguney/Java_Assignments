package java_assignments.assignments_10;

public class question28_removeBadWord {

	public static void main(String[] args) {

		 clean ("he said bla bla bla","bla");
		
		
		
		
	}

	private static void clean(String text, String badWord) {

		if (!text.contains(badWord)) {
			System.out.println("There is no bad word.");
		}
		
		while (text.contains(badWord)) {

			text = text.replaceFirst(badWord, "");

		}

		System.out.println(text);
		
		
		
		
	}

}

/*
 Question-28

This method gets two strings (text and badWord) and returns a string. Basicly what it does is take out all the occurrences of badWord in text.

Sample Output:

     clean ("one two three","two")
     returns "one three"

     clean ("foo bar","foo")
     returns "bar"

     clean ("he said bla bla bla","bla")
     returns "he said "
 
 
 */



