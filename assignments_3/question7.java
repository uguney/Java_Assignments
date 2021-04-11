package java_assignments.assignments_3;

public class question7 {

	public static void main(String[] args) {

		int quarter=0, dimes=0, nickles=0;
		
		int price=35;
		
		if(price>=25 && price<=100) {
			
			int change=100-price;
			
			quarter=change/25;
			dimes=(change%25)/10;
			nickles=((change%25)%10)/5;
			
			System.out.println("Price in cents: " + price);
			System.out.println("Your change is " + quarter + " quarters, " + dimes + " dimes, and " + nickles + " nickles");
			
		}else {
			
			System.out.println("invalid pay");
		}
		
		

	}
		

}
