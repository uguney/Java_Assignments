package LABS.lab_2;

import java.util.Scanner;

public class question4_percentofmales {

	public static void main(String[] args) {

//		Question-4
//
//		Write a program that asks user for the number of 
//		males and the number of females registered in a class. 
//		The program should display the percentage of males and females in the class.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of males: ");
		int males = sc.nextInt();
		
		System.out.print("Number of females: ");
		int females = sc.nextInt();
		
		
		int total = males + females;
		double percentOfMales= males * 100 / total;
		double percentOfFemales=100-percentOfMales;
	
		System.out.println("% " + percentOfMales + " males and % " + percentOfFemales + " females");
		
		
		
		
		
	}

}
