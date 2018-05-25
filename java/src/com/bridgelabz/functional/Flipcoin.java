package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 *
 */
public class Flipcoin {
	public static void main(String[] args) {
		flip();
	}

	public static void flip() {
		Utility u = new Utility();
		System.out.println("enter no of flips");
		int numFlips = u.inputInteger();
		double result;
		int heads = 0;
		int tails = 0;

		for (int toss = 0; toss < numFlips; toss++) {
			result = Math.random();
			if (result <= .5)
				heads++;
			else
				tails++;
		}
		double percentHeads = heads * 100.00 / numFlips;
		double percentTails = (numFlips - heads) * 100.00 / numFlips;
		System.out.println(" percent of tails " + percentTails);
		System.out.println(" percent of heads " + percentHeads);
	}
}
