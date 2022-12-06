<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contacts</title>
</head>
<body>
<h2>List of all the Contacts</h2>
<table>
<tr>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Source</th>
<th>Delete</th>
<th>Billing</th>
</tr>
 <c:forEach var = "contact" items="${contact}">
<tr>
       <td><a href="contact_info?id=${contact.id}">${contact.name }</a></td>
       <td>${contact.email }</td>
       <td>${contact.mobile }</td>
       <td>${contact.source }</td>
       <td><a href="delete1?id=${contact.id}">Delete</a></td>
       <td><a href="billingInfo?id=${contact.id}">Billing</a></td>
      </tr>
      </c:forEach>
      </table>
</body>
</html>