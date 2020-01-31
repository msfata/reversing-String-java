package Palindrome;

public class LongestWord {

	public static void main(String[] args) {
		System.out.println(
				getLongestWord(new String[] { "kabul", "afghanistan", "Mohammed", "shafiq", "fata", "parwan" }));
	}

	private static String getLongestWord(String[] array) {
		String temp = "";
		for (int i = 0; i < array.length; i++) {

			if (array[i].length() > temp.length())
				temp = array[i];
		}
		return temp;

	}
}
