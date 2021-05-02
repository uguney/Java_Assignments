package java_assignments.assignments_8_Methods;

import java.util.Scanner;

public class Question5_signNumber {

	public static void main(String[] args) {

		sign(30);
		
		
	}
	
	public static int sign(int num) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		num = sc.nextInt();
		
		if(num==0) {
			System.out.println("0");
		}else if(num<0) {
			System.out.println("-1");
		}else {
			System.out.println("1");
		}
		
		return num;
	
	}

}


/*
 Question-5

Create a method called sign.  It gets a number and tells you if its positive, negative or zero.

for example :
sign(5) => 1
sign(-30)=> -1
sign(0) => 0

sign gets an int parameter.

print out 1,-1 or 0 depending on the input

the parameter should be entered by user (create a scanner object)



 */

