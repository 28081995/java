package pgms.functional;


import java.util.Scanner;

import com.Utility;


/**
 * @author 28081995
 *
 */
public class Coupon1 
{
	 static int randvar;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the no of random number");
	    int num=sc.nextInt();
	    System.out.println("enter the size of array");
	    int size=sc.nextInt();
	    int array[]=new int[size];
	    Utility.distinctcoupon(array,num);
		
	}
}	
	