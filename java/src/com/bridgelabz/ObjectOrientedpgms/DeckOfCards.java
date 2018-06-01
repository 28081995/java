package com.bridgelabz.ObjectOrientedpgms;

import java.util.Random;

import com.bridgelabz.datastructure.MyLinkedList;

public class DeckOfCards {
	
	static int numcards;
	public static void main(String[] args) {
	String[] suit= {"clubs","diamonds","hearts","spades"};
	String[] rank= {"2","3","4","5","6","7","8","9","10",  
				"Jack","Queen","King","Ace"};
	MyLinkedList deck =new MyLinkedList(numcards);
	MyLinkedList shuffledDeck=new MyLinkedList();
	Random random=new Random();
	
	for(int i=0;i<suit.length;i++)
	{
		for(int j=0;j<rank.length;j++)
		{
			deck.add(suit[i]+rank[j]);
		}
	}
	int opt=0;
	for(int i=0;i<numcards;i++)
	{
		opt=random.nextInt(deck.size());
		
	}
	
	
}	

}
