package pgms.algorithm;

import com.Utility;

/**
 * @author 28081995 InsertionSort of string
 */
public class InsertionSortString {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter no of elements");
		int arrsize = u.inputInteger();
		String[] Stringarr = new String[arrsize];

		System.out.println("enter array elements");
		for (int i = 0; i < Stringarr.length; i++) {
			Stringarr[i] = u.inputString();
		}

		Utility.stringinsertionsort(Stringarr);
		Utility.printArray(Stringarr);
	}

}
