package LABS.lab_2;

import java.util.Scanner;

public class question3_sumOfPositiveNumbers {

	public static void main(String[] args) {

//		Question-3
//
//		Write a program that asks the user for a positive nonzero integer value. 
//		The program should use a loop to get the sum of all the integers
//		from 1 up to the number entered. 
		
		Scanner sca = new Scanner(System.in);
		
		
		
		int sumNumbers = 0;
		int number = 0;
		
		while(true) {	
			
			System.out.println("Enter a positive number: ");
			number = sca.nextInt();
			
			if(number>0) {
				sumNumbers+=number;	
			}else {
				break;
			}
		
			
		} 
 		
		System.out.println("Sum of all the numbers: " + sumNumbers);
		
		
	}

}
