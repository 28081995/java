package pgms.functional;

import com.Utility;


	public class Array_2D {
		public static void main(String[] args)
		{
			int rows = 0,columns=0;
			System.out.println("Enter the rows:");
			rows=Utility.scanner(rows);
			System.out.println("Enter the columns:");
			columns=Utility.scanner(columns);
			int[][] b=Utility.arrayInt(rows,columns);
			Utility.printArrayInt(b,rows,columns);
			double[][] c=Utility.arrayDouble(rows,columns);
			Utility.printArrayDouble(c,rows,columns);
			boolean[][] d=Utility.arrayBoolean(rows,columns);
			Utility.printArrayBoolean(d,rows,columns);
			
	}
}
	 
  

