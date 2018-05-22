package pgms.functional;

import com.Utility;

/**
 * @author 28081995
 *
 */
public class Quadratic_pgm 
{
	public static void main(String[] args) 
	{
		
		Utility u=new Utility();
		
		System.out.println("enter the 1st element");
		int a=u.inputInteger();
		System.out.println("enter the 2nd element");
		int b=u.inputInteger();
		System.out.println("enter the 3rd element");
		int c=u.inputInteger();
		findRoots(a,b,c);
	}
	public static void findRoots(int a,int b,int c)
	{
		double delta,root1,root2;
		delta = Math.pow(b, 2) - 4 * a * c; //calculating
		
		root1 = (-1 * b + Math.sqrt(delta)) / (2 * a);	// 1st root 
		root2 = (-1 * b - Math.sqrt(delta)) / (2 * a);  // 2nd root
		System.out.println("1st root"+root1);
		System.out.println("2nd root"+root2);//output
	
		
	}

}
