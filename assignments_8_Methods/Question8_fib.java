package java_assignments.assignments_8_Methods;

import java.util.Scanner;

public class Question8_fib {

	public static void main(String[] args) {

		fib();

	}

	public static void fib() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		int number = sc.nextInt();

		int num3=0;
		
		int num1 = 0;
		int num2 = 1;

		for (int i = 1; i < number-1; i++) {
			
			num3=num1+num2;
			
			num1=num2;
			num2=num3;
		}
		
		System.out.println(num3);

	}

}


/*










 * Question-8
 * 
 * Complete a method fib() that will compute Fibonacci numbers In fibonacci
 * series, next number is the sum of previous two numbers for example 0, 1, 1,
 * 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci
 * series are 0 and 1. Given a number num, print n-th Fibonacci Number.
 * 
 * Input : 2 Output : 1
 * 
 * Input : 9 Output : 21
 * 
 * 
 * 
 */
