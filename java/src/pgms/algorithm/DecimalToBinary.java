package pgms.algorithm;

import com.Utility;

/**
 * @author 28081995
 *
 */
public class DecimalToBinary {
	public static void main(String[] args) {
		Utility u=new Utility();
		System.out.println("enter the decimal number");
		int dec=u.inputInteger();             //take decimal input
		Utility.tobinary(dec);
	}	
}
