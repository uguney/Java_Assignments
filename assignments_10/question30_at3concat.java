package java_assignments.assignments_10;

public class question30_at3concat {

	public static void main(String[] args) {

		 at3("longword","foo");
		 
		
		
		
		
	}

	private static void at3(String str1, String str2) {

		String alt1 = str1.substring(0, 3);
		String alt2 = str1.substring(3);
		
		String result = alt1+str2+alt2;
		System.out.println(result);
		
	}

}

/*
 Question-30

at3 method gets two strings and returns a string. The first string is the one that will be manipulated. At the 3rd char position of the target you will insert the word argument.

Sample output:

     at3("longword","foo")
     return: "lonfoogword"

     at3("blabla","a")
     return: "blaabla"
 
 
 */



