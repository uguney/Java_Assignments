package java_assignments.assignments_10;

public class question23_sandwich {

	public static void main(String[] args) {

		String word = "kkkkbreadjambreadkkk";

		String sub = "bread";

		int start = word.indexOf(sub)+5;
		int fin = word.indexOf(sub, start);
		
		String result = word.substring(start, fin);
		
		System.out.println(result);
		
		

		
		
		
	}

}

/*
 Question-23

A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Sample Output:

     input: breadjambread
     output: jam

     input: xxbreadjambreadyy
     output: jam

     input: xxbreadapple
     output: nothing

     input: breadbutterbread
     output: butter
 
 
 */



