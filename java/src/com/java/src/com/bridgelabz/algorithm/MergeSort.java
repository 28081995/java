package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995 merge sort
 */
public class MergeSort {
	public static void main(String[] args) {
		int number = 0;
		String string = null;
		Utility u = new Utility();
		System.out.println("Enter the array size");
		number = u.inputInteger();
		String[] value = new String[number];
		String[] value1 = new String[number];
		System.out.println("Enter the first array");
		for (int i = 0; i < number; i++) {
			value[i] = u.inputString();
		}
		System.out.println("Enter the second array");
		for (int i = 0; i < number; i++) {
			value1[i] = u.inputString();
		}
		String[] size = new String[value.length + value1.length];
		Utility.mergeSort(value);
		Utility.mergeSort(value1);
		Utility.merge(size, value, value1);
		Utility.mergeSort(size);
		System.out.println("Sorted names are:");
		for (String ClassThree : size) {
			System.out.println(ClassThree);
		}
	}

}
