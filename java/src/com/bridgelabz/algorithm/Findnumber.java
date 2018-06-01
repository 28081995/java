package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Findnumber {
	
	public static void main(String[] args) {
		Utility u=new Utility();
		System.out.println("enter power to find range");
		int n=u.inputInteger();
		int N=(int) Math.pow(2,n);
		
		search(0,N);
	}
	public static void search(int low,int high)
	{
		Utility u=new Utility();
		int mid=low+(high-low)/2;
		if(low<high)
		{
			System.out.println("enter y if guess no is greater"+mid);
			String st=u.inputString();
			if(st.equals("y"))
			{
				low=mid+1;
				search(low,high);
			}
			else
			{
				high=mid;
				search(low,high);
			}
	}
		else
		System.out.println(low);
	}
}
