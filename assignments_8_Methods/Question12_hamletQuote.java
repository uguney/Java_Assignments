package java_assignments.assignments_8_Methods;

public class Question12_hamletQuote {

	public static void main(String[] args) {


		hamletQuote(true, true);
		
	}
	
	public static void hamletQuote(boolean first, boolean second) {
		
		if(first==false && second==false) {
			
			System.out.println(false);
		}else {
			System.out.println(true);
		}
		
		
	}
	

}
/*

Question-12

The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.

the hamletQuote method only returns true if one of or both of the boolean parameters is true.

example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false

 

hint: use the truth table for this one, this can be done with one if and a logical operator.



*/