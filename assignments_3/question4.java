package java_assignments.assignments_3;

public class question4 {

	public static void main(String[] args) {


	int num1, num2;
	num1=10;
	num2=20;
	
	System.out.println("n1=" + num1 + "\n" + "n2=" + num2);
	
	System.out.println("------");
	
	// swapping values, we can use the third temporary value
	
	int temp=num1;
	
	num1=num2;
	num2=temp;
		
	System.out.println("n1=" + num1 + "\n" + "n2=" + num2);	

	}
	
}
