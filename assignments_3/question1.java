package java_assignments.assignments_3;

public class question1 {

	public static void main(String[] args) {

		double gallon = convertGallonToLiter(150);
		
		System.out.println(gallon);
		
	}

	public static double convertGallonToLiter(double gallon) {

		gallon = gallon * 3.78541178;

		return gallon;
	}

}
