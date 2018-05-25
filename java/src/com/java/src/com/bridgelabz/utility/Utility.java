package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class Utility {

	/**
	 * @return int value to take integer input from user
	 */
	public int inputInteger() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	/*********************************************************************
	 * 
	 * @return double value to take double input from user
	 */
	public double inputDouble() {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}

	/********************************************************************
	 * 
	 * @return string value to take string input from user
	 */
	public String inputString() {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		return st;
	}

	/*******************************************************************
	 * 
	 */
	/**
	 * @param array
	 * @param num
	 *            finding distinct coupons
	 */
	public static void distinctcoupon(int[] array, int num) {
		Random rand = new Random();
		int randnum = rand.nextInt(1000);

		// GENERATING N NO OF RANDOM NUMBERS
		for (int i = 0; i < num; i++) {
			array[i] = rand.nextInt(1000);

		}
		// CHECKING DISTINCT NUMBERS
		for (int j = 0; j < array.length; j++) {
			for (int k = j + 1; k < array.length; k++) {
				if (array[j] == array[k]) {
					if (j != k) {
						array[j] = rand.nextInt(1000);
						;
					}
				}
			}
		}
		// PRINT DISTINCT COUPONS
		for (int j = 0; j < num; j++) {
			System.out.println(array[j]);

		}

	}

	/*****************************************************************************************
	  
	 */

	/**
	 * FINDING NTH HARMONIC NUMBER
	 * 
	 * @param n
	 */
	public static void harmonic(int num) {

		double sum = 0.0;
		for (int i = 1; i <= num; i++) {
			sum += 1.0 / i;
			System.out.println(sum);
		}
		System.out.println("nth harmonic=" + sum);// nth harmonic number
	}

	/****************************************************************************************
	 */

	/**
	 * checking leap year
	 * 
	 * @param year
	 */
	public static void findleap(int year) {
		boolean isleap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isleap = true;
				} else
					isleap = false;
			} else
				isleap = true;
		} else
			isleap = false;

		if (isleap == true)
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");
	}

	/*******************************************************************************
	 * 
	 */

	/**
	 * FINDING POWER OF 2
	 * 
	 * @param num
	 */
	public static void findpower(int num) {
		System.out.println("power of 2 are");
		System.out.println("---------------");

		int power = 1;
		for (int i = 1; i <= num; i++) {
			power = power * 2;
			System.out.println("2" + "^" + i + "=" + power);
		}

	}

	/******************************************************************************
	 * 
	 */

	/**
	 * FUNCTION TO FINDING THE PRIME FACTOR OF A NUMBER
	 * 
	 * @param num
	 */
	public static void findprimefactor(int num) {
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.println(i + "");
				num = num / 2;
			}
		}
		if (num < 1) {
			System.out.println(num);
		}
	}

	/********************************************************************************
	 * 
	 */

	/**
	 * function to measure distance between the (x,y) and (0,0)
	 * 
	 * @param xCoOrdinate
	 * @param yCoOrdinate
	 * @return distance
	 */
	public double measureDistance(double xCoOrdinate, double yCoOrdinate) {
		return Math.pow((Math.pow(xCoOrdinate, 2) + Math.pow(yCoOrdinate, 2)), 0.5);
	}

	/***********************************************************************************
	 * 
	 */

	/**
	 * function to find prime number or not
	 * 
	 * @param num
	 */
	public static void rangePrime() {
		for (int i = 0; i <= 1000; i++) {
			boolean b = Utility.findPrime(i);
			if (b) // if num is prime then only prints
			{
				System.out.print(i + " ");
			}
		}
	}

	public static boolean findPrime(int num) {
		int i = 2;
		if (num < 2) // 0 and 1 are not a prime
			return false;

		while (i <= num / 2) {
			if (num % i == 0)

				return false;
			i++;
		}
		return true;
	}

	/***********************************************************************************
	 * 
	 */
	/**
	 * function to find given strings are anagram or not
	 * 
	 * @param st1
	 *            string 1
	 * @param st2
	 *            string 2
	 */
	public static void checkAnagram(String st1, String st2) {
		String s1 = st1.replaceAll(" ", ""); // remove the space
		String s2 = st2.replaceAll(" ", "");

		boolean result = true;
		if (s1.length() != s2.length()) // check the length equal or not
		{
			result = false;
		} else {
			char[] ch1 = s1.toLowerCase().toCharArray();// convert to lowercase and to charArray
			char[] ch2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);// sort array in ascending order
			Arrays.sort(ch2);
			result = Arrays.equals(ch1, ch2); // check equal or not

		}
		if (result)
			System.out.println("given strings " + s1 + " " + s2 + " are anagrams");
		else
			System.out.println("given strings " + s1 + " " + s2 + " are not anagrams");

	}

	/************************************************************************************************************
	 * 
	 */
	/**
	 * function to find palindrome or not
	 * 
	 * @param str
	 * @return
	 */
	public static boolean palindrome(String str) {

		char[] array = str.toCharArray();
		int n = array.length;
		for (int i = 0; i < n; i++) {
			if (array[i] != array[n - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	/*************************************************************************************************************
	 * 
	 */
	/**
	 * function for binary search of integers
	 * 
	 * @param intarr
	 * @param key
	 * @return
	 */
	public static int binarysearchint(int[] intarr, int key) {
		int start = 0;
		int end = intarr.length - 1;

		int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if (key == intarr[mid])
				return mid;
			if (key > intarr[mid]) {
				start = mid + 1;
			} else
				end = mid - 1;
		}
		return -1;
	}

	/************************************************************************************************************
	 * 
	 */
	/**
	 * function for binary search of string
	 * 
	 * @param Stringarr
	 * @param Stringkey
	 * @return
	 */
	public static int binarysearchstring(String[] Stringarr, String Stringkey) {
		int start = 0;
		int end = Stringarr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (Stringkey.compareTo(Stringarr[mid]) > 0)
				start = mid + 1;
			else if (Stringkey.compareTo(Stringarr[mid]) < 0)
				end = mid - 1;
			else {
				System.out.println("elment found in position " + mid);
				return mid;
			}
		}
		System.out.println("elment not found in position ");
		return -1;

	}

	/***********************************************************************************************************
	 * 
	 */
	/**
	 * function for insertion sort of integer
	 * 
	 * @param arr
	 * @param key
	 */
	public static void intinsertionsort(int arr[]) {
		int size = arr.length;
		for (int i = 1; i < size; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/******************************************************************************************************************
	 * to print an integer array
	 * 
	 * @param arr
	 */
	// to print array of insertion sort
	public static void printArray(int arr[]) {
		int num = arr.length;
		for (int i = 0; i < num; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	/***********************************************************************************************************
	 * to print a string array
	 * 
	 * @param arr
	 */
	public static void printArray(String arr[]) {
		int num = arr.length;
		for (int i = 0; i < num; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	/************************************************************************************************************
	 * 
	 */
	/**
	 * function for insertion sort of string
	 * 
	 * @param Stringarr
	 * @param Stringkey
	 */
	public static void stringinsertionsort(String Stringarr[]) {
		int size = Stringarr.length;
		for (int i = 1; i < size; ++i) {
			String Stringkey = Stringarr[i];
			int j = i - 1;

			while (j >= 0 && Stringarr[j].compareTo(Stringkey) > 0) {
				Stringarr[j + 1] = Stringarr[j];
				j = j - 1;
			}
			Stringarr[j + 1] = Stringkey;
		}
	}

	/****************************************************************************************************
	 * 
	 */
	/**
	 * function to bubblesort of integer
	 * 
	 * @param arr
	 */
	public static void bubblesortInteger(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	/*****************************************************************************************************
	 * function to bubblesort of string
	 * 
	 * @param arr
	 */
	public static void stringBubblesort(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	/***********************************************************************************************************
	 * 
	 */
	/**
	 * @param names
	 *            function for merge sort
	 */
	public static void mergeSort(String[] names) {
		if (names.length > 2) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - names.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = names[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = names[i + names.length / 2];
			}

			mergeSort(left);
			mergeSort(right);
			merge(names, left, right);
		}
	}

	public static void merge(String[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}

	/*****************************************************************************************************
	 * 
	 */
	/**
	 * binarysearch using generics
	 * 
	 * @param Stringarr
	 * @param Stringkey
	 */
	public static <T extends Comparable<T>> void binarysearchstringGen(T[] Stringarr, T Stringkey) {
		int start = 0;
		int end = Stringarr.length;
		int mid = 0;
		while (start < end) {
			mid = (start + end) / 2;
			if (Stringkey.compareTo(Stringarr[mid]) > 0)
				start = mid + 1;
			else if (Stringkey.compareTo(Stringarr[mid]) < 0)
				end = mid - 1;
			else {
				System.out.println("elment found in position " + mid);
				return;
			}
		}
		System.out.println("elment not found in position ");
		return;

	}

	/*****************************************************************************************************
	 * 
	 */
	/**
	 * bubblesort using generics
	 * 
	 * @param arr
	 */
	public static <T extends Comparable<T>> void stringBubblesort(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	/*****************************************************************************************************
	 * 
	 */
	/**
	 * insertion sort using generics
	 * 
	 * @param Stringarr
	 */
	public static <T extends Comparable<T>> void stringinsertionsort(T Stringarr[]) {
		int size = Stringarr.length;
		for (int i = 1; i < size; ++i) {
			T Stringkey = Stringarr[i];
			int j = i - 1;

			while (j >= 0 && Stringarr[j].compareTo(Stringkey) > 0) {
				Stringarr[j + 1] = Stringarr[j];
				j = j - 1;
			}
			Stringarr[j + 1] = Stringkey;
		}
	}

	/*****************************************************************************************************
	 * 
	 */
	/**
	 * to find day of the week
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static double dayOfWeek(int month, int day, int year) {
		int y0 = year - (14 - month) / 12;
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + 31 * m0 / 12) % 7;
		return d0;

	}

	/***************************************************************************************************
	 * 
	 */
	/**
	 * /** temperature conversion from fahrenheit to celsius and vice-versa
	 * 
	 * @param temperature
	 * @param unit
	 * @return
	 */
	public double tempConvert(double temperature, String unit) {
		if (unit.equals("f")) {
			return ((double) temperature - 32) * 5 / 9; // Celcius to Fahrenheit
		} else {
			return (((double) temperature * 9 / 5) + 32); // Fahrenheit to Celsius:
		}
	}

	/***************************************************************************************************
	 * 
	 */
	/**
	 * finding the monthly payment
	 * 
	 * @param P
	 * @param Y
	 * @param R
	 * @return
	 */
	public double monthlyPay(double P, double Y, double R) {
		double r = R / (12 * 100);
		double n = 12 * Y;
		double payment = (P * r) / (1 - Math.pow((1 + r), -n));
		return payment;

	}

	/*****************************************************************************************************
	 * 
	 */
	/**
	 * conversion of decimal to binary
	 * 
	 * @param dec
	 */
	public static void tobinary(int dec) {
		String bin = "";
		while (dec >= 1) {
			int rem = dec % 2; // remainder
			bin = rem + bin;
			dec = dec / 2;
		}
		System.out.println("binary value of given decimal is " + bin);// print binary value

	}

	/**************************************************************************************************
	 * 
	 */
	/**
	 * function to find square root of a number
	 * 
	 * @param c
	 * @return square root value
	 */
	public static double sqrt(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - (c / t)) > (epsilon * t)) {
			t = ((c / t) + t) / 2.0;
		}
		return t;
	}

	/***************************************************************************************************
	 * 
	 */
	/**
	 * function tobinary
	 * 
	 * @param number
	 * @return
	 */
	public static String toBinary(int number) {
		if (number == 1) {
			return String.valueOf(number);
		}
		int remainder = number % 2;
		return toBinary(number / 2) + String.valueOf(remainder);
	}

	/** Converts binary number to decimal. **/
	public int binaryToInteger(int binary) {
		String binaryString = String.valueOf(binary);
		int number = 0;
		for (int index = 0; index < binaryString.length(); index++) {
			int tempDigit = binaryString.charAt(index) - '0';
			number = number * 2 + tempDigit;
		}
		return number;
	}

	/** Swaps nibbles in the given binary **/
	public int swapNibbles(String binaryString) {
		int size = binaryString.length();
		for (int i = 0; i < 8 - size; i++) {
			binaryString = "0" + binaryString;
		}
		String nibble1 = binaryString.substring(0, 4);
		String nibble2 = binaryString.substring(4);
		return Integer.parseInt(nibble2 + nibble1);
	}

	/** Returns true if number is power of two **/
	public boolean isPowerOfTwo(int binary) {
		String binaryString = String.valueOf(binary);

		for (int index = 1; index < binaryString.length(); index++) {
			if (binaryString.charAt(index) != '0') {
				return false;
			}
		}
		return true;
	}

	/** Represents number as addition of numbers which are power of two **/
	public String paddedString(int number) {
		int i = 2;
		String returnString = "";
		String plusCharacter = "";
		while (number > 0) {
			if ((number / i) == 0) {
				if (returnString.length() != 0) {
					plusCharacter = " + ";
				}
				returnString = returnString + plusCharacter + (i / 2);
				number -= (i / 2);
				i = 2;
			} else if (number == 1) {
				return returnString + " + 1";
			} else {
				i *= 2;
			}
		}
		return returnString;
	}
	/***************************************************************************************************
	 * 
	 */

}