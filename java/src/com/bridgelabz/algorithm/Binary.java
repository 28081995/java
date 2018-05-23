package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Binary {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.print("Enter number to convert into binary: ");
		int number = u.inputInteger(); // number to convert into binary

		// storing binary into string
		String binaryString = Utility.toBinary(number);
		System.out.println("Binary representation of the number: " + binaryString);
		// prints padded string
		System.out.println("Addition: " + u.paddedString(number));

	}

}
