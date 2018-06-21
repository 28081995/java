package com.bridgelabz.jdbcpgm.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.jdbcpgm.Utility;

/**
 * @author bridgelabz
 *
 */
public class FetchParticularRecord {
	public static void main(String[] args) {
		Utility u = new Utility();
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rs = null;
		String qry = "select * from person.student1 where id=?";
		System.out.println("enter id of student you want to fetch");
		int stId = u.inputInteger();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, stId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String name = rs.getString(2);
				String place = rs.getString(3);
				System.out.println("records fetched");
				System.out.println(name + " " + place);
			} else
				System.out.println("student id you entered is not found");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) {
				try {
					rs.close();
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
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
