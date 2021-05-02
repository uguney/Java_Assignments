package java_assignments.assignments_10;

public class question18_twoStrings {

	public static void main(String[] args) {

		String word1 = "oo";
		String word2 = "xxxxx";
		int sep = 3;
		
		for(int i=0; i<sep;i++) {
			
			if(word1.length()>word2.length()) {
				
				System.out.print(word1.concat(word2));
			}
			if(word1.length()<word2.length()) {
				System.out.print(word2.concat(word1));
			}
			
		}
		
		
		
		
	}

}

/*
 Question-18

Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Sample Output:

     input: Word
     input: X
     input: 3
     output: WordXWordXWord

     input: This
     input: And
     input: 2
     output: ThisAndThis

     input: This
     input: And
     input: 1
     output: This
 
 
 */



