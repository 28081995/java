package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class PalindromeChecker {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the String");
		String str = u.inputString();

		Deque<Character> deque = new Deque<Character>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			deque.addRear(c);
		}
		while (!deque.isEmpty()) {
			if (deque.removeFront() != deque.removeRear()) {

				System.out.println("not a palindrome");
				break;
			}
			System.out.println("palindrome");
		}

	}
}
