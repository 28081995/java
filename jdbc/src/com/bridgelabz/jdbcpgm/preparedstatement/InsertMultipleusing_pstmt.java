package com.bridgelabz.jdbcpgm.preparedstatement;

import java.sql.*;

import com.bridgelabz.jdbcpgm.Utility;

/**
 * @author bridgelabz
 *
 */
public class InsertMultipleusing_pstmt {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into person.student2 values(?,?,?)";
		try {
			con = Utility.getConnection("mysql", "root", "bridgeit");

			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, 6);
			pstmt.setString(2, "pradeep");
			pstmt.setString(3, "mysore");
			pstmt.executeUpdate();
			pstmt.setInt(1, 7);
			pstmt.setString(2, "kradeep");
			pstmt.setString(3, "hangal");
			pstmt.executeUpdate();
			pstmt.setInt(1, 8);
			pstmt.setString(2, "sadeep");
			pstmt.setString(3, "bidar");
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
