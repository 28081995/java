package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class Array2D {
	public static void main(String[] args) {
		Utility u = new Utility();
		int rows = 0, columns = 0;
		System.out.println("Enter the rows:");
		rows = u.inputInteger();
		System.out.println("Enter the columns:");
		columns = u.inputInteger();
		int[][] b = Utility.arrayInt(rows, columns);
		Utility.printArrayInt(b, rows, columns);
		double[][] c = Utility.arrayDouble(rows, columns);
		Utility.printArrayDouble(c, rows, columns);
		boolean[][] d = Utility.arrayBoolean(rows, columns);
		Utility.printArrayBoolean(d, rows, columns);

	}
}