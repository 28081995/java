package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;


public class PrimeExtension {
public static void main(String[] args) {
	Utility u=new Utility();
	String[] primeNumbers = u.prime(1000);
    
	System.out.println("Anagram and prime numbers are:");
	// prints prime numbers that are anagrams
	for (int i = 0; i < primeNumbers.length-1; i++) {
		for (int j = i + 1; j < primeNumbers.length-1; j++) {
			if (Utility.checkAnagram(""+primeNumbers[i], ""+primeNumbers[j])) {
				System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
			}
		}
	}
}
}

