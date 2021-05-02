package java_assignments.assignments_8_Methods;

import java.util.Scanner;

public class Question7_isPalindrome {

	public static void main(String[] args) {


		isPalindrome();
	
		
	}
	
	public static void isPalindrome() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		
		int i=10;
		int result=0; 
		int remainder;
		
		int temp=num;
		
		while(!(temp==0)) {
			
			remainder = temp%10;
			
			temp=temp / 10;
			
			result=result * 10 + remainder;
		
		}
		
		if(result==num) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	
	}

}


/*
 Question-7

Complete a method isPalindrome() that will check if the number is a palindrome.
Print your result as a boolean (true or false).
Do not convert int into a string!
Example:
input: 1001
output: true

Example:
input: 1234
output: false

1221
1331
1441

11
121
131
141

1221
1331


12321













 */

