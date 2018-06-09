package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	public int inputInteger() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	/********************************************************************
	 * 
	 * @return
	 */
	public long inputLong() {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		return num;
	}

	/*********************************************************************
	 * 
	 * @return double value to take double input from user
	 */
	public double inputDouble() {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}

	/********************************************************************
	 * 
	 * @return string value to take string input from user
	 */
	public String inputString() {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		return st;
	}


}
