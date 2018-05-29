package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class PrimeExtension {

	Prime2D object;
	int[][] primeAnagrams;
	
	public static void main(String[] args) {		
		PrimeExtension extension = new PrimeExtension();
		extension.findAnagrams();
	}
	/**
	 * finds anagrams and puts them into array
	 */
	void findAnagrams() {
		primeAnagrams = new int[10][];
		
		object = new Prime2D();		
		
		object.primerange();
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			int[] tempArray = new int[object.primeNumbers[i].length];
			for(int j = 0; j < tempArray.length; j++) {
				int num = object.primeNumbers[i][j];
				for(int k = j+1; k < tempArray.length; k++) {
					if(isAnagram(num, object.primeNumbers[i][k])){
						tempArray[count] = num;
						count++;
						tempArray[count] = object.primeNumbers[i][k];
						count++;
						break;
					}
				}
			}
			primeAnagrams[i] = new int[count];
			for(int j = 0; j < count; j++) {
				primeAnagrams[i][j] = tempArray[j];
			}
		}
		print();
	}
	
	/**
	 * @param firstInterger - first number 
	 * @param secondInteger - second number
	 * @returns true if numbers are anagram else returns false
	 */
	boolean isAnagram(int firstInterger, int secondInteger) {
		if(firstInterger < 10) {
			return false;
		}
		Utility u = new Utility();
		return Utility.checkAnagram(String.valueOf(firstInterger), 
				String.valueOf(secondInteger));
	}
	/**
	 * prints prime anagrams
	 */
	void print() {
		for(int[] nums : primeAnagrams) {
			for(int i = 0; i < nums.length; i++) {
				System.out.println(nums[i] + " " + nums[++i]);
			}
		}
	}
}
/*package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class PrimeAnagram2D {
public static void main(String[] args) {
	String[] primeNumbers = Utility.rangePrime();
    
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
	
}*/

