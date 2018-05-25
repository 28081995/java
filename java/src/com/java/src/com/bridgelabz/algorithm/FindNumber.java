package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class FindNumber {

	static int[] numberArray; // array of numbers of given range
	int count = 0;
	int ans; // the number in mind
	int N; // range
	double maxCount = 0; // number of times question will be asked

	public static void main(String[] args) {
		FindNumber fnum = new FindNumber();
		FindNumber.start();
	}

	public static void start() {
		Utility u = new Utility();
		System.out.print("Enter limit num: ");
		int num = u.inputInteger();
		int[] numberArray = new int[num]; // array initialization
		// fills the array
		for (int i = 0; i < num; i++) {
			numberArray[i] = i;
		}

		// calculates maximum count of questions
		double maxCount = (Math.log(num) / Math.log(2));
		System.out.println("Number of tries required to guess: " + ((int) maxCount + 1));
		binarySearch(0, num - 1);
	}

	public static void binarySearch(int first, int last) {
		int count = 0;
		double maxCount = 0;
		Utility u = new Utility();
		if (count < maxCount) {
			int middle = (first + last) / 2;
			count++;
			System.out.println("Is number between " + first + " and " + middle + "?");
			String temp = u.inputString();
			if (temp.equals("y")) {
				change(middle + 1, last);
				binarySearch(first, middle);
			} else if (temp.equals("n")) {
				change(first, middle);
				binarySearch(middle + 1, last);
			}
		} else {
			for (int i = 0; i < numberArray.length; i++) {

			}
			for (int i : numberArray) {
				if (i != -1)
					System.out.println("The number is: " + i);
			}
		}
	}

	public static void change(int first1, int last1) {
		for (int i = first1; i <= last1; i++) {
			numberArray[i] = -1;
		}
	}

}
