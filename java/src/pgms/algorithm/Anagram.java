package pgms.algorithm;

import java.util.Arrays;

import com.Utility;

/**
 * @author 28081995 given strings are anagram or not
 */
public class Anagram {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter 1st string ");
		String st1 = u.inputString();
		System.out.println("enter 2nd string ");
		String st2 = u.inputString();
		Utility.checkAnagram(st1, st2);
	}

}
