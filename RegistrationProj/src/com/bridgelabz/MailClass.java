package com.bridgelabz;

import java.io.IOException;
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

public class MailClass extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		// ResultSet rs = null;
		String to = req.getParameter("to");
		String subject = "To change password";
		String Email = "aruna28aug@gmail.com";
		String Password = "Aruna@123";
		String qry = "select * from  person.usertable where Email= ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
			pstmt = con.prepareStatement(qry);
			pstmt.setString(1, to);
			// System.out.println(to);
			ResultSet rs = pstmt.executeQuery();
			System.out.println(rs);
			if (rs.next()) {
				String message = rs.getString("Password");
				SendMail.send(to, subject, message, Email, Password);
				System.out.println("Email sent successfully");
				RequestDispatcher dispatcher = req.getRequestDispatcher("PreLoginClass");
				dispatcher.forward(req, resp);
			}
		} catch (SQLException | IOException | ServletException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
