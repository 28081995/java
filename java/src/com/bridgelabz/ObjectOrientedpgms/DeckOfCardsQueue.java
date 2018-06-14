package com.bridgelabz.ObjectOrientedpgms;

import com.bridgelabz.datastructure.QueueLinklist;
import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class DeckOfCardsQueue {
	public static void main(String[] args) {
		Utility u = new Utility();
		String[] suit = { "clubs", "diamonds", "hearts", "spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[][] deck = new String[suit.length][rank.length];
		QueueLinklist[] cards = new QueueLinklist[52];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new QueueLinklist();
		}
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				int index = 0;
				cards[index++].insert(suit[i] + "" + rank[j]);
			}
		}
		String[][] player = shuffleCards(cards, suit.length, rank.length);
		QueueLinklist[] queue = distribute(player);
		sortPlayer(queue);
	}
	public static String[][] shuffleCards(QueueLinklist[] cards, int suitsize, int ranksize) {
		String[][] player = new String[suitsize][ranksize];
		int index = (int) (Math.random() * suitsize * ranksize);
		for (int i = 0; i < suitsize; i++) {
			for (int j = 0; j < ranksize; j++) {
				int index1 = (int) (Math.random() * suitsize * ranksize);
				if (!cards[index1].isEmpty()) {
					player[i][j] = (String) cards[index1].pop();
				} else
					j--;
			}
		}
		return player;
	}
	public static void sortPlayer(QueueLinklist[] elements) {
		for (int i = 0; i < 4; i++) {
			System.out.println("** Person " + (i + 1) + " **");
			for (int j = 0; j < 9; j++) {
				System.out.println(elements[i].pop(0));
			}
			System.out.println();
		}
	}
	/**
	 * @param player
	 * @return QueueUsingLinkedlist[]
	 */
	public static QueueLinklist[] distribute(String[][] player) {
		QueueLinklist[] elements = new QueueLinklist[52];
		for (int i = 0; i < 4; i++) {
			elements[i] = new QueueLinklist();
			for (int j = 0; j < 9; j++) {
				elements[i].addSort(player[i][j]);
			}
		}
		return elements;
	}
}
