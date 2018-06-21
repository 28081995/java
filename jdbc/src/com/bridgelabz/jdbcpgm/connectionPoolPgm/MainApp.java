package com.bridgelabz.jdbcpgm.connectionPoolPgm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author bridgelabz
 *
 */
public class MainApp {

	public static void insertOrUpdate(String isbn, String title, String edition, Double price) {
		try (Connection con = C3P0DataSource.getInstance().getConnection()) {
			PreparedStatement pstmt = null;
			if (isIsbnExists(isbn)) {
				pstmt = con.prepareStatement("UPDATE books " + "SET title=?,edition=?," + "price=? WHERE isbn LIKE ?");
				pstmt.setString(1, isbn);
				pstmt.setString(2, title);
				pstmt.setString(3, edition);
				pstmt.setDouble(4, price);
			} else {
				pstmt = con.prepareStatement("INSERT INTO " + "books(isbn,title," + "edition,price) VALUES (?,?,?,?)");
				pstmt.setString(1, isbn);
				pstmt.setString(2, title);
				pstmt.setString(3, edition);
				pstmt.setDouble(4, price);
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean isIsbnExists(String isbn) {
		Boolean flag = false;
		try (Connection con = C3P0DataSource.getInstance().getConnection()) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT isbn " + "FROM books WHERE " + "isbn LIKE '" + isbn + "'");
			flag = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void delete(String isbn) {
		try (Connection con = C3P0DataSource.getInstance().getConnection()) {
			PreparedStatement pstmt = null;
			if (isIsbnExists(isbn)) {
				pstmt = con.prepareStatement("DELETE FROM " + "books " + "WHERE isbn LIKE ?");
				pstmt.setString(1, isbn);
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void showAll() {
		try (Connection con = C3P0DataSource.getInstance().getConnection()) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM books");
			ResultSetMetaData metadata = rs.getMetaData();
			int cols = metadata.getColumnCount();
			System.out.println("\n-----------------------------" + "--------------------------------");
			System.out.println("ISBN" + "     " + "TITLE" + "             " + "EDITION" + "  " + "PRICE");
			for (int i = 0; i < cols; i++) {
				metadata.getColumnName(i + 1).toUpperCase();
			}
			System.out.println("\n-----------------------------" + "--------------------------------");
			while (rs.next()) {
				for (int i = 0; i < cols; i++) {
					String isbn = rs.getString(1);
					String title = rs.getString(2);
					String edition = rs.getString(3);
					Double price = rs.getDouble(4);
					System.out.println(isbn + "   " + title + "   " + edition + "   " + price);
				}
				System.out.println();
			}

			System.out.println("-------------------------------" + "--------------------------------");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		showAll();
		insertOrUpdate("111111", "Complex Numbers", "Second", 56.78);
		showAll();
		insertOrUpdate("121111", "Complex Numbers", "Fourth", 87.50);
		showAll();
		delete("111111");
		showAll();
	}
}
