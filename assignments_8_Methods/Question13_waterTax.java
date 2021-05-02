package java_assignments.assignments_8_Methods;

public class Question13_waterTax {

	public static void main(String[] args) {

		waterTax(101);

	}

	public static double waterTax(double usage) {

		double bill = 0;

		if (usage >= 0 && usage <= 50) {

			bill = usage * 0.60;
		} else if (usage > 50 && usage <= 100) {
			bill = usage * 0.90;
		} else if (usage > 100 && usage <= 150) {
			bill = usage * 0.90 + 50;
		} else if (usage > 150) {
			bill = usage * 0.90 + 100;
		} else {
			return bill;
		}

		System.out.println(bill);
		return usage;

	}

}

/*
 * Question-13
 * 
 * This method calculates a water bill, the method gets a double and returns a
 * double.
 * 
 * The more water you use the more it will cost you (as a fine for wasting
 * water).
 * 
 * for example:
 * 
 * waterTax(50) returns 30
 * 
 * waterTax(55) returns 49.5
 * 
 * waterTax(101) returns 140.9
 * 
 * waterTax(151) returns 235.9
 * 
 * the regular calculation under 50 is bill = units * 0.60; above 50 is: bill =
 * units * 0.90;
 * 
 * above 100 the calculation is like above 50 but with a 50 as fine
 * 
 * and above 150 it is the same as above 50 (units *0.90) but with a 100 fine
 * added to the price.
 * 
 * 
 * 
 */