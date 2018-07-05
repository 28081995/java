package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail1 {
	public static void send(String to, String Email, String pass) throws ClassNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String userPassword = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/bridgelabz?user=root&password=bridgeit";
			con = DriverManager.getConnection(dbUrl);
			String sql = "select * from Person.usertable where Email=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, to);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				userPassword = rs.getString("password");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("entered into send email");

		// create an instance of Properties Class
		Properties props = new Properties();

		/*
		 * Specifies the IP address of your default mail server for e.g if you are using
		 * gmail server as an email sever you will pass smtp.gmail.com as value of
		 * mail.smtp host. As shown here in the code. Change accordingly, if your email
		 * id is not a gmail id
		 */
		props.put("mail.smtp.host", "smtp.gmail.com");
		// below mentioned mail.smtp.port is optional
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");

		/*
		 * Pass Properties object(props) and Authenticator object for authentication to
		 * Session instance
		 */

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(Email, pass);
			}
		});

		try {

			/*
			 * Create an instance of MimeMessage, it accept MIME types and headers
			 */

			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(Email));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			message.setText(userPassword);

			/* Transport class is used to deliver the message to the recipients */
			// 3). Send message

			Transport.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}