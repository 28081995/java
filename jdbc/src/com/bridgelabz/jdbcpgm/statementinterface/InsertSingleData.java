package com.bridgelabz.jdbcpgm.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author bridgelabz
 *
 */
public class InsertSingleData {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		String qry = "insert into person.employee values(8,'pushpa','lead')";
		String qry1 = "update person.employee set name='boss' where id=1";
		String qry2 = "delete from person.employee where id=2";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
			stmt = con.createStatement();
			stmt.executeUpdate(qry);
			System.out.println("data inserted");
			stmt.executeUpdate(qry1);
			System.out.println("data updated");
			stmt.executeUpdate(qry2);
			System.out.println("data deleted");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				con.close();
			if (stmt != null)
				stmt.close();
		}

	}

}
