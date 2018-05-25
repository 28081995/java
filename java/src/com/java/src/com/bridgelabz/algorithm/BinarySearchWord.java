package com.bridgelabz.algorithm;

import java.util.Arrays;

import com.bridgelabz.utility.*;

public class BinarySearchWord {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the words in a file");
		String st = u.inputString();

		String words[] = st.split(",");
		System.out.println("enter word to be searched");
		String s = u.inputString();
		Arrays.sort(words);
		Utility.binarysearchstring(words, s);

	}
}
