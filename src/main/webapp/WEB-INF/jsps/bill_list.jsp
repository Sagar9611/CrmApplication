<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bills</title>
</head>
<body>
<h2>List of all the Bills</h2>
<table>
<tr>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Product</th>
<th>Amount</th>
</tr>
 <c:forEach var="billing" items="${billing}">
<tr>
       <td>${billing.name}</td>
       <td>${billing.email}</td>
       <td>${billing.mobile}</td>
       <td>${billing.product}</td>
       <td>${billing.amount}</td>
      </tr>
      </c:forEach>
      </table>
</body>
</html>