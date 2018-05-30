package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class BalancedParenthesis {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter expression");
		String exp = u.inputString();
		System.out.println("enter size of array");
		int size = u.inputInteger();
		StackPgm stack = new StackPgm(size);
		// matches,mismatches
		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (ch == '(')
				stack.push(i);
			else if (ch == ')')
				stack.pop();

		}
		while (!stack.isEmpty()) {
			System.out.println("'('at index " + (stack.pop() + 1) + "is unmatched");
		}
		System.out.println("matched");
	}

}
