<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body>
<form action="saveLeads" method="post">
<pre>
Name:<input type="text" name="name"/>
Email:<input type="text" name="email"/>
Mobile:<input type="text" name="mobile"/>
Source:<select name="source">
<option  value="radio">Radio</option>
<option  value="newspapaer">newspaper</option>
<option  value="tradeshow">tradeshow</option>
<option  value="Adv">Adv</option>
</select>
<input type="submit" value="Save"/>
</pre>
</form>
</body>
</html>