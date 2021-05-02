package java_assignments.assignments_10;

public class question21_replaceFirst {

	public static void main(String[] args) {

		String word = "abXYbXc";
		
		int input = 1;
		int counter=0;
		
		String sub=word.substring(0, input);
		
		
		
		while(word.contains(sub)) {
			
			word=word.replaceFirst(sub, "");
			
			counter++;
			
		}
		
		if(counter>=2) {
			System.out.println(true);
			System.out.println(sub + " appears " + counter);
		}
		
		if(counter<2) {
			System.out.println(false);
			System.out.println(sub + " appears once only");
		}

		
	}

}

/*
 Question-21

Given a string, consider the prefix string made of the first n chars of the string. Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that n is in the range from 1 till str.length().

Sample Output:

     input: abXYabc
     input: 1
     output: true
     a appears twice

     input: abXYabc
     input: 2
     output: true
     ab appears twice

     input: abXYabc
     input: 3
     output: false
     abX appears once only
 
 
 */



