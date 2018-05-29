package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class Prime2D {
	int[][] primeNumbers;

	public static void main(String[] args) {
		Prime2D p2D = new Prime2D();
		p2D.primerange();
		// p2D.print();

	}

	public void primerange() {
		int[][] primeNumbers = new int[10][];
		for (int i = 0; i < 10; i++) {
			int count = 0;
			int[] tempArr = new int[100];
			for (int j = 1; j <= 100; j++) {
				int num = i * 100 + j;
				if (Utility.findPrime(num)) {
					tempArr[count] = num;
					count++;
				}
			}
			primeNumbers[i] = new int[count];
			for (int k = 0; k < count; k++) {
				primeNumbers[i][k] = tempArr[k];
				System.out.println(primeNumbers[i][k]);

			}
		}
	}
}
