package com.bridgelabz.jdbcpgm.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.jdbcpgm.Utility;

public class Callable {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		CallableStatement stmt=null;
		ResultSet rs=null;
		try {
			con = Utility.getConnection("mysql", "root", "bridgeit");
			stmt=con.prepareCall("{call country(?,?)}");
			stmt.setInt(1,1);
			stmt.setString(2,"aruna");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				int RegNo=rs.getInt(1);
				String name=rs.getString(2);
				System.out.println(RegNo+""+name);
			}	
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally 
		{
			if (rs != null) 
			{
				try 
				{
					rs.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			
			if (con != null) 
			{
				try 
				{
					con.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
