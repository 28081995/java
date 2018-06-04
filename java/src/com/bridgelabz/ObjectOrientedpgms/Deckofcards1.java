package com.bridgelabz.ObjectOrientedpgms;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class Deckofcards1 {
	static String[] SUIT = { "club", "diamond", "heart", "spades" };
	static String[] RANK = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };
	static String[][] deck = new String[SUIT.length][RANK.length];

	public static void main(String[] args) {

		deck = Utility.cardInitialize(deck, RANK, SUIT);
		deck = Utility.shuffleCards(deck, SUIT.length, RANK.length);
		Utility.printCards(deck);
	}
}
