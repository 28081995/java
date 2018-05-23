package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 *
 */
public class Triplets {
	public static void main(String[] args) {
		Utility u = new Utility();

		System.out.println("enter no of elements");
		int size = u.inputInteger();
		int[] arr = new int[size];

		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = u.inputInteger();
		}
	}

	public static void distinctTriplets(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = j; k < arr.length; k++) {
					if ((i != j) && (i != k) && (j != k)) {
						if ((arr[i] + arr[j] + arr[k]) == 0) {
							count++;
							System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						}
					}
				}
			}

		}
		System.out.println("no of distinct triplets" + count);
	}
}