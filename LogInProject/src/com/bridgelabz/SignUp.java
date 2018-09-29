package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String username = req.getParameter("u");
		String password = req.getParameter("p");

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String qry = "insert into person.user values('aruna','xyz')";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
			pstmt = con.prepareStatement(qry);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				out.println("successfully registered");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
