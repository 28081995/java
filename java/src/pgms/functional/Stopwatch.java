package pgms.functional;

import com.Utility;

/**
 * @author28081995
 *
 */
public class Stopwatch {
	public static void main(String[] args)
	{
		Utility u=new Utility();
		long start=0;
		long stop=0;
		System.out.println("enter 'y' to start the stopwatch");
		String choice=u.inputString();
		System.out.println("enter 'n' to stop the stopwatch");
		String choice1=u.inputString();
		
		switch(choice)
		{
		case "Y":start=System.nanoTime();
		break;
		case "y": start= System.nanoTime();
		break;
		default: System.out.println("itsok");
		break;
		}
		
		double ellapsedtime=(stop-start)*1000000000;
		System.out.println(ellapsedtime);
		
	}
	

}
