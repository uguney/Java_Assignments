package LABS.lab_1;

public class question4 {

	public static void main(String[] args) {

		deerPlay(70, false);

	}

	public static void deerPlay(int temperature, boolean isSummer) {

		if ((temperature >= 60) && (temperature <= 90)) {

			System.out.println("true");

		} else if ((temperature > 90 && temperature <= 100) && (isSummer == true)) {

			System.out.println("true");

		} else if ((temperature > 90 && temperature <= 100) && (isSummer == false)) {

			System.out.println("false");

		} else {
			
			System.out.println("false");
			
		}

	}

}
