package LABS.lab_2;

import java.util.Scanner;

public class question2_caloriesOfCookies {

	public static void main(String[] args) {

//		Question-2
//
//		A bag of cookies holds 40 cookies. The calorie information
//		on the bag claims that there are 10 serving in the bag and 
//		that a serving equals 300 calories. write a program that 
//		lets the user enter the number of cookies he or she actually ate 
//		and then reports the number of total calories consumed.
		
		Scanner sca = new Scanner(System.in);
		
		System.out.print("Enter number of cookies: ");
		int eatenCookies = sca.nextInt();
		
		
		int cal=eatenCookies*75;
		
		System.out.println("Number of total calories consumed is: " + cal);
	}

}
