package com.bridgelabz.designpattern.structuralDesignPattern.FacadePattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlHelper {
	static Connection con=null;
	public static Connection getMySqlDBConnection() throws SQLException{
		//get MySql DB connection using connection parameters
		System.out.println("get  MySql DB connection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?user=root&password=bridgeit");
		
		}
		catch(ClassNotFoundException e){ System.out.println(e);}  
		return con;
	}
	public void generateMySqlPDFReport(String Employee1, Connection con) {
		//get data from table and generate pdf report
		System.out.println("get data from table");
		}
	
	public void generateMySqlHTMLReport(String tableName, Connection con) throws SQLException{
		//get data from table and generate pdf report
		System.out.println("get data from table and generate pdf report");
	    Statement stmt = null;
	try {
		stmt = con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee1");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		
	} catch (SQLException e) {
		e.printStackTrace();
	}  
	finally {
		if(con!=null)
		{
			con.close();
		}
		if(stmt!=null)
		{
			stmt.close();
		}
	}
}
}