package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter
 */

public class LogInFilter implements Filter {
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		
		String Name = request.getParameter("u");
		String Password = request.getParameter("p");
		
		PrintWriter out = response.getWriter();

		if(Name.equals("")||Password.equals(""))
		{
			out.print("fields can not be empty");
		}
		else
		chain.doFilter(request, response);
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
