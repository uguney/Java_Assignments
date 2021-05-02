package java_assignments.assignments_8_Methods;

public class Question11_profit {

	public static void main(String[] args) {

		c_profits(5, 10);

	}

	public static void c_profits(int buyPrice, int sellPrice) {

		if (buyPrice < sellPrice) {
			System.out.println("profit");
		} else if (buyPrice > sellPrice) {
			System.out.println("**loss**");
		} else {
			System.out.println("no loss");
		}

	}

}
/*
 * 
 * Question-11
 * 
 * c_profits gets the buyPrice(int) and sellPrice(int) and determines if there
 * was a profit or loss. it returns a string value that can be
 * "profit","loss","no loss"
 * 
 * for example: c_profis(100,1500) returns : "profit"
 * 
 * c_profis(20,5) returns : "loss"
 * 
 * c_profis(100,100) returns : "no loss"
 * 
 * 
 */