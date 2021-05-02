package java_assignments.assignments_10;

public class question25_mergeStrings  {

	public static void main(String[] args) {

		String ss1 = "123456789";
		String ss2 = "abc";

		mergeStrings(ss1, ss2);

	}

	public static void mergeStrings(String s1, String s2) {

		String result = "";
		
		char c1;
		char c2;

		if (s1.length() < s2.length()) {

			for (int i = 0; i < s1.length(); i++) {

				c1 = s1.charAt(i);
				c2 = s2.charAt(i);

				result += c1 + "" + c2;

			}

			String sub = s2.substring(s1.length());

			result += sub;

			System.out.print(result);

		}
		
		if (s1.length() > s2.length()) {

			for (int i = 0; i < s2.length(); i++) {

				c1 = s1.charAt(i);
				c2 = s2.charAt(i);

				result += c1 + "" + c2;

			}

			String sub = s1.substring(s2.length());

			result += sub;

			System.out.print(result);

		}

	}

}

/*
 * Question-25
 * 
 * When gears merge and work together, one tooth from each one goes in order.
 * Write a method mergeStrings that will return the strings merged, one letter
 * at a time, starting with one. Please note one and two can be of different
 * lengths. Please look at below examples:
 * 
 * s1 ==> "12345" s2 ==> "abcde" mergeStrings(s1,s2) ==> "1a2b3c4d5e"
 * 
 * mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
 * 
 * mergeStrings("java", "selenium") ==> "jsaevlaenium"
 * 
 * 
 */
