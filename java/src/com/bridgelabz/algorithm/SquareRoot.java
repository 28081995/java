package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995 SQUARE ROOT OF A NUMBER
 */
public class SquareRoot {
	public static void main(String[] args) {
		double number = Double.parseDouble(args[0]);// command line argument input
		double res = Utility.sqrt(number);
		System.out.println(res);
	}
}
