package java_assignments.assignments_3;

public class question6 {

	public static void main(String[] args) {


	calculateLethalOverdose(500);
		
		

	}
	
	public static int calculateLethalOverdose(int milligram) {
		
		int gram;
		gram=milligram/10000;
		
		// gram*10=10*(milligram*1000)
		
		int numberOfDrinks=10000/milligram;
		
		System.out.println("Number of milligrams in drink: " + milligram);
		System.out.println("It would take about " + numberOfDrinks + " drinks for a lethal overdose.");
		
		return milligram;
		
				
	}
	
	
	

}
