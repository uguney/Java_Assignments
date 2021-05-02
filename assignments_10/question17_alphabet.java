package java_assignments.assignments_10;

import java.util.Scanner;

public class question17_alphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";   //no need
		
		System.out.println("Enter first character: ");
		String input1 = sc.next();
		System.out.println("Enter second character: ");
		String input2 = sc.next();    
		
		sc.close();
		
		char first = input1.charAt(0);
		char second = input2.charAt(0);
		
	
		for(char i=first; i<=second;i++) {
			System.out.print(i);
		}
		
		
		
		
		
		
	}

}

/*
 
 Question-17

Write a program that will print out letters
in the alphabetic order accordingly to the given range within 2 chars.

Sample Output:

     input: A
     input: Z
     output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

     input: a
     input: f
     output: abcdef

     input: a
     input: d
     output: abcd

     input: B
     input: O
     output: BCDEFGHIJKLMNO
 
 */



