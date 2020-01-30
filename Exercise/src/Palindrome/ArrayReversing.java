package Palindrome;
/*
 * @author msfata programminghelp
 * */
public class ArrayReversing {
	public static void main(String[] args) {
		Integer[] in = new Integer[] { 1, 2, 3, 4, 5 };
		Integer[] re = reverseArray(in);
		
		String [] st= new String[] {"Mohammed","shafiq","fata"};
		String [] result=reverseArray(st);
		for(String i: result) {
			System.out.print(i+" ");
		}System.out.println();

		for (int i : re) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	@SafeVarargs
	private static <T> T[] reverseArray(T... array) {
		for (int i = 0; i < array.length / 2; i++) {
			T temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		return array;
	}
}
