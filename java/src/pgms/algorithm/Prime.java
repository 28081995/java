package pgms.algorithm;

import com.Utility;

/**
 * @author 28081995 finding prime numbers in a given range between 0 to 1000
 */
public class Prime {
	public static void main(String[] args) {
		rangePrime();
	}

	public static void rangePrime() {
		for (int i = 0; i <= 1000; i++) {
			boolean b = Utility.findPrime(i);
			if (b) // if num is prime then only prints
			{
				System.out.print(i + " ");
			}
		}
	}

}
