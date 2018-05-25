package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 *
 */
public class Windchill {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter temperature of air");
		double t = u.inputDouble();
		System.out.println("enter speed of air");
		double v = u.inputDouble();
		if (t > 50) {
			// invalid temperature
			System.out.println("temperature should not be greater than 50");
		}
		if ((v > 120) || (v < 3)) { // invalid velocity
			System.out.println("velocity should be greater than 3 and less than 120");
		}
		calculate_wchill(t, v);
	}

	public static void calculate_wchill(double t, double v) {
		double windchill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16));
		System.out.println(windchill);
	}

}