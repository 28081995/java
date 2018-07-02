package com.bridgelabz;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PreSuccess extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
				try {
					rd.forward(req, resp);
				} catch (ServletException e) {
					e.printStackTrace();
				}
	}
}
