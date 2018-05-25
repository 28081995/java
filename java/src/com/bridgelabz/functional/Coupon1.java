package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 *
 */
public class Coupon1 {
	static int randvar;

	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the no of random number");
		int num = u.inputInteger();
		System.out.println("enter the size of array");
		int size = u.inputInteger();
		int array[] = new int[size];
		Utility.distinctcoupon(array, num);

	}
}
