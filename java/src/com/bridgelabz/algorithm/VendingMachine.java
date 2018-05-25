package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995 change of notes we get from vending machine
 */
public class VendingMachine {
	public static void main(String[] args) {
		Utility u = new Utility();
		int[] notes = { 1, 5, 10, 20, 50, 100, 500, 1000 };
		System.out.println("enter amount in rupees");
		int rs = u.inputInteger();
		checkNote(notes, rs);
	}

	public static void checkNote(int[] notes, int rs) {
		int count = 0;
		for (int i = notes.length - 1; i >= 0; i--) {
			while (rs >= notes[i]) {
				System.out.println(notes[i] + " note");
				rs = rs - notes[i];
				count++;
			}
		}
		System.out.println("total no of notes got= " + count);
	}
}
