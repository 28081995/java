package pgms.functional;

import java.util.Scanner;

/**
 * @author 28081995
 *
 */
public class Flipcoin
{
	 public static void main(String[] args)
	 {
	   flip();  
	 }
	 public static void flip()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter no of flips");
		 int numFlips=sc.nextInt();
	     double result;
	     int heads=0;
	     int tails=0;

	 for(int toss=0;toss<numFlips;toss++)
	 {
	  result=Math.random();
	  if(result<=.5)
      heads++;
	  else
	  tails++;
	 }
	 double percentHeads = heads*100.00/numFlips; 
	 double percentTails = (numFlips-heads)*100.00/numFlips;
	 System.out.println(" percent of tails " + percentTails);
	 System.out.println(" percent of heads " + percentHeads);
	 }
}
  
