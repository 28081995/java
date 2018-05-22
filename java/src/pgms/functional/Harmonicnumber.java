package pgms.functional;

import java.util.Scanner;

import com.Utility;

/**
 * @author 28081995
 *
 */
public class Harmonicnumber 
{ 
    public static void main(String[] args)
    { 
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the harmonic value");
     int hvalue=sc.nextInt();
     Utility.harmonic(hvalue);
    }
    
}
