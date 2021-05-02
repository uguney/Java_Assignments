package java_assignments.assignments_10;

import java.util.Scanner;

public class question20_factorial  {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int input = sc.nextInt();
		
		int result = 1;
		
		for(int i=1; i<=input; i++) {
			
			result*=i;
			
		}
		
		System.out.println(result);
		
		
	}

}

/*
 Question-20

In mathematics, the factorial of a positive integer n, denoted by n!,  is the product of all positive integers less than or equal to n. Calculate factorial and output result to the console.

Sample Output:

     input: 5
     output: 120
 
 
 */



