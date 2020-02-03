package Palindrome;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class MyFilter {
	public static void main(String[] args) {
		LinkedList<Integer> ll = Uniquification.uniquify(new Integer[] { 1, 2, 3, 4, 4, 4, 4, 1, 1, 2 });
		ll.forEach(value -> System.out.print(value + " "));
		
        System.out.println("");
        
		LinkedList<String> ll1 = Uniquification.uniquify(new String[] { "Mohammed", "Shafiq", "Fata" });
		ll1.forEach(value -> System.out.print(value + " "));
	}

	static class Uniquification {
		@SafeVarargs
		public static <T> LinkedList<T> uniquify(T... input) {
			HashSet<T> hs = new HashSet<T>();
			for (T i : input)
				hs.add(i);
			List<T> l = new LinkedList<T>();
			l.addAll(hs);
			return (LinkedList<T>) l;
		}
	}
}
