package LABS.lab_1;

public class question1 {

	public static void main(String[] args) {

		stringTimes("Hi", 5);
		
	}
	
	public static void stringTimes(String message, int num) {
		
		int i;
		for (i=1; i<=num; i++) {
			
			System.out.print(message);
			
		}
	}

}
