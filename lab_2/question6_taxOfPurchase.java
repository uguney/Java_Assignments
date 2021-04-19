package LABS.lab_2;

import java.util.Scanner;

public class question6_taxOfPurchase {

	public static void main(String[] args) {

		// Question 6
//		Write a program that will ask the user 
//		to enter the amount of a purchase. 
//		The program should then compute the state and county tax sales tax. 
//		Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
//		The program should display the amount of the purchase , 
//		the state sales tax, the county sales tax, the total sales tax, 
//		and the total of the sale (which is the sum of the amount 
//		of purchase plus the total sales tax)
		
		double purchase;
		final double stateTax = 0.04;
		final double countyTax=0.02;
		
		double stateTaxAmount;
		double countyTaxAmount;
		double totalTax;
		double totalOfTheSale;

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount of your purchase: $ ");
		purchase=sc.nextDouble();
		
		sc.nextLine();
		
		stateTaxAmount = purchase * stateTax;
		countyTaxAmount= purchase * countyTax;
		totalTax= stateTaxAmount + countyTaxAmount;
		totalOfTheSale= purchase + totalTax;
		
		System.out.println("----------------------------------------");
		
		System.out.println("The state tax for your purchase: $ " + stateTaxAmount);
		System.out.println("The county tax for your purchase: $ " + countyTaxAmount);
		System.out.println("The total tax for your purchase: $ "+ totalTax);
		System.out.println("----------------------------------------");

		System.out.println("The total of the sale: $ " + totalOfTheSale);


		
		
		
		
		
		
	}

}
