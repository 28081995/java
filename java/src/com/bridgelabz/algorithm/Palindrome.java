package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 * checking palindrome or not
 */
public class Palindrome {
	public static void main(String[] args) {

		Utility u = new Utility();
		System.out.println("enter a number");
		String str = u.inputString();
		boolean res = Utility.palindrome(str);
		if (res)
			System.out.println(str + " it is a palindrome");
		else
			System.out.println(str + " not a palindrome");
	}
}
