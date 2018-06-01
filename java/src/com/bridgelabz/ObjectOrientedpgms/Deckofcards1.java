package com.bridgelabz.ObjectOrientedpgms;

import java.util.Random;

public class Deckofcards1 {
	public static void main(String[] args) {
		String[] suit= {"clubs","diamonds","hearts","spades"};
		String[] rank= {"2","3","4","5","6","7","8","9","10",  
					"Jack","Queen","King","Ace"};
		int n=52; 
		String[][] deck=new String[suit.length][rank.length];
		for(int i=0;i<suit.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			{
				deck[i][j]=suit[j]+rank[j];
			}
		}
		//shuffle
		Random random=new Random();
		shufflecard(suit,rank,deck);
	}
		public static void shufflecard(String[] suit,String[] rank,String[][] deck)
		{
		for(int i=0;i<suit.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			{
				int rand1=(int)Math.random()*suit.length;
				int rand2=(int) Math.random()*rank.length;
				deck[i][j]=
				
			}
		}
		
		}
		
	}


