package com.bridgelabz.datastructure;

public class BalancedParentheses {
	
	public static void main(String[] args) {
		char[] par= {'(',')'};
		if(isParBalanced(par))
			System.out.println("balanced paranthesis");
		else
			System.out.println("not balanced paranthesis");	
	}
	public static boolean isParBalanced(char[] par)
	{
		Stack st=new Stack();
		int count=0;
		int count1=0;
		for(int i=0;i<par.length;i++)
		{
			if(par[i]=='(')
			{
			  count++;
		    st.push(par[i]);
			}
			else if(par[i]==')')
			{
              count1++;
			st.pop(par[i]);
			}
			if(count==count1)
				return true;
			else
				return false;
			
		}
		return false;	
	}
}
	class Stack
	{
	 int top=-1;
	 int size;
	/* Stack(int size)
	 {
		 this.size=size;
	 }*/
	 int[]array=new int[size];
	 public void push(int value)
	 {	 
	 if(top==size-1)
		 System.out.println("stack is full");
	 
	 else
		 top++;
	 }
	 public void pop(int value)	
	 {
		 if(top==-1)
			 System.out.println("stack is empty");
		 else
			 top--;
		 
	 }
		
		
	}


