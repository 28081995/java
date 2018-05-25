package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * @author 28081995
 *
 */
public class Gambler {
	public static void game(int[] arr) {
		Utility u = new Utility();
		System.out.println("enter no of stake");
		int stake = u.inputInteger();
		System.out.println("enter no of goals");
		int goals = u.inputInteger();
		System.out.println("enter no of trials");
		int trials = u.inputInteger();
		System.out.println("enter no of bets");
		int bets = 24;
		int wins = 0;

		// no of trials taking to play
		for (int t = 0; t <= trials; t++) {
			int cash = stake;
			while (cash > 0 && cash < goals) {
				bets++;
				if (Math.random() < 0.5)
					cash++; // win $1
				else
					cash--; // lose $1
			}
			if (cash == goals)
				wins++;
		}
		System.out.println(wins + " wins of " + trials);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);
		System.out.println("Avg # bets           = " + 1.0 * bets / trials);
	}

	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the size of array");
		int size = u.inputInteger();
		int[] arr = new int[size];
		game(arr);
	}
}
