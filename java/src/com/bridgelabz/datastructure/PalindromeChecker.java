package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class PalindromeChecker { 
	public static <T extends Comparable<T>> void main(String[] args) {
		Utility u=new Utility();
		System.out.println("enter the String");
		String str=u.inputString();
		char[] ch=str.toCharArray();
		int count=ch.length;
        Deque<T> deque=new Deque<>();
        fillDeque(str);
		//ispalindrome(str);
		for(int i=0;i<ch.length;i++)
		{
		
		 deque.addFront(ch[i]);
		deque.display();
			count++;
		}
		
		//int count1=str.length();
		boolean palindrome=true;
		String frontString;
		String backString;
		if(count%2==0)
		{
			while(!deque.isEmpty()&& palindrome)
			{
				frontString=(String) deque.removeFront();
				backString=(String) deque.removeRear();
				if(!frontString.equalsIgnoreCase(backString))
					palindrome=false;
			}
		}
		else
		{
			int index=0;
			if(index<((count-1)/2)&& palindrome)
			{
				frontString=(String) deque.removeFront();
				backString=(String) deque.removeRear();
				if(!frontString.equalsIgnoreCase(backString))
					palindrome=false;
			}
			index++;
		}
		return;
	}
	
	public static void fillDeque(String str) {
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				deque.addRear(Character.toString(str.charAt(i)));
			}
		}
	}
}
