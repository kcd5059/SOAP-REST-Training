<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Get a Quote from Acme</h3>
<form method="post" action="QuoteController">
Part number:<br/>
<input type="text" name="partNumber"/><br/>
Quantity:<br/>
<input type="text" name="quantity"/><br/>
Date required by (MM/DD/YYYY):<br/>
<input type="text" name="dateRequiredBy"/><br/>
<br/>
<input type="submit" value="Get Quote"/>
</form>
</body>
</html>