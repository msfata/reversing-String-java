package Palindrome;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("palap"));
	}

	public static boolean isPalindrome(String input) {
		input = input.replaceAll("\\s+", "");
		return input.equals(new StringBuilder(input.toLowerCase()).reverse().toString());
	}
}
