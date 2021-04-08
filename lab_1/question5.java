package LABS.lab_1;

public class question5 {

	public static void main(String[] args) {

		caughtSpeeding(85, false);

	}

	public static void caughtSpeeding(int speed, boolean birthday) {

		int result0 = 0, result1 = 1, result2 = 2;

		
		if (birthday == true) {

			int newspeed = speed - 5;

			if (newspeed >= 0 && newspeed <= 60) {

				System.out.println(result0);

			}else if(newspeed > 60 && newspeed <= 80) {
				
				System.out.println(result1);

			}else if(newspeed > 80) {
				
				System.out.println(result2);

			}

		}else if(birthday==false) {
			
			if (speed >= 0 && speed <= 60) {

				System.out.println(result0);
			
		}else if (speed > 60 && speed <= 80) {
			
			System.out.println(result1);
			
		}else if (speed > 80) {
			
			System.out.println(result2);

		}
		

	}
		
	}

}
