package java_assignments.assignments_8_Methods;

public class Question16_simpleRoomBook {

	public static void main(String[] args) {

		simpleRoomBook(true, 7, 25, 2018);

	}

	public static void simpleRoomBook(boolean option, int month, int day, int year) {

		if (month == 7 && (day >= 1 && day <= 8) && year == 2018) {
			System.out.println(false);
		} else if (option == true && (month >= 1 && month <= 12) && (day >= 1 && day <= 31) && year >= 2018) {
			System.out.println(true);
		}

	}

}
/*
 * Question-16
 * 
 * To book a room first it needs to be available for rent and make sure its
 * available at the date selected:
 * 
 * the room is already booked between 7/1/2018 - 7/8/2018 and not available
 * accepting bookings only for year of 2018
 * 
 * example:
 * 
 * simpleRoomBook(false,2,1,2018) return false
 * 
 * simpleRoomBook(true,2,1,2018) return true
 * 
 * simpleRoomBook(true,7,2,2018) return false
 * 
 * 
 * 
 */