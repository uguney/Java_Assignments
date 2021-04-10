package java_assignments.assignments_3;

public class question5 {

	public static void main(String[] args) {


	int enterSecond=convertSeconds(3695);	
		
		

	}
	
	public static int convertSeconds(int inputSeconds) {
		
		int hours, minutes, seconds;
		
		hours=inputSeconds/3600;
		int remainderOfHours=inputSeconds%3600;
		minutes=remainderOfHours/60;
		seconds=remainderOfHours%60;
		
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
		
		return inputSeconds;
			
			
	}
	
	
	

}
