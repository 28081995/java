package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 *
 */
public class Harmonicnumber {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the harmonic value");
		int hvalue = u.inputInteger();
		Utility.harmonic(hvalue);
	}

}
