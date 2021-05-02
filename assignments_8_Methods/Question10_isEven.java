package java_assignments.assignments_8_Methods;

public class Question10_isEven {

	public static void main(String[] args) {

		
		isEven(20);
		
		
		
	}
	
	public static void isEven(int num) {
		
		if(num%2==0) {
			System.out.println(true);
		}else {
			System.out.println(false);	
		}
		
		
	}
	

}



/*
Question-10

isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true



*/