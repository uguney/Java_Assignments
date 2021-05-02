package java_assignments.assignments_8_Methods;

import java.util.Scanner;

public class Question2_cube {

	public static void main(String[] args) {
		
		

		System.out.println("Result: " + cube());

	}

	public static long cube() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		long result = num * num * num;

		return result;

	}

}

/*
 * 
 * Question-2
 * 
 * Create a method called cube. Write all required code inside this method in
 * order to ask the user for a number and then prints the cubed value of that
 * number:
 * 
 * Example:
 * 
 * input: 5 output: 125
 */
