package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995 to find monthly payment
 */
public class MonthlyPayment {
	public static void main(String[] args) {
		Utility u = new Utility();
		double P = Double.parseDouble(args[0]);
		double Y = Double.parseDouble(args[1]);
		double R = Double.parseDouble(args[2]);
		double payment = u.monthlyPay(P, Y, R);
		
		System.out.println("Monthly payment required: " + payment);
        
		
		
		
	}

}