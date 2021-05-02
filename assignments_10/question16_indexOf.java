package java_assignments.assignments_10;

public class question16_indexOf {

	public static void main(String[] args) {

		String word = "xjavaxx";
		
		
		
		if(word.indexOf("java")==0 || word.indexOf("java")==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
	}

}

/*
 Question-16

Given a string word, print true if "java" appears 
starting at index 0 or 1 in the string, such as with 
"javaxxx" or "xjavaxx" but not "xxjavaxx". 
The string should be 4 and more characters.

Sample Output:
     input: javapython
     output: true

     input: cjavac++
     output: true

     input: c#javaruby
     output: false
 
 
 */



