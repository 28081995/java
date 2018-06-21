package com.bridgelabz.jdbcpgm.preparedstatement;

import java.sql.*;

/**
 * @author bridgelabz
 *
 */
public class InsertMultipleusing_pstmt 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into person.student2 values(?,?,?)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "pradeep");
			pstmt.setString(3, "mysore");
			pstmt.executeUpdate();
			pstmt.setInt(1, 2);
			pstmt.setString(2, "kradeep");
			pstmt.setString(3, "hangal");
			pstmt.executeUpdate();
			pstmt.setInt(1, 3);
			pstmt.setString(2, "sadeep");
			pstmt.setString(3, "bidar");
			pstmt.executeUpdate();

		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		} 
		finally {
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
			if (pstmt != null) 
			{
				try 
				{
					pstmt.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
