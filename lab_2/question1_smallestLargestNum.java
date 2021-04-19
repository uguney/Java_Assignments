package LABS.lab_2;

import java.util.Scanner;

public class question1_smallestLargestNum {

	public static void main(String[] args) {

//		Write a program with a loop that lets the user enter 
//		a series of integer numbers. After all the numbers have been entered, 
//		the program should display the largest and smallest numbers entered.

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int max = sc.nextInt();
		int min = max;
		
		int option = 1;

		while (option == 1) {

			System.out.print("Enter your next number: ");
			int numNext = sc.nextInt();

			if(numNext<max && numNext<min) {
				min = numNext;
			}
			else{
				max = numNext;
			}

			System.out.println("");

			System.out.println("Do you want to continue entering number: \n0-No, 1-Yes");
			option = sc.nextInt();

		}
		
		System.out.println("The largest number: " + max);
		System.out.println("The smallest number: " + min);
		
		System.out.println("*** Thank you so much ***");
	}


}


