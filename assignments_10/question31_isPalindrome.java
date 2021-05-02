package java_assignments.assignments_10;

public class question31_isPalindrome {

	public static void main(String[] args) {

		isPalindrome("level");
		 
		
		
		
		
	}

	private static boolean isPalindrome(String str) {
		
		String result = "";
		
		for(int i=str.length()-1; i>=0;i--) {
			
			result+=str.charAt(i);
			
		}
		
		if(result.equalsIgnoreCase(str)) {
			
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		return false;
		
		
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



