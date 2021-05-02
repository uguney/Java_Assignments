package java_assignments.assignments_8_Methods;

public class Question4_RectWithLoop {

	public static void main(String[] args) {

		printHollowRect();

	}

	private static void printHollowRect() {

		for (int i=1; i<=5; i++) { //sat�rlar�n a�a�� do�ru y�ksekli�i kadar bu i�lemi tekrarla
		
			for (int j=1; j<=5; j++){
				
				if(i==1 || i==5) {
				
				System.out.print("*");//sat�r geni�li�i kadar yan yana + karakteri yazd�r
			
				}
				
				if((j==1 || j==5) && !(i==1 || i==5)) {
					System.out.print("*");
					
				}else if(!(i==1 || i==5)){
					System.out.print(" ");
				}

		}

			System.out.println("");//sat�r sonu bir sat�r a�a�� ge�
		
	}
	
	
	}

}
/*
 * 
 * Question-4
 * 
 * Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
 *****
 * 
 * * * *
 *****
 * 
 * 
 * hint: you will need to use two nested for loops for that, and an if that
 * checks if its the last or first iteration of the loop (so you will know whet
 * to print "*" or " ")
 * 
 * 
 */
