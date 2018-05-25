package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 *
 */
public class Leapyear {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the year");
		int year = u.inputInteger();
		Utility.findleap(year);
	}

}
