package pgms.algorithm;

import com.Utility;

/**
 * @author 28081995 insertion sort of integer
 */
public class InsertionSortInteger {
	public static void main(String[] args) {
		Utility u = new Utility();

		System.out.println("enter no of elements");
		int size = u.inputInteger();
		int[] arr = new int[size];

		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = u.inputInteger();
		}

		Utility.intinsertionsort(arr);
		Utility.printArray(arr);
	}

}
