package java_assignments.assignments_10;

public class question24_countString {

	public static void main(String[] args) {

		String sentence = "What's the difference pythonbetween java, javascript and python?";
		
		int counterX = 0;
		int counterY = 0;
		
		if(sentence.contains("java")&&(sentence.contains("python"))) {
			
			do {
			
			sentence = sentence.replaceFirst("java", "");
			
			counterX++;
			}while(sentence.contains("java"));
			
			do {
				
			sentence = sentence.replaceFirst("python", "");
			
			counterY++;
			}while(sentence.contains("python"));
		}
		
		
		if(counterX==counterY) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
	}

}

/*
 Question-24

Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Sample Output:

     input: We study java not python
     output: true

     input: What's the difference between java, javascript and python?
     output: false
 
 
 */



