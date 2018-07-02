<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='skyblue'>
<form action="RegisterClass" method="post">
		user name:<input type="text" name="u" /></br>
		phone no:<input type="text" name="ph" pattern=".{10,10}" title="must be a 9 digit mobile number" /></br>
		email:<input type="text" name="e" pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$" title="must follow XXXX@domain.com"/></br>
	    password:<input type="password" name="p" pattern="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,})" title="password must contain atleast 1 digit,1 lowercase,1 uppercase,1 special character and length of 8";/></br> 
		<input type="submit" value="register" />
		<input type="reset" value="reset">
	</form>
</body>
</html>