package pgms.functional;

import java.util.Scanner;

/**
 * @author 28081995
 *
 */
public class Gambler 
{ 
	public static void game(int[] arr)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter no of stake");
		 int stake=sc.nextInt();
		 System.out.println("enter no of goals");
		 int goals=sc.nextInt();
		 System.out.println("enter no of trials");
		 int trials=sc.nextInt();
		 System.out.println("enter no of bets");
		 int bets=sc.nextInt();
		 int wins = 0;       

         //no of trials taking to play
         for (int t = 0; t <=trials; t++) 
         {
           int cash= stake;
           while (cash > 0 && cash < goals)
           {
                bets++;
                if (Math.random() < 0.5)
                	cash++;     // win $1
                else                    
                	cash--;     // lose $1
            }
            if (cash == goals) 
            	wins++;                
         }
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }
	
 public static void main(String[] args)
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the size of array");
	 int size=sc.nextInt();
	 int[] arr=new int[size];
     game(arr);
  }
}


