package com.bridgelabz.jdbcpgm.connectionPoolPgm;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author bridgelabz
 *
 */
public class C3P0DataSource {
	private static C3P0DataSource dataSource;
	private ComboPooledDataSource comboPooledDataSource;

	private C3P0DataSource() {
		try {
			comboPooledDataSource = new ComboPooledDataSource();
			comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
			comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/emp");
			comboPooledDataSource.setUser("root");
			comboPooledDataSource.setPassword("bridgeit");
		} catch (PropertyVetoException ex1) {
			ex1.printStackTrace();
		}
	}

	public static C3P0DataSource getInstance() {
		if (dataSource == null)
			dataSource = new C3P0DataSource();
		return dataSource;
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = comboPooledDataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}