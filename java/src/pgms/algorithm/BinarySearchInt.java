package pgms.algorithm;

import com.Utility;

/**
 * @author28081995 binary search of integers
 */
public class BinarySearchInt {
	public static void main(String[] args) {
		Utility u = new Utility();

		System.out.println("enter no of elements");
		int size = u.inputInteger();
		int[] intarr = new int[size];

		System.out.println("enter array elements");
		for (int i = 0; i < intarr.length; i++) {
			intarr[i] = u.inputInteger();
		}
		System.out.println("enter key to be search");
		int key = u.inputInteger();

		System.out.println(" key position is " + Utility.binarysearchint(intarr, key));
	}
}
