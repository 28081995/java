package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 *
 */

public class Binary {
	public static void main(String[] args) {

		Utility u = new Utility();
		System.out.print("Enter number to convert into binary: ");
		int number = u.inputInteger();
		Utility utility = new Utility();

		String binaryString = Utility.toBinary(number);
		System.out.println("Binary representation of the number: " + binaryString);

		// stores swapped binary nibbles
		int SwappedBinary = utility.swapNibbles(binaryString);
		System.out.println("Binary after swapping: " + SwappedBinary);

		// stores new integer
		int swappedBinaryInteger = utility.binaryToInteger(SwappedBinary);
		System.out.println("Number after swapping nibbles: " + swappedBinaryInteger);
		;

		// checks if number is power of two and prints
		if (utility.isPowerOfTwo(SwappedBinary)) {
			System.out.println("The number is power of two");
		} else {
			System.out.println("The number is not power of two");
		}

	}

}
