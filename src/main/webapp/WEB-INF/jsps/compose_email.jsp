<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>email</title>
</head>
<body>
<div>
${msg }
</div>
<form action="composeEmail" method="post">
<pre>
To<input type="text" value="${email }" name="to"/></br>
Subject <input type="text" name="subject"/></br>
Message<textarea name="message" rows="4" cols="50">
</textarea></br>
 <input type="Submit" value="SendEmail"/>
 </pre>
</form>
</body>
</html>