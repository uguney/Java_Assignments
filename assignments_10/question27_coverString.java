package java_assignments.assignments_10;

public class question27_coverString {

	public static void main(String[] args) {

		coverString("jameva methods", "me");

	}

	public static void coverString(String main, String cover) {

		String result = "";

		if (!main.contains(cover)) {
			System.out.println("[" + main + "]");

		} else {

			result = main.replaceAll(cover, "[" + cover + "]");

			System.out.println(result);

		}
	}
}

/*
 * Question-27
 * 
 * coverString method will take 2 string parameters from the caller.
 * 
 * Your job is to write an important code that will :
 * 
 * - to search and find each appearance of coverME within main - then surround
 * it with [coverMe] (square brackets) - if you cannot find the coverME within
 * main after tirelessly looping then just return whole main itself covered
 * [main]. - keep in mind that coverME value can be of any length.
 * 
 * Sample Output:
 * 
 * coverString("java methods", "me") ) ; ==> "java [me]thods"
 * 
 * coverString("Certified Wooden Spoon", "o") ) ; ==>
 * "Certified W[o][o]den Sp[o][o]n"
 * 
 * coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
 * 
 * coverString("apples", "pears") ) ; ==> "[apples]"
 * 
 * 
 */
