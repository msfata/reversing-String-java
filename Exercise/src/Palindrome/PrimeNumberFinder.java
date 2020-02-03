package Palindrome;

public class PrimeNumberFinder {

	public static void main(String[] args) {
		System.out.println(isPrime(1));
//		System.out.println(isPalindrome("Tomoto ptomoT"));
	}
	
	
	
	
	
	
	private static boolean isPrime(int n) {
		//filtering numbers <=1
		if(n<=1)return false;
		for(int i=2; i<n; i++) {
	     if(n%i==0) {
	    	 return false;
	     }
		}
		return true;
	}
	
	
	
	
	
	
	

//	private static boolean isPrime(int n) {
//		if (n <= 1) {
//			return false;
//		}
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}

	private static boolean isPalindrome(String string) {
		//remove white spaces
		//reverse string
		//unify the letters case 
		String removedSpaces=string.replaceAll("\\s+","");
		return removedSpaces.equalsIgnoreCase(new StringBuilder(removedSpaces).reverse().toString()); 
	}

//	static boolean isPrime(int n) {
//
//		if (n <= 1) {
//			return false;
//		}
//
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
}
