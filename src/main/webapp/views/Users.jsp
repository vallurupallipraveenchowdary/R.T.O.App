<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <p>Users Details</p>
 
 <table border="1">
 <c:forEach items="${users}" var="user">
 
 
 <tr>
 <td><c:out value="${user.firstName}"/></td>
  <td><c:out value="${user.lastName}"/></td>
   <td><c:out value="${user.email}"/></td>
    <td><c:out value="${user.phno}"/></td>
     <td><c:out value="${user.gender}"/></td>
      
      
 </tr>
 
 </c:forEach>


</table>

<a href="displayForm">AddUser</a>
</body>
</html>