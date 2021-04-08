package LABS.lab_1;

public class question6 {

	public static void main(String[] args) {

		cigarParty(60, true);

	}

	public static void cigarParty(int numberOfCigars, boolean weekend) {

		if (numberOfCigars >= 40 && numberOfCigars <= 60) {

			System.out.println("true");
			
		}else if (numberOfCigars >= 61 && weekend == true) {
			
			System.out.println("true");
					
		}else {
			
			System.out.println("false");
			
		}

		

	}

}
