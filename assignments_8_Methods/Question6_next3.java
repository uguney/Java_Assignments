package java_assignments.assignments_8_Methods;

import java.util.Scanner;

public class Question6_next3 {

	public static void main(String[] args) {


		next3();
	
	}
	
	public static void next3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		
		System.out.println("Next 3 are:");

		for(int i=num+1; i<num+4; i++) {
			
			System.out.print(i + " ");
		}
		
		
	}

}


/*
 Question-6

Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.

enter number
1
next 3 are:
2 3 4

(put a space between numbers)



 */

