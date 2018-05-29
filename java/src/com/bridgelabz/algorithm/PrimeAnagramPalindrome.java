package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class PrimeAnagramPalindrome {
	public static void main(String[] args) {
		// Utility u = new Utility();
		// System.out.println("enter a number ");

		// prime numbers array between 0 and 1000
		String[] primeNumbers = Utility.rangePrime();

		System.out.println("Anagram and prime numbers are:");
		// prints prime numbers that are anagrams
		for (int i = 0; i < primeNumbers.length; i++) {
			for (int j = i + 1; j < primeNumbers.length; j++) {
				if (Utility.checkAnagram(primeNumbers[i], primeNumbers[j])) {
					System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
				}
			}
		}
		System.out.println("\nPalindrome and prime numbers are:");
		// prints prime numbers that are palindrome
		for (int i = 0; i < primeNumbers.length; i++) {
			if (Utility.palindrome(primeNumbers[i])) {
				System.out.println(primeNumbers[i]);
			}
		}
	}
}
