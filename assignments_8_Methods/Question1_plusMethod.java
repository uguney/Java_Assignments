package java_assignments.assignments_8_Methods;

import java.util.Scanner;

public class Question1_plusMethod {

	public static void main(String[] args) {

		
		
		System.out.println("Result: " + plus(0, 0));
		
	}
	
	public static int plus(int num1, int num2) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = sc.nextInt();
		System.out.println("Enter second number:");
		num2 = sc.nextInt();
		
		int result = num1+num2;
		
		return result;
		
		
	}

}


/*
 
 Question-1

Create a method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within the plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */

