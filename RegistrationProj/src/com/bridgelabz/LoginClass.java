package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginClass extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String Name = req.getParameter("u");
		String Password = req.getParameter("p");

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String qry = "select * from person.usertable where Name=? and password=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
			pstmt = con.prepareStatement(qry);
			pstmt.setString(1, Name);
			pstmt.setString(2, Password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				HttpSession session = req.getSession(true);
				session.setAttribute("userName", Name);
				//setting session to expire in 30 minutes
				session.setMaxInactiveInterval(30*60);
				
				RequestDispatcher rd=req.getRequestDispatcher("PreSuccess");
				rd.forward(req, resp);

			} else
			{
				HttpSession session = req.getSession(true);
				session.setAttribute("userName", Name);
				RequestDispatcher rd=req.getRequestDispatcher("PreError");
				rd.forward(req, resp);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}	

}
