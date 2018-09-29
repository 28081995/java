package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fs")
public class Forgot extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String username = req.getParameter("u");
		String password = req.getParameter("p");

		Connection con = null;
		PreparedStatement pstmt = null;
	    String qry1="update person.user set password=? where name=? ";
	    try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
			pstmt = con.prepareStatement(qry1);
			pstmt.setString(1, password);
			pstmt.setString(2, username);
		int rs = pstmt.executeUpdate();
			if (rs>0) {
				resp.sendRedirect("forgot.html");
			} else
				resp.sendRedirect("error");
	}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
}
}