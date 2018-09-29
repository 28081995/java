package com.bridgelabz.jdbcpgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author bridgelabz method to take integer input by user
 */
public class Utility {
	public int inputInteger() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	/********************************************************************
	 */

	/**
	 * @return long integer value to take long integer input from user
	 */
	public long inputLong() {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
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
	
	  /************************************************************************************************
	   * database connectivity     
	   * @param db_name
	   * @param user_name
	   * @param password
	   * @return
	   */
	    public static Connection getConnection(String db_name,String user_name,String password)
	    {
	        Connection con=null;
	        try
	        {
	        Class.forName("com.mysql.jdbc.Driver");
	        con=DriverManager.getConnection("jdbc:mysql://rds-security.cgipjwom4bc4.us-east-2.rds.amazonaws.com/"+db_name+"?user="+user_name+"&password="+password);
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	     
	        return con;        
	    }
	 

}
