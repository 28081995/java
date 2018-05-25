package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 *
 */
public class Replacestring {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the user name");
		String username = u.inputString();
		System.out.print("Hello " + username + ", How are you?");
	}
}
