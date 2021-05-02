package java_assignments.assignments_10;

public class question19_countJava {

	public static void main(String[] args) {

		String sentence = "javaxjavajavajavaapplepearjavaegg";		
		String word = "java";
		int counter = 0;
		
		
		while(sentence.contains(word)) {
			sentence = sentence.replaceFirst(word, "");
			counter++;
		}
			
				
		System.out.println(counter);
		
		
		
	}

}

/*
 Question-19

Return the number of times that the string "java" appears anywhere in the given string word.

Sample Output:

     input: javaxjava
     output: 2

     input: javaxjavaapplepearjavaegg
     output: 3
 
 
 */



