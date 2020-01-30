package Palindrome;

public class GenericReverse {

	public static void main(String[] args) {

		System.out.println(reverse(687));
	}

	public static <T> T reverse(T input) {
		String temp = "";
		String str = String.valueOf(input);
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--)
			temp += ch[i];
		T result = (T) temp;
		return result;
	}
}
