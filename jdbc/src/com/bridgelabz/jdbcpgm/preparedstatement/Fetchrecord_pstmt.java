package com.bridgelabz.jdbcpgm.preparedstatement;

import java.sql.*;

import com.bridgelabz.jdbcpgm.Utility;

/**
 * @author bridgelabz
 *
 */
public class Fetchrecord_pstmt {
	public static void main(String[] args) {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rs = null;
		String qry = "select * from person.student1";
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			// con =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
			con = Utility.getConnection("mysql", "root", "bridgeit");
			pstmt = con.prepareStatement(qry);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String place = rs.getString(3);
				System.out.println("records fetched");
				System.out.println(id + " " + name + " " + place);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
