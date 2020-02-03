package Palindrome;

public class tes {
	public static void main(String[] args) {

		System.out.println(isQualified(1100));

	}

	private static boolean isQualified(int salary) {
		
		boolean result= salary >= 1000 ? true : false;
		
		if (salary >= 1000) {
			result = true;
		} else {
			result = false;
		}
		
		
		return result;
	}
}
