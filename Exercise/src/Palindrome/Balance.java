package Palindrome;

import java.util.LinkedList;

public class Balance {

	public static void main(String[] args) {
		System.out.println(CheckParentheses("({[]})"));
	}

	private static Boolean CheckParentheses(String s) {
		LinkedList<Character> ll = new LinkedList<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '{' || c == '(' || c == '[' || c == '}' || c == ')' || c == ']') {
				switch (c) {
				case '{':
					ll.push(c);
					break;
				case '[':
					ll.push(c);
					break;
				case '(':
					ll.push(c);
					break;
				case '}':
					if (ll.isEmpty() || ll.pop() != '{') {
						return false;
					}
					break;
				case ']':
					if (ll.isEmpty() || ll.pop() != '[') {
						return false;
					}
					break;
				case ')':
					if (ll.isEmpty() || ll.pop() != '(') {
						return false;
					}
					break;
				}
			} else {
				return false;
			}
		}

		return ll.isEmpty();

	}
}