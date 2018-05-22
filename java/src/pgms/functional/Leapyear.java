package pgms.functional;

import java.util.Scanner;

import com.Utility;

/**
 * @author 28081995
 *
 */
public class Leapyear
{
public static void main(String[] args) 
{ 
Scanner sc=new Scanner(System.in);
System.out.println("enter the year");
int year=sc.nextInt();
Utility.findleap( year);
}

}

