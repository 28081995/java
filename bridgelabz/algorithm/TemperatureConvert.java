package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995 conversion of temperature
 */
public class TemperatureConvert {
	public static void main(String[] args) {
		convert();
	}

	public static void convert() {

		Utility u = new Utility(); // utility object

		System.out.println("Enter temperature unit 'f' for Fahrenheit and 'c' for Celcius: ");
		String unit = u.inputString(); // unit

		// gets temperature and converts it
		if (unit.equals("f")) {
			System.out.print("Enter temperature in fahrenheit: ");
			double fahrenheitTemp = u.inputDouble();
			System.out.format("Temperature in celcius is: %.2f", u.tempConvert(fahrenheitTemp, unit));
		} else if (unit.equals("c")) {
			System.out.print("Enter temperature in celcius: ");
			double celciusTemp = u.inputDouble();
			System.out.format("Temperature in fahrenheit is: %.2f", u.tempConvert(celciusTemp, unit));
		} else {
			System.out.println("Enter proper character...");
			convert();
		}
	}
}