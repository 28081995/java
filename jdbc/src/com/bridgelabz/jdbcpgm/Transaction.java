package com.bridgelabz.jdbcpgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

/**
 * @author bridgelabz
 *
 */
public class Transaction {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Savepoint sp = null;

		String qry = "insert into person.student3 values(?,?,?)";
		String qry1 = "insert into person.student3 values(?,?,?)";

		Utility u = new Utility();
/*
		System.out.println("enter id??");
		int id = u.inputInteger();
		System.out.println("enter name");
		String name = u.inputString();
		System.out.println("enter place");
		String place = u.inputString();*/
		try {
			con = Utility.getConnection("mysql", "root", "bridgeit");
			con.setAutoCommit(false);

			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, 63);
			pstmt.setString(2, "pradeep");
			pstmt.setString(3, "mysore");
			pstmt.executeUpdate();
			
			
			sp = con.setSavepoint();
			
			pstmt.setInt(1, 54);
			pstmt.setString(2, "deep");
			pstmt.setString(3, "sore");
			pstmt.executeUpdate();
		/*	con.rollback(sp);*/
			con.commit();
		} catch (SQLException e) {
			try {
				con.rollback(sp);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}

		finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}
}
