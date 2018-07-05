package com.bridgelabz.jdbcpgm;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.jdbcpgm.Utility;

/**
 * @author bridgelabz
 *
 */
public class BatchUpdate {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		String insertqry = "insert into person.employee1 values(5,'gambler','lead')";
		String updateqry = "update person.employee1 set name='boss2' where id=3";
		String deleteqry = "delete from person.employee1 where id=4";
		try {
			con = Utility.getConnection("mysql", "root", "bridgeit");
			stmt = con.createStatement();
			stmt.addBatch(insertqry);
			stmt.addBatch(updateqry);
			stmt.addBatch(deleteqry);
			int arr[] = stmt.executeBatch();
			for (int i : arr) {
				System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				con.close();
			if (stmt != null)
				stmt.close();
		}

	}
}
