<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Leads</title>
</head>
<body>
<h2>List of all the Leads</h2>
<table>
<tr>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Source</th>
<th>Delete</th>

</tr>
 <c:forEach var = "leads" items="${leads}">
<tr>
       <td><a href="lead_info?id=${leads.id}">${leads.name }</a></td>
       <td>${leads.email }</td>
       <td>${leads.mobile }</td>
       <td>${leads.source }</td>
       <td><a href="delete?id=${leads.id}">Delete</a></td>
       
      </tr>
      </c:forEach>
      </table>
</body>
</html>