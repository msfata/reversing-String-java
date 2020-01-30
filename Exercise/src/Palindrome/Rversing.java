package Palindrome;
/*
 * @author msfata programminghelp
 * */
public class Rversing {
	public static void main(String[] args) {
		System.out.println(firstWay("ataf qifahs demmahoM"));
		System.out.println(secondWay("ataf qifahs demmahoM"));
		System.out.println(thirdWay("ataf qifahs demmahoM"));
	}

	/*
	 * reversing string text method 1
	 */
	private static String firstWay(String string) {
		Character c;
		String temp = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			c = string.charAt(i);
			temp += c;
		}
		return temp;
	}

	/*
	 * reversing string text method 2
	 */
	private static String secondWay(String string) {
		char[] ch = string.toCharArray();
		String result = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			result += ch[i];
		}
		return result;
	}

	/*
	 * reversing string text method 3
	 */
	private static String thirdWay(String string) {
		return new StringBuilder(string).reverse().toString();
	}

}
