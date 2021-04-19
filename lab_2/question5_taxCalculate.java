package LABS.lab_2;

import java.util.Scanner;

public class question5_taxCalculate {

	public static void main(String[] args) {

//		Question-5
////
////		Write a program that computes the tax and tip on a restaurant bill.
//			The program should ask the user to enter the charge for the meal. 
////		The tax should be 6.75 percent of the meal charge. 
////		The tip should be 20 percent of the total after adding tax. 
////		Display the meal charge, tax amount, tip amount, and total bill on the screen.

		
		double mealCharge;
		final double tax = 0.0675;
		final double tip = 0.20;

		double taxAmount;
		double mealChargeWithTax;
		double tipAmount;
		double totalBill;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the charge for the meal: ");
		mealCharge = sc.nextDouble();
	
		sc.nextLine();
				
		 taxAmount = mealCharge * tax;
		 mealChargeWithTax = mealCharge + taxAmount;
		 tipAmount = mealChargeWithTax * tip;
		 totalBill = mealChargeWithTax + tipAmount;
		
		System.out.println("Tax amount for your meal: " + taxAmount);
		System.out.println("Tip amount for your meal: " + tipAmount);
		System.out.println("***********************************");
		System.out.println("Total bill for your meal: " + totalBill);


	
		
	}

}
