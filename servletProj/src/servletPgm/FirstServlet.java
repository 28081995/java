package servletPgm;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		String id1=req.getParameter("i");
		int id=Integer.parseInt(id1);
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		PrintWriter out=resp.getWriter();
		out.print("<html><body bgcolor='red'>"+"welcome"+id+" "+name+" "+place);
		//out.println("<html><body bgcolor='red'>"+"welcome"+id+" "+name+" "+place+"<a href='index.html'>");
		out.flush();
		out.close();
		Connection con=null;
		PreparedStatement pstmt=null;
		String query="insert into person.student values(?,?,?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1,id);
			pstmt.setString(2, name);
			pstmt.setString(3,place);
			pstmt.executeUpdate();
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		
		}
		finally {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
