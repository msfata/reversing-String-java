package Palindrome;

import java.util.LinkedList;
import java.util.Stack;

public class test {
	public static void main(String[] args) {

//System.out.println(matchingBrackets("[]{}"));
		System.out.println(isBracketsMatching("{"));
	}

	private static boolean isBracketsMatching(String string) {

		LinkedList<Character> l = new LinkedList<Character>();
		for (int i = 0; i < string.length(); i++) {

			Character c = string.charAt(i);
			if (c == '{' || c == '[' || c == '(') {
				l.push(c);
			} else {
				switch (c) {
				case '}':
					if (l.isEmpty() || l.pop() != '{') {
						return false;
					}
					break;
				case ']':
					if (l.isEmpty() || l.pop() != '[') {
						return false;
					}
					break;
				case ')':
					if (l.isEmpty() || l.pop() != '(') {
						return false;
					}
					break;
				case '>':
					if (l.isEmpty() || l.pop() != '<') {
						return false;
					}
					break;
				}

			}

		}
		return l.isEmpty();
	}

	public static boolean isParenthesisMatch(String str) {
		if (str.charAt(0) == '{')
			return false;

		Stack<Character> stack = new Stack<Character>();

		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);

			if (c == '(')
				stack.push(c);
			else if (c == '{')
				stack.push(c);
			else if (c == ')')
				if (stack.empty())
					return false;
				else if (stack.peek() == '(')
					stack.pop();
				else
					return false;
			else if (c == '}')
				if (stack.empty())
					return false;
				else if (stack.peek() == '{')
					stack.pop();
				else
					return false;
		}
		return stack.empty();
	}

	public static boolean matchingBrackets(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '{' || c[i] == '[' || c[i] == '(') {
				stack.push(c[i]);
			} else if (c[i] == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			} else if (c[i] == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			} else if (c[i] == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
