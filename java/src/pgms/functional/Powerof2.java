package pgms.functional;

import java.util.Scanner;

import com.Utility;

/**
 * @author 28081995
 *
 */
public class Powerof2 
{
public static void main(String[] args)
{ 
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
Utility.findpower(num);
}

}
