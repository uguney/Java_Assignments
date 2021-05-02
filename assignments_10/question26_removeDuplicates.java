package java_assignments.assignments_10;

public class question26_removeDuplicates {

	public static void main(String[] args) {

		
		uniqueChars("javvvvaa");
		
		
		
	}

	private static void uniqueChars(String str) {

		
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			
			String each = "" + str.charAt(i);
			
			if(!(result.contains(each))) {
				
				result = result + each;
				
			}
			
		}
		
		System.out.println(result);
		
		
		
		
	}

}

/*
 Question-26

uniqueChars is a method that you will code now, should be able to accept any string in the word and return unique characters from the parameter.

Sample Output:

     uniqueChars("java") ==> "jav"

     uniqueChars("mama") ==> "ma"

     uniqueChars("spoon") ==> "spon"
 
 
 */



