<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bills</title>
</head>
<body>
<form action="genrateBill" method="post">
<pre>
Name:<input type="text" name="name" value="${contact.name }"/>
Email:<input type="text" name="email" value="${contact.email }"/>
Mobile:<input type="text" name="mobile" value="${contact.mobile }"/>
Product:<input type="text" name="product"/>
Amount:<input type="text" name="amount"/>
<input type="submit" value="Genrate Bill"/>
</pre>
</form>
</body>
</html>