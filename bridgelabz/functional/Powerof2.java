package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 *
 */
public class Powerof2 {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the number");
		int num = u.inputInteger();
		Utility.findpower(num);
	}

}
