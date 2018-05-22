package pgms.algorithm;

import com.Utility;

public class FindMax {
	public static void main(String[] args) {
		Utility u=new Utility();
		System.out.println("enter a,b,c values");
	    int a=u.inputInteger();
		int b=u.inputInteger();
		int c=u.inputInteger();
		int res=max(a,b,c);
		System.out.println(res);
		//for String
		System.out.println("enter a,b,c values");
		String a1=u.inputString();
		String b1=u.inputString();
		String c1=u.inputString();
	    String res1=max(a1,b1,c1);
		System.out.println(res1);
		//for double
		System.out.println("enter a,b,c values");
		Double a2=u.inputDouble();
		Double b2=u.inputDouble();
		Double c2=u.inputDouble();
		Double res2=max(a2,b2,c2);
		System.out.println(res2);
	}
   public static <T extends Comparable<T>> T max(T a,T b,T c)
   {
	   if((a.compareTo(b)>0)&& (b.compareTo(c)>0))
	   return a;
	   else if((b.compareTo(c)>0))
	   return b;
	   else
	   return c;
   }
   public static Integer max(Integer a,Integer b,Integer c)
   {
	   if((a.compareTo(b)>0)&& (b.compareTo(c)>0))
	   return a;
	   else if((b.compareTo(c)>0))
	   return b;
	   else
	   return c;
   }
   public static Double max(Double a,Double b,Double c)
   {
	   if((a.compareTo(b)>0)&& (b.compareTo(c)>0))
	   return a;
	   else if((b.compareTo(c)>0))
	   return b;
	   else
	   return c;
   }
}
