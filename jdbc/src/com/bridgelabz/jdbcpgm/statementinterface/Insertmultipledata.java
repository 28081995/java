package com.bridgelabz.jdbcpgm.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author bridgelabz
 *
 */
public class Insertmultipledata {
	public static void main(String[] args) {
		Statement stmt = null;
		Connection con = null;
		String qry1 = "insert into person.student1 values(1,'cruna','rnr')";
		String qry2 = "insert into person.student1 values(2,'vruna','haveri')";
		String qry3 = "insert into person.student1 values(3,'kruna','dvg')";
		String qry4 = "insert into person.student1 values(4,'runa','hubli')";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
			stmt = con.createStatement();
			int i = stmt.executeUpdate(qry1);
			System.out.println(i + "rows affected ");
			stmt.executeUpdate(qry2);
			stmt.executeUpdate(qry3);
			stmt.executeUpdate(qry4);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		}
	}

}
