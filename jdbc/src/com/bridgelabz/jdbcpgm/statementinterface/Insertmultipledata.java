package com.bridgelabz.jdbcpgm.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.jdbcpgm.Utility;

/**
 * @author bridgelabz
 *
 */
public class Insertmultipledata {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String qry1 = "insert into person.student1 values(1,'cruna','rnr')";
		String qry2 = "insert into person.student1 values(2,'vruna','haveri')";
		String qry3 = "insert into person.student1 values(3,'kruna','dvg')";
		String qry4 = "insert into person.student1 values(4,'runa','hubli')";

		try {
			con = Utility.getConnection("mysql", "root", "bridgeit");
			stmt = con.createStatement();
			int i = stmt.executeUpdate(qry1);
			System.out.println(i + "rows affected ");
			stmt.executeUpdate(qry2);
			stmt.executeUpdate(qry3);
			stmt.executeUpdate(qry4);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
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
